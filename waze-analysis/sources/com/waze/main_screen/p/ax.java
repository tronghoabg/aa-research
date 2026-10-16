package com.waze.main_screen.p;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ax extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.l.bp f27068a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Density f27069b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f27070c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Integer f27071d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f27072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(com.waze.ui.l.bp bpVar, Density density, bf bfVar, Integer num, h.c.e eVar) {
        super(2, eVar);
        this.f27068a = bpVar;
        this.f27069b = density;
        this.f27070c = bfVar;
        this.f27071d = num;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ax axVar = new ax(this.f27068a, this.f27069b, this.f27070c, this.f27071d, eVar);
        axVar.f27072e = obj;
        return axVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ax) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f27072e;
        bf bfVar = this.f27070c;
        kotlinx.coroutines.aj.z(afVar, null, null, new ar(bfVar, (h.c.e) null, 3, (short[]) null), 3);
        Density density = this.f27069b;
        float fMo2124toDpu2uoSUM = density.mo2124toDpu2uoSUM(this.f27071d.intValue()) + this.f27068a.b() + 16.0f;
        kotlinx.coroutines.aj.z(afVar, null, null, new aw(bfVar, fMo2124toDpu2uoSUM, (h.c.e) null, 1, (byte[]) null), 3);
        return kotlinx.coroutines.aj.z(afVar, null, null, new aw(bfVar, fMo2124toDpu2uoSUM, null, 0), 3);
    }
}
