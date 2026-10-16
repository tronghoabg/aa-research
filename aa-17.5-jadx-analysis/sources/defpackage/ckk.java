package defpackage;

/* loaded from: classes.dex */
public final class ckk extends ckm {
    public final cjb a;

    public ckk(cjb cjbVar) {
        this.a = cjbVar;
    }

    @Override // defpackage.ckm
    public final cjb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckk) && affa.f(this.a, ((ckk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
