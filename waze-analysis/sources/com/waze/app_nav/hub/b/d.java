package com.waze.app_nav.hub.b;

import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15259b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f15260c;

    public d(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f15259b = eVar;
        this.f15260c = ck.b(h.a.i.h());
    }

    @Override // com.waze.app_nav.hub.b.c
    public final /* synthetic */ ch a() {
        return this.f15260c;
    }

    @Override // com.waze.app_nav.hub.b.c
    public final void b(k kVar) {
        bn bnVar;
        Object objD;
        List listAg;
        x.f(kVar, "popup");
        do {
            bnVar = this.f15260c;
            objD = bnVar.d();
            List list = (List) objD;
            listAg = h.a.i.ag(list, kVar);
            this.f15259b.a("addPopup queueSize=" + list.size() + "->" + listAg.size() + ", popup=" + kVar);
        } while (!bnVar.f(objD, listAg));
    }

    @Override // com.waze.app_nav.hub.b.c
    public final void c(k kVar) {
        bn bnVar;
        Object objD;
        ArrayList arrayList;
        x.f(kVar, "popup");
        do {
            bnVar = this.f15260c;
            objD = bnVar.d();
            List list = (List) objD;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!x.n((k) obj, kVar)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
            this.f15259b.a("removePopup queueSize=" + list.size() + "->" + arrayList.size() + " popup=" + kVar);
        } while (!bnVar.f(objD, arrayList));
    }
}
