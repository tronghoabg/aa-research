package defpackage;

/* loaded from: classes2.dex */
public final class gzk {
    public static final gzk a = new gzk(1, null);
    public static final gzk b = new gzk(2, null);
    public final fvd c;
    public final int d;

    public gzk(int i, fvd fvdVar) {
        this.d = i;
        this.c = fvdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzk)) {
            return false;
        }
        gzk gzkVar = (gzk) obj;
        return this.d == gzkVar.d && affa.f(this.c, gzkVar.c);
    }

    public final int hashCode() {
        fvd fvdVar = this.c;
        return (this.d * 31) + (fvdVar == null ? 0 : fvdVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlphaJumpData(state=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "JUMPED" : "KEYBOARD" : "NONE"));
        sb.append(", jumpKey=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
