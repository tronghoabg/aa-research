package K0;

import L0.j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f6322c = new i(Fe.b.E(0), Fe.b.E(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f6323a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6324b;

    public i(long j8, long j10) {
        this.f6323a = j8;
        this.f6324b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return j.a(this.f6323a, iVar.f6323a) && j.a(this.f6324b, iVar.f6324b);
    }

    public final int hashCode() {
        return j.d(this.f6324b) + (j.d(this.f6323a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) j.e(this.f6323a)) + ", restLine=" + ((Object) j.e(this.f6324b)) + ')';
    }
}
