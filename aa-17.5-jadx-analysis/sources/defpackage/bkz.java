package defpackage;

/* loaded from: classes.dex */
public final class bkz {
    private final bdt a;
    private final long b;
    private final boolean c;
    private final int d;

    public bkz(bdt bdtVar, long j, int i, boolean z) {
        this.a = bdtVar;
        this.b = j;
        this.d = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkz)) {
            return false;
        }
        bkz bkzVar = (bkz) obj;
        return this.a == bkzVar.a && a.j(this.b, bkzVar.b) && this.d == bkzVar.d && this.c == bkzVar.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.g(this.b)) * 31) + this.d) * 31) + a.f(this.c);
    }

    public final String toString() {
        String strD = cja.d(this.b);
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(strD);
        sb.append(", anchor=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "Right" : "Middle" : "Left"));
        sb.append(", visible=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
