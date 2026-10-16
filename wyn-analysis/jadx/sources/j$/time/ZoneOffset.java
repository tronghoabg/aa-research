package j$.time;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b, reason: collision with root package name */
    private final int f37491b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f37492c;

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f37487d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f37488e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = c0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f37489f = c0(-64800);

    /* renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f37490g = c0(64800);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset a0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.f37488e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r6, r2)
            int r2 = d0(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r1, r3)
            int r2 = d0(r7, r4, r3)
            goto L85
        L50:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = d0(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = b0(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = b0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.a0(java.lang.String):j$.time.ZoneOffset");
    }

    private static int d0(String str, int i5, boolean z2) {
        if (z2 && str.charAt(i5 - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i5);
        char cCharAt2 = str.charAt(i5 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset Y(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.B(j$.time.temporal.l.h());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new c("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    public static ZoneOffset b0(int i5, int i10, int i11) {
        if (i5 < -18 || i5 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i5 + " is not in the range -18 to 18");
        }
        if (i5 > 0) {
            if (i10 < 0 || i11 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i5 < 0) {
            if (i10 > 0 || i11 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i10 > 0 && i11 < 0) || (i10 < 0 && i11 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i10 < -59 || i10 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (i11 < -59 || i11 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (Math.abs(i5) == 18 && (i10 | i11) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return c0((i10 * 60) + (i5 * 3600) + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset c0(int i5) {
        if (i5 < -64800 || i5 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i5 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i5);
            ConcurrentHashMap concurrentHashMap = f37487d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i5));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f37488e.putIfAbsent(zoneOffset2.f37492c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i5);
    }

    private ZoneOffset(int i5) {
        String string;
        this.f37491b = i5;
        if (i5 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i5);
            StringBuilder sb2 = new StringBuilder();
            int i10 = iAbs / 3600;
            int i11 = (iAbs / 60) % 60;
            sb2.append(i5 < 0 ? "-" : "+");
            sb2.append(i10 < 10 ? "0" : "");
            sb2.append(i10);
            String str = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
            sb2.append(i11 < 10 ? ":0" : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(i11);
            int i12 = iAbs % 60;
            if (i12 != 0) {
                sb2.append(i12 < 10 ? ":0" : str);
                sb2.append(i12);
            }
            string = sb2.toString();
        }
        this.f37492c = string;
    }

    public final int Z() {
        return this.f37491b;
    }

    @Override // j$.time.ZoneId
    public final String n() {
        return this.f37492c;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f S() {
        return j$.time.zone.f.h(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f37491b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return j$.time.temporal.l.d(this, qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f37491b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        return (rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.j()) ? this : j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(this.f37491b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f37491b - this.f37491b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.f37491b == ((ZoneOffset) obj).f37491b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f37491b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f37492c;
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void W(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        f0(objectOutput);
    }

    final void f0(DataOutput dataOutput) throws IOException {
        int i5 = this.f37491b;
        int i10 = i5 % 900 == 0 ? i5 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i5);
        }
    }

    static ZoneOffset e0(ObjectInput objectInput) throws IOException {
        byte b5 = objectInput.readByte();
        return b5 == 127 ? c0(objectInput.readInt()) : c0(b5 * 900);
    }
}
