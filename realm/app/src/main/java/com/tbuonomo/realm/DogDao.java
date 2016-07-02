package com.tbuonomo.realm;

import java.util.List;

/**
 * Created by tommy on 02/07/16.
 */
public class DogDao extends Dao<Dog> {
    public Dog findByName(String name) {
        List<Dog> dogs = findByQuery(mRealm.where(Dog.class).equalTo("mName", name), Dog.class);
        return dogs.isEmpty() ? null : dogs.get(0);
    }
}
