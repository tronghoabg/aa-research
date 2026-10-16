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
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a, reason: collision with root package name */
    private byte f37711a;

    /* renamed from: b, reason: collision with root package name */
    private Serializable f37712b;

    public a() {
    }

    a(byte b5, Serializable serializable) {
        this.f37711a = b5;
        this.f37712b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b5 = this.f37711a;
        Serializable serializable = this.f37712b;
        objectOutput.writeByte(b5);
        if (b5 == 1) {
            ((f) serializable).writeExternal(objectOutput);
            return;
        }
        if (b5 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b5 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else {
            if (b5 == 100) {
                ((f) serializable).k(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable serializableJ;
        byte b5 = objectInput.readByte();
        this.f37711a = b5;
        if (b5 == 1) {
            serializableJ = f.j(objectInput);
        } else if (b5 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            serializableJ = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b5 == 3) {
            serializableJ = e.b(objectInput);
        } else {
            if (b5 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            serializableJ = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f37712b = serializableJ;
    }

    private Object readResolve() {
        return this.f37712b;
    }

    static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int iZ = zoneOffset.Z();
        int i5 = iZ % 900 == 0 ? iZ / 900 : 127;
        objectOutput.writeByte(i5);
        if (i5 == 127) {
            objectOutput.writeInt(iZ);
        }
    }

    static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b5 = objectInput.readByte();
        return b5 == 127 ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0(b5 * 900);
    }

    static void c(long j8, ObjectOutput objectOutput) {
        if (j8 >= -4575744000L && j8 < 10413792000L && j8 % 900 == 0) {
            int i5 = (int) ((j8 + 4575744000L) / 900);
            objectOutput.writeByte((i5 >>> 16) & 255);
            objectOutput.writeByte((i5 >>> 8) & 255);
            objectOutput.writeByte(i5 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j8);
    }

    static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & ForkServer.ERROR) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & ForkServer.ERROR) << 8)) + (objectInput.readByte() & ForkServer.ERROR)) * 900) - 4575744000L;
    }
}
