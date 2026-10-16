package com.waze.settings;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bm implements com.waze.sharedui.views.w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f36888a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f36889b;

    bm(bn bnVar, int i2) {
        this.f36888a = i2;
        Objects.requireNonNull(bnVar);
        this.f36889b = bnVar;
    }

    @Override // com.waze.sharedui.views.w
    public final void a(boolean z) {
        this.f36889b.f36890a.f36680l[this.f36888a].f36895e = z;
    }
}
