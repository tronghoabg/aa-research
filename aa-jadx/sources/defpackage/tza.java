package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tza implements defpackage.trp {
    public final defpackage.trq e;
    protected final int f;
    public final java.lang.Integer g;
    protected final defpackage.umw h;

    public tza(defpackage.trq trqVar, int i, java.lang.Integer num, defpackage.umw umwVar) {
        this.e = trqVar;
        this.f = i;
        this.h = umwVar;
        this.g = num;
    }

    @Override // defpackage.trp
    public final int a() {
        return this.f;
    }

    @Override // defpackage.trp
    public defpackage.trq b() {
        return this.e;
    }

    @Override // defpackage.trp
    public final boolean c() {
        defpackage.trq trqVar = this.e;
        boolean z = trqVar instanceof defpackage.twi;
        if (z) {
            return z && ((defpackage.twi) trqVar).q();
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                defpackage.tza tzaVar = (defpackage.tza) obj;
                if (b().equals(tzaVar.b()) && this.f == tzaVar.f && j$.util.Objects.equals(this.g, tzaVar.g) && this.h.equals(tzaVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.e, java.lang.Integer.valueOf(this.f), this.g, this.h);
    }

    public final java.lang.String toString() {
        defpackage.umw umwVar = this.h;
        return "PickObjectImpl{renderOp=" + this.e.toString() + ", indexOfSmallestCollidedTapRadius=" + this.f + ", smallestCollidedTapRadiusDp=" + this.g + ", gmmEntity=" + java.lang.String.valueOf(umwVar) + "}";
    }
}
