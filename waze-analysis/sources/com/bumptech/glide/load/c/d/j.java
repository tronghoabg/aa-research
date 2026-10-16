package com.bumptech.glide.load.c.d;

import android.os.Handler;
import android.os.Message;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f3423a;

    j(k kVar) {
        Objects.requireNonNull(kVar);
        this.f3423a = kVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f3423a.j((i) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        this.f3423a.f3424a.f((i) message.obj);
        return false;
    }
}
