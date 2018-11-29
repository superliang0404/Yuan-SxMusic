package com.example.musicplayer.presenter;

import com.example.musicplayer.base.BasePresenter;
import com.example.musicplayer.contract.ILocalMusicContract;
import com.example.musicplayer.entiy.LocalSong;
import com.example.musicplayer.model.LocalMusicModel;

import java.util.List;

/**
 * Created by 残渊 on 2018/10/17.
 */

public class LocalMusicPresenter extends BasePresenter<ILocalMusicContract.View> implements ILocalMusicContract.Presenter {

    private LocalMusicModel mModel;
    public LocalMusicPresenter(){
        mModel=new LocalMusicModel(this);
    }


    @Override
    public void showMusicList(List<LocalSong> mp3InfoList) {
        if(isAttachView()){
            getMvpView().showMusicList(mp3InfoList);
        }
    }

    @Override
    public void getLocalMp3Info() {
        mModel.getLocalMp3Info();
    }

    @Override
    public void saveSong(List<LocalSong> localSongs) {
        mModel.saveSong(localSongs);
    }
}
