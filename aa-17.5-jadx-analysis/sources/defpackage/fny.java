package defpackage;

/* loaded from: classes2.dex */
public final class fny {
    public final String a;
    public final int b;

    public fny(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fny)) {
            return false;
        }
        fny fnyVar = (fny) obj;
        return affa.f(this.a, fnyVar.a) && this.b == fnyVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ")";
    }
}
