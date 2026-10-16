package defpackage;

/* loaded from: classes2.dex */
public final class btx {
    public final tv a;
    public final tt b;
    public final ty c;
    public final tv d;

    public btx(ty tyVar, tv tvVar, tv tvVar2, tt ttVar) {
        this.c = tyVar;
        this.d = tvVar;
        this.a = tvVar2;
        this.b = ttVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btx)) {
            return false;
        }
        btx btxVar = (btx) obj;
        return affa.f(this.c, btxVar.c) && affa.f(this.d, btxVar.d) && affa.f(this.a, btxVar.a) && affa.f(this.b, btxVar.b);
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }
}
