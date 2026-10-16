package defpackage;

/* loaded from: classes3.dex */
public final class zzs extends ysi {
    protected final zzq a;
    protected final zzq b;

    public zzs(zzq zzqVar, zzq zzqVar2) {
        super(null);
        this.a = zzqVar;
        this.b = zzqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            zzs zzsVar = (zzs) obj;
            if (zzsVar.b.equals(this.b) && zzsVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 31) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + this.a.toString() + ", " + this.b.toString() + "]";
    }
}
