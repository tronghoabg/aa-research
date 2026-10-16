package com.waze.bw.c.d;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f18158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Density f18159b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f18160c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f18161d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.b.ab f18162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(boolean z, Density density, boolean z2, float f2, com.waze.z.a.b.ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f18158a = z;
        this.f18159b = density;
        this.f18160c = z2;
        this.f18161d = f2;
        this.f18162e = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f18158a, this.f18159b, this.f18160c, this.f18161d, this.f18162e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f18158a;
        Density density = this.f18159b;
        this.f18162e.s(z ? v.d(density, this.f18160c) : v.e(density, this.f18161d, this.f18160c), z ? com.waze.z.a.b.ad.f45734b : null);
        return h.ab.f48028a;
    }
}
