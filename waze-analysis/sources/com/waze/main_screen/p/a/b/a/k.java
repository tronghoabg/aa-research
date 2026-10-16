package com.waze.main_screen.p.a.b.a;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f26795a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f26796b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f26797c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f26798d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Density f26799e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ State f26800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(boolean z, boolean z2, float f2, t tVar, Density density, State state, h.c.e eVar) {
        super(2, eVar);
        this.f26795a = z;
        this.f26796b = z2;
        this.f26797c = f2;
        this.f26798d = tVar;
        this.f26799e = density;
        this.f26800f = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f26795a, this.f26796b, this.f26797c, this.f26798d, this.f26799e, this.f26800f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean zBooleanValue = ((Boolean) this.f26800f.getValue()).booleanValue();
        boolean z = this.f26795a;
        boolean z2 = this.f26796b;
        this.f26798d.e().s(new com.waze.z.a.b.m(com.waze.z.a.b.c.f45740a, new com.waze.z.a.b.e(true != z2 ? 0.8f : 1.0f), new com.waze.z.a.b.a(this.f26799e.mo2121roundToPx0680j_4(com.waze.main_screen.n.c.b(zBooleanValue, z, z2) + this.f26797c))), null);
        return h.ab.f48028a;
    }
}
