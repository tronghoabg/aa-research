package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tvo {
    protected final defpackage.tvv a;
    public boolean b;
    protected final float c;
    protected final float d;

    public tvo(defpackage.tvv tvvVar, float f, float f2) {
        tvvVar.getClass();
        this.a = tvvVar;
        this.c = f;
        this.d = f2;
    }

    public final void a(defpackage.tvz tvzVar) {
        if (!this.b) {
            throw new java.lang.IllegalStateException("Gesture already inactive: ".concat(java.lang.String.valueOf(getClass().getName())));
        }
        this.b = false;
        b(tvzVar);
    }

    protected abstract void b(defpackage.tvz tvzVar);

    protected abstract boolean c(defpackage.tvz tvzVar);

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    protected abstract boolean g(defpackage.tvz tvzVar);

    protected abstract int h(long j, java.util.Deque deque, java.util.List list);
}
