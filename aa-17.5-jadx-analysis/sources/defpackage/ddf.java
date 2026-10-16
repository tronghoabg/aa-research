package defpackage;

/* loaded from: classes.dex */
public final class ddf {
    public final String a;
    public final aezn b;

    public ddf(String str, aezn aeznVar) {
        this.a = str;
        this.b = aeznVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddf)) {
            return false;
        }
        ddf ddfVar = (ddf) obj;
        return affa.f(this.a, ddfVar.a) && affa.f(this.b, ddfVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
