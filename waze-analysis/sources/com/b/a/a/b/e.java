package com.b.a.a.b;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f2550a;

    public e(f fVar) {
        this.f2550a = new WeakReference(fVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar = (f) this.f2550a.get();
        if (fVar != null) {
            f.b(fVar, message);
        }
    }
}
