package com.bumptech.glide.load.a;

import android.os.Handler;
import android.os.Message;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class az implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((aw) message.obj).e();
        return true;
    }
}
