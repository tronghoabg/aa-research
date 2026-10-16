package com.waze.main_screen.p;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ba extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Density f27161a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27162b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Integer f27163c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f27164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(Density density, bf bfVar, Integer num, h.c.e eVar) {
        super(2, eVar);
        this.f27161a = density;
        this.f27162b = bfVar;
        this.f27163c = num;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ba baVar = new ba(this.f27161a, this.f27162b, this.f27163c, eVar);
        baVar.f27164d = obj;
        return baVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ba) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f27164d;
        bf bfVar = this.f27162b;
        kotlinx.coroutines.aj.z(afVar, null, null, new ar(bfVar, (h.c.e) null, 7, (byte[][]) null), 3);
        float fMo2124toDpu2uoSUM = this.f27161a.mo2124toDpu2uoSUM(this.f27163c.intValue()) + 16.0f;
        kotlinx.coroutines.aj.z(afVar, null, null, new aw(bfVar, fMo2124toDpu2uoSUM, (h.c.e) null, 9, (short[][]) null), 3);
        return kotlinx.coroutines.aj.z(afVar, null, null, new aw(bfVar, fMo2124toDpu2uoSUM, (h.c.e) null, 10, (int[][]) null), 3);
    }
}
