package j$.time.chrono;

import com.waze.strings.DisplayStrings;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    public byte f49842a;

    /* renamed from: b, reason: collision with root package name */
    public Object f49843b;

    public d0(byte b2, Object obj) {
        this.f49842a = b2;
        this.f49843b = obj;
    }

    private Object readResolve() {
        return this.f49843b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objM;
        byte b2 = objectInput.readByte();
        this.f49842a = b2;
        switch (b2) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f49835a;
                objM = a.m(objectInput.readUTF());
                break;
            case 2:
                objM = ((b) objectInput.readObject()).E((LocalTime) objectInput.readObject());
                break;
            case 3:
                objM = ((e) objectInput.readObject()).A((ZoneOffset) objectInput.readObject()).w((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = w.f49883d;
                int i2 = objectInput.readInt();
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                u.f49881d.getClass();
                objM = new w(LocalDate.of(i2, b3, b4));
                break;
            case 5:
                x xVar = x.f49887d;
                objM = x.i(objectInput.readByte());
                break;
            case 6:
                n nVar = (n) objectInput.readObject();
                int i3 = objectInput.readInt();
                byte b5 = objectInput.readByte();
                byte b6 = objectInput.readByte();
                nVar.getClass();
                objM = new p(nVar, i3, b5, b6);
                break;
            case 7:
                int i4 = objectInput.readInt();
                byte b7 = objectInput.readByte();
                byte b8 = objectInput.readByte();
                z.f49893d.getClass();
                objM = new b0(LocalDate.of(i4 + DisplayStrings.DS_CUSTOM_PROMPT_FIFTH, b7, b8));
                break;
            case 8:
                int i5 = objectInput.readInt();
                byte b9 = objectInput.readByte();
                byte b10 = objectInput.readByte();
                f0.f49846d.getClass();
                objM = new h0(LocalDate.of(i5 - 543, b9, b10));
                break;
            case 9:
                int i6 = h.f49850e;
                objM = new h(a.m(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f49843b = objM;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f49842a;
        Object obj = this.f49843b;
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.f49847a);
                objectOutput.writeObject(gVar.f49848b);
                return;
            case 3:
                k kVar = (k) obj;
                objectOutput.writeObject(kVar.f49859a);
                objectOutput.writeObject(kVar.f49860b);
                objectOutput.writeObject(kVar.f49861c);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(wVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(wVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(wVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((x) obj).f49889a);
                return;
            case 6:
                p pVar = (p) obj;
                objectOutput.writeObject(pVar.f49873a);
                objectOutput.writeInt(j$.time.temporal.n.a(pVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(pVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(pVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(b0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(b0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(b0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(h0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(h0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(h0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.f49851a.getId());
                objectOutput.writeInt(hVar.f49852b);
                objectOutput.writeInt(hVar.f49853c);
                objectOutput.writeInt(hVar.f49854d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public d0() {
    }
}
