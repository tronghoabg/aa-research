package defpackage;

import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class gto implements gtp {
    public final fzy a;
    public final CarText b;
    public final CarText c;

    public gto(fzy fzyVar, CarText carText, CarText carText2) {
        this.a = fzyVar;
        this.b = carText;
        this.c = carText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gto)) {
            return false;
        }
        gto gtoVar = (gto) obj;
        return affa.f(this.a, gtoVar.a) && affa.f(this.b, gtoVar.b) && affa.f(this.c, gtoVar.c);
    }

    public final int hashCode() {
        fzy fzyVar = this.a;
        int iHashCode = fzyVar == null ? 0 : fzyVar.hashCode();
        CarText carText = this.b;
        int iHashCode2 = carText == null ? 0 : carText.hashCode();
        int i = iHashCode * 31;
        CarText carText2 = this.c;
        return ((i + iHashCode2) * 31) + (carText2 != null ? carText2.hashCode() : 0);
    }

    public final String toString() {
        return "MessageInfoInternal(image=" + this.a + ", message=" + this.b + ", title=" + this.c + ")";
    }
}
