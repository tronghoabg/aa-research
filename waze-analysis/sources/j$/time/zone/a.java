package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a, reason: collision with root package name */
    public byte f50097a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f50098b;

    public a(byte b2, Serializable serializable) {
        this.f50097a = b2;
        this.f50098b = serializable;
    }

    public static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & 255) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        return b2 == 127 ? ZoneOffset.S(objectInput.readInt()) : ZoneOffset.S(b2 * 900);
    }

    public static void c(long j2, ObjectOutput objectOutput) throws IOException {
        if (j2 < -4575744000L || j2 >= 10413792000L || j2 % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j2);
        } else {
            int i2 = (int) ((j2 + 4575744000L) / 900);
            objectOutput.writeByte((i2 >>> 16) & 255);
            objectOutput.writeByte((i2 >>> 8) & 255);
            objectOutput.writeByte(i2 & 255);
        }
    }

    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i2 = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        objectOutput.writeByte(i2);
        if (i2 == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    private Object readResolve() {
        return this.f50098b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable zoneRules;
        byte b2 = objectInput.readByte();
        this.f50097a = b2;
        if (b2 == 1) {
            int i2 = objectInput.readInt();
            long[] jArr = ZoneRules.f50085i;
            long[] jArr2 = i2 == 0 ? jArr : new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr2[i3] = a(objectInput);
            }
            int i4 = i2 + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                zoneOffsetArr[i5] = b(objectInput);
            }
            int i6 = objectInput.readInt();
            if (i6 != 0) {
                jArr = new long[i6];
            }
            long[] jArr3 = jArr;
            for (int i7 = 0; i7 < i6; i7++) {
                jArr3[i7] = a(objectInput);
            }
            int i8 = i6 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                zoneOffsetArr2[i9] = b(objectInput);
            }
            int i10 = objectInput.readByte();
            d[] dVarArr = i10 == 0 ? ZoneRules.f50086j : new d[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                dVarArr[i11] = d.a(objectInput);
            }
            zoneRules = new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, dVarArr);
        } else if (b2 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                j$.time.f.b("Offsets must not be equal");
                return;
            }
            zoneRules = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b2 == 3) {
            zoneRules = d.a(objectInput);
        } else {
            if (b2 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            zoneRules = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f50098b = zoneRules;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f50097a;
        Serializable serializable = this.f50098b;
        objectOutput.writeByte(b2);
        if (b2 != 1) {
            if (b2 == 2) {
                b bVar = (b) serializable;
                c(bVar.f50099a, objectOutput);
                d(bVar.f50101c, objectOutput);
                d(bVar.f50102d, objectOutput);
                return;
            }
            if (b2 == 3) {
                ((d) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b2 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((ZoneRules) serializable).f50095g.getID());
                return;
            }
        }
        ZoneRules zoneRules = (ZoneRules) serializable;
        d[] dVarArr = zoneRules.f50094f;
        long[] jArr = zoneRules.f50091c;
        long[] jArr2 = zoneRules.f50089a;
        objectOutput.writeInt(jArr2.length);
        for (long j2 : jArr2) {
            c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.f50090b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(jArr.length);
        for (long j3 : jArr) {
            c(j3, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.f50093e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(dVarArr.length);
        for (d dVar : dVarArr) {
            dVar.writeExternal(objectOutput);
        }
    }

    public a() {
    }
}
