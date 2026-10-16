package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nax implements defpackage.cuf {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public nax(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int a(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.ty.f(this, cszVar, list, i) : defpackage.ty.f(this, cszVar, list, i);
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int b(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.ty.g(this, cszVar, list, i) : defpackage.ty.g(this, cszVar, list, i);
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int c(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.ty.h(this, cszVar, list, i) : defpackage.ty.h(this, cszVar, list, i);
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int d(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.ty.i(this, cszVar, list, i) : defpackage.ty.i(this, cszVar, list, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [affc, java.lang.Object] */
    @Override // defpackage.cuf
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        int iA;
        java.util.ArrayList arrayList;
        int i = 0;
        if (this.b != 0) {
            java.util.List list2 = (java.util.List) list.get(0);
            java.util.List list3 = (java.util.List) list.get(1);
            java.util.List list4 = (java.util.List) list.get(2);
            int size = list2.size();
            defpackage.afgt afgtVar = new defpackage.afgt();
            int iB = defpackage.dlm.b(j);
            if (size > 0) {
                afgtVar.a = iB / size;
            }
            java.lang.Integer numValueOf = 0;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(((defpackage.ctx) list2.get(i2)).c(afgtVar.a), numValueOf.intValue()));
            }
            int iIntValue = numValueOf.intValue();
            java.lang.Object obj = this.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                float fDG = cubVar.dG(java.lang.Math.min(((defpackage.ctx) list2.get(i3)).d(iIntValue), afgtVar.a));
                float f = brh.b;
                arrayList2.add(new bri(cubVar.dG(afgtVar.a) * i3, cubVar.dG(afgtVar.a), ((defpackage.dlr) defpackage.afga.y(new defpackage.dlr(fDG - (f + f)), new defpackage.dlr(24.0f))).a));
            }
            ((defpackage.sr) obj).a.b(arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
            int size3 = list2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                defpackage.ctx ctxVar = (defpackage.ctx) list2.get(i4);
                int i5 = afgtVar.a;
                arrayList3.add(ctxVar.v(defpackage.dlm.l(i5, i5, iIntValue, iIntValue)));
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list3.size());
            int size4 = list3.size();
            int i6 = 0;
            while (i6 < size4) {
                arrayList4.add(((defpackage.ctx) list3.get(i6)).v(defpackage.dlm.m(j, 0, 0, 0, 0, 11)));
                i6++;
                list3 = list3;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(list4.size());
            int size5 = list4.size();
            for (int i7 = 0; i7 < size5; i7++) {
                defpackage.ctx ctxVar2 = (defpackage.ctx) list4.get(i7);
                int i8 = afgtVar.a;
                arrayList5.add(ctxVar2.v(defpackage.dlm.l(i8, i8, 0, iIntValue)));
            }
            return cubVar.dS(iB, iIntValue, defpackage.afcf.a, new cje(arrayList3, arrayList4, arrayList5, afgtVar, iIntValue, 1));
        }
        cubVar.getClass();
        java.util.List listAM = defpackage.afga.aM(list, 1);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Iterator it = listAM.iterator();
        while (it.hasNext()) {
            defpackage.ctx ctxVar3 = (defpackage.ctx) defpackage.afga.aB((java.util.List) it.next());
            if (ctxVar3 != null) {
                arrayList6.add(ctxVar3);
            }
        }
        java.util.List list5 = (java.util.List) defpackage.afga.aE(list);
        if (arrayList6.isEmpty()) {
            return cubVar.dS(defpackage.dlm.d(j), defpackage.dlm.c(j), defpackage.afcf.a, new defpackage.nao(5));
        }
        int iE = ((defpackage.ctx) defpackage.afga.az(arrayList6)).e(defpackage.dlm.b(j));
        if (defpackage.actz.C()) {
            iA = iE > 0 ? defpackage.dlm.a(j) / iE : 0;
            this.a.invoke(java.lang.Integer.valueOf(iA));
            if (iA <= 0) {
                return cubVar.dS(defpackage.dlm.d(j), defpackage.dlm.c(j), defpackage.afcf.a, new defpackage.nao(6));
            }
        } else {
            iA = defpackage.dlm.a(j) / iE;
            this.a.invoke(java.lang.Integer.valueOf(iA));
        }
        defpackage.afct afctVar = new defpackage.afct(10);
        int iA2 = defpackage.dlm.a(j) != Integer.MAX_VALUE ? defpackage.dlm.a(j) : defpackage.dlm.c(j);
        float f2 = iA2 / iA;
        int iK = defpackage.afhi.k(f2) * iA;
        int i9 = iA2 - iK;
        int iB2 = 0;
        for (defpackage.ctx ctxVar4 : defpackage.afga.aX(arrayList6, iA)) {
            int iSignum = java.lang.Integer.signum(i9);
            i9 -= iSignum;
            int iE2 = defpackage.afqt.e(defpackage.afhi.k(f2) + iSignum, 0);
            defpackage.cux cuxVarV = ctxVar4.v(defpackage.dlm.m(j, 0, 0, iE2, iE2, 3));
            iB2 = java.lang.Math.max(iB2, cuxVarV.a);
            afctVar.add(cuxVarV);
        }
        java.util.List listF = afctVar.f();
        int iA3 = defpackage.dlm.a(j);
        java.util.ListIterator listIterator = ((defpackage.afct) listF).listIterator(0);
        while (listIterator.hasNext()) {
            i += ((defpackage.cux) listIterator.next()).b;
        }
        int i10 = iA3 - i;
        byte[] bArr = null;
        if (i10 >= iE) {
            arrayList = new java.util.ArrayList(defpackage.afga.aj(list5, 10));
            java.util.Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                int i11 = i10;
                arrayList.add(((defpackage.ctx) it2.next()).v(defpackage.dlm.m(j, 0, 0, 0, i11, 3)));
                i10 = i11;
            }
        } else {
            arrayList = null;
        }
        if (defpackage.dlm.b(j) != Integer.MAX_VALUE) {
            iB2 = defpackage.dlm.b(j);
        }
        return cubVar.dS(iB2, defpackage.dlm.a(j), defpackage.afcf.a, new defpackage.lyi(listF, arrayList, 15, bArr));
    }
}
