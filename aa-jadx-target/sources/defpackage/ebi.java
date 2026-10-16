package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ebi {
    private final int a;
    private final java.lang.Class b;
    private final int c;
    private final int d;

    public ebi(int i, java.lang.Class cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    static final boolean f(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    private final boolean g() {
        return android.os.Build.VERSION.SDK_INT >= this.c;
    }

    public abstract java.lang.Object a(android.view.View view);

    public abstract void b(android.view.View view, java.lang.Object obj);

    public boolean c(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    final java.lang.Object d(android.view.View view) {
        if (g()) {
            return a(view);
        }
        java.lang.Object tag = view.getTag(this.a);
        if (this.b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void e(android.view.View view, java.lang.Object obj) {
        if (g()) {
            b(view, obj);
        } else if (c(d(view), obj)) {
            defpackage.ebt.j(view);
            view.setTag(this.a, obj);
            defpackage.ebt.k(view, this.d);
        }
    }
}
