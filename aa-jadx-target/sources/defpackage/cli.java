package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class cli {
    public final long a;

    public /* synthetic */ cli(long j) {
        this.a = j;
    }

    public static java.lang.String a(long j) {
        return defpackage.a.bH(j, "TransformOrigin(packedValue=", ")");
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cli) && this.a == ((defpackage.cli) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
