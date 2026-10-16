package com.waze.native_managers;

import android.os.Handler;
import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class j extends Handler {
    public j() {
        super(Looper.getMainLooper());
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }

    public j(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
