package R0;

import A7.AbstractC0279p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f10074f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10075a;

    /* renamed from: b, reason: collision with root package name */
    public int f10076b;

    /* renamed from: c, reason: collision with root package name */
    public int f10077c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10078d;

    /* renamed from: e, reason: collision with root package name */
    public int f10079e;

    public final void a(ArrayList arrayList) {
        int size = this.f10075a.size();
        if (this.f10079e != -1 && size > 0) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                n nVar = (n) arrayList.get(i5);
                if (this.f10079e == nVar.f10076b) {
                    c(this.f10077c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(O0.c cVar, int i5) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f10075a;
        if (arrayList.size() == 0) {
            return 0;
        }
        Q0.e eVar = (Q0.e) ((Q0.d) arrayList.get(0)).f9533T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((Q0.d) arrayList.get(i10)).b(cVar, false);
        }
        if (i5 == 0 && eVar.f9600z0 > 0) {
            Q0.j.a(eVar, cVar, arrayList, 0);
        }
        if (i5 == 1 && eVar.f9581A0 > 0) {
            Q0.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        this.f10078d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Q0.d dVar = (Q0.d) arrayList.get(i11);
            x4.d dVar2 = new x4.d(25);
            new WeakReference(dVar);
            O0.c.n(dVar.f9523I);
            O0.c.n(dVar.f9524J);
            O0.c.n(dVar.f9525K);
            O0.c.n(dVar.L);
            O0.c.n(dVar.f9526M);
            this.f10078d.add(dVar2);
        }
        if (i5 == 0) {
            iN = O0.c.n(eVar.f9523I);
            iN2 = O0.c.n(eVar.f9525K);
            cVar.t();
        } else {
            iN = O0.c.n(eVar.f9524J);
            iN2 = O0.c.n(eVar.L);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i5, n nVar) {
        Iterator it = this.f10075a.iterator();
        while (it.hasNext()) {
            Q0.d dVar = (Q0.d) it.next();
            ArrayList arrayList = nVar.f10075a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i10 = nVar.f10076b;
            if (i5 == 0) {
                dVar.f9566n0 = i10;
            } else {
                dVar.f9568o0 = i10;
            }
        }
        this.f10079e = nVar.f10076b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i5 = this.f10077c;
        sb2.append(i5 == 0 ? "Horizontal" : i5 == 1 ? "Vertical" : i5 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strJ = AbstractC0279p0.j(this.f10076b, "] <", sb2);
        Iterator it = this.f10075a.iterator();
        while (it.hasNext()) {
            Q0.d dVar = (Q0.d) it.next();
            StringBuilder sbQ = AbstractC0279p0.q(strJ, StringUtils.SPACE);
            sbQ.append(dVar.f9555h0);
            strJ = sbQ.toString();
        }
        return N0.a.f(strJ, " >");
    }
}
