package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class apx {
    public final long a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.apx) && this.a == ((defpackage.apx) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "ScrollValue(bits=" + this.a + ")";
    }
}
