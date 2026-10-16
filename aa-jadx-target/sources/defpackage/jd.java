package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jd {
    public static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    private static defpackage.jd b;
    private defpackage.mu c;

    public static synchronized android.graphics.PorterDuffColorFilter b(int i, android.graphics.PorterDuff.Mode mode) {
        return defpackage.mu.b(i, mode);
    }

    public static synchronized defpackage.jd d() {
        if (b == null) {
            f();
        }
        return b;
    }

    public static synchronized void f() {
        if (b == null) {
            defpackage.jd jdVar = new defpackage.jd();
            b = jdVar;
            jdVar.c = defpackage.mu.e();
            b.c.h(new defpackage.jc());
        }
    }

    final synchronized android.content.res.ColorStateList a(android.content.Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(android.content.Context context) {
        this.c.f(context);
    }

    public final synchronized android.graphics.drawable.Drawable g(android.content.Context context, int i) {
        return this.c.d(context, i, true);
    }
}
