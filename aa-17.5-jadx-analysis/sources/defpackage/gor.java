package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gor implements gmo {
    public final List a;
    public final List b;
    public final fvu c;

    public gor(List list, List list2, fvu fvuVar) {
        this.a = list;
        this.b = list2;
        this.c = fvuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gor)) {
            return false;
        }
        gor gorVar = (gor) obj;
        return affa.f(this.a, gorVar.a) && affa.f(this.b, gorVar.b) && affa.f(this.c, gorVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fvu fvuVar = this.c;
        return (iHashCode * 31) + (fvuVar == null ? 0 : fvuVar.hashCode());
    }

    public final String toString() {
        return "MapActionsInternal(horizontalActions=" + this.a + ", verticalActions=" + this.b + ", primaryAction=" + this.c + ")";
    }

    public gor() {
        this(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gor(byte[] bArr) {
        afbe afbeVar = afbe.a;
        this(afbeVar, afbeVar, null);
    }
}
