package defpackage;

/* loaded from: classes2.dex */
public final class qai {
    public final ywf a;

    public qai(ywf ywfVar) {
        this.a = ywfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qai) && this.a.equals(((qai) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 474194425;
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + ", null, null, null, null, null, null, null, null, null, null, null, null, null, null}";
    }

    public qai() {
        throw null;
    }
}
