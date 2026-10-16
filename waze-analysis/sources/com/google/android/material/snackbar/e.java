package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            ((o) message.obj).u();
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        ((o) message.obj).p(message.arg1);
        return true;
    }
}
