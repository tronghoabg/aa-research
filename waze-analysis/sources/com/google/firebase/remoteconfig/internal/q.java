package com.google.firebase.remoteconfig.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f10722a;

    q(s sVar) {
        Objects.requireNonNull(sVar);
        this.f10722a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10722a.d();
    }
}
