package com.waze.alerters.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab implements i, h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14145a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f14146b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f14147c;

    public ab(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eVar, "logger");
        this.f14145a = eVar;
        bn bnVarB = ck.b(h.a.i.h());
        this.f14146b = bnVarB;
        this.f14147c = ai.U(bnVarB);
    }

    @Override // com.waze.alerters.a.h
    public final /* synthetic */ kotlinx.coroutines.b.k a() {
        return this.f14147c;
    }

    @Override // com.waze.alerters.a.i
    public final void b(com.waze.k kVar) {
        bn bnVar;
        Object objD;
        ArrayList arrayList;
        h.g.b.x.f(kVar, "alertId");
        Objects.toString(kVar);
        this.f14145a.e("removing alert alertId=".concat(String.valueOf(kVar)));
        do {
            bnVar = this.f14146b;
            objD = bnVar.d();
            arrayList = new ArrayList();
            for (Object obj : (List) objD) {
                if (!h.g.b.x.n(((c) obj).a(), kVar)) {
                    arrayList.add(obj);
                }
            }
        } while (!bnVar.f(objD, arrayList));
    }

    @Override // com.waze.alerters.a.i
    public final boolean c(c cVar) {
        bn bnVar;
        Object objD;
        List listAg;
        Object next;
        boolean z;
        h.g.b.x.f(cVar, "alert");
        com.waze.k kVarA = cVar.a();
        Objects.toString(kVarA);
        String strConcat = "adding alert alertId=".concat(String.valueOf(kVarA));
        com.waze.shared_infra.i.e eVar = this.f14145a;
        eVar.e(strConcat);
        do {
            bnVar = this.f14146b;
            objD = bnVar.d();
            listAg = (List) objD;
            Iterator it = listAg.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (h.g.b.x.n(((c) next).a(), cVar.a())) {
                    break;
                }
            }
            if (next == null) {
                listAg = h.a.i.ag(listAg, new aa(this, cVar));
                z = true;
            } else {
                z = false;
            }
        } while (!bnVar.f(objD, listAg));
        if (!z) {
            eVar.g("alertId=" + cVar.a() + " is already inserted");
        }
        return z;
    }
}
