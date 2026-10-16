package com.waze.main_screen.bottom_bars.scrollable_eta;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
