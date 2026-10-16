package defpackage;

/* loaded from: classes3.dex */
public final class aixn extends aixo {
    public final Throwable a;

    public aixn(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aixn) && affa.f(this.a, ((aixn) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.aixo
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
