package com.waze.main_screen.p;

import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27348a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27349b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f27350c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f27351d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Density f27352e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f27353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(bf bfVar, float f2, float f3, Density density, LifecycleOwner lifecycleOwner, h.c.e eVar) {
        super(2, eVar);
        this.f27349b = bfVar;
        this.f27350c = f2;
        this.f27351d = f3;
        this.f27352e = density;
        this.f27353f = lifecycleOwner;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new u(this.f27349b, this.f27350c, this.f27351d, this.f27352e, this.f27353f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27348a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f27348a = 1;
            if (this.f27349b.L(this.f27350c, this.f27351d, this.f27352e, this.f27353f, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
