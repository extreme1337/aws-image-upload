package com.marko.awsimageupload.datastore;

import com.marko.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("f28e7f8c-99a0-4802-96d5-ec074933c482"),"pera",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("72a7ecc5-b033-420d-afef-6e79121a1857"),"zika",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
