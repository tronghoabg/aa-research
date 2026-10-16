package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lr {
    protected final defpackage.mc a;
    public int b = Integer.MIN_VALUE;
    final android.graphics.Rect c = new android.graphics.Rect();

    public lr(defpackage.mc mcVar) {
        this.a = mcVar;
    }

    public static defpackage.lr p(defpackage.mc mcVar, int i) {
        return i != 0 ? new defpackage.lq(mcVar) : new defpackage.lp(mcVar);
    }

    public abstract int a(android.view.View view);

    public abstract int b(android.view.View view);

    public abstract int c(android.view.View view);

    public abstract int d(android.view.View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(android.view.View view);

    public abstract int m(android.view.View view);

    public abstract void n(int i);

    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.b;
    }
}
