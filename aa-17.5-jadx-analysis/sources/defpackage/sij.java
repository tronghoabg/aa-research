package defpackage;

/* loaded from: classes2.dex */
public final class sij {
    final abow a;

    public sij() {
        this.a = null;
    }

    public static sij a(abow abowVar) {
        return (abowVar == null || abowVar == abng.a) ? sio.b : new sij(abowVar);
    }

    public final boolean equals(Object obj) {
        abow abowVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof sij) && (abowVar = this.a) != null && abowVar.equals(((sij) obj).a);
    }

    public final int hashCode() {
        spu.ar(!sio.c.equals(this));
        if (sio.b.equals(this)) {
            return 0;
        }
        abow abowVar = this.a;
        spu.aw(abowVar);
        return abowVar.hashCode();
    }

    public final String toString() {
        if (sio.c.equals(this)) {
            return "$use_sticky_dims$";
        }
        if (sio.b.equals(this)) {
            return "$no_dims$";
        }
        abow abowVar = this.a;
        spu.aw(abowVar);
        return abowVar.toString();
    }

    private sij(abow abowVar) {
        this.a = abowVar;
    }
}
