package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccz implements defpackage.affg, defpackage.affh, defpackage.affi, defpackage.affj, defpackage.affk, defpackage.affl, defpackage.affm, defpackage.affn, defpackage.afes, defpackage.afet, defpackage.afev, defpackage.afew, defpackage.afex, defpackage.afey, defpackage.afez, defpackage.affa, defpackage.affb, defpackage.affd, defpackage.affe {
    public final boolean a;
    public java.lang.Object b;
    public java.util.List c;
    public defpackage.bxl d;
    private final int e;

    public ccz(int i, boolean z, java.lang.Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void h(defpackage.bve bveVar) {
        defpackage.bxl bxlVarP;
        if (!this.a || (bxlVarP = ((defpackage.bwc) bveVar).P()) == null) {
            return;
        }
        bxlVarP.q();
        if (defpackage.dai.ar(this.d, bxlVarP)) {
            this.d = bxlVarP;
            return;
        }
        java.util.List list = this.c;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.c = arrayList;
            arrayList.add(bxlVarP);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (defpackage.dai.ar((defpackage.bxl) list.get(i), bxlVarP)) {
                list.set(i, bxlVarP);
                return;
            }
        }
        list.add(bxlVarP);
    }

    public final java.lang.Object a(defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(this.e);
        h(bveVarC);
        int i2 = true != bveVarC.C(this) ? 2 : 4;
        java.lang.Object obj = this.b;
        obj.getClass();
        defpackage.afgz.g(obj, 2);
        java.lang.Object objInvoke = ((defpackage.affg) obj).invoke(bveVarC, java.lang.Integer.valueOf(i | i2));
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.aqg(this, 2, (char[]) null);
        }
        return objInvoke;
    }

    public final java.lang.Object b(java.lang.Object obj, defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(this.e);
        h(bveVarC);
        int i2 = true != bveVarC.C(this) ? 16 : 32;
        java.lang.Object obj2 = this.b;
        obj2.getClass();
        defpackage.afgz.g(obj2, 3);
        java.lang.Object objInvoke = ((defpackage.affh) obj2).invoke(obj, bveVarC, java.lang.Integer.valueOf(i2 | i));
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.dbk(this, obj, i, 1);
        }
        return objInvoke;
    }

    public final java.lang.Object c(java.lang.Object obj, java.lang.Object obj2, defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(this.e);
        h(bveVarC);
        int i2 = true != bveVarC.C(this) ? 128 : 256;
        java.lang.Object obj3 = this.b;
        obj3.getClass();
        defpackage.afgz.g(obj3, 4);
        java.lang.Object objInvoke = ((defpackage.affi) obj3).invoke(obj, obj2, bveVarC, java.lang.Integer.valueOf(i2 | i));
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(this, obj, obj2, i, 7, null);
        }
        return objInvoke;
    }

    public final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(this.e);
        h(bveVarC);
        int i2 = true != bveVarC.C(this) ? 1024 : 2048;
        java.lang.Object obj4 = this.b;
        obj4.getClass();
        defpackage.afgz.g(obj4, 5);
        java.lang.Object objInvoke = ((defpackage.affj) obj4).invoke(obj, obj2, obj3, bveVarC, java.lang.Integer.valueOf(i2 | i));
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bhr(this, obj, obj2, obj3, i, 2);
        }
        return objInvoke;
    }

    public final java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(this.e);
        h(bveVarC);
        int i2 = true != bveVarC.C(this) ? 8192 : 16384;
        java.lang.Object obj5 = this.b;
        obj5.getClass();
        defpackage.afgz.g(obj5, 6);
        java.lang.Object objInvoke = ((defpackage.affk) obj5).invoke(obj, obj2, obj3, obj4, bveVarC, java.lang.Integer.valueOf(i | i2));
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.ago(this, obj, obj2, obj3, obj4, i, 2);
        }
        return objInvoke;
    }

    public final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(this.e);
        h(bveVarC);
        int i2 = true != bveVarC.C(this) ? 524288 : 1048576;
        java.lang.Object obj7 = this.b;
        obj7.getClass();
        defpackage.afgz.g(obj7, 8);
        java.lang.Object objInvoke = ((defpackage.affm) obj7).invoke(obj, obj2, obj3, obj4, obj5, obj6, bveVarC, java.lang.Integer.valueOf(i | i2));
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.ccy(this, obj, obj2, obj3, obj4, obj5, obj6, i, 0);
        }
        return objInvoke;
    }

    public final java.lang.Object g(final java.lang.Object obj, final java.lang.Object obj2, final java.lang.Object obj3, final java.lang.Object obj4, final java.lang.Object obj5, final java.lang.Object obj6, final java.lang.Object obj7, defpackage.bve bveVar, final int i) {
        defpackage.bve bveVarC = bveVar.c(this.e);
        h(bveVarC);
        int i2 = true != bveVarC.C(this) ? 4194304 : 8388608;
        java.lang.Object obj8 = this.b;
        obj8.getClass();
        defpackage.afgz.g(obj8, 9);
        java.lang.Object objInvoke = ((defpackage.affn) obj8).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, bveVarC, java.lang.Integer.valueOf(i | i2));
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: ccx
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj9, java.lang.Object obj10) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj9;
                    ((java.lang.Integer) obj10).intValue();
                    defpackage.ccz cczVar = this.a;
                    java.lang.Object obj11 = obj;
                    java.lang.Object obj12 = obj2;
                    java.lang.Object obj13 = obj3;
                    int i3 = i;
                    int i4 = 306783378 & i3;
                    int i5 = 613566756 & i3;
                    cczVar.g(obj11, obj12, obj13, obj4, obj5, obj6, obj7, bveVar2, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5) | 1);
                    return defpackage.afbk.a;
                }
            };
        }
        return objInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affm
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return f(obj, obj2, obj3, obj4, obj5, obj6, obj7, ((java.lang.Number) obj8).intValue());
    }

    @Override // defpackage.affh
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return b(obj, (defpackage.bve) obj2, ((java.lang.Number) obj3).intValue());
    }

    @Override // defpackage.affi
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return c(obj, obj2, (defpackage.bve) obj3, ((java.lang.Number) obj4).intValue());
    }

    @Override // defpackage.affj
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return d(obj, obj2, obj3, (defpackage.bve) obj4, ((java.lang.Number) obj5).intValue());
    }

    @Override // defpackage.affk
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return e(obj, obj2, obj3, obj4, (defpackage.bve) obj5, ((java.lang.Number) obj6).intValue());
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return a((defpackage.bve) obj, ((java.lang.Number) obj2).intValue());
    }

    @Override // defpackage.affn
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) {
        return g(obj, obj2, obj3, obj4, obj5, obj6, obj7, (defpackage.bve) obj8, ((java.lang.Number) obj9).intValue());
    }
}
