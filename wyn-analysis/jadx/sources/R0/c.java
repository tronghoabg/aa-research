package R0;

import java.util.ArrayList;
import java.util.Iterator;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class c extends o {
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public int f10048l;

    public c(Q0.d dVar, int i5) {
        Q0.d dVar2;
        super(dVar);
        this.k = new ArrayList();
        this.f10085f = i5;
        Q0.d dVar3 = this.f10081b;
        Q0.d dVarM = dVar3.m(i5);
        while (true) {
            Q0.d dVar4 = dVarM;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f10085f);
            }
        }
        this.f10081b = dVar2;
        int i10 = this.f10085f;
        d dVar5 = i10 == 0 ? dVar2.f9546d : i10 == 1 ? dVar2.f9548e : null;
        ArrayList arrayList = this.k;
        arrayList.add(dVar5);
        Q0.d dVarL = dVar2.l(this.f10085f);
        while (dVarL != null) {
            int i11 = this.f10085f;
            arrayList.add(i11 == 0 ? dVarL.f9546d : i11 == 1 ? dVarL.f9548e : null);
            dVarL = dVarL.l(this.f10085f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            int i12 = this.f10085f;
            if (i12 == 0) {
                oVar.f10081b.f9542b = this;
            } else if (i12 == 1) {
                oVar.f10081b.f9544c = this;
            }
        }
        if (this.f10085f == 0 && ((Q0.e) this.f10081b.f9533T).v0 && arrayList.size() > 1) {
            this.f10081b = ((o) AbstractC3256n.e(arrayList, 1)).f10081b;
        }
        this.f10048l = this.f10085f == 0 ? this.f10081b.f9557i0 : this.f10081b.f9559j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    @Override // R0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(R0.d r28) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.c.a(R0.d):void");
    }

    @Override // R0.o
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        Q0.d dVar = ((o) arrayList.get(0)).f10081b;
        Q0.d dVar2 = ((o) arrayList.get(size - 1)).f10081b;
        int i5 = this.f10085f;
        f fVar = this.f10088i;
        f fVar2 = this.f10087h;
        if (i5 == 0) {
            Q0.c cVar = dVar.f9523I;
            Q0.c cVar2 = dVar2.f9525K;
            f fVarI = o.i(cVar, 0);
            int iE = cVar.e();
            Q0.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.f9523I.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(cVar2, 0);
            int iE2 = cVar2.e();
            Q0.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.f9525K.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            Q0.c cVar3 = dVar.f9524J;
            Q0.c cVar4 = dVar2.L;
            f fVarI3 = o.i(cVar3, 1);
            int iE3 = cVar3.e();
            Q0.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.f9524J.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(cVar4, 1);
            int iE4 = cVar4.e();
            Q0.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.L.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f10058a = this;
        fVar.f10058a = this;
    }

    @Override // R0.o
    public final void e() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i5)).e();
            i5++;
        }
    }

    @Override // R0.o
    public final void f() {
        this.f10082c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // R0.o
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j8 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j8 = r5.f10088i.f10063f + ((o) arrayList.get(i5)).j() + j8 + r5.f10087h.f10063f;
        }
        return j8;
    }

    @Override // R0.o
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!((o) arrayList.get(i5)).k()) {
                return false;
            }
        }
        return true;
    }

    public final Q0.d m() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i5 >= arrayList.size()) {
                return null;
            }
            Q0.d dVar = ((o) arrayList.get(i5)).f10081b;
            if (dVar.f9553g0 != 8) {
                return dVar;
            }
            i5++;
        }
    }

    public final Q0.d n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Q0.d dVar = ((o) arrayList.get(size)).f10081b;
            if (dVar.f9553g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f10085f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            sb2.append("<");
            sb2.append(oVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
