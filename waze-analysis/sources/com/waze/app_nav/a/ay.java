package com.waze.app_nav.a;

import android.os.Bundle;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import androidx.activity.contextaware.ContextAware;
import com.waze.R;
import com.waze.car_lib.bq;
import com.waze.iv;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay implements com.waze.shared_infra.coordinators.g, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ay f15122a;

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f15123b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f15124c;

    /* renamed from: d, reason: collision with root package name */
    private static bv f15125d;

    static {
        ay ayVar = new ay();
        f15122a = ayVar;
        f15123b = h.g.b(h.h.f48130a, new a((org.a.d.a.a) ayVar, 4));
        f15124c = new ArrayList();
    }

    private ay() {
    }

    public static final bv e() {
        return f15125d;
    }

    public static final void f(bv bvVar) {
        f15125d = bvVar;
    }

    private static final bv g() {
        bv bvVar = f15125d;
        if (bvVar == null || bvVar.aL()) {
            return null;
        }
        return bvVar;
    }

    @Override // com.waze.shared_infra.coordinators.g
    public final void a(String str) {
        h.g.b.x.f(str, "presentableUuid");
        List<String> listAq = h.a.i.aq(f15124c);
        h.a.i.F(listAq);
        for (String str2 : listAq) {
            if (h.g.b.x.n(str2, str)) {
                return;
            } else {
                f15122a.c(str2);
            }
        }
    }

    @Override // com.waze.shared_infra.coordinators.g
    public final /* bridge */ /* synthetic */ void b(com.waze.shared_infra.coordinators.f fVar, boolean z, String str) {
        b bVar = (b) fVar;
        h.g.b.x.f(bVar, "presentable");
        h.g.b.x.f(str, "controllerId");
        f15124c.add(bVar.getUuid());
        if (z) {
            Bundle arguments = bVar.getArguments();
            if (arguments != null) {
                arguments.putString("COORDINATOR_CONTROLLER_ID_KEY", str);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("COORDINATOR_CONTROLLER_ID_KEY", str);
                bVar.setArguments(bundle);
            }
            bv bvVarG = g();
            if (bvVarG != null) {
                ch chVarU = bvVarG.u();
                h.g.b.x.e(chVarU, "beginTransaction(...)");
                chVarU.A();
                chVarU.u(bVar.getUuid());
                com.waze.app_nav.d dVarA = ((com.waze.app_nav.e) f15123b.getValue()).a(bVar.getClass());
                chVarU.z(dVarA.a(), dVarA.b(), dVarA.c(), dVarA.d());
                chVarU.r(R.id.coordinatorsView, bVar, bVar.getUuid());
                chVarU.l();
            }
        }
    }

    @Override // com.waze.shared_infra.coordinators.g
    public final void c(String str) {
        Object objA;
        bv bvVarG;
        h.g.b.x.f(str, "presentableUuid");
        try {
            ay ayVar = this;
            bv bvVarG2 = g();
            if (bvVarG2 != null) {
                bvVarG2.bb(str);
                objA = h.ab.f48028a;
            } else {
                objA = null;
            }
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (h.m.c(objA) != null) {
            try {
                bv bvVarG3 = g();
                if (bvVarG3 != null) {
                    bvVarG3.I(str);
                }
            } catch (Throwable th2) {
                e.b.c.a(th2);
            }
            h.g.b.x.f(str, "presentableUuid");
            bv bvVarG4 = g();
            ContextAware contextAwareH = bvVarG4 != null ? bvVarG4.h(str) : null;
            b bVar = contextAwareH instanceof b ? (b) contextAwareH : null;
            if (bVar != null && (bvVarG = g()) != null) {
                ch chVarU = bvVarG.u();
                h.g.b.x.e(chVarU, "beginTransaction(...)");
                chVarU.n(bVar);
                chVarU.l();
            }
        }
        Collection.EL.removeIf(f15124c, new bq(new iv(str, 3), 1));
    }

    @Override // com.waze.shared_infra.coordinators.g
    public final boolean d(String str) {
        List listX;
        android.support.v4.app.ar arVar;
        h.g.b.x.f(str, "presentableUuid");
        bv bvVarG = g();
        String tag = null;
        if (bvVarG != null && (listX = bvVarG.x()) != null && (arVar = (android.support.v4.app.ar) h.a.i.U(listX)) != null) {
            tag = arVar.getTag();
        }
        return h.g.b.x.n(tag, str);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
