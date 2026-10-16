package K8;

import A.AbstractC0213f;
import A7.C0295v;
import Va.Za;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p9.C3776A;
import qd.C3887b;
import qd.EnumC3886a;
import r9.InterfaceC3949f;

/* renamed from: K8.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0694f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6639a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6640b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6641c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6642d;

    public C0694f(boolean z2) {
        this.f6639a = z2;
    }

    public static c9.d b(p9.u uVar, c9.c cVar) {
        c9.d dVar = new c9.d(Collections.EMPTY_LIST, uVar.a());
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            s9.k kVar = (s9.k) ((Map.Entry) it.next()).getValue();
            if (uVar.g(kVar)) {
                dVar = dVar.a(kVar);
            }
        }
        return dVar;
    }

    public static boolean d(p9.u uVar, int i5, c9.d dVar, s9.o oVar) {
        if (uVar.f43417h != -1) {
            c9.c cVar = dVar.f19805a;
            if (i5 == cVar.size()) {
                s9.k kVar = uVar.f43418i == 1 ? (s9.k) cVar.d() : (s9.k) cVar.e();
                if (kVar != null && (kVar.c() || AbstractC0213f.b(kVar.f45385f, 2) || kVar.f45382c.compareTo(oVar) > 0)) {
                }
            }
            return true;
        }
        return false;
    }

    public c9.c a(c9.d dVar, p9.u uVar, s9.b bVar) {
        c9.c cVarG = ((Za) this.f6641c).g(uVar, bVar, null);
        Iterator it = dVar.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return cVarG;
            }
            s9.k kVar = (s9.k) c0295v.next();
            cVarG = cVarG.g(kVar.f45380a, kVar);
        }
    }

    public void c(EnumC3886a... enumC3886aArr) {
        if (!this.f6639a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[enumC3886aArr.length];
        for (int i5 = 0; i5 < enumC3886aArr.length; i5++) {
            strArr[i5] = enumC3886aArr[i5].f44208a;
        }
        this.f6641c = strArr;
    }

    public c9.c e(p9.u uVar) {
        if (uVar.h()) {
            return null;
        }
        C3776A c3776aI = uVar.i();
        int iK = ((InterfaceC3949f) this.f6642d).k(c3776aI);
        if (AbstractC0213f.b(iK, 1)) {
            return null;
        }
        if ((uVar.f43417h != -1) && AbstractC0213f.b(iK, 2)) {
            return e(uVar.f(-1L));
        }
        List listP = ((InterfaceC3949f) this.f6642d).p(c3776aI);
        A6.c.z(listP != null, "index manager must return results for partial and full indexes.", new Object[0]);
        c9.c cVarE = ((Za) this.f6641c).e(listP);
        s9.b bVarX = ((InterfaceC3949f) this.f6642d).x(c3776aI);
        c9.d dVarB = b(uVar, cVarE);
        return d(uVar, ((ArrayList) listP).size(), dVarB, bVarX.f45362a) ? e(uVar.f(-1L)) : a(dVarB, uVar, bVarX);
    }

    public void f(qd.m... mVarArr) {
        if (!this.f6639a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[mVarArr.length];
        for (int i5 = 0; i5 < mVarArr.length; i5++) {
            strArr[i5] = mVarArr[i5].f44257a;
        }
        this.f6642d = strArr;
    }

    public C0694f(C3887b c3887b) {
        this.f6639a = c3887b.f44210a;
        this.f6641c = c3887b.f44211b;
        this.f6642d = c3887b.f44212c;
        this.f6640b = c3887b.f44213d;
    }
}
