package com.waze.main_screen.p;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class x implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27360a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27361b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27362c;

    x(bf bfVar, Density density, int i2) {
        this.f27362c = i2;
        this.f27360a = bfVar;
        this.f27361b = density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f27362c;
        if (i2 == 0) {
            h.p pVar = (h.p) obj;
            Object objX = ((bf) this.f27360a).x((com.waze.ui.l.bp) pVar.a(), this.f27361b, ((Number) pVar.b()).intValue(), (Integer) pVar.c(), eVar);
            return objX == h.c.a.a.f48038a ? objX : h.ab.f48028a;
        }
        if (i2 != 1) {
            ((bf) this.f27361b).v().b(com.waze.map.main.aa.h((com.waze.map.main.aa) this.f27360a, 0, 0, 0, 0, 0, ((Number) obj).intValue(), 0, 95));
            return h.ab.f48028a;
        }
        h.p pVar2 = (h.p) obj;
        int iIntValue = ((Number) pVar2.a()).intValue();
        Object objD = kotlinx.coroutines.aj.d(new bc(this.f27361b, (com.waze.ui.l.bp) pVar2.c(), (Integer) pVar2.b(), (bf) this.f27360a, iIntValue, null, 0), eVar);
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objD != aVar) {
            objD = h.ab.f48028a;
        }
        return objD == aVar ? objD : h.ab.f48028a;
    }

    x(bf bfVar, com.waze.map.main.aa aaVar, int i2) {
        this.f27362c = i2;
        this.f27361b = bfVar;
        this.f27360a = aaVar;
    }
}
