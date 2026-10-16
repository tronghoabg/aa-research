package defpackage;

/* loaded from: classes.dex */
public final class rlh {
    public final boolean a;
    public final int b;
    public final rls c;

    public rlh(boolean z, int i, rls rlsVar) {
        this.a = z;
        this.b = i;
        this.c = rlsVar;
    }

    public static rlg a() {
        rlg rlgVar = new rlg();
        rlgVar.b(100);
        rlgVar.a = rls.a().a();
        return rlgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rlh) {
            rlh rlhVar = (rlh) obj;
            if (this.a == rlhVar.a && this.b == rlhVar.b && this.c.equals(rlhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return this.c.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "GalSnoopSettings{isEnabled=" + this.a + ", bufferSize=" + this.b + ", galMessageFilter=" + String.valueOf(this.c) + "}";
    }

    public rlh() {
        throw null;
    }
}
