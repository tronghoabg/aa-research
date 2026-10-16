package F0;

import U8.v0;
import W.i;
import kotlin.jvm.internal.AbstractC3340k;
import z0.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b f3797a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3798b;

    static {
        S3.e eVar = i.f14934a;
    }

    public b(z0.b bVar, long j8) {
        this.f3797a = bVar;
        int length = bVar.f48269a.length();
        int i5 = o.f48335b;
        int i10 = (int) (j8 >> 32);
        int iS = android.support.v4.media.session.b.S(i10, 0, length);
        int i11 = (int) (4294967295L & j8);
        int iS2 = android.support.v4.media.session.b.S(i11, 0, length);
        this.f3798b = (iS == i10 && iS2 == i11) ? j8 : v0.g(iS, iS2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        long j8 = bVar.f3798b;
        int i5 = o.f48335b;
        return this.f3798b == j8 && AbstractC3340k.a(null, null) && AbstractC3340k.a(this.f3797a, bVar.f3797a);
    }

    public final int hashCode() {
        int iHashCode = this.f3797a.hashCode() * 31;
        int i5 = o.f48335b;
        long j8 = this.f3798b;
        return ((((int) (j8 ^ (j8 >>> 32))) + iHashCode) * 31) + 0;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f3797a) + "', selection=" + ((Object) o.a(this.f3798b)) + ", composition=" + ((Object) null) + ')';
    }
}
