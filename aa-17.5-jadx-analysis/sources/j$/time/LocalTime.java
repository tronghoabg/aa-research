package j$.time;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class LocalTime implements Temporal, j$.time.temporal.l, Comparable<LocalTime>, Serializable {
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime g;
    public static final LocalTime[] h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = h;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime A(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        LocalTime localTime = (LocalTime) kVar.w(j$.time.temporal.o.g);
        if (localTime != null) {
            return localTime;
        }
        g.g(e.a("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
        return null;
    }

    public static LocalTime H(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.s(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.s(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.s(i3);
        j$.time.temporal.a.NANO_OF_SECOND.s(i4);
        return s(i, i2, i3, i4);
    }

    public static LocalTime I(long j) {
        j$.time.temporal.a.NANO_OF_DAY.s(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return s(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static LocalTime O(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        byte b = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                ?? r5 = ~b2;
                i = 0;
                b = r5;
                i2 = 0;
            } else {
                byte b3 = objectInput.readByte();
                if (b3 < 0) {
                    i2 = ~b3;
                    i = 0;
                    b = b2;
                } else {
                    i = objectInput.readInt();
                    b = b2;
                    i2 = b3;
                }
            }
        }
        return H(i3, b, i2, i);
    }

    public static LocalTime ofSecondOfDay(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.s(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return s(i, (int) (j2 / 60), (int) (j2 - (r1 * 60)), 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalTime s(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new LocalTime(i, i2, i3, i4);
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    public final int B(j$.time.temporal.n nVar) {
        int i = i.a[((j$.time.temporal.a) nVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                g.e("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
                return 0;
            case 3:
                return i2 / 1000;
            case 4:
                g.e("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
                return 0;
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (P() / 1000000);
            case 7:
                return this.c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0;
        }
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.NANO_OF_DAY ? P() : nVar == j$.time.temporal.a.MICRO_OF_DAY ? P() / 1000 : B(nVar) : nVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.k(this, j);
        }
        switch (i.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(j);
            case 2:
                return M((j % 86400000000L) * 1000);
            case 3:
                return M((j % 86400000) * 1000000);
            case 4:
                return N(j);
            case 5:
                return L(j);
            case 6:
                return K(j);
            case 7:
                return K((j % 2) * 12);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final LocalTime K(long j) {
        if (j == 0) {
            return this;
        }
        return s(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime L(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return s(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime M(long j) {
        if (j != 0) {
            long jP = P();
            long j2 = (((j % 86400000000000L) + jP) + 86400000000000L) % 86400000000000L;
            if (jP != j2) {
                return s((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime N(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return s(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long P() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalTime) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = i.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return R((int) j);
            case 2:
                return I(j);
            case 3:
                return R(((int) j) * 1000);
            case 4:
                return I(j * 1000);
            case 5:
                return R(((int) j) * 1000000);
            case 6:
                return I(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.s(i3);
                    return s(b3, b2, i3, i2);
                }
                return this;
            case 8:
                return N(j - toSecondOfDay());
            case 9:
                int i4 = (int) j;
                if (b2 != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.s(i4);
                    return s(b3, i4, b, i2);
                }
                return this;
            case 10:
                return L(j - ((b3 * 60) + b2));
            case 11:
                return K(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return K(j - (b3 % 12));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i5);
                    return s(i5, b2, b, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i6);
                    return s(i6, b2, b, i2);
                }
                return this;
            case 15:
                return K((j - (b3 / 12)) * 12);
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    public final LocalTime R(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.s(i);
        return s(this.a, this.b, this.c, i);
    }

    public final void S(DataOutput dataOutput) throws IOException {
        byte b = this.a;
        byte b2 = this.c;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b2);
            dataOutput.writeInt(i);
            return;
        }
        if (b2 != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b2);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b);
        } else {
            dataOutput.writeByte(b);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).w() : nVar != null && nVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeA = A(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.h(this, localTimeA);
        }
        long jP = localTimeA.P() - P();
        switch (i.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jP;
            case 2:
                return jP / 1000;
            case 3:
                return jP / 1000000;
            case 4:
                return jP / 1000000000;
            case 5:
                return jP / 60000000000L;
            case 6:
                return jP / 3600000000000L;
            case 7:
                return jP / 43200000000000L;
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? B(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    public final int hashCode() {
        long jP = P();
        return (int) (jP ^ (jP >>> 32));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k */
    public final Temporal x(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(P(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    public int toSecondOfDay() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? CloudRecognizerProtocolStrings.DBG_VALUE : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public LocalTime truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            g.e("Unit is too large to be used for truncation");
            return null;
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos == 0) {
            return I((P() / nanos) * nanos);
        }
        g.e("Unit must divide into a standard day without remainder");
        return null;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.b || nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d) {
            return null;
        }
        if (nVar == j$.time.temporal.o.g) {
            return this;
        }
        if (nVar == j$.time.temporal.o.f) {
            return null;
        }
        return nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }
}
