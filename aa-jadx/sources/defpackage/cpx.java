package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class cpx {
    public final android.view.KeyEvent a;

    public static java.lang.String a(android.view.KeyEvent keyEvent) {
        return defpackage.a.bl(keyEvent, "KeyEvent(nativeKeyEvent=", ")");
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cpx) && defpackage.afga.f(this.a, ((defpackage.cpx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
