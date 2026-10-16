package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class hew implements gmw {
    public final wp a;
    public final fzg b;
    public final CarText c;
    public final CarText d;
    public final List e;
    private final boolean f;

    public hew(wp wpVar, boolean z, fzg fzgVar, CarText carText, CarText carText2, List list) {
        this.a = wpVar;
        this.f = z;
        this.b = fzgVar;
        this.c = carText;
        this.d = carText2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hew)) {
            return false;
        }
        hew hewVar = (hew) obj;
        return affa.f(this.a, hewVar.a) && this.f == hewVar.f && affa.f(this.b, hewVar.b) && affa.f(this.c, hewVar.c) && affa.f(this.d, hewVar.d) && affa.f(this.e, hewVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + a.f(this.f)) * 31) + this.b.hashCode();
        CarText carText = this.c;
        int iHashCode2 = ((iHashCode * 31) + (carText == null ? 0 : carText.hashCode())) * 31;
        CarText carText2 = this.d;
        return ((iHashCode2 + (carText2 != null ? carText2.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "SignInTemplateInternal(signInMethod=" + this.a + ", isLoading=" + this.f + ", header=" + this.b + ", instructions=" + this.c + ", additionalText=" + this.d + ", actions=" + this.e + ")";
    }
}
