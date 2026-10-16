package com.bumptech.glide;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f2738a;

    aa(ac acVar) {
        Objects.requireNonNull(acVar);
        this.f2738a = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ac acVar = this.f2738a;
        acVar.f2744c.a(acVar);
    }
}
