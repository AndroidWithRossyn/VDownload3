package com.videosdownide.loadbase.vdownload.interfaces;
import com.videosdownide.loadbase.vdownload.model.FBStoryModel.NodeModel;
import com.videosdownide.loadbase.vdownload.model.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
