package j$.time;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import j$.time.chrono.AbstractC2901i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class k implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f37640e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f37641f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f37642g;

    /* renamed from: h, reason: collision with root package name */
    private static final k[] f37643h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    private final byte f37644a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f37645b;

    /* renamed from: c, reason: collision with root package name */
    private final byte f37646c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37647d;

    static {
        int i5 = 0;
        while (true) {
            k[] kVarArr = f37643h;
            if (i5 < kVarArr.length) {
                kVarArr[i5] = new k(i5, 0, 0, 0);
                i5++;
            } else {
                k kVar = kVarArr[0];
                f37642g = kVar;
                k kVar2 = kVarArr[12];
                f37640e = kVar;
                f37641f = new k(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static k Z(int i5) {
        j$.time.temporal.a.HOUR_OF_DAY.S(i5);
        return f37643h[i5];
    }

    public static k a0(int i5, int i10, int i11, int i12) {
        j$.time.temporal.a.HOUR_OF_DAY.S(i5);
        j$.time.temporal.a.MINUTE_OF_HOUR.S(i10);
        j$.time.temporal.a.SECOND_OF_MINUTE.S(i11);
        j$.time.temporal.a.NANO_OF_SECOND.S(i12);
        return S(i5, i10, i11, i12);
    }

    public static k c0(long j8) {
        j$.time.temporal.a.SECOND_OF_DAY.S(j8);
        int i5 = (int) (j8 / 3600);
        long j10 = j8 - (i5 * 3600);
        return S(i5, (int) (j10 / 60), (int) (j10 - (r1 * 60)), 0);
    }

    public static k b0(long j8) {
        j$.time.temporal.a.NANO_OF_DAY.S(j8);
        int i5 = (int) (j8 / 3600000000000L);
        long j10 = j8 - (i5 * 3600000000000L);
        int i10 = (int) (j10 / 60000000000L);
        long j11 = j10 - (i10 * 60000000000L);
        int i11 = (int) (j11 / 1000000000);
        return S(i5, i10, i11, (int) (j11 - (i11 * 1000000000)));
    }

    public static k T(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        k kVar = (k) temporalAccessor.B(j$.time.temporal.l.g());
        if (kVar != null) {
            return kVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private static k S(int i5, int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return f37643h[i5];
        }
        return new k(i5, i10, i11, i12);
    }

    private k(int i5, int i10, int i11, int i12) {
        this.f37644a = (byte) i5;
        this.f37645b = (byte) i10;
        this.f37646c = (byte) i11;
        this.f37647d = i12;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T();
        }
        return qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return U(qVar);
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return j0();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return j0() / 1000;
            }
            return U(qVar);
        }
        return qVar.s(this);
    }

    private int U(j$.time.temporal.q qVar) {
        int i5 = j.f37638a[((j$.time.temporal.a) qVar).ordinal()];
        byte b5 = this.f37645b;
        int i10 = this.f37647d;
        byte b10 = this.f37644a;
        switch (i5) {
            case 1:
                return i10;
            case 2:
                throw new j$.time.temporal.s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i10 / 1000;
            case 4:
                throw new j$.time.temporal.s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i10 / 1000000;
            case 6:
                return (int) (j0() / 1000000);
            case 7:
                return this.f37646c;
            case 8:
                return k0();
            case 9:
                return b5;
            case 10:
                return (b10 * 60) + b5;
            case 11:
                return b10 % 12;
            case 12:
                int i11 = b10 % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 14:
                if (b10 == 0) {
                    return 24;
                }
            case 13:
                return b10;
            case 15:
                return b10 / 12;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
    }

    public final int V() {
        return this.f37644a;
    }

    public final int W() {
        return this.f37645b;
    }

    public final int Y() {
        return this.f37646c;
    }

    public final int X() {
        return this.f37647d;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final k d(long j8, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (k) qVar.w(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.S(j8);
        int i5 = j.f37638a[aVar.ordinal()];
        byte b5 = this.f37645b;
        byte b10 = this.f37646c;
        int i10 = this.f37647d;
        byte b11 = this.f37644a;
        switch (i5) {
            case 1:
                return m0((int) j8);
            case 2:
                return b0(j8);
            case 3:
                return m0(((int) j8) * 1000);
            case 4:
                return b0(j8 * 1000);
            case 5:
                return m0(((int) j8) * 1000000);
            case 6:
                return b0(j8 * 1000000);
            case 7:
                int i11 = (int) j8;
                if (b10 != i11) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.S(i11);
                    return S(b11, b5, i11, i10);
                }
                return this;
            case 8:
                return h0(j8 - k0());
            case 9:
                int i12 = (int) j8;
                if (b5 != i12) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.S(i12);
                    return S(b11, i12, b10, i10);
                }
                return this;
            case 10:
                return f0(j8 - ((b11 * 60) + b5));
            case 11:
                return e0(j8 - (b11 % 12));
            case 12:
                if (j8 == 12) {
                    j8 = 0;
                }
                return e0(j8 - (b11 % 12));
            case 13:
                int i13 = (int) j8;
                if (b11 != i13) {
                    j$.time.temporal.a.HOUR_OF_DAY.S(i13);
                    return S(i13, b5, b10, i10);
                }
                return this;
            case 14:
                if (j8 == 24) {
                    j8 = 0;
                }
                int i14 = (int) j8;
                if (b11 != i14) {
                    j$.time.temporal.a.HOUR_OF_DAY.S(i14);
                    return S(i14, b5, b10, i10);
                }
                return this;
            case 15:
                return e0((j8 - (b11 / 12)) * 12);
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
    }

    public final k m0(int i5) {
        if (this.f37647d == i5) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.S(i5);
        return S(this.f37644a, this.f37645b, this.f37646c, i5);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final k e(long j8, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (j.f37639b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return g0(j8);
                case 2:
                    return g0((j8 % 86400000000L) * 1000);
                case 3:
                    return g0((j8 % 86400000) * 1000000);
                case 4:
                    return h0(j8);
                case 5:
                    return f0(j8);
                case 6:
                    return e0(j8);
                case 7:
                    return e0((j8 % 2) * 12);
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
            }
        }
        return (k) temporalUnit.o(this, j8);
    }

    public final k e0(long j8) {
        if (j8 == 0) {
            return this;
        }
        return S(((((int) (j8 % 24)) + this.f37644a) + 24) % 24, this.f37645b, this.f37646c, this.f37647d);
    }

    public final k f0(long j8) {
        if (j8 != 0) {
            int i5 = (this.f37644a * 60) + this.f37645b;
            int i10 = ((((int) (j8 % 1440)) + i5) + 1440) % 1440;
            if (i5 != i10) {
                return S(i10 / 60, i10 % 60, this.f37646c, this.f37647d);
            }
        }
        return this;
    }

    public final k h0(long j8) {
        if (j8 != 0) {
            int i5 = (this.f37645b * 60) + (this.f37644a * 3600) + this.f37646c;
            int i10 = ((((int) (j8 % 86400)) + i5) + 86400) % 86400;
            if (i5 != i10) {
                return S(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f37647d);
            }
        }
        return this;
    }

    public final k g0(long j8) {
        if (j8 != 0) {
            long jJ0 = j0();
            long j10 = (((j8 % 86400000000000L) + jJ0) + 86400000000000L) % 86400000000000L;
            if (jJ0 != j10) {
                return S((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this;
        }
        if (rVar == j$.time.temporal.l.f()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        k kVarT = T(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jJ0 = kVarT.j0() - j0();
            switch (j.f37639b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jJ0;
                case 2:
                    return jJ0 / 1000;
                case 3:
                    return jJ0 / 1000000;
                case 4:
                    return jJ0 / 1000000000;
                case 5:
                    return jJ0 / 60000000000L;
                case 6:
                    return jJ0 / 3600000000000L;
                case 7:
                    return jJ0 / 43200000000000L;
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, kVarT);
    }

    public final int k0() {
        return (this.f37645b * 60) + (this.f37644a * 3600) + this.f37646c;
    }

    public final long j0() {
        return (this.f37646c * 1000000000) + (this.f37645b * 60000000000L) + (this.f37644a * 3600000000000L) + this.f37647d;
    }

    @Override // java.lang.Comparable
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int iCompare = Integer.compare(this.f37644a, kVar.f37644a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f37645b, kVar.f37645b)) == 0 && (iCompare = Integer.compare(this.f37646c, kVar.f37646c)) == 0) ? Integer.compare(this.f37647d, kVar.f37647d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f37644a == kVar.f37644a && this.f37645b == kVar.f37645b && this.f37646c == kVar.f37646c && this.f37647d == kVar.f37647d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return (k) AbstractC2901i.a(gVar, this);
    }

    public final int hashCode() {
        long jJ0 = j0();
        return (int) (jJ0 ^ (jJ0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b5 = this.f37644a;
        sb2.append(b5 < 10 ? "0" : "");
        sb2.append((int) b5);
        String str = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        byte b10 = this.f37645b;
        sb2.append(b10 < 10 ? ":0" : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append((int) b10);
        byte b11 = this.f37646c;
        int i5 = this.f37647d;
        if (b11 > 0 || i5 > 0) {
            if (b11 < 10) {
                str = ":0";
            }
            sb2.append(str);
            sb2.append((int) b11);
            if (i5 > 0) {
                sb2.append('.');
                if (i5 % 1000000 == 0) {
                    sb2.append(Integer.toString((i5 / 1000000) + 1000).substring(1));
                } else if (i5 % 1000 == 0) {
                    sb2.append(Integer.toString((i5 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i5 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void n0(DataOutput dataOutput) {
        byte b5 = this.f37646c;
        byte b10 = this.f37644a;
        byte b11 = this.f37645b;
        int i5 = this.f37647d;
        if (i5 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b5);
            dataOutput.writeInt(i5);
            return;
        }
        if (b5 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(~b5);
        } else if (b11 == 0) {
            dataOutput.writeByte(~b10);
        } else {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(~b11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    static k i0(ObjectInput objectInput) throws IOException {
        int i5;
        int i10;
        int i11 = objectInput.readByte();
        byte b5 = 0;
        if (i11 < 0) {
            i11 = ~i11;
            i10 = 0;
            i5 = 0;
        } else {
            byte b10 = objectInput.readByte();
            if (b10 < 0) {
                ?? r52 = ~b10;
                i5 = 0;
                b5 = r52;
                i10 = 0;
            } else {
                byte b11 = objectInput.readByte();
                if (b11 < 0) {
                    i10 = ~b11;
                    i5 = 0;
                    b5 = b10;
                } else {
                    i5 = objectInput.readInt();
                    b5 = b10;
                    i10 = b11;
                }
            }
        }
        return a0(i11, b5, i10, i5);
    }
}
