package com.bumptech.glide.load.a.b;

import com.bumptech.glide.load.a.aw;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends com.bumptech.glide.g.m implements i {

    /* renamed from: a, reason: collision with root package name */
    private h f3079a;

    @Override // com.bumptech.glide.g.m
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        aw awVar = (aw) obj;
        if (awVar == null) {
            return 1;
        }
        return awVar.a();
    }

    @Override // com.bumptech.glide.load.a.b.i
    public final /* bridge */ /* synthetic */ aw b(com.bumptech.glide.load.o oVar) {
        return (aw) super.k(oVar);
    }

    @Override // com.bumptech.glide.g.m
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        aw awVar = (aw) obj2;
        h hVar = this.f3079a;
        if (hVar == null || awVar == null) {
            return;
        }
        hVar.d(awVar);
    }

    @Override // com.bumptech.glide.load.a.b.i
    public final void d(h hVar) {
        this.f3079a = hVar;
    }

    @Override // com.bumptech.glide.load.a.b.i
    public final void e(int i2) {
        if (i2 >= 40) {
            g();
        } else if (i2 >= 20 || i2 == 15) {
            l(h() / 2);
        }
    }

    @Override // com.bumptech.glide.load.a.b.i
    public final /* bridge */ /* synthetic */ void f(com.bumptech.glide.load.o oVar, aw awVar) {
    }
}
