package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xzd {
    public final boolean a;
    public final int b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public xzd(java.lang.String str, int i, boolean z) {
        this.c = "com.google.android.gms";
        this.d = str;
        this.b = i;
        this.a = z;
    }

    public static defpackage.xzd c(char c) {
        return new defpackage.xzd(new defpackage.xyx(new defpackage.xxo(c)));
    }

    public static defpackage.xzd d(java.lang.String str) {
        return new defpackage.xzd(new defpackage.xyx(new defpackage.xxo(str.charAt(0))));
    }

    public static defpackage.xzd e(java.lang.String str) {
        final defpackage.xyf xyfVar = new defpackage.xyf(java.util.regex.Pattern.compile(str));
        defpackage.ysr.bc(!((java.util.regex.Matcher) xyfVar.a("").a).matches(), "The pattern may not match the empty string: %s", xyfVar);
        return new defpackage.xzd(new defpackage.xzc() { // from class: xyy
            @Override // defpackage.xzc
            public final java.util.Iterator a(defpackage.xzd xzdVar, java.lang.CharSequence charSequence) {
                return new defpackage.xza(xzdVar, charSequence, xyfVar.a(charSequence));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xzc] */
    public final defpackage.xzd a(int i) {
        return new defpackage.xzd(this.d, this.a, (defpackage.xxv) this.c, i);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, xzc] */
    public final defpackage.xzd b() {
        return new defpackage.xzd(this.d, true, (defpackage.xxv) this.c, this.b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xzc] */
    public final defpackage.xzd f() {
        defpackage.xxv xxvVar = defpackage.xxu.c;
        xxvVar.getClass();
        return new defpackage.xzd(this.d, this.a, xxvVar, this.b);
    }

    public final java.lang.Iterable g(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return new defpackage.xzb(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xzc] */
    public final java.util.Iterator h(java.lang.CharSequence charSequence) {
        return this.d.a(this, charSequence);
    }

    public final java.util.List i(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator itH = h(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (itH.hasNext()) {
            arrayList.add((java.lang.String) itH.next());
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public final defpackage.zzx j(java.lang.String str) {
        return new defpackage.zzx(this, d(str), null);
    }

    private xzd(defpackage.xzc xzcVar, boolean z, defpackage.xxv xxvVar, int i) {
        this.d = xzcVar;
        this.a = z;
        this.c = xxvVar;
        this.b = i;
    }

    public xzd(defpackage.xzc xzcVar) {
        this(xzcVar, false, defpackage.xxs.a, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    }
}
