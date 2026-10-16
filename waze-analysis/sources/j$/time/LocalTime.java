package j$.time;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import com.waze.strings.DisplayStrings;
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

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class LocalTime implements Temporal, j$.time.temporal.k, Comparable<LocalTime>, Serializable {
    public static final LocalTime MIDNIGHT;

    /* renamed from: e, reason: collision with root package name */
    public static final LocalTime f49807e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocalTime f49808f;

    /* renamed from: g, reason: collision with root package name */
    public static final LocalTime[] f49809g = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    public final byte f49810a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f49811b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f49812c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49813d;

    static {
        int i2 = 0;
        while (true) {
            LocalTime[] localTimeArr = f49809g;
            if (i2 >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                f49807e = localTime;
                f49808f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i2] = new LocalTime(i2, 0, 0, 0);
            i2++;
        }
    }

    public LocalTime(int i2, int i3, int i4, int i5) {
        this.f49810a = (byte) i2;
        this.f49811b = (byte) i3;
        this.f49812c = (byte) i4;
        this.f49813d = i5;
    }

    public static LocalTime L(int i2, int i3, int i4, int i5) {
        return ((i3 | i4) | i5) == 0 ? f49809g[i2] : new LocalTime(i2, i3, i4, i5);
    }

    public static LocalTime M(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.x(j$.time.temporal.n.f50071g);
        if (localTime != null) {
            return localTime;
        }
        f.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
        return null;
    }

    public static LocalTime O(int i2, int i3, int i4, int i5) {
        j$.time.temporal.a.HOUR_OF_DAY.z(i2);
        j$.time.temporal.a.MINUTE_OF_HOUR.z(i3);
        j$.time.temporal.a.SECOND_OF_MINUTE.z(i4);
        j$.time.temporal.a.NANO_OF_SECOND.z(i5);
        return L(i2, i3, i4, i5);
    }

    public static LocalTime P(long j2) {
        j$.time.temporal.a.NANO_OF_DAY.z(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (i2 * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (i3 * 60000000000L);
        int i4 = (int) (j4 / C.NANOS_PER_SECOND);
        return L(i2, i3, i4, (int) (j4 - (i4 * C.NANOS_PER_SECOND)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static LocalTime V(ObjectInput objectInput) throws IOException {
        int i2;
        int i3;
        int i4 = objectInput.readByte();
        byte b2 = 0;
        if (i4 < 0) {
            i4 = ~i4;
            i3 = 0;
            i2 = 0;
        } else {
            byte b3 = objectInput.readByte();
            if (b3 < 0) {
                ?? r5 = ~b3;
                i2 = 0;
                b2 = r5;
                i3 = 0;
            } else {
                byte b4 = objectInput.readByte();
                if (b4 < 0) {
                    i3 = ~b4;
                    i2 = 0;
                    b2 = b3;
                } else {
                    i2 = objectInput.readInt();
                    b2 = b3;
                    i3 = b4;
                }
            }
        }
        return O(i4, b2, i3, i2);
    }

    public static LocalTime ofSecondOfDay(long j2) {
        j$.time.temporal.a.SECOND_OF_DAY.z(j2);
        int i2 = (int) (j2 / 3600);
        long j3 = j2 - (i2 * DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED);
        return L(i2, (int) (j3 / 60), (int) (j3 - (r1 * 60)), 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 4, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f49810a, localTime.f49810a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f49811b, localTime.f49811b)) == 0 && (iCompare = Integer.compare(this.f49812c, localTime.f49812c)) == 0) ? Integer.compare(this.f49813d, localTime.f49813d) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.NANO_OF_DAY ? W() : mVar == j$.time.temporal.a.MICRO_OF_DAY ? W() / 1000 : N(mVar) : mVar.k(this);
    }

    public final int N(j$.time.temporal.m mVar) {
        int i2 = h.f50008a[((j$.time.temporal.a) mVar).ordinal()];
        byte b2 = this.f49811b;
        int i3 = this.f49813d;
        byte b3 = this.f49810a;
        switch (i2) {
            case 1:
                return i3;
            case 2:
                f.f("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
                return 0;
            case 3:
                return i3 / 1000;
            case 4:
                f.f("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
                return 0;
            case 5:
                return i3 / PlaybackException.CUSTOM_ERROR_CODE_BASE;
            case 6:
                return (int) (W() / 1000000);
            case 7:
                return this.f49812c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b2;
            case 10:
                return (b3 * 60) + b2;
            case 11:
                return b3 % StylePropertiesKt.HeightFractionId;
            case 12:
                int i4 = b3 % StylePropertiesKt.HeightFractionId;
                if (i4 % 12 == 0) {
                    return 12;
                }
                return i4;
            case 14:
                if (b3 == 0) {
                    return 24;
                }
            case 13:
                return b3;
            case 15:
                return b3 / StylePropertiesKt.HeightFractionId;
            default:
                f.f("Unsupported field: ".concat(String.valueOf(mVar)));
                return 0;
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.f(this, j2);
        }
        switch (h.f50009b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return T(j2);
            case 2:
                return T((j2 % 86400000000L) * 1000);
            case 3:
                return T((j2 % CalendarModelKt.MillisecondsIn24Hours) * 1000000);
            case 4:
                return U(j2);
            case 5:
                return S(j2);
            case 6:
                return R(j2);
            case 7:
                return R((j2 % 2) * 12);
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final LocalTime R(long j2) {
        if (j2 == 0) {
            return this;
        }
        return L(((((int) (j2 % 24)) + this.f49810a) + 24) % 24, this.f49811b, this.f49812c, this.f49813d);
    }

    public final LocalTime S(long j2) {
        if (j2 != 0) {
            int i2 = (this.f49810a * 60) + this.f49811b;
            int i3 = ((((int) (j2 % 1440)) + i2) + DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT) % DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT;
            if (i2 != i3) {
                return L(i3 / 60, i3 % 60, this.f49812c, this.f49813d);
            }
        }
        return this;
    }

    public final LocalTime T(long j2) {
        if (j2 != 0) {
            long jW = W();
            long j3 = (((j2 % 86400000000000L) + jW) + 86400000000000L) % 86400000000000L;
            if (jW != j3) {
                return L((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / C.NANOS_PER_SECOND) % 60), (int) (j3 % C.NANOS_PER_SECOND));
            }
        }
        return this;
    }

    public final LocalTime U(long j2) {
        if (j2 != 0) {
            int i2 = (this.f49811b * 60) + (this.f49810a * StylePropertiesKt.BottomId) + this.f49812c;
            int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
            if (i2 != i3) {
                return L(i3 / DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED, (i3 / 60) % 60, i3 % 60, this.f49813d);
            }
        }
        return this;
    }

    public final long W() {
        return (this.f49812c * C.NANOS_PER_SECOND) + (this.f49811b * 60000000000L) + (this.f49810a * 3600000000000L) + this.f49813d;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (LocalTime) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        aVar.z(j2);
        int i2 = h.f50008a[aVar.ordinal()];
        int i3 = this.f49813d;
        byte b2 = this.f49812c;
        byte b3 = this.f49811b;
        byte b4 = this.f49810a;
        switch (i2) {
            case 1:
                return Y((int) j2);
            case 2:
                return P(j2);
            case 3:
                return Y(((int) j2) * 1000);
            case 4:
                return P(j2 * 1000);
            case 5:
                return Y(((int) j2) * PlaybackException.CUSTOM_ERROR_CODE_BASE);
            case 6:
                return P(j2 * 1000000);
            case 7:
                int i4 = (int) j2;
                if (b2 != i4) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.z(i4);
                    return L(b4, b3, i4, i3);
                }
                return this;
            case 8:
                return U(j2 - toSecondOfDay());
            case 9:
                int i5 = (int) j2;
                if (b3 != i5) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.z(i5);
                    return L(b4, i5, b2, i3);
                }
                return this;
            case 10:
                return S(j2 - ((b4 * 60) + b3));
            case 11:
                return R(j2 - (b4 % StylePropertiesKt.HeightFractionId));
            case 12:
                if (j2 == 12) {
                    j2 = 0;
                }
                return R(j2 - (b4 % StylePropertiesKt.HeightFractionId));
            case 13:
                int i6 = (int) j2;
                if (b4 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.z(i6);
                    return L(i6, b3, b2, i3);
                }
                return this;
            case 14:
                if (j2 == 24) {
                    j2 = 0;
                }
                int i7 = (int) j2;
                if (b4 != i7) {
                    j$.time.temporal.a.HOUR_OF_DAY.z(i7);
                    return L(i7, b3, b2, i3);
                }
                return this;
            case 15:
                return R((j2 - (b4 / StylePropertiesKt.HeightFractionId)) * 12);
            default:
                f.f("Unsupported field: ".concat(String.valueOf(mVar)));
                return null;
        }
    }

    public final LocalTime Y(int i2) {
        if (this.f49813d == i2) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.z(i2);
        return L(this.f49810a, this.f49811b, this.f49812c, i2);
    }

    public final void Z(DataOutput dataOutput) throws IOException {
        byte b2 = this.f49810a;
        byte b3 = this.f49812c;
        byte b4 = this.f49811b;
        int i2 = this.f49813d;
        if (i2 != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b3);
            dataOutput.writeInt(i2);
            return;
        }
        if (b3 != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b4);
            dataOutput.writeByte(~b3);
        } else if (b4 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b4);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).B() : mVar != null && mVar.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f49810a == localTime.f49810a && this.f49811b == localTime.f49811b && this.f49812c == localTime.f49812c && this.f49813d == localTime.f49813d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? N(mVar) : j$.time.temporal.n.a(this, mVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    public final int hashCode() {
        long jW = W();
        return (int) (jW ^ (jW >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public int toSecondOfDay() {
        return (this.f49811b * 60) + (this.f49810a * StylePropertiesKt.BottomId) + this.f49812c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.f49810a;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        byte b3 = this.f49811b;
        sb.append(b3 < 10 ? ":0" : ":");
        sb.append((int) b3);
        byte b4 = this.f49812c;
        int i2 = this.f49813d;
        if (b4 > 0 || i2 > 0) {
            sb.append(b4 < 10 ? ":0" : ":");
            sb.append((int) b4);
            if (i2 > 0) {
                sb.append('.');
                if (i2 % PlaybackException.CUSTOM_ERROR_CODE_BASE == 0) {
                    sb.append(Integer.toString((i2 / PlaybackException.CUSTOM_ERROR_CODE_BASE) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + PlaybackException.CUSTOM_ERROR_CODE_BASE).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + 1000000000).substring(1));
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
            f.f("Unit is too large to be used for truncation");
            return null;
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos == 0) {
            return P((W() / nanos) * nanos);
        }
        f.f("Unit must divide into a standard day without remainder");
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeM = M(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localTimeM);
        }
        long jW = localTimeM.W() - W();
        switch (h.f50009b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jW;
            case 2:
                return jW / 1000;
            case 3:
                return jW / 1000000;
            case 4:
                return jW / C.NANOS_PER_SECOND;
            case 5:
                return jW / 60000000000L;
            case 6:
                return jW / 3600000000000L;
            case 7:
                return jW / 43200000000000L;
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.f50066b || nVar == j$.time.temporal.n.f50065a || nVar == j$.time.temporal.n.f50069e || nVar == j$.time.temporal.n.f50068d) {
            return null;
        }
        if (nVar == j$.time.temporal.n.f50071g) {
            return this;
        }
        if (nVar == j$.time.temporal.n.f50070f) {
            return null;
        }
        return nVar == j$.time.temporal.n.f50067c ? ChronoUnit.NANOS : nVar.d(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return this.b(j3, chronoUnit);
    }
}
