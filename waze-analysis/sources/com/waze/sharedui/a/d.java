package com.waze.sharedui.a;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f38780a;

    public d(e eVar) {
        this.f38780a = new WeakReference(eVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        e eVar = (e) this.f38780a.get();
        if (eVar == null || eVar.D(message)) {
            return;
        }
        super.handleMessage(message);
    }
}
