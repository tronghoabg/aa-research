package defpackage;

/* loaded from: classes3.dex */
public final class xrc {
    public final xsy a;
    public final Object b;
    public final aes c;

    public xrc(xsy xsyVar, Object obj, aes aesVar) {
        this.a = xsyVar;
        this.b = obj;
        this.c = aesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrc)) {
            return false;
        }
        xrc xrcVar = (xrc) obj;
        return affa.f(this.a, xrcVar.a) && affa.f(this.b, xrcVar.b) && affa.f(this.c, xrcVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aes aesVar = this.c;
        return (iHashCode * 31) + (aesVar == null ? 0 : aesVar.hashCode());
    }

    public final String toString() {
        return "Keyframe(uniform=" + this.a + ", value=" + this.b + ", easing=" + this.c + ")";
    }
}
