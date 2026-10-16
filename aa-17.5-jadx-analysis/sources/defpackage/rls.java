package defpackage;

/* loaded from: classes.dex */
public final class rls {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public rls(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static rlr a() {
        rlr rlrVar = new rlr();
        rlrVar.d(false);
        rlrVar.c(false);
        rlrVar.b(false);
        return rlrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rls) {
            rls rlsVar = (rls) obj;
            if (this.a == rlsVar.a && this.b == rlsVar.b && this.c == rlsVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "GalMessageFilter{videoAckLoggable=" + this.a + ", audioMediaAckLoggable=" + this.b + ", audioGuidanceAckLoggable=" + this.c + "}";
    }

    public rls() {
        throw null;
    }
}
