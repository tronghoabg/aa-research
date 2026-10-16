package defpackage;

import androidx.car.app.model.CarColor;
import java.util.List;

/* loaded from: classes2.dex */
public final class gtl implements gmo {
    public final CarColor a;
    public final gmq b;

    public /* synthetic */ gtl(gmq gmqVar, int i) {
        this((CarColor) null, (i & 2) != 0 ? new gmq(null) : gmqVar);
    }

    public final gti a(int i, afdr afdrVar) {
        List listB = b();
        if ((listB != null ? listB.size() : 0) >= i) {
            return (gti) afdrVar.invoke();
        }
        return null;
    }

    public final List b() {
        gmo gmoVar = this.b.a;
        if (gmoVar != null) {
            return ((gtj) gmoVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtl)) {
            return false;
        }
        gtl gtlVar = (gtl) obj;
        return affa.f(this.a, gtlVar.a) && affa.f(this.b, gtlVar.b);
    }

    public final int hashCode() {
        CarColor carColor = this.a;
        return ((carColor == null ? 0 : carColor.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TurnCardInternal(backgroundColor=" + this.a + ", loadingTurnCardInfoList=" + this.b + ")";
    }

    public gtl(CarColor carColor, gmq gmqVar) {
        gmqVar.getClass();
        this.a = carColor;
        this.b = gmqVar;
    }

    public gtl() {
        this((gmq) null, 3);
    }
}
