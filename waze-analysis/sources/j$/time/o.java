package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    public byte f50023a;

    /* renamed from: b, reason: collision with root package name */
    public Object f50024b;

    public o(byte b2, Object obj) {
        this.f50023a = b2;
        this.f50024b = obj;
    }

    public static Serializable a(byte b2, ObjectInput objectInput) throws IOException {
        switch (b2) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f49793c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.f49798d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.V(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f49803c;
                LocalDate localDate2 = LocalDate.f49798d;
                return LocalDateTime.N(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f49803c;
                LocalDate localDate3 = LocalDate.f49798d;
                LocalDateTime localDateTimeN = LocalDateTime.N(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput));
                ZoneOffset zoneOffsetU = ZoneOffset.U(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeN, "localDateTime");
                Objects.requireNonNull(zoneOffsetU, TypedValues.CycleType.S_WAVE_OFFSET);
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetU.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeN, zoneId, zoneOffsetU);
                }
                f.b("ZoneId must match ZoneOffset");
                return null;
            case 7:
                int i2 = s.f50031d;
                return ZoneId.L(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.U(objectInput);
            case 9:
                int i3 = m.f50016c;
                return new m(LocalTime.V(objectInput), ZoneOffset.U(objectInput));
            case 10:
                int i4 = OffsetDateTime.f49816c;
                LocalDate localDate4 = LocalDate.f49798d;
                return new OffsetDateTime(LocalDateTime.N(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput)), ZoneOffset.U(objectInput));
            case 11:
                int i5 = q.f50027b;
                return q.B(objectInput.readInt());
            case 12:
                int i6 = YearMonth.f49819c;
                int i7 = objectInput.readInt();
                byte b3 = objectInput.readByte();
                j$.time.temporal.a.YEAR.z(i7);
                j$.time.temporal.a.MONTH_OF_YEAR.z(b3);
                return new YearMonth(i7, b3);
            case 13:
                int i8 = j.f50011c;
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                Month monthN = Month.N(b4);
                Objects.requireNonNull(monthN, "month");
                j$.time.temporal.a.DAY_OF_MONTH.z(b5);
                if (b5 <= monthN.M()) {
                    return new j(monthN.getValue(), b5);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) b5) + " is not valid for month " + monthN.name());
            case 14:
                n nVar = n.f50019d;
                return n.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f50024b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        this.f50023a = b2;
        this.f50024b = a(b2, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f50023a;
        Object obj = this.f50024b;
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f49791a);
                objectOutput.writeInt(duration.f49792b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f49796a);
                objectOutput.writeInt(instant.f49797b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f49800a);
                objectOutput.writeByte(localDate.f49801b);
                objectOutput.writeByte(localDate.f49802c);
                return;
            case 4:
                ((LocalTime) obj).Z(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.f49805a;
                objectOutput.writeInt(localDate2.f49800a);
                objectOutput.writeByte(localDate2.f49801b);
                objectOutput.writeByte(localDate2.f49802c);
                localDateTime.f49806b.Z(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f49829a;
                LocalDate localDate3 = localDateTime2.f49805a;
                objectOutput.writeInt(localDate3.f49800a);
                objectOutput.writeByte(localDate3.f49801b);
                objectOutput.writeByte(localDate3.f49802c);
                localDateTime2.f49806b.Z(objectOutput);
                zonedDateTime.f49830b.V(objectOutput);
                zonedDateTime.f49831c.O(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((s) obj).f50032b);
                return;
            case 8:
                ((ZoneOffset) obj).V(objectOutput);
                return;
            case 9:
                m mVar = (m) obj;
                mVar.f50017a.Z(objectOutput);
                mVar.f50018b.V(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f49817a;
                LocalDate localDate4 = localDateTime3.f49805a;
                objectOutput.writeInt(localDate4.f49800a);
                objectOutput.writeByte(localDate4.f49801b);
                objectOutput.writeByte(localDate4.f49802c);
                localDateTime3.f49806b.Z(objectOutput);
                offsetDateTime.f49818b.V(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((q) obj).f50028a);
                return;
            case 12:
                YearMonth yearMonth = (YearMonth) obj;
                objectOutput.writeInt(yearMonth.f49820a);
                objectOutput.writeByte(yearMonth.f49821b);
                return;
            case 13:
                j jVar = (j) obj;
                objectOutput.writeByte(jVar.f50012a);
                objectOutput.writeByte(jVar.f50013b);
                return;
            case 14:
                n nVar = (n) obj;
                objectOutput.writeInt(nVar.f50020a);
                objectOutput.writeInt(nVar.f50021b);
                objectOutput.writeInt(nVar.f50022c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public o() {
    }
}
