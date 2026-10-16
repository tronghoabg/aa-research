package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class ckv {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ckv) && this.a == ((defpackage.ckv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return 1 != this.a ? "NonZero" : "EvenOdd";
    }
}
