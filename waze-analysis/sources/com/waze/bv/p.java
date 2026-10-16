package com.waze.bv;

import com.waze.cs;
import com.waze.strings.DisplayStrings;
import h.ab;
import java.util.Objects;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f17546a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f17547b;

    p(Object obj, int i2) {
        this.f17547b = i2;
        this.f17546a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        h hVar;
        if (this.f17547b == 0) {
            h.k kVar = (h.k) obj;
            d dVar = (d) kVar.a();
            h hVar2 = (h) kVar.b();
            q qVar = (q) this.f17546a;
            qVar.f17548a.b(dVar);
            c cVar = qVar.f17548a;
            int i2 = hVar2.f17520d;
            cVar.a(i2);
            if (!hVar2.f17521e || !hVar2.f17522f || qVar.f17552e != i2 || hVar2.f17517a <= i2) {
                qVar.f17551d = true;
            }
            qVar.f17552e = i2;
            if (qVar.f17551d && hVar2.f17524h && !cs.f(qVar.f17550c)) {
                qVar.f17551d = false;
                qVar.f17549b.g(qVar.f17548a.c());
            }
            return ab.f48028a;
        }
        h.k kVar2 = (h.k) obj;
        n nVar = (n) kVar2.a();
        d dVar2 = (d) kVar2.b();
        l lVar = (l) this.f17546a;
        bn bnVar = lVar.f17536h;
        do {
            objD = bnVar.d();
            boolean z = ((h) objD).f17521e;
            boolean zBooleanValue = ((Boolean) lVar.f17532d.invoke()).booleanValue();
            hVar = new h(nVar.c(), nVar.d(), dVar2.f17509h, nVar.b(), false, false, false, false);
            if (dVar2.f17502a && !zBooleanValue && (nVar.c() != -1 || z)) {
                if (nVar.b() <= 0 || !((dVar2.f17506e || dVar2.f17503b) && dVar2.f17511j)) {
                    hVar = h.a(hVar, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_2);
                } else {
                    int iC = nVar.c();
                    int i3 = dVar2.f17507f;
                    boolean z2 = iC > (i3 > 0 ? nVar.b() + ((nVar.b() * i3) / 100) : nVar.b() - i3);
                    hVar = h.a(hVar, true, dVar2.f17510i || z2, z2, 15);
                }
            }
            com.waze.shared_infra.i.e eVar2 = lVar.f17533e;
            Objects.toString(hVar);
            eVar2.a("updating state: ".concat(hVar.toString()));
        } while (!bnVar.f(objD, hVar));
        return ab.f48028a;
    }
}
