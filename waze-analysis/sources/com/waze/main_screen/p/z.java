package com.waze.main_screen.p;

import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27368a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27369b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.m.p f27370c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Density f27371d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f27372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(bf bfVar, com.waze.main_screen.m.p pVar, Density density, LifecycleOwner lifecycleOwner, h.c.e eVar) {
        super(2, eVar);
        this.f27369b = bfVar;
        this.f27370c = pVar;
        this.f27371d = density;
        this.f27372e = lifecycleOwner;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new z(this.f27369b, this.f27370c, this.f27371d, this.f27372e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = h.c.a.a.f48038a;
        if (this.f27368a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bf bfVar = this.f27369b;
            com.waze.main_screen.m.p pVar = this.f27370c;
            Density density = this.f27371d;
            LifecycleOwner lifecycleOwner = this.f27372e;
            this.f27368a = 1;
            Object objD = kotlinx.coroutines.aj.d(new be(pVar, lifecycleOwner, density, bfVar, null), this);
            if (objD != obj2) {
                objD = h.ab.f48028a;
            }
            if (objD == obj2) {
                return obj2;
            }
        }
        return h.ab.f48028a;
    }
}
