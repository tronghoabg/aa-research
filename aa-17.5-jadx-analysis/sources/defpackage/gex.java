package defpackage;

import androidx.car.app.model.CarIcon;

/* loaded from: classes2.dex */
public final class gex {
    public final CarIcon a;
    public final boolean b;
    public final afdr c;

    public gex(CarIcon carIcon, boolean z, afdr afdrVar) {
        carIcon.getClass();
        this.a = carIcon;
        this.b = z;
        this.c = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gex)) {
            return false;
        }
        gex gexVar = (gex) obj;
        return affa.f(this.a, gexVar.a) && this.b == gexVar.b && affa.f(this.c, gexVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PlaybackAction(icon=" + this.a + ", isEnabled=" + this.b + ", clickAction=" + this.c + ")";
    }
}
