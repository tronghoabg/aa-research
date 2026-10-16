package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cla {
    public final long a;

    public /* synthetic */ cla(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return a.bI(j, "TransformOrigin(packedValue=", ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cla) && this.a == ((cla) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return a(this.a);
    }
}
