package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC2901i;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long[] f37728i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    private static final e[] f37729j = new e[0];
    private static final LocalDateTime[] k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    private static final b[] f37730l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    private final long[] f37731a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset[] f37732b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f37733c;

    /* renamed from: d, reason: collision with root package name */
    private final LocalDateTime[] f37734d;

    /* renamed from: e, reason: collision with root package name */
    private final ZoneOffset[] f37735e;

    /* renamed from: f, reason: collision with root package name */
    private final e[] f37736f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeZone f37737g;

    /* renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f37738h = new ConcurrentHashMap();

    public static f h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new f(zoneOffset);
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f37731a = jArr;
        this.f37732b = zoneOffsetArr;
        this.f37733c = jArr2;
        this.f37735e = zoneOffsetArr2;
        this.f37736f = eVarArr;
        if (jArr2.length == 0) {
            this.f37734d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 < jArr2.length) {
                int i10 = i5 + 1;
                b bVar = new b(jArr2[i5], zoneOffsetArr2[i5], zoneOffsetArr2[i10]);
                if (bVar.D()) {
                    arrayList.add(bVar.q());
                    arrayList.add(bVar.o());
                } else {
                    arrayList.add(bVar.o());
                    arrayList.add(bVar.q());
                }
                i5 = i10;
            }
            this.f37734d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f37737g = null;
    }

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f37732b = zoneOffsetArr;
        long[] jArr = f37728i;
        this.f37731a = jArr;
        this.f37733c = jArr;
        this.f37734d = k;
        this.f37735e = zoneOffsetArr;
        this.f37736f = f37729j;
        this.f37737g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f37732b = zoneOffsetArr;
        long[] jArr = f37728i;
        this.f37731a = jArr;
        this.f37733c = jArr;
        this.f37734d = k;
        this.f37735e = zoneOffsetArr;
        this.f37736f = f37729j;
        this.f37737g = timeZone;
    }

    private static ZoneOffset i(int i5) {
        return ZoneOffset.c0(i5 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f37737g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.f37731a;
        objectOutput.writeInt(jArr.length);
        for (long j8 : jArr) {
            a.c(j8, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f37732b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f37733c;
        objectOutput.writeInt(jArr2.length);
        for (long j10 : jArr2) {
            a.c(j10, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f37735e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f37736f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    final void k(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f37737g.getID());
    }

    static f j(ObjectInput objectInput) throws IOException {
        int i5 = objectInput.readInt();
        long[] jArr = f37728i;
        long[] jArr2 = i5 == 0 ? jArr : new long[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            jArr2[i10] = a.a(objectInput);
        }
        int i11 = i5 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zoneOffsetArr[i12] = a.b(objectInput);
        }
        int i13 = objectInput.readInt();
        if (i13 != 0) {
            jArr = new long[i13];
        }
        long[] jArr3 = jArr;
        for (int i14 = 0; i14 < i13; i14++) {
            jArr3[i14] = a.a(objectInput);
        }
        int i15 = i13 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            zoneOffsetArr2[i16] = a.b(objectInput);
        }
        int i17 = objectInput.readByte();
        e[] eVarArr = i17 == 0 ? f37729j : new e[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            eVarArr[i18] = e.b(objectInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f37737g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f37733c;
        if (jArr.length == 0) {
            return this.f37732b[0];
        }
        long jT = instant.T();
        int length = this.f37736f.length;
        ZoneOffset[] zoneOffsetArr = this.f37735e;
        if (length > 0 && jT > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(jT, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i5 = 0; i5 < bVarArrB.length; i5++) {
                bVar = bVarArrB[i5];
                if (jT < bVar.Q()) {
                    return bVar.w();
                }
            }
            return bVar.t();
        }
        int iBinarySearch = Arrays.binarySearch(jArr, jT);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return ((b) objE).B();
        }
        return Collections.singletonList((ZoneOffset) objE);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f37732b;
        int i5 = 0;
        TimeZone timeZone = this.f37737g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.a0());
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(AbstractC2901i.o(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i5 < length) {
                b bVar = bVarArrB[i5];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.w())) {
                    return objA;
                }
                i5++;
                obj = objA;
            }
            return obj;
        }
        if (this.f37733c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f37736f.length;
        LocalDateTime[] localDateTimeArr = this.f37734d;
        if (length2 > 0 && localDateTime.b0(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.a0());
            int length3 = bVarArrB2.length;
            while (i5 < length3) {
                b bVar2 = bVarArrB2[i5];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.w())) {
                    return objA2;
                }
                i5++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f37735e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i10 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i10])) {
                iBinarySearch = i10;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i11 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i11];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i11 + 1];
        return zoneOffset2.Z() > zoneOffset.Z() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeQ = bVar.q();
        if (bVar.D()) {
            if (localDateTime.c0(localDateTimeQ)) {
                return bVar.w();
            }
            if (!localDateTime.c0(bVar.o())) {
                return bVar.t();
            }
        } else {
            if (!localDateTime.c0(localDateTimeQ)) {
                return bVar.t();
            }
            if (localDateTime.c0(bVar.o())) {
                return bVar.w();
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i5) {
        Integer numValueOf = Integer.valueOf(i5);
        ConcurrentHashMap concurrentHashMap = this.f37738h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f37737g;
        if (timeZone == null) {
            e[] eVarArr = this.f37736f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                bVarArr2[i10] = eVarArr[i10].a(i5);
            }
            if (i5 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = f37730l;
        if (i5 < 1800) {
            return bVarArr3;
        }
        long jO = AbstractC2901i.o(LocalDateTime.d0(i5 - 1), this.f37732b[0]);
        long j8 = 1000;
        int offset = timeZone.getOffset(jO * 1000);
        long j10 = 31968000 + jO;
        while (jO < j10) {
            long j11 = 7776000 + jO;
            long j12 = j8;
            if (offset != timeZone.getOffset(j11 * j12)) {
                while (j11 - jO > 1) {
                    int i11 = offset;
                    long jF = j$.time.b.f(j11 + jO, 2L);
                    if (timeZone.getOffset(jF * j12) == i11) {
                        jO = jF;
                    } else {
                        j11 = jF;
                    }
                    offset = i11;
                }
                int i12 = offset;
                if (timeZone.getOffset(jO * j12) == i12) {
                    jO = j11;
                }
                ZoneOffset zoneOffsetI = i(i12);
                offset = timeZone.getOffset(jO * j12);
                ZoneOffset zoneOffsetI2 = i(offset);
                if (c(jO, zoneOffsetI2) == i5) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(jO, zoneOffsetI, zoneOffsetI2);
                }
            } else {
                jO = j11;
            }
            j8 = j12;
        }
        if (1916 <= i5 && i5 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j8, ZoneOffset zoneOffset) {
        return j$.time.g.i0(j$.time.b.f(j8 + zoneOffset.Z(), 86400)).a0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f37737g, fVar.f37737g) && Arrays.equals(this.f37731a, fVar.f37731a) && Arrays.equals(this.f37732b, fVar.f37732b) && Arrays.equals(this.f37733c, fVar.f37733c) && Arrays.equals(this.f37735e, fVar.f37735e) && Arrays.equals(this.f37736f, fVar.f37736f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f37737g) ^ Arrays.hashCode(this.f37731a)) ^ Arrays.hashCode(this.f37732b)) ^ Arrays.hashCode(this.f37733c)) ^ Arrays.hashCode(this.f37735e)) ^ Arrays.hashCode(this.f37736f);
    }

    public final String toString() {
        TimeZone timeZone = this.f37737g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f37732b[r1.length - 1] + "]";
    }
}
