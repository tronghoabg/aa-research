package defpackage;

/* loaded from: classes2.dex */
public final class gzx implements hab {
    public final fwb a;

    public gzx(fwb fwbVar) {
        this.a = fwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzx) && affa.f(this.a, ((gzx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Action(action=" + this.a + ")";
    }
}
