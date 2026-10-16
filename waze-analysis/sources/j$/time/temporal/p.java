package j$.time.temporal;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    public final long f50072a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50073b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50074c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50075d;

    public p(long j2, long j3, long j4, long j5) {
        this.f50072a = j2;
        this.f50073b = j3;
        this.f50074c = j4;
        this.f50075d = j5;
    }

    public static p f(long j2, long j3) {
        if (j2 <= j3) {
            return new p(j2, j2, j3, j3);
        }
        j$.time.f.b("Minimum value must be less than maximum value");
        return null;
    }

    public static p g(long j2, long j3, long j4) {
        if (j2 > 1) {
            j$.time.f.b("Smallest minimum value must be less than largest minimum value");
            return null;
        }
        if (j3 > j4) {
            j$.time.f.b("Smallest maximum value must be less than largest maximum value");
            return null;
        }
        if (1 <= j4) {
            return new p(j2, 1L, j3, j4);
        }
        j$.time.f.b("Minimum value must be less than maximum value");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j2 = this.f50072a;
        long j3 = this.f50073b;
        if (j2 > j3) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j4 = this.f50074c;
        long j5 = this.f50075d;
        if (j4 > j5) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j3 > j5) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j2, m mVar) {
        if (d() && e(j2)) {
            return (int) j2;
        }
        j$.time.f.h(c(j2, mVar));
        return 0;
    }

    public final void b(long j2, m mVar) {
        if (e(j2)) {
            return;
        }
        j$.time.f.h(c(j2, mVar));
    }

    public final String c(long j2, m mVar) {
        if (mVar == null) {
            return "Invalid value (valid values " + String.valueOf(this) + "): " + j2;
        }
        return "Invalid value for " + String.valueOf(mVar) + " (valid values " + String.valueOf(this) + "): " + j2;
    }

    public final boolean d() {
        return this.f50072a >= SieveCacheKt.NodeMetaAndPreviousMask && this.f50075d <= SieveCacheKt.NodeLinkMask;
    }

    public final boolean e(long j2) {
        return j2 >= this.f50072a && j2 <= this.f50075d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f50072a == pVar.f50072a && this.f50073b == pVar.f50073b && this.f50074c == pVar.f50074c && this.f50075d == pVar.f50075d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f50073b;
        long j3 = this.f50072a + (j2 << 16) + (j2 >> 48);
        long j4 = this.f50074c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f50075d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) ((j7 >>> 32) ^ j7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j2 = this.f50072a;
        sb.append(j2);
        long j3 = this.f50073b;
        if (j2 != j3) {
            sb.append('/');
            sb.append(j3);
        }
        sb.append(" - ");
        long j4 = this.f50074c;
        sb.append(j4);
        long j5 = this.f50075d;
        if (j4 != j5) {
            sb.append('/');
            sb.append(j5);
        }
        return sb.toString();
    }
}
