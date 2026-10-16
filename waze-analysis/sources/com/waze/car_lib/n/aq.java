package com.waze.car_lib.n;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20375a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f20376b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f20377c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f20378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(ar arVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20378d = i2;
        this.f20376b = arVar;
        this.f20377c = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f20378d;
        Object obj2 = this.f20376b;
        if (i2 != 0) {
            return new aq((r) obj2, (v) this.f20377c, eVar, 1);
        }
        return new aq((ar) obj2, (String) this.f20377c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20378d != 0 ? ((aq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        ArrayList arrayList;
        if (this.f20378d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20375a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f20376b;
                Object obj3 = this.f20377c;
                this.f20375a = 1;
                if (r.a((r) obj2, (v) obj3, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f20375a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj4 = this.f20376b;
            Object obj5 = this.f20377c;
            ar arVar = (ar) obj4;
            this.f20375a = 1;
            obj = b.a(arVar.f20382d, (String) obj5, arVar.f20388j.d() instanceof ak, this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        Object obj6 = this.f20376b;
        Object obj7 = this.f20377c;
        List list = (List) obj;
        ar arVar2 = (ar) obj6;
        bn bnVar = arVar2.f20388j;
        do {
            objD = bnVar.d();
            List<com.waze.w.i> list2 = list;
            arrayList = new ArrayList(h.a.i.q(list2, 10));
            for (com.waze.w.i iVar : list2) {
                com.waze.shared_infra.h.c cVarD = iVar.b().d();
                Location location = (Location) arVar2.f20381c.c().d();
                com.waze.shared_infra.h.c cVarL = location != null ? com.waze.notifications.c.k.l(location) : com.waze.shared_infra.h.c.f37873a;
                Integer numValueOf = null;
                if (((cVarD.h() && cVarL.h()) ? cVarL : null) != null) {
                    numValueOf = Integer.valueOf((int) Math.rint(com.waze.sharedui.utils.f.b(cVarD, cVarL)));
                }
                arrayList.add(new ad(iVar, numValueOf));
            }
        } while (!bnVar.f(objD, new aj((String) obj7, arrayList)));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(r rVar, v vVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20378d = i2;
        this.f20376b = rVar;
        this.f20377c = vVar;
    }
}
