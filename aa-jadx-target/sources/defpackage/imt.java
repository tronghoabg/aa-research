package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class imt implements java.util.concurrent.Callable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ imt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.b;
        int i2 = 0;
        if (i == 0) {
            android.util.SparseArray sparseArray = ((defpackage.inh) this.a).S;
            int size = sparseArray.size();
            android.util.SparseArray sparseArray2 = new android.util.SparseArray(size);
            while (i2 < size) {
                java.util.List list = (java.util.List) sparseArray.valueAt(i2);
                sparseArray2.put(sparseArray.keyAt(i2), list != null ? new java.util.ArrayList(list) : new java.util.ArrayList());
                i2++;
            }
            return sparseArray2;
        }
        char c = 2;
        if (i != 1) {
            if (i == 2) {
                return ((defpackage.qsa) this.a).j;
            }
            if (i == 3) {
                defpackage.rlw rlwVar = defpackage.rlw.i;
                boolean z = ((android.content.Context) this.a).getSharedPreferences("action_developer_settings", 0).getBoolean("failure_injection_enabled", false);
                if (z) {
                    defpackage.rlw.i = new defpackage.kou();
                }
                return java.lang.Boolean.valueOf(z);
            }
            if (i == 4) {
                ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9773)).u("DeferrableExecutor unblocked after max task delay");
                ((defpackage.vlt) this.a).g();
                return null;
            }
            if (i == 5) {
                ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9774)).u("DeferrableExecutor unblocked after onResume");
                ((defpackage.vlt) this.a).g();
                return null;
            }
            java.lang.Object obj = this.a;
            synchronized (((defpackage.whv) obj).b.d) {
                ((defpackage.whv) obj).a = null;
            }
            return null;
        }
        defpackage.inh inhVar = (defpackage.inh) this.a;
        defpackage.jjc jjcVar = (defpackage.jjc) inhVar.aq;
        defpackage.jhi jhiVar = inhVar.w;
        jhiVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = jhiVar.b;
        defpackage.ive iveVar = jhiVar.a;
        android.graphics.Rect rect = iveVar.n;
        int iK = defpackage.afhi.k(defpackage.ebm.o(100, iveVar.i));
        int i4 = rect.left + i3 + iK;
        int i5 = jhiVar.c + rect.bottom + iK;
        int i6 = (((iveVar.e + i3) - rect.right) - 1) - iK;
        int i7 = iveVar.c;
        int i8 = (((i7 - iveVar.h) - rect.top) - 1) - iK;
        while (true) {
            int i9 = i8 - i5;
            int i10 = i6 - i4;
            if (i2 >= 20) {
                arrayList.add(jjcVar.a(iveVar.b, i7, i4 + (i10 / 2), i5 + (i9 / 2)));
                return arrayList;
            }
            arrayList.add(jjcVar.a(iveVar.b, i7, (int) ((java.lang.Math.random() * ((double) i10)) + ((double) i4)), (int) ((java.lang.Math.random() * ((double) i9)) + ((double) i5))));
            i2++;
            c = c;
        }
    }
}
