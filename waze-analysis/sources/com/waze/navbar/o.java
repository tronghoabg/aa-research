package com.waze.navbar;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f30901a;

    /* synthetic */ o(p pVar) {
        this.f30901a = new WeakReference(pVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        p pVar = (p) this.f30901a.get();
        if (pVar != null) {
            p.m(pVar, message);
        }
    }
}
