package com.bumptech.glide.load.a;

import android.os.Handler;
import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3093a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f3094b = new Handler(Looper.getMainLooper(), new az());

    ba() {
    }

    final synchronized void a(aw awVar, boolean z) {
        if (!this.f3093a && !z) {
            this.f3093a = true;
            awVar.e();
            this.f3093a = false;
            return;
        }
        this.f3094b.obtainMessage(1, awVar).sendToTarget();
    }
}
