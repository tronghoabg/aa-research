package defpackage;

/* loaded from: classes3.dex */
final class uif extends uij {
    private volatile transient int h;
    private volatile transient boolean i;
    private volatile transient String j;

    @Override // defpackage.uij
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uif) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof uij)) {
                return false;
            }
            uij uijVar = (uij) obj;
            if (!this.a.equals(uijVar.a) || !this.b.equals(uijVar.b) || !this.c.equals(uijVar.c) || !this.d.equals(uijVar.d) || this.e != uijVar.e) {
                return false;
            }
            aacq aacqVar = this.g;
            if (aacqVar == null) {
                if (uijVar.g != null) {
                    return false;
                }
            } else if (!aacqVar.equals(uijVar.g)) {
                return false;
            }
            if (!this.f.equals(uijVar.f)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.uij
    public final int hashCode() {
        if (!this.i) {
            synchronized (this) {
                if (!this.i) {
                    int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003;
                    aacq aacqVar = this.g;
                    this.h = ((iHashCode ^ (aacqVar == null ? 0 : aacqVar.hashCode())) * 1000003) ^ this.f.hashCode();
                    this.i = true;
                }
            }
        }
        return this.h;
    }

    @Override // defpackage.uij
    public final String toString() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = "{" + this.a.b + ", " + this.b.toString() + ", " + String.valueOf(this.c) + ", " + this.d.toString() + ", " + this.e + ", " + String.valueOf(this.g) + ", " + this.f + "}";
                    if (this.j == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.j;
    }
}
