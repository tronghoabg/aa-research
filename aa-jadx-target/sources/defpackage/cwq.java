package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cwq implements java.util.Comparator {
    public static final defpackage.cwq a = new defpackage.cwq(2);
    private final /* synthetic */ int b;

    public cwq(int i) {
        this.b = i;
    }

    private static final int a(defpackage.nve nveVar) {
        int iOrdinal = nveVar.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 2 : 0;
        }
        return 1;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.b;
        if (i == 0) {
            defpackage.cxl cxlVar = (defpackage.cxl) obj;
            defpackage.cxl cxlVar2 = (defpackage.cxl) obj2;
            int iB = defpackage.afga.b(cxlVar.m, cxlVar2.m);
            return iB != 0 ? iB : defpackage.afga.b(cxlVar.hashCode(), cxlVar2.hashCode());
        }
        if (i == 1) {
            la laVar = (la) obj;
            la laVar2 = (la) obj2;
            android.support.v7.widget.RecyclerView recyclerView = laVar.d;
            if ((recyclerView == null) != (laVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = laVar.a;
            if (z != laVar2.a) {
                return z ? -1 : 1;
            }
            int i2 = laVar2.b - laVar.b;
            if (i2 == 0 && (i2 = laVar.c - laVar2.c) == 0) {
                return 0;
            }
            return i2;
        }
        if (i == 2) {
            defpackage.cxl cxlVar3 = (defpackage.cxl) obj;
            defpackage.cxl cxlVar4 = (defpackage.cxl) obj2;
            int iB2 = defpackage.afga.b(cxlVar4.m, cxlVar3.m);
            return iB2 != 0 ? iB2 : defpackage.afga.b(cxlVar3.hashCode(), cxlVar4.hashCode());
        }
        nvh nvhVar = ((nuv) obj).c;
        defpackage.nve nveVar = nvhVar.x;
        nvh nvhVar2 = ((nuv) obj2).c;
        defpackage.nve nveVar2 = nvhVar2.x;
        int iA = a(nveVar);
        int iA2 = a(nveVar2);
        if (iA == iA2) {
            long j = nvhVar.i;
            long j2 = nvhVar2.i;
            if (j == j2) {
                return 0;
            }
            if (j >= j2) {
                return 1;
            }
        } else if (iA >= iA2) {
            return 1;
        }
        return -1;
    }
}
