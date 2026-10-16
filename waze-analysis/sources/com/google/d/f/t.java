package com.google.d.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f7873a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f7874b;

    t(u uVar, s sVar) {
        this.f7873a = sVar;
        Objects.requireNonNull(uVar);
        this.f7874b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7874b.f7875a.remove(this.f7873a);
    }
}
