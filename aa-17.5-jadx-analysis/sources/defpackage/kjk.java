package defpackage;

import com.google.android.gms.car.control.CarAction;
import java.util.List;

/* loaded from: classes2.dex */
public final class kjk extends kjl {
    public final kjz a;
    public final CarAction b;
    public final kjz c;
    public final List d;
    private final boolean e;
    private final int f;

    public kjk(kjz kjzVar, CarAction carAction, kjz kjzVar2, boolean z, List list, int i) {
        this.a = kjzVar;
        this.b = carAction;
        this.c = kjzVar2;
        this.e = z;
        this.d = list;
        this.f = i;
    }

    @Override // defpackage.kjl
    public final int a() {
        return this.f;
    }

    @Override // defpackage.kjl
    public final List b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjk)) {
            return false;
        }
        kjk kjkVar = (kjk) obj;
        return affa.f(this.a, kjkVar.a) && affa.f(this.b, kjkVar.b) && affa.f(this.c, kjkVar.c) && this.e == kjkVar.e && affa.f(this.d, kjkVar.d) && this.f == kjkVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarAction carAction = this.b;
        int i = (iHashCode + (carAction == null ? 0 : carAction.a)) * 31;
        kjz kjzVar = this.c;
        return ((((((i + (kjzVar != null ? kjzVar.hashCode() : 0)) * 31) + a.f(this.e)) * 31) + this.d.hashCode()) * 31) + this.f;
    }

    public final String toString() {
        return "CarPropertyControl(property=" + this.a + ", associatedAction=" + this.b + ", associatedProperty=" + this.c + ", enabled=" + this.e + ", metadata=" + this.d + ", sideAffinity=" + this.f + ")";
    }
}
