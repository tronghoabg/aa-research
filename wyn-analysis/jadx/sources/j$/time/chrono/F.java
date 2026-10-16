package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    private byte f37503a;

    /* renamed from: b, reason: collision with root package name */
    private Object f37504b;

    public F() {
    }

    F(byte b5, Object obj) {
        this.f37503a = b5;
        this.f37504b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b5 = this.f37503a;
        Object obj = this.f37504b;
        objectOutput.writeByte(b5);
        switch (b5) {
            case 1:
                objectOutput.writeUTF(((AbstractC2893a) obj).n());
                return;
            case 2:
                ((C2899g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((z) obj).H(objectOutput);
                return;
            case 6:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 7:
                D d3 = (D) obj;
                d3.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(d3, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(d3, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(d3, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j8 = (J) obj;
                j8.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(j8, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(j8, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(j8, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C2900h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objS;
        byte b5 = objectInput.readByte();
        this.f37503a = b5;
        switch (b5) {
            case 1:
                int i5 = AbstractC2893a.f37512c;
                objS = AbstractC2893a.s(objectInput.readUTF());
                break;
            case 2:
                objS = ((InterfaceC2894b) objectInput.readObject()).z((j$.time.k) objectInput.readObject());
                break;
            case 3:
                objS = ((InterfaceC2897e) objectInput.readObject()).p((ZoneOffset) objectInput.readObject()).k((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.g gVar = y.f37548d;
                int i10 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                w.f37546d.getClass();
                objS = new y(j$.time.g.g0(i10, b10, b11));
                break;
            case 5:
                z zVar = z.f37552d;
                objS = z.v(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                pVar.getClass();
                objS = r.Y(pVar, i11, b12, b13);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                B.f37499d.getClass();
                objS = new D(j$.time.g.g0(i12 + 1911, b14, b15));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                H.f37506d.getClass();
                objS = new J(j$.time.g.g0(i13 - 543, b16, b17));
                break;
            case 9:
                int i14 = C2900h.f37517e;
                objS = new C2900h(AbstractC2893a.s(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f37504b = objS;
    }

    private Object readResolve() {
        return this.f37504b;
    }
}
