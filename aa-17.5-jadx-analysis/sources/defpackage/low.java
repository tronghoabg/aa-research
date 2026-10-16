package defpackage;

/* loaded from: classes2.dex */
public final class low implements lol {
    private final lok a;
    private final ljx b;

    public low(lok lokVar, ljx ljxVar) {
        this.a = lokVar;
        if (ljxVar == null) {
            throw new NullPointerException("Null packageInfo");
        }
        this.b = ljxVar;
    }

    @Override // defpackage.los
    public final ljx d() {
        return this.b;
    }

    @Override // defpackage.los
    public final lok e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof low) {
            low lowVar = (low) obj;
            if (this.a.equals(lowVar.a) && this.b.equals(lowVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        ljx ljxVar = this.b;
        return "InactiveMediaControllerConnection{connectionStatus=" + this.a.toString() + ", packageInfo=" + ljxVar.toString() + "}";
    }

    public low() {
        throw null;
    }
}
