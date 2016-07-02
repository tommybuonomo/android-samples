package com.tbuonomo.realm;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmQuery;

/**
 * Created by tommy on 02/07/16.
 */
public abstract class Dao<T extends RealmObject> {
    protected Realm mRealm = Realm.getDefaultInstance();

    public void save(final T object) {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealmOrUpdate(object);
            }
        });
    }

    public void delete(final T object) {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                object.deleteFromRealm();
            }
        });
    }

    public List<T> findAll(Class<T> clazz) {
        RealmQuery<T> query = mRealm.where(clazz);
        return query.findAll();
    }

    public List<T> findByQuery(RealmQuery<T> query, Class<T> clazz) {
        return query.findAll();
    }
}
