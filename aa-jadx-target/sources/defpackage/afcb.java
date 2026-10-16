package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afcb implements aisp {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public afcb(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Iterable, java.lang.Object] */
    public final java.util.Iterator a() {
        int i = this.b;
        if (i == 0) {
            return defpackage.affz.c((java.lang.Object[]) this.a);
        }
        if (i == 1) {
            return new eba(defpackage.ebm.b((android.view.ViewGroup) this.a).a(), ebx.a);
        }
        if (i == 2) {
            return this.a.iterator();
        }
        if (i == 3) {
            return afsg.a((defpackage.affg) this.a);
        }
        if (i != 4) {
            return i != 5 ? new aitg((java.lang.CharSequence) this.a) : new aiss(this.a);
        }
        return this.a;
    }
}
