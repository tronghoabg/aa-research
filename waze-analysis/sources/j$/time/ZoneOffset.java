package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.waze.strings.DisplayStrings;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.k, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b, reason: collision with root package name */
    public final int f49827b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f49828c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f49823d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f49824e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = S(0);

    /* renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f49825f = S(-64800);

    /* renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f49826g = S(64800);

    public ZoneOffset(int i2) {
        String string;
        this.f49827b = i2;
        if (i2 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i2);
            int i3 = iAbs / DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED;
            int i4 = (iAbs / 60) % 60;
            StringBuilder sb = new StringBuilder(i2 < 0 ? "-" : "+");
            sb.append(i3 < 10 ? "0" : "");
            sb.append(i3);
            sb.append(i4 < 10 ? ":0" : ":");
            sb.append(i4);
            int i5 = iAbs % 60;
            if (i5 != 0) {
                sb.append(i5 < 10 ? ":0" : ":");
                sb.append(i5);
            }
            string = sb.toString();
        }
        this.f49828c = string;
    }

    public static ZoneOffset P(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.x(j$.time.temporal.n.f50068d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        f.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain ZoneOffset from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset Q(java.lang.String r8) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r8, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.f49824e
            java.lang.Object r0 = r0.get(r8)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r8.length()
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L62
            r1 = 3
            if (r0 == r1) goto L7e
            r5 = 5
            if (r0 == r5) goto L59
            r6 = 6
            r7 = 4
            if (r0 == r6) goto L4f
            r6 = 7
            if (r0 == r6) goto L42
            r1 = 9
            if (r0 != r1) goto L38
            int r0 = T(r8, r3, r4)
            int r1 = T(r8, r7, r3)
            int r3 = T(r8, r6, r3)
            goto L84
        L38:
            java.lang.String r0 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r8 = r0.concat(r8)
            j$.time.f.h(r8)
            return r2
        L42:
            int r0 = T(r8, r3, r4)
            int r1 = T(r8, r1, r4)
            int r3 = T(r8, r5, r4)
            goto L84
        L4f:
            int r0 = T(r8, r3, r4)
            int r1 = T(r8, r7, r3)
        L57:
            r3 = r4
            goto L84
        L59:
            int r0 = T(r8, r3, r4)
            int r1 = T(r8, r1, r4)
            goto L57
        L62:
            char r0 = r8.charAt(r4)
            char r8 = r8.charAt(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        L7e:
            int r0 = T(r8, r3, r4)
            r1 = r4
            r3 = r1
        L84:
            char r4 = r8.charAt(r4)
            r5 = 43
            r6 = 45
            if (r4 == r5) goto L9b
            if (r4 != r6) goto L91
            goto L9b
        L91:
            java.lang.String r0 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r8 = r0.concat(r8)
            j$.time.f.h(r8)
            return r2
        L9b:
            if (r4 != r6) goto La5
            int r8 = -r0
            int r0 = -r1
            int r1 = -r3
            j$.time.ZoneOffset r8 = R(r8, r0, r1)
            return r8
        La5:
            j$.time.ZoneOffset r8 = R(r0, r1, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.Q(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset R(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            f.d("Zone offset hours not in valid range: value ", i2, " is not in the range -18 to 18");
            return null;
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                f.h("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                f.h("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            f.h("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            f.d("Zone offset minutes not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (i4 < -59 || i4 > 59) {
            f.d("Zone offset seconds not in valid range: value ", i4, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i2) != 18 || (i3 | i4) == 0) {
            return S((i3 * 60) + (i2 * DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED) + i4);
        }
        f.h("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset S(int i2) {
        if (i2 < -64800 || i2 > 64800) {
            f.h("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i2 % 900 != 0) {
            return new ZoneOffset(i2);
        }
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = f49823d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i2));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        f49824e.putIfAbsent(zoneOffset2.f49828c, zoneOffset2);
        return zoneOffset2;
    }

    public static int T(CharSequence charSequence, int i2, boolean z) {
        if (z && charSequence.charAt(i2 - 1) != ':') {
            f.h("Invalid ID for ZoneOffset, colon not found when expected: ".concat(String.valueOf(charSequence)));
            return 0;
        }
        char cCharAt = charSequence.charAt(i2);
        char cCharAt2 = charSequence.charAt(i2 + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            f.h("Invalid ID for ZoneOffset, non numeric characters found: ".concat(String.valueOf(charSequence)));
            return 0;
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static ZoneOffset U(DataInput dataInput) throws IOException {
        byte b2 = dataInput.readByte();
        return b2 == 127 ? S(dataInput.readInt()) : S(b2 * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f49827b;
        }
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0L;
    }

    @Override // j$.time.ZoneId
    public final void O(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        V(objectOutput);
    }

    public final void V(DataOutput dataOutput) throws IOException {
        int i2 = this.f49827b;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.OFFSET_SECONDS : mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f49827b - this.f49827b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.f49827b == ((ZoneOffset) obj).f49827b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f49827b;
        }
        if (!(mVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, mVar).a(D(mVar), mVar);
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f49828c;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        Objects.requireNonNull(this, TypedValues.CycleType.S_WAVE_OFFSET);
        return new ZoneRules(this);
    }

    public int getTotalSeconds() {
        return this.f49827b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f49827b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(this.f49827b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f49828c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return (nVar == j$.time.temporal.n.f50068d || nVar == j$.time.temporal.n.f50069e) ? this : j$.time.temporal.n.c(this, nVar);
    }
}
