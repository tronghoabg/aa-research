package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.p, Comparable<Duration>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Duration f37474c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    private final long f37475a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37476b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f37475a, duration2.f37475a);
        return iCompare != 0 ? iCompare : this.f37476b - duration2.f37476b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMinutes(long j8) {
        return q(b.g(j8, 60), 0);
    }

    public static Duration w(long j8) {
        return q(j8, 0);
    }

    public static Duration B(long j8, long j10) {
        return q(b.b(j8, b.f(j10, 1000000000L)), (int) b.e(j10, 1000000000L));
    }

    public static Duration t(long j8) {
        long j10 = j8 / 1000000000;
        int i5 = (int) (j8 % 1000000000);
        if (i5 < 0) {
            i5 = (int) (i5 + 1000000000);
            j10--;
        }
        return q(j10, i5);
    }

    private static Duration q(long j8, int i5) {
        if ((i5 | j8) == 0) {
            return f37474c;
        }
        return new Duration(j8, i5);
    }

    private Duration(long j8, int i5) {
        this.f37475a = j8;
        this.f37476b = i5;
    }

    public final long s() {
        return this.f37475a;
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal) {
        long j8 = this.f37475a;
        if (j8 != 0) {
            temporal = temporal.e(j8, ChronoUnit.SECONDS);
        }
        int i5 = this.f37476b;
        return i5 != 0 ? temporal.e(i5, ChronoUnit.NANOS) : temporal;
    }

    public long toMillis() {
        long j8 = this.f37476b;
        long j10 = this.f37475a;
        if (j10 < 0) {
            j10++;
            j8 -= 1000000000;
        }
        return b.b(b.g(j10, 1000), j8 / 1000000);
    }

    public final long D() {
        long j8 = this.f37476b;
        long j10 = this.f37475a;
        if (j10 < 0) {
            j10++;
            j8 -= 1000000000;
        }
        return b.b(b.g(j10, 1000000000L), j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f37475a == duration.f37475a && this.f37476b == duration.f37476b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f37475a;
        return (this.f37476b * 51) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        if (this == f37474c) {
            return "PT0S";
        }
        long j8 = this.f37475a;
        int i5 = this.f37476b;
        long j10 = (j8 >= 0 || i5 <= 0) ? j8 : 1 + j8;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && i5 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (j8 < 0 && i5 > 0 && i11 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i11);
        }
        if (i5 > 0) {
            int length = sb2.length();
            if (j8 < 0) {
                sb2.append(2000000000 - i5);
            } else {
                sb2.append(i5 + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f37475a);
        objectOutput.writeInt(this.f37476b);
    }
}
