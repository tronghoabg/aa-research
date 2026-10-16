package com.waze.closure.c;

import android.graphics.Rect;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.R;
import com.waze.car_lib.r;
import com.waze.main_screen.p.m;
import com.waze.map.aw;
import com.waze.map.az;
import com.waze.map.b.Cdo;
import com.waze.map.b.aj;
import com.waze.map.b.bg;
import com.waze.map.b.bi;
import com.waze.map.b.ca;
import com.waze.map.b.cj;
import com.waze.map.b.co;
import com.waze.map.b.ct;
import com.waze.map.b.dn;
import com.waze.map.b.dz;
import com.waze.map.b.ea;
import com.waze.map.b.ed;
import com.waze.map.b.fi;
import com.waze.map.b.fj;
import com.waze.map.bc;
import com.waze.strings.DisplayStrings;
import h.g.b.x;
import h.m.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.closure.domain.g f22471a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.closure.domain.i f22472b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22473c;

    /* renamed from: d, reason: collision with root package name */
    private final ed f22474d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f22475e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f22476f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f22477g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f22478h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.n.c f22479i;

    public i(aj ajVar, cj cjVar, com.waze.closure.domain.g gVar, com.waze.closure.domain.i iVar) {
        x.f(ajVar, "mainMapController");
        x.f(cjVar, "mapViewControllerFactory");
        x.f(gVar, "closureService");
        x.f(iVar, "statsSender");
        this.f22471a = gVar;
        this.f22472b = iVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ClosureScreenViewModel");
        x.e(eVarD, "create(...)");
        this.f22473c = eVarD;
        ed edVarA = cjVar.a(eVarD, com.waze.map.b.ch.f28144a);
        this.f22474d = edVarA;
        this.f22479i = ajVar.p(edVarA);
        bn bnVarB = ck.b(new d(h.a.i.h(), new ea(false, null, 3), null));
        this.f22475e = bnVarB;
        bn bnVarB2 = ck.b(a.f22452a);
        this.f22476f = bnVarB2;
        this.f22477g = ai.U(bnVarB2);
        h hVar = new h(bnVarB);
        i iVar2 = this;
        af viewModelScope = ViewModelKt.getViewModelScope(iVar2);
        int i2 = bz.f51630a;
        this.f22478h = ai.V(hVar, viewModelScope, by.b(), false);
        iVar.d();
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(iVar2), null, null, new b(this, null), 3);
        ai.m(ai.K(bnVarB, new c(this, null)), ViewModelKt.getViewModelScope(iVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(com.waze.closure.c.i r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.closure.c.e
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.closure.c.e r0 = (com.waze.closure.c.e) r0
            int r1 = r0.f22465c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22465c = r1
            goto L18
        L13:
            com.waze.closure.c.e r0 = new com.waze.closure.c.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22463a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22465c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            com.waze.closure.domain.g r6 = r5.f22471a
            r0.f22465c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.waze.shared_infra.i.e r0 = r5.f22473c
            java.util.List r6 = (java.util.List) r6
            int r1 = r6.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "loaded closure candidates total="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.a(r1)
            kotlinx.coroutines.b.bn r0 = r5.f22475e
        L5a:
            java.lang.Object r1 = r0.d()
            r2 = r1
            com.waze.closure.c.d r2 = (com.waze.closure.c.d) r2
            r3 = 6
            r4 = 0
            com.waze.closure.c.d r2 = com.waze.closure.c.d.d(r2, r6, r4, r4, r3)
            boolean r1 = r0.f(r1, r2)
            if (r1 == 0) goto L5a
            kotlinx.coroutines.b.bn r5 = r5.f22476f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L78
            com.waze.closure.c.a r6 = com.waze.closure.c.a.f22453b
            goto L7a
        L78:
            com.waze.closure.c.a r6 = com.waze.closure.c.a.f22454c
        L7a:
            r5.e(r6)
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.closure.c.i.a(com.waze.closure.c.i, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ h.ab b(com.waze.closure.c.i r8, int r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "it"
            h.g.b.x.f(r10, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
        L9:
            kotlinx.coroutines.b.bn r0 = r8.f22475e
            java.lang.Object r1 = r0.d()
            r2 = r1
            com.waze.closure.c.d r2 = (com.waze.closure.c.d) r2
            r10.getClass()
            java.util.List r3 = r2.c()
            int r3 = r3.size()
            if (r9 >= r3) goto L6b
            r10.getClass()
            if (r9 >= 0) goto L25
            goto L6b
        L25:
            com.waze.shared_infra.i.e r3 = r8.f22473c
            java.util.List r4 = r2.c()
            r10.getClass()
            java.lang.Object r4 = r4.get(r9)
            com.waze.closure.a.a r4 = (com.waze.closure.a.a) r4
            int r4 = r4.b()
            java.util.List r5 = r2.c()
            r10.getClass()
            java.lang.Object r5 = r5.get(r9)
            com.waze.closure.a.a r5 = (com.waze.closure.a.a) r5
            int r5 = r5.c()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "selecting closure fromNodeId="
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = ", toNodeId="
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.a(r4)
            r3 = 3
            r4 = 0
            com.waze.closure.c.d r2 = com.waze.closure.c.d.d(r2, r4, r4, r10, r3)
            goto L90
        L6b:
            com.waze.shared_infra.i.e r3 = r8.f22473c
            java.util.List r4 = r2.c()
            int r4 = r4.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "invalid index num_candidates="
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = ", index="
            r5.append(r4)
            r5.append(r10)
            java.lang.String r4 = r5.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.g(r4)
        L90:
            boolean r0 = r0.f(r1, r2)
            if (r0 == 0) goto L9
            com.waze.closure.a.a r9 = i(r2)
            if (r9 == 0) goto La9
            com.waze.closure.domain.i r8 = r8.f22472b
            int r10 = r9.b()
            int r9 = r9.c()
            r8.a(r10, r9)
        La9:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.closure.c.i.b(com.waze.closure.c.i, int, java.lang.String):h.ab");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void e(i iVar, d dVar) {
        com.waze.shared_infra.h.a aVar;
        bc bcVar;
        List listC = dVar.c();
        ArrayList arrayList = new ArrayList(h.a.i.q(listC, 10));
        Iterator it = listC.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            aVar = null;
            com.waze.coroutines.b bVarA = null;
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            com.waze.closure.a.a aVar2 = (com.waze.closure.a.a) next;
            Integer numB = dVar.b();
            int i4 = 1;
            Object[] objArr = numB != null && numB.intValue() == i2;
            if (aVar2.f().isEmpty()) {
                bcVar = null;
            } else {
                bcVar = new bc((com.waze.shared_infra.h.c) h.a.i.P(aVar2.f()), new az(R.drawable.closure_arrow), null, aw.f27975e, null, true != objArr ? 1.0f : 1.3f, null, DisplayStrings.DS_RESUME_DIALOG_CONTENT_WORK);
            }
            if (bcVar != null) {
                bVarA = com.waze.map.c.a(bcVar, "", new m(iVar, i2, i4));
            }
            arrayList.add(bVarA);
            i2 = i3;
        }
        bi biVar = new bi((List) null, (List) null, h.a.i.ac(arrayList), dVar.b() == null ? h.a.i.h() : h.a.i.d(com.waze.map.c.d(new fi(((com.waze.closure.a.a) dVar.c().get(dVar.b().intValue())).f(), fj.f28345h))), (List) null, new ca(true, null, false, null, null, 1022), new dn(new com.waze.map.b.bz(z, z, z, 15)), 147);
        ed edVar = iVar.f22474d;
        edVar.b(biVar);
        h.m.h<com.waze.shared_infra.h.c> hVarM = k.m(h.a.i.av(dVar.c()), new r(2));
        com.waze.shared_infra.h.a aVar3 = new com.waze.shared_infra.h.a(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        for (com.waze.shared_infra.h.c cVar : hVarM) {
            aVar3 = new com.waze.shared_infra.h.a(Math.max(aVar3.b(), cVar.c()), Math.min(aVar3.c(), cVar.c()), Math.max(aVar3.a(), cVar.d()), Math.min(aVar3.d(), cVar.d()));
        }
        if (aVar3.b() > aVar3.c() && aVar3.a() > aVar3.d()) {
            aVar = aVar3;
        }
        if (aVar != null) {
            edVar.a(new bg(dVar.a(), new co(aVar.h(), ct.f28166b, 1.15f), Cdo.f28213a, false, 8));
        }
    }

    private static final com.waze.closure.a.a i(d dVar) {
        if (dVar.b() == null) {
            return null;
        }
        return (com.waze.closure.a.a) h.a.i.S(dVar.c(), dVar.b().intValue());
    }

    public final ch c() {
        return this.f22477g;
    }

    public final ch d() {
        return this.f22478h;
    }

    public final void f() {
        com.waze.closure.a.a aVarI = i((d) this.f22475e.d());
        if (aVarI == null) {
            this.f22473c.g("closure candidate not selected");
        } else {
            this.f22472b.b();
            this.f22471a.a(aVarI);
        }
    }

    public final void g() {
        this.f22472b.c();
    }

    public final void h(Rect rect) {
        bn bnVar;
        Object objD;
        x.f(rect, "rect");
        do {
            bnVar = this.f22475e;
            objD = bnVar.d();
        } while (!bnVar.f(objD, d.d((d) objD, null, new dz(rect), null, 5)));
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f22473c.a("view model cleared");
        this.f22479i.f();
    }
}
