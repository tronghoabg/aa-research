package com.waze.navigate;

import com.waze.NativeManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class l extends h.g.b.u implements h.g.a.l {
    l(Object obj) {
        super(1, obj, NativeManager.class, "PostRunnable", "PostRunnable(Ljava/lang/Runnable;)Z", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((NativeManager) this.receiver).PostRunnable((Runnable) obj));
    }
}
