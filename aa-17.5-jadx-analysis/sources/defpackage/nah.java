package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class nah implements ctw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nah(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.m(this, csqVar, list, i) : tr.m(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.n(this, csqVar, list, i) : tr.n(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.o(this, csqVar, list, i) : tr.o(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.p(this, csqVar, list, i) : tr.p(this, csqVar, list, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [afec, java.lang.Object] */
    @Override // defpackage.ctw
    public final ctq e(cts ctsVar, List list, long j) {
        int iA;
        ArrayList arrayList;
        if (this.b != 0) {
            List list2 = (List) list.get(0);
            List list3 = (List) list.get(1);
            List list4 = (List) list.get(2);
            int size = list2.size();
            afft afftVar = new afft();
            int iB = dle.b(j);
            if (size > 0) {
                afftVar.a = iB / size;
            }
            Integer numValueOf = 0;
            int size2 = list2.size();
            for (int i = 0; i < size2; i++) {
                numValueOf = Integer.valueOf(Math.max(((cto) list2.get(i)).c(afftVar.a), numValueOf.intValue()));
            }
            int iIntValue = numValueOf.intValue();
            Object obj = this.a;
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                float fEy = ctsVar.ey(Math.min(((cto) list2.get(i2)).d(iIntValue), afftVar.a));
                float f = brb.b;
                arrayList2.add(new brc(ctsVar.ey(afftVar.a) * i2, ctsVar.ey(afftVar.a), ((dlj) affa.y(new dlj(fEy - (f + f)), new dlj(24.0f))).a));
            }
            ((sm) obj).a.b(arrayList2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                cto ctoVar = (cto) list2.get(i3);
                int i4 = afftVar.a;
                arrayList3.add(ctoVar.v(dle.l(i4, i4, iIntValue, iIntValue)));
            }
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size4 = list3.size();
            for (int i5 = 0; i5 < size4; i5++) {
                arrayList4.add(((cto) list3.get(i5)).v(dle.m(j, 0, 0, 0, 0, 11)));
            }
            ArrayList arrayList5 = new ArrayList(list4.size());
            int size5 = list4.size();
            for (int i6 = 0; i6 < size5; i6++) {
                cto ctoVar2 = (cto) list4.get(i6);
                int i7 = afftVar.a;
                arrayList5.add(ctoVar2.v(dle.l(i7, i7, 0, iIntValue)));
            }
            return ctsVar.eK(iB, iIntValue, afbf.a, new ciw(arrayList3, arrayList4, arrayList5, afftVar, iIntValue, 1));
        }
        ctsVar.getClass();
        List listBS = woy.bS(list, 1);
        ArrayList arrayList6 = new ArrayList();
        Iterator it = listBS.iterator();
        while (it.hasNext()) {
            cto ctoVar3 = (cto) woy.bH((List) it.next());
            if (ctoVar3 != null) {
                arrayList6.add(ctoVar3);
            }
        }
        List list5 = (List) woy.bK(list);
        if (arrayList6.isEmpty()) {
            return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new nag(0));
        }
        int iE = ((cto) woy.bF(arrayList6)).e(dle.b(j));
        if (acsx.C()) {
            iA = iE > 0 ? dle.a(j) / iE : 0;
            this.a.invoke(Integer.valueOf(iA));
            if (iA <= 0) {
                return ctsVar.eK(dle.d(j), dle.c(j), afbf.a, new nag(2));
            }
        } else {
            iA = dle.a(j) / iE;
            this.a.invoke(Integer.valueOf(iA));
        }
        afbt afbtVar = new afbt(10);
        int iA2 = dle.a(j) != Integer.MAX_VALUE ? dle.a(j) : dle.c(j);
        float f2 = iA2 / iA;
        int iK = afgi.k(f2) * iA;
        int i8 = iA2 - iK;
        int iB2 = 0;
        for (cto ctoVar4 : woy.cd(arrayList6, iA)) {
            int iSignum = Integer.signum(i8);
            i8 -= iSignum;
            int iE2 = afpt.e(afgi.k(f2) + iSignum, 0);
            cuo cuoVarV = ctoVar4.v(dle.m(j, 0, 0, iE2, iE2, 3));
            iB2 = Math.max(iB2, cuoVarV.a);
            afbtVar.add(cuoVarV);
        }
        List listF = afbtVar.f();
        int iA3 = dle.a(j);
        int i9 = 0;
        ListIterator listIterator = ((afbt) listF).listIterator(0);
        while (listIterator.hasNext()) {
            i9 += ((cuo) listIterator.next()).b;
        }
        int i10 = iA3 - i9;
        byte[] bArr = null;
        if (i10 >= iE) {
            arrayList = new ArrayList(woy.bp(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList.add(((cto) it2.next()).v(dle.m(j, 0, 0, 0, i10, 3)));
            }
        } else {
            arrayList = null;
        }
        if (dle.b(j) != Integer.MAX_VALUE) {
            iB2 = dle.b(j);
        }
        return ctsVar.eK(iB2, dle.a(j), afbf.a, new lyb(listF, arrayList, 15, bArr));
    }
}
