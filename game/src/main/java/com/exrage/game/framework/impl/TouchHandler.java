package com.exrage.game.framework.impl;

import android.view.View.OnTouchListener;

import com.exrage.game.framework.Input.TouchEvent;

import java.util.List;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}
