package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mtt implements defpackage.cuf {
    final /* synthetic */ float a;
    final /* synthetic */ boolean b;
    final /* synthetic */ defpackage.affg c;

    public mtt(float f, boolean z, defpackage.affg affgVar) {
        this.a = f;
        this.b = z;
        this.c = affgVar;
    }

    public static final int f(defpackage.cux cuxVar, boolean z) {
        return z ? cuxVar.a : cuxVar.b;
    }

    private static final long g(long j, boolean z, int i) {
        return z ? defpackage.dlm.m(j, 0, i, 0, 0, 12) : defpackage.dlm.m(j, 0, 0, 0, i, 3);
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int a(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.ty.f(this, cszVar, list, i);
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int b(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.ty.g(this, cszVar, list, i);
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int c(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.ty.h(this, cszVar, list, i);
    }

    @Override // defpackage.cuf
    public final /* synthetic */ int d(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.ty.i(this, cszVar, list, i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // defpackage.cuf
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        java.lang.Integer numValueOf;
        cubVar.getClass();
        float f = this.a;
        int iDN = cubVar.dN(f);
        boolean z = this.b;
        int iB = z ? defpackage.dlm.b(j) : defpackage.dlm.a(j);
        defpackage.dlr dlrVar = (defpackage.dlr) this.c.invoke(cubVar, new defpackage.dlm(j));
        java.lang.Integer num = null;
        if (dlrVar == null) {
            numValueOf = null;
        } else {
            if (true == z) {
                dlrVar = null;
            }
            if (dlrVar != null) {
                numValueOf = java.lang.Integer.valueOf(cubVar.dN(dlrVar.a + f + 0.0f));
            } else {
                numValueOf = null;
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : (iDN + iB) / 2;
        java.lang.Iterable iterable = (java.lang.Iterable) defpackage.afga.az(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.ctx) it.next()).v(g(j, z, iIntValue)));
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(f((defpackage.cux) it2.next(), z));
            loop1: while (true) {
                num = numValueOf2;
                do {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    numValueOf2 = java.lang.Integer.valueOf(f((defpackage.cux) it2.next(), z));
                } while (num.compareTo(numValueOf2) >= 0);
            }
        }
        if (num != null) {
            iB -= num.intValue();
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) list.get(1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(iterable2, 10));
        java.util.Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((defpackage.ctx) it3.next()).v(g(j, z, iB)));
        }
        return cubVar.dS(defpackage.dlm.b(j), defpackage.dlm.a(j), defpackage.afcf.a, new defpackage.glo(defpackage.afga.ac(arrayList, arrayList2), z, 4));
    }
}
