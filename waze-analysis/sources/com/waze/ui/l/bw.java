package com.waze.ui.l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg f42632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f42633b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f42634c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f42635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bw(cg cgVar, ad adVar, ad adVar2, h.c.e eVar) {
        super(2, eVar);
        this.f42632a = cgVar;
        this.f42633b = adVar;
        this.f42634c = adVar2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bw bwVar = new bw(this.f42632a, this.f42633b, this.f42634c, eVar);
        bwVar.f42635d = obj;
        return bwVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        bk blVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f42635d;
        List listK = h.a.i.k(this.f42633b, this.f42634c);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listK) {
            if (((ad) obj2).e()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (obj3 instanceof t) {
                arrayList4.add(obj3);
            }
        }
        t tVar = (t) h.a.i.R(arrayList4);
        if (tVar != null) {
            blVar = new bj(tVar);
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (obj4 instanceof aa) {
                    arrayList5.add(obj4);
                }
            }
            aa aaVar = (aa) h.a.i.R(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : arrayList3) {
                if (obj5 instanceof r) {
                    arrayList6.add(obj5);
                }
            }
            r rVar = (r) h.a.i.R(arrayList6);
            blVar = (aaVar == null || rVar == null) ? !arrayList2.isEmpty() ? new bl((ad) h.a.i.P(arrayList2)) : bk.f42580a : new bm(aaVar, rVar);
        }
        cg cgVar = this.f42632a;
        if (cgVar.y()) {
            Objects.toString(blVar);
            Log.d("InsightState", "Switching to Plan: ".concat(blVar.toString()));
        }
        if (blVar instanceof bk) {
            kotlinx.coroutines.aj.z(afVar, null, null, new au(cgVar, (h.c.e) null, 6), 3);
            return kotlinx.coroutines.aj.z(afVar, null, null, new au(cgVar, (h.c.e) null, 7, (byte[]) null), 3);
        }
        if (blVar instanceof bl) {
            cg.o(cgVar, afVar, (bl) blVar);
            return h.ab.f48028a;
        }
        if (blVar instanceof bj) {
            cg.n(cgVar, afVar, (bj) blVar);
            return h.ab.f48028a;
        }
        if (!(blVar instanceof bm)) {
            throw new h.i();
        }
        cg.p(cgVar, afVar, (bm) blVar);
        return h.ab.f48028a;
    }
}
