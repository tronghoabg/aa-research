package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bfl implements defpackage.cty {
    private final defpackage.afer a;
    private final defpackage.afer b;

    public bfl(defpackage.afer aferVar, defpackage.afer aferVar2) {
        this.a = aferVar;
        this.b = aferVar2;
    }

    @Override // defpackage.cty
    public final /* synthetic */ int a(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.q(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int b(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.r(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int c(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.s(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int d(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.t(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        java.util.ArrayList arrayList;
        defpackage.afau afauVar;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (!(((defpackage.ctx) obj).g() instanceof defpackage.bfn)) {
                arrayList2.add(obj);
            }
        }
        java.util.List list2 = (java.util.List) this.b.invoke();
        if (list2 != null) {
            arrayList = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                defpackage.cjj cjjVar = (defpackage.cjj) list2.get(i2);
                if (cjjVar != null) {
                    defpackage.ctx ctxVar = (defpackage.ctx) arrayList2.get(i2);
                    float f = cjjVar.d;
                    float f2 = cjjVar.b;
                    float fFloor = (float) java.lang.Math.floor(f - f2);
                    float f3 = cjjVar.e;
                    float f4 = cjjVar.c;
                    afauVar = new defpackage.afau(ctxVar.v(defpackage.dln.d(0, (int) fFloor, 0, (int) java.lang.Math.floor(f3 - f4))), new defpackage.dlw((((long) java.lang.Math.round(f2)) << 32) | (((long) java.lang.Math.round(f4)) & 4294967295L)));
                } else {
                    afauVar = null;
                }
                if (afauVar != null) {
                    arrayList.add(afauVar);
                }
            }
        } else {
            arrayList = null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            java.lang.Object obj2 = list.get(i3);
            if (((defpackage.ctx) obj2).g() instanceof defpackage.bfn) {
                arrayList3.add(obj2);
            }
        }
        return cubVar.dS(defpackage.dlm.b(j), defpackage.dlm.a(j), defpackage.afcf.a, new defpackage.beh(arrayList, defpackage.afw.I(arrayList3, this.a), 5, null));
    }
}
