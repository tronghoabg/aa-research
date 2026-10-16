package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
final class y extends ZoneId {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37707d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b, reason: collision with root package name */
    private final String f37708b;

    /* renamed from: c, reason: collision with root package name */
    private final transient j$.time.zone.f f37709c;

    static y X(String str, boolean z2) {
        j$.time.zone.f fVarB;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = str.charAt(i5);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i5 == 0) && ((cCharAt < '0' || cCharAt > '9' || i5 == 0) && ((cCharAt != '~' || i5 == 0) && ((cCharAt != '.' || i5 == 0) && ((cCharAt != '_' || i5 == 0) && ((cCharAt != '+' || i5 == 0) && (cCharAt != '-' || i5 == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarB = j$.time.zone.j.b(str, true);
            } catch (j$.time.zone.g e7) {
                if (z2) {
                    throw e7;
                }
                fVarB = null;
            }
            return new y(str, fVarB);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    y(String str, j$.time.zone.f fVar) {
        this.f37708b = str;
        this.f37709c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String n() {
        return this.f37708b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f S() {
        j$.time.zone.f fVar = this.f37709c;
        return fVar != null ? fVar : j$.time.zone.j.b(this.f37708b, false);
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void W(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f37708b);
    }

    final void Y(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f37708b);
    }
}
