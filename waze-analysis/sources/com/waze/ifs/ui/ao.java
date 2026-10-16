package com.waze.ifs.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ao extends GestureDetector.SimpleOnGestureListener {
    ao(at atVar) {
        Objects.requireNonNull(atVar);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
