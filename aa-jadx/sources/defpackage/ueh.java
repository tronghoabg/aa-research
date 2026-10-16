package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ueh {
    public final int a;
    public final defpackage.xyn b;

    public ueh(int i, defpackage.xyn xynVar) {
        this.a = i;
        this.b = xynVar;
    }

    public static defpackage.ueh a(int i, defpackage.uel uelVar) {
        return new defpackage.ueh(i, defpackage.xyn.h(uelVar));
    }

    public final java.lang.String toString() {
        return "{renderId=" + this.a + ", placement=" + this.b.toString() + "}";
    }
}
