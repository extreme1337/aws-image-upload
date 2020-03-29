package com.marko.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("upload.image.aws");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
