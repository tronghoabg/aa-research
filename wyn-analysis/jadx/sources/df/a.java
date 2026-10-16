package Df;

import Bf.r;
import a.AbstractC1304a;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f2659c = new a(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f2660a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2661b;

    public a(long j8, long j10) {
        this.f2660a = j8;
        this.f2661b = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        AbstractC3340k.e(other, "other");
        long j8 = this.f2660a;
        long j10 = other.f2660a;
        return j8 != j10 ? Long.compare(j8 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) : Long.compare(this.f2661b ^ Long.MIN_VALUE, other.f2661b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2660a == aVar.f2660a && this.f2661b == aVar.f2661b;
    }

    public final int hashCode() {
        long j8 = this.f2660a ^ this.f2661b;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC1304a.p(this.f2660a, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC1304a.p(this.f2660a, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC1304a.p(this.f2660a, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC1304a.p(this.f2661b, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC1304a.p(this.f2661b, bArr, 24, 2, 8);
        return r.a0(bArr);
    }
}
