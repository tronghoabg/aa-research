package com.airbnb.lottie.b;

import kotlinx.coroutines.cl;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class i extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f2006a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f2007b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f2008c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f2009d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f2010e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f2011f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u f2012g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h f2013h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f2014i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ t f2015j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, int i2, int i3, boolean z, float f2, u uVar, com.airbnb.lottie.h hVar, float f3, t tVar, h.c.e eVar) {
        super(1, eVar);
        this.f2007b = kVar;
        this.f2008c = i2;
        this.f2009d = i3;
        this.f2010e = z;
        this.f2011f = f2;
        this.f2012g = uVar;
        this.f2013h = hVar;
        this.f2014i = f3;
        this.f2015j = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new i(this.f2007b, this.f2008c, this.f2009d, this.f2010e, this.f2011f, this.f2012g, this.f2013h, this.f2014i, this.f2015j, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((i) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.k kVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f2006a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                k kVar2 = this.f2007b;
                int i2 = this.f2008c;
                kVar2.B(i2);
                int i3 = this.f2009d;
                kVar2.f2022c.setValue(Integer.valueOf(i3));
                kVar2.f2023d.setValue(Boolean.valueOf(this.f2010e));
                float f2 = this.f2011f;
                kVar2.f2025f.setValue(Float.valueOf(f2));
                kVar2.f2024e.setValue(this.f2012g);
                com.airbnb.lottie.h hVar = this.f2013h;
                kVar2.f2028i.setValue(hVar);
                kVar2.D(this.f2014i);
                kVar2.f2026g.setValue(false);
                kVar2.C(Long.MIN_VALUE);
                if (hVar == null) {
                    kVar2.f2020a.setValue(Boolean.valueOf(false));
                    return h.ab.f48028a;
                }
                if (Float.isInfinite(f2)) {
                    kVar2.D(kVar2.y());
                    kVar2.f2020a.setValue(Boolean.valueOf(false));
                    kVar2.B(i3);
                    return h.ab.f48028a;
                }
                kVar2.f2020a.setValue(Boolean.valueOf(true));
                t tVar = this.f2015j;
                t tVar2 = t.f2074a;
                int iOrdinal = tVar.ordinal();
                if (iOrdinal == 0) {
                    kVar = h.c.k.f48060a;
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    kVar = cl.f51810b;
                }
                this.f2006a = 1;
                if (kotlinx.coroutines.aj.v(kVar, new h(tVar, h.g.b.o.d(getContext()), i3, i2, kVar2, null), this) == aVar) {
                    return aVar;
                }
            }
            h.g.b.o.f(getContext());
            this.f2007b.f2020a.setValue(Boolean.valueOf(false));
            return h.ab.f48028a;
        } catch (Throwable th) {
            this.f2007b.f2020a.setValue(Boolean.valueOf(false));
            throw th;
        }
    }
}
