package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2900h implements j$.time.temporal.p, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f37517e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    private final m f37518a;

    /* renamed from: b, reason: collision with root package name */
    final int f37519b;

    /* renamed from: c, reason: collision with root package name */
    final int f37520c;

    /* renamed from: d, reason: collision with root package name */
    final int f37521d;

    static {
        j$.time.b.d(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C2900h(m mVar, int i5, int i10, int i11) {
        Objects.requireNonNull(mVar, "chrono");
        this.f37518a = mVar;
        this.f37519b = i5;
        this.f37520c = i10;
        this.f37521d = i11;
    }

    public final String toString() {
        m mVar = this.f37518a;
        int i5 = this.f37521d;
        int i10 = this.f37520c;
        int i11 = this.f37519b;
        if (i11 == 0 && i10 == 0 && i5 == 0) {
            return mVar.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.toString());
        sb2.append(" P");
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('Y');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i5 != 0) {
            sb2.append(i5);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        m mVar = (m) temporal.B(j$.time.temporal.l.e());
        m mVar2 = this.f37518a;
        if (mVar == null || mVar2.equals(mVar)) {
            int i5 = this.f37519b;
            int i10 = this.f37520c;
            if (i10 != 0) {
                j$.time.temporal.t tVarK = mVar2.K(j$.time.temporal.a.MONTH_OF_YEAR);
                long jD = (tVarK.g() && tVarK.h()) ? (tVarK.d() - tVarK.e()) + 1 : -1L;
                if (jD > 0) {
                    temporal = temporal.e((i5 * jD) + i10, ChronoUnit.MONTHS);
                } else {
                    if (i5 != 0) {
                        temporal = temporal.e(i5, ChronoUnit.YEARS);
                    }
                    temporal = temporal.e(i10, ChronoUnit.MONTHS);
                }
            } else if (i5 != 0) {
                temporal = temporal.e(i5, ChronoUnit.YEARS);
            }
            int i11 = this.f37521d;
            return i11 != 0 ? temporal.e(i11, ChronoUnit.DAYS) : temporal;
        }
        throw new j$.time.c("Chronology mismatch, expected: " + mVar2.n() + ", actual: " + mVar.n());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2900h) {
            C2900h c2900h = (C2900h) obj;
            if (this.f37519b == c2900h.f37519b && this.f37520c == c2900h.f37520c && this.f37521d == c2900h.f37521d && this.f37518a.equals(c2900h.f37518a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37518a.hashCode() ^ (Integer.rotateLeft(this.f37521d, 16) + (Integer.rotateLeft(this.f37520c, 8) + this.f37519b));
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f37518a.n());
        objectOutput.writeInt(this.f37519b);
        objectOutput.writeInt(this.f37520c);
        objectOutput.writeInt(this.f37521d);
    }
}
