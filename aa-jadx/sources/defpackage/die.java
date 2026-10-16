package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class die {
    public final int a;

    public static java.lang.String a(int i) {
        return 1 != i ? "Normal" : "Italic";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.die) && this.a == ((defpackage.die) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
