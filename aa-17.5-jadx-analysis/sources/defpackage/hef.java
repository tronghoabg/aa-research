package defpackage;

/* loaded from: classes2.dex */
public final class hef {
    public static final hef a = new hef(new hee(56.0f, bcr.a), new hee(48.0f, bcr.a), new hee(32.0f, bcr.a), new hee(24.0f, bcr.a), new hee(36.0f, null));
    public static final hef b = new hef(new hee(72.0f, bcr.a), new hee(64.0f, bcr.a), new hee(48.0f, bcr.a), new hee(40.0f, bcr.a), new hee(52.0f, null));
    public final hee c;
    public final hee d;
    public final hee e;
    public final hee f;
    public final hee g;

    public hef(hee heeVar, hee heeVar2, hee heeVar3, hee heeVar4, hee heeVar5) {
        this.c = heeVar;
        this.d = heeVar2;
        this.e = heeVar3;
        this.f = heeVar4;
        this.g = heeVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hef)) {
            return false;
        }
        hef hefVar = (hef) obj;
        return affa.f(this.c, hefVar.c) && affa.f(this.d, hefVar.d) && affa.f(this.e, hefVar.e) && affa.f(this.f, hefVar.f) && affa.f(this.g, hefVar.g);
    }

    public final int hashCode() {
        return (((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "RowTrailingImageStyles(large=" + this.c + ", medium=" + this.d + ", small=" + this.e + ", extraSmall=" + this.f + ", icon=" + this.g + ")";
    }
}
