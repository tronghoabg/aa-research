package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adxs implements adni {
    private final java.util.List a;
    private final defpackage.adnh b;

    public adxs(java.util.List list, defpackage.adnh adnhVar) {
        this.a = defpackage.ygw.o(list);
        this.b = adnhVar;
    }

    public final void a(defpackage.adnz adnzVar, java.util.List list, java.util.List list2) {
        java.util.List list3 = adnzVar.c;
        int size = list3.size();
        int i = ((defpackage.ymx) list).c;
        defpackage.ysr.ba(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        java.util.List list4 = adnzVar.d;
        int size2 = list4.size();
        int i2 = ((defpackage.ymx) list2).c;
        defpackage.ysr.ba(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (adnj adnjVar : this.a) {
            if (adnjVar.a() <= adnzVar.a) {
                this.b.c();
                adnjVar.d();
            }
            adnjVar.b();
        }
    }

    public final void b(defpackage.adnz adnzVar, java.util.List list, java.util.List list2) {
        java.util.List list3 = adnzVar.c;
        int size = list3.size();
        int i = ((defpackage.ymx) list).c;
        defpackage.ysr.ba(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        java.util.List list4 = adnzVar.d;
        int size2 = list4.size();
        int i2 = ((defpackage.ymx) list2).c;
        defpackage.ysr.ba(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (adnj adnjVar : this.a) {
            if (adnjVar.a() <= adnzVar.a) {
                this.b.c();
                adnjVar.d();
            }
            adnjVar.c();
        }
    }
}
