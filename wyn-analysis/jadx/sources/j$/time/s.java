package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s implements j$.time.temporal.p, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final s f37658d = new s(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37659a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37660b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37661c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        b.d(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static s b(int i5) {
        if (i5 == 0) {
            return f37658d;
        }
        return new s(0, 0, i5);
    }

    private s(int i5, int i10, int i11) {
        this.f37659a = i5;
        this.f37660b = i10;
        this.f37661c = i11;
    }

    public final int a() {
        return this.f37661c;
    }

    public final long d() {
        return (this.f37659a * 12) + this.f37660b;
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        j$.time.chrono.m mVar = (j$.time.chrono.m) temporal.B(j$.time.temporal.l.e());
        if (mVar == null || j$.time.chrono.t.f37543d.equals(mVar)) {
            if (this.f37660b == 0) {
                int i5 = this.f37659a;
                if (i5 != 0) {
                    temporal = temporal.e(i5, ChronoUnit.YEARS);
                }
            } else {
                long jD = d();
                if (jD != 0) {
                    temporal = temporal.e(jD, ChronoUnit.MONTHS);
                }
            }
            int i10 = this.f37661c;
            return i10 != 0 ? temporal.e(i10, ChronoUnit.DAYS) : temporal;
        }
        throw new c("Chronology mismatch, expected: ISO, actual: " + mVar.n());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f37659a == sVar.f37659a && this.f37660b == sVar.f37660b && this.f37661c == sVar.f37661c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f37661c, 16) + Integer.rotateLeft(this.f37660b, 8) + this.f37659a;
    }

    public final String toString() {
        if (this == f37658d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i5 = this.f37659a;
        if (i5 != 0) {
            sb2.append(i5);
            sb2.append('Y');
        }
        int i10 = this.f37660b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f37661c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f37659a);
        objectOutput.writeInt(this.f37660b);
        objectOutput.writeInt(this.f37661c);
    }

    static s c(ObjectInput objectInput) throws IOException {
        int i5 = objectInput.readInt();
        int i10 = objectInput.readInt();
        int i11 = objectInput.readInt();
        if ((i5 | i10 | i11) == 0) {
            return f37658d;
        }
        return new s(i5, i10, i11);
    }
}
