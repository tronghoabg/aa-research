package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f6785a;

    s(u uVar) {
        Objects.requireNonNull(uVar);
        this.f6785a = uVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        this.f6785a.b((t) message.obj);
        return true;
    }
}
