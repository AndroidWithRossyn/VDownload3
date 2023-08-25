package com.videosdownide.loadbase.vdownload.wallpaperFragment;


class Categories_Model {

    private int mImageId;
    private String mCategory_name;

    Categories_Model(String category_name, int imageId) {

        mImageId = imageId;
        mCategory_name = category_name;

    }

    String getCategory_name() {
        return mCategory_name;
    }

    int getImageId() {
        return mImageId;
    }

}
