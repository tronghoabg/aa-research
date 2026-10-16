package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    private byte f37662a;

    /* renamed from: b, reason: collision with root package name */
    private Object f37663b;

    public t() {
    }

    t(byte b5, Object obj) {
        this.f37662a = b5;
        this.f37663b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b5 = this.f37662a;
        Object obj = this.f37663b;
        objectOutput.writeByte(b5);
        switch (b5) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).b0(objectOutput);
                return;
            case 3:
                ((g) obj).u0(objectOutput);
                return;
            case 4:
                ((k) obj).n0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).o0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).Z(objectOutput);
                return;
            case 7:
                ((y) obj).Y(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).f0(objectOutput);
                return;
            case 9:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((v) obj).V(objectOutput);
                return;
            case 12:
                ((x) obj).Y(objectOutput);
                return;
            case 13:
                ((o) obj).S(objectOutput);
                return;
            case 14:
                ((s) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b5 = objectInput.readByte();
        this.f37662a = b5;
        this.f37663b = b(b5, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b5, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b5) {
            case 1:
                Duration duration = Duration.f37474c;
                return Duration.B(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f37477c;
                return Instant.X(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.f37632d;
                return g.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.i0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f37480c;
                g gVar2 = g.f37632d;
                return LocalDateTime.f0(g.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.i0(objectInput));
            case 6:
                return ZonedDateTime.V(objectInput);
            case 7:
                int i5 = y.f37707d;
                return ZoneId.T(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.e0(objectInput);
            case 9:
                return r.T(objectInput);
            case 10:
                return OffsetDateTime.U(objectInput);
            case 11:
                int i10 = v.f37700b;
                return v.R(objectInput.readInt());
            case 12:
                int i11 = x.f37704c;
                return x.S(objectInput.readInt(), objectInput.readByte());
            case 13:
                return o.R(objectInput);
            case 14:
                return s.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f37663b;
    }
}
