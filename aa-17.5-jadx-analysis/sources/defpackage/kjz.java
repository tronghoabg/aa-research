package defpackage;

/* loaded from: classes2.dex */
public final class kjz {
    public final klq a;
    public final kka b;
    private final aezr c = woy.dG(new kjy(this, 0));

    public kjz(klq klqVar, kka kkaVar) {
        this.a = klqVar;
        this.b = kkaVar;
    }

    public final kkh a() {
        return (kkh) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjz)) {
            return false;
        }
        kjz kjzVar = (kjz) obj;
        return affa.f(this.a, kjzVar.a) && affa.f(this.b, kjzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CarProperty(id=" + this.a + ", config=" + this.b + ")";
    }
}
