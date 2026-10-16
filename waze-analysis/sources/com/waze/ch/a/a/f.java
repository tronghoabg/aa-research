package com.waze.ch.a.a;

import androidx.autofill.HintConstants;
import com.waze.alerters.a.k;
import com.waze.app_nav.ah;
import com.waze.app_nav.w;
import e.a.cn;
import e.a.cp;
import e.a.cq;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f22349a;

    private f() {
    }

    public static e a(e.a.i iVar) {
        return (e) e.newStub(new d(), iVar);
    }

    public static cq b() {
        cq cqVarA;
        cq cqVar = f22349a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (f.class) {
            cqVarA = f22349a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.wazegeoads.proto.interfaces.client.AdEventsService", "ReportAdEvents"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(h.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(j.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f22349a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static final void c(w wVar, com.waze.web.c cVar) {
        k.c(wVar, cVar.a(), new ah(false, null, new com.waze.app_nav.f(com.waze.app_nav.g.f15207c)));
    }

    public static final org.a.d.i.b d() {
        return org.a.d.j.a.f56411b;
    }

    public static final org.a.d.i.a e(Enum r2) {
        x.f(r2, "enum");
        x.f(r2, "<this>");
        String lowerCase = r2.toString().toLowerCase(Locale.ROOT);
        x.e(lowerCase, "toLowerCase(...)");
        return new org.a.d.i.b(lowerCase);
    }

    public static final org.a.d.i.b f(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new org.a.d.i.b(str);
    }

    public static final org.a.d.h.a g(Object... objArr) {
        x.f(objArr, "parameters");
        return new org.a.d.h.a(h.a.c.aa(objArr), 2);
    }

    public static final Set h(List list) {
        x.f(list, "modules");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i(list, linkedHashSet);
        return linkedHashSet;
    }

    private static final void i(List list, Set set) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.a.d.g.a aVar = (org.a.d.g.a) it.next();
            set.add(aVar);
            i(aVar.d(), set);
        }
    }
}
