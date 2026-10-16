package com.bumptech.glide.load.a;

import com.google.android.gms.common.api.internal.be;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bb implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc f3095a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f3096b;

    bb(bc bcVar, be beVar) {
        this.f3096b = beVar;
        Objects.requireNonNull(bcVar);
        this.f3095a = bcVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b(Object obj) {
        bc bcVar = this.f3095a;
        be beVar = this.f3096b;
        if (bcVar.h(beVar)) {
            bcVar.f(beVar, obj);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc) {
        bc bcVar = this.f3095a;
        be beVar = this.f3096b;
        if (bcVar.h(beVar)) {
            bcVar.g(beVar, exc);
        }
    }
}
