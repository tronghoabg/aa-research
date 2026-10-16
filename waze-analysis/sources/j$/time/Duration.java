package j$.time;

import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    public final long f49791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49792b;

    static {
        BigInteger.valueOf(C.NANOS_PER_SECOND);
    }

    public Duration(long j2, int i2) {
        this.f49791a = j2;
        this.f49792b = i2;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return k(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (c | ArithmeticException unused) {
            long jUntil = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j2 = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jD = temporal2.D(aVar) - temporal.D(aVar);
                if (jUntil > 0 && jD < 0) {
                    jUntil++;
                } else if (jUntil < 0 && jD > 0) {
                    jUntil--;
                }
                j2 = jD;
            } catch (c unused2) {
            }
            return ofSeconds(jUntil, j2);
        }
    }

    public static Duration h(long j2, int i2) {
        return (((long) i2) | j2) == 0 ? ZERO : new Duration(j2, i2);
    }

    public static Duration k(long j2) {
        long j3 = j2 / C.NANOS_PER_SECOND;
        int i2 = (int) (j2 % C.NANOS_PER_SECOND);
        if (i2 < 0) {
            i2 = (int) (i2 + C.NANOS_PER_SECOND);
            j3--;
        }
        return h(j3, i2);
    }

    public static Duration ofHours(long j2) {
        return h(j$.com.android.tools.r8.a.Q(j2, 3600L), 0);
    }

    public static Duration ofMillis(long j2) {
        long j3 = j2 / 1000;
        int i2 = (int) (j2 % 1000);
        if (i2 < 0) {
            i2 += 1000;
            j3--;
        }
        return h(j3, i2 * PlaybackException.CUSTOM_ERROR_CODE_BASE);
    }

    public static Duration ofMinutes(long j2) {
        return h(j$.com.android.tools.r8.a.Q(j2, 60L), 0);
    }

    public static Duration ofSeconds(long j2, long j3) {
        return h(j$.com.android.tools.r8.a.P(j2, j$.com.android.tools.r8.a.F(j3, C.NANOS_PER_SECOND)), (int) j$.com.android.tools.r8.a.O(j3, C.NANOS_PER_SECOND));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.f49791a, duration.f49791a);
        return iCompare != 0 ? iCompare : this.f49792b - duration.f49792b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f49791a == duration.f49791a && this.f49792b == duration.f49792b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Temporal temporal) {
        long j2 = this.f49791a;
        if (j2 != 0) {
            temporal = temporal.b(j2, ChronoUnit.SECONDS);
        }
        int i2 = this.f49792b;
        return i2 != 0 ? temporal.b(i2, ChronoUnit.NANOS) : temporal;
    }

    public int getNano() {
        return this.f49792b;
    }

    public long getSeconds() {
        return this.f49791a;
    }

    public final int hashCode() {
        long j2 = this.f49791a;
        return (this.f49792b * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isNegative() {
        return this.f49791a < 0;
    }

    public final Duration m(long j2) {
        long jQ = j$.com.android.tools.r8.a.Q(j2, 3600L);
        return jQ == 0 ? this : ofSeconds(j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.P(this.f49791a, jQ), 0L), this.f49792b);
    }

    public Duration minusHours(long j2) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            this = m(Long.MAX_VALUE);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return this.m(j3);
    }

    public long toHours() {
        return this.f49791a / 3600;
    }

    public long toMillis() {
        long j2 = this.f49792b;
        long j3 = this.f49791a;
        if (j3 < 0) {
            j3++;
            j2 -= C.NANOS_PER_SECOND;
        }
        return j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j3, 1000L), j2 / 1000000);
    }

    public long toMinutes() {
        return this.f49791a / 60;
    }

    public long toNanos() {
        long j2 = this.f49792b;
        long j3 = this.f49791a;
        if (j3 < 0) {
            j3++;
            j2 -= C.NANOS_PER_SECOND;
        }
        return j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j3, C.NANOS_PER_SECOND), j2);
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j2 = this.f49791a;
        int i2 = this.f49792b;
        long j3 = (j2 >= 0 || i2 <= 0) ? j2 : 1 + j2;
        long j4 = j3 / 3600;
        int i3 = (int) ((j3 % 3600) / 60);
        int i4 = (int) (j3 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j4 != 0) {
            sb.append(j4);
            sb.append('H');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        if (i4 == 0 && i2 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j2 >= 0 || i2 <= 0 || i4 != 0) {
            sb.append(i4);
        } else {
            sb.append("-0");
        }
        if (i2 > 0) {
            int length = sb.length();
            if (j2 < 0) {
                sb.append(2000000000 - i2);
            } else {
                sb.append(i2 + C.NANOS_PER_SECOND);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static Duration ofSeconds(long j2) {
        return h(j2, 0);
    }
}
