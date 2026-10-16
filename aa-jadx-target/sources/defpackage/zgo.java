package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zgo extends defpackage.zgk {
    private java.util.List c;

    public zgo(defpackage.ygm ygmVar, boolean z) {
        java.util.List arrayList;
        super(ygmVar, z, true);
        if (ygmVar.isEmpty()) {
            arrayList = java.util.Collections.EMPTY_LIST;
        } else {
            int size = ygmVar.size();
            defpackage.ysr.aL(size, "initialArraySize");
            arrayList = new java.util.ArrayList(size);
        }
        for (int i = 0; i < ygmVar.size(); i++) {
            arrayList.add(null);
        }
        this.c = arrayList;
        u();
    }

    @Override // defpackage.zgk
    public final void e(int i, java.lang.Object obj) {
        java.util.List list = this.c;
        if (list != null) {
            list.set(i, new defpackage.kwv(obj, (char[]) null));
        }
    }

    @Override // defpackage.zgk
    public final void g() {
        java.util.List<defpackage.kwv> list = this.c;
        if (list != null) {
            int size = list.size();
            defpackage.ysr.aL(size, "initialArraySize");
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (defpackage.kwv kwvVar : list) {
                arrayList.add(kwvVar != null ? kwvVar.a : null);
            }
            o(j$.util.DesugarCollections.unmodifiableList(arrayList));
        }
    }

    @Override // defpackage.zgk
    public final void w(int i) {
        super.w(i);
        this.c = null;
    }
}
