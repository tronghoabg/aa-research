package com.bumptech.glide;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab implements com.bumptech.glide.manager.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f2739a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.manager.p f2740b;

    ab(ac acVar, com.bumptech.glide.manager.p pVar) {
        Objects.requireNonNull(acVar);
        this.f2739a = acVar;
        this.f2740b = pVar;
    }

    @Override // com.bumptech.glide.manager.b
    public final void a(boolean z) {
        if (z) {
            synchronized (this.f2739a) {
                this.f2740b.c();
            }
        }
    }
}
