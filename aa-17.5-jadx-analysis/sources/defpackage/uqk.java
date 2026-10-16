package defpackage;

/* loaded from: classes3.dex */
public final class uqk implements uql {
    public final abdr a;

    public uqk(abdr abdrVar) {
        abdrVar.getClass();
        this.a = abdrVar;
    }

    @Override // defpackage.uql
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqk) {
            return this.a.equals(((uqk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "{" + this.a.toString() + "}";
    }

    public uqk() {
        throw null;
    }
}
