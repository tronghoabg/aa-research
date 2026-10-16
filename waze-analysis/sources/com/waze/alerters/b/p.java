package com.waze.alerters.b;

import com.waze.alerters.a.ac;
import com.waze.alerters.a.ad;
import com.waze.alerters.a.z;
import com.waze.navigate.cd;
import com.waze.navigate.ce;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p implements ce {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14259a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.alerters.a.l f14260b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.alerters.a.i f14261c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14262d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.alerters.l f14263e;

    /* renamed from: f, reason: collision with root package name */
    private h f14264f;

    /* renamed from: g, reason: collision with root package name */
    private final bn f14265g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f14266h;

    public p(kotlinx.coroutines.b.k kVar, com.waze.alerters.a.l lVar, com.waze.alerters.a.i iVar, com.waze.shared_infra.i.e eVar, com.waze.alerters.l lVar2, com.waze.calendar.b bVar) {
        x.f(kVar, "nativeUpdates");
        x.f(lVar, "nativeCallbacks");
        x.f(iVar, "alertsService");
        x.f(eVar, "logger");
        x.f(lVar2, "statsReporter");
        x.f(bVar, "config");
        this.f14259a = kVar;
        this.f14260b = lVar;
        this.f14261c = iVar;
        this.f14262d = eVar;
        this.f14263e = lVar2;
        this.f14264f = new h(null, false, false);
        bn bnVarB = ck.b(cd.f31163a);
        this.f14265g = bnVarB;
        this.f14266h = ai.U(bnVarB);
    }

    public static final /* synthetic */ h d(p pVar, h hVar) {
        ad adVarD;
        ad adVarD2;
        boolean zB = hVar.b();
        boolean zC = hVar.c();
        z zVarA = hVar.a();
        ac acVarB = (zVarA == null || (adVarD2 = zVarA.d()) == null) ? null : adVarD2.b();
        ac acVar = ac.f14149b;
        if (acVarB == acVar && !zB) {
            com.waze.shared_infra.i.e eVar = pVar.f14262d;
            z zVarA2 = hVar.a();
            Objects.toString(zVarA2);
            eVar.e("entering zone ".concat(String.valueOf(zVarA2)));
            pVar.f14261c.c(new i(pVar, hVar.a().b(), acVar));
            zB = true;
        }
        z zVarA3 = hVar.a();
        ac acVarB2 = (zVarA3 == null || (adVarD = zVarA3.d()) == null) ? null : adVarD.b();
        ac acVar2 = ac.f14150c;
        if (acVarB2 == acVar2 && !zC) {
            com.waze.shared_infra.i.e eVar2 = pVar.f14262d;
            z zVarA4 = hVar.a();
            Objects.toString(zVarA4);
            eVar2.e("exiting zone ".concat(String.valueOf(zVarA4)));
            pVar.f14261c.c(new i(pVar, com.waze.j.z(hVar.a().b(), null, null, null, null, -385), acVar2));
            zC = true;
        }
        return h.d(hVar, null, zB, zC, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    public static final /* synthetic */ h e(p pVar, h hVar, List list) {
        Object next;
        z next2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            z zVar = (z) obj;
            if (zVar.d() != null && zVar.b().g().b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        z zVarA = hVar.a();
        com.waze.k kVarC = zVarA != null ? zVarA.c() : null;
        ArrayList arrayList3 = arrayList2;
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((z) next).c(), kVarC)) {
                break;
            }
        }
        z zVar2 = (z) next;
        if (zVar2 == null) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int value = ((z) next2).e().getValue();
                    next2 = next2;
                    while (true) {
                        Object next3 = it2.next();
                        int value2 = ((z) next3).e().getValue();
                        int i2 = value > value2 ? value2 : value;
                        if (value > value2) {
                            next2 = next3;
                        }
                        if (!it2.hasNext()) {
                            break;
                        }
                        value = i2;
                        next2 = next2;
                    }
                }
            } else {
                next2 = 0;
            }
            zVar2 = next2;
        }
        z zVarA2 = hVar.a();
        if (x.n(zVarA2 != null ? zVarA2.c() : null, zVar2 != null ? zVar2.c() : null)) {
            return h.d(hVar, zVar2, false, false, 6);
        }
        com.waze.shared_infra.i.e eVar = pVar.f14262d;
        z zVarA3 = hVar.a();
        eVar.e("zone alert changed " + (zVarA3 != null ? zVarA3.c() : null) + " -> " + (zVar2 != null ? zVar2.c() : null));
        return new h(zVar2, false, false);
    }

    public final Object f(h.c.e eVar) {
        return aj.d(new o(this, null), eVar);
    }

    @Override // com.waze.navigate.ce
    public final ch i() {
        return this.f14266h;
    }
}
