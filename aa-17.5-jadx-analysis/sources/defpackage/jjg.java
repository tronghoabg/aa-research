package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jjg {
    public final List a;
    public final boolean b;
    public final int c;
    public final jit d;

    public jjg(List list, boolean z, int i, jit jitVar) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = jitVar;
    }

    public static /* synthetic */ jjg a(jjg jjgVar, List list, boolean z, int i, jit jitVar, int i2) {
        if ((i2 & 1) != 0) {
            list = jjgVar.a;
        }
        if ((i2 & 2) != 0) {
            z = jjgVar.b;
        }
        if ((i2 & 4) != 0) {
            i = jjgVar.c;
        }
        if ((i2 & 8) != 0) {
            jitVar = jjgVar.d;
        }
        list.getClass();
        jitVar.getClass();
        return new jjg(list, z, i, jitVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjg)) {
            return false;
        }
        jjg jjgVar = (jjg) obj;
        return affa.f(this.a, jjgVar.a) && this.b == jjgVar.b && this.c == jjgVar.c && affa.f(this.d, jjgVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RelayUiState(windows=" + this.a + ", shouldFinish=" + this.b + ", backgroundColor=" + this.c + ", geometry=" + this.d + ")";
    }
}
