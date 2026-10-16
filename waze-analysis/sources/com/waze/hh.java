package com.waze;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hh extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f24379a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hh(Looper looper, Runnable runnable) {
        super(looper);
        this.f24379a = runnable;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == NativeManager.UH_LOGIN_DONE) {
            NativeManager.getInstance().unsetUpdateHandler(NativeManager.UH_LOGIN_DONE, this);
            this.f24379a.run();
        }
    }
}
