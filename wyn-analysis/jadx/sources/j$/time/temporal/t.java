package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    private final long f37694a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37695b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37696c;

    /* renamed from: d, reason: collision with root package name */
    private final long f37697d;

    public static t j(long j8, long j10) {
        if (j8 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new t(j8, j8, j10, j10);
    }

    public static t k(long j8, long j10) {
        if (j8 > j10) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new t(1L, 1L, j8, j10);
    }

    private t(long j8, long j10, long j11, long j12) {
        this.f37694a = j8;
        this.f37695b = j10;
        this.f37696c = j11;
        this.f37697d = j12;
    }

    public final boolean g() {
        return this.f37694a == this.f37695b && this.f37696c == this.f37697d;
    }

    public final long e() {
        return this.f37694a;
    }

    public final long f() {
        return this.f37696c;
    }

    public final long d() {
        return this.f37697d;
    }

    public final boolean h() {
        return this.f37694a >= -2147483648L && this.f37697d <= 2147483647L;
    }

    public final boolean i(long j8) {
        return j8 >= this.f37694a && j8 <= this.f37697d;
    }

    public final int a(long j8, q qVar) {
        if (h() && i(j8)) {
            return (int) j8;
        }
        throw new j$.time.c(c(j8, qVar));
    }

    public final void b(long j8, q qVar) {
        if (!i(j8)) {
            throw new j$.time.c(c(j8, qVar));
        }
    }

    private String c(long j8, q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j8;
        }
        return "Invalid value (valid values " + this + "): " + j8;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j8 = this.f37694a;
        long j10 = this.f37695b;
        if (j8 > j10) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j11 = this.f37696c;
        long j12 = this.f37697d;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 > j12) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f37694a == tVar.f37694a && this.f37695b == tVar.f37695b && this.f37696c == tVar.f37696c && this.f37697d == tVar.f37697d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f37695b;
        long j10 = this.f37694a + (j8 << 16) + (j8 >> 48);
        long j11 = this.f37696c;
        long j12 = j10 + (j11 << 32) + (j11 >> 32);
        long j13 = this.f37697d;
        long j14 = j12 + (j13 << 48) + (j13 >> 16);
        return (int) ((j14 >>> 32) ^ j14);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j8 = this.f37694a;
        sb2.append(j8);
        long j10 = this.f37695b;
        if (j8 != j10) {
            sb2.append('/');
            sb2.append(j10);
        }
        sb2.append(" - ");
        long j11 = this.f37696c;
        sb2.append(j11);
        long j12 = this.f37697d;
        if (j11 != j12) {
            sb2.append('/');
            sb2.append(j12);
        }
        return sb2.toString();
    }
}
