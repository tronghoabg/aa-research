package defpackage;

/* loaded from: classes3.dex */
public final class uqj implements uql {
    public final ygz a;

    public uqj(ygz ygzVar) {
        this.a = ygzVar;
    }

    @Override // defpackage.uql
    public final int a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof uqj) && yrm.N(this.a, ((uqj) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "{" + yrm.K(this.a) + ", null}";
    }

    public uqj() {
        throw null;
    }
}
