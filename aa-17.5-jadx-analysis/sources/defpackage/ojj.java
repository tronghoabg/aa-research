package defpackage;

/* loaded from: classes2.dex */
public abstract class ojj {
    public final yxo c;
    public final boolean d;

    public ojj(yxo yxoVar, boolean z) {
        this.c = yxoVar;
        this.d = z;
    }

    public abstract ojn a();

    public abstract void b();

    public abstract int d();

    public final boolean e() {
        return d() == 4;
    }

    public final int f() {
        return this.d ? 3 : 2;
    }
}
