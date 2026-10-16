package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final a a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.A(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public h(a aVar, int i, int i2, int i3) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.a.equals(hVar.a);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal h(Temporal temporal) {
        a aVar = (a) temporal.w(j$.time.temporal.o.b);
        a aVar2 = this.a;
        if (aVar != null && !aVar2.equals(aVar)) {
            j$.time.g.g(j$.time.e.a("Chronology mismatch, expected: ", aVar2.getId(), ", actual: ", aVar.getId()));
            return null;
        }
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            j$.time.temporal.q qVarC = aVar2.C(j$.time.temporal.a.MONTH_OF_YEAR);
            long j = qVarC.a;
            long j2 = qVarC.d;
            long j3 = (j == qVarC.b && qVarC.c == j2 && qVarC.d()) ? (j2 - qVarC.a) + 1 : -1L;
            if (j3 > 0) {
                temporal = temporal.b((i * j3) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.b(i, ChronoUnit.YEARS);
                }
                temporal = temporal.b(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    public final String toString() {
        a aVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return aVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new e0((byte) 9, this);
    }
}
