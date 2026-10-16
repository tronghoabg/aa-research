package defpackage;

import com.google.android.gms.car.control.CarAction;
import java.util.List;

/* loaded from: classes2.dex */
public final class kji extends kjl {
    public final CarAction a;
    public final boolean b;
    private final List c;
    private final int d;

    public kji(CarAction carAction, boolean z, List list, int i) {
        this.a = carAction;
        this.b = z;
        this.c = list;
        this.d = i;
    }

    @Override // defpackage.kjl
    public final int a() {
        return this.d;
    }

    @Override // defpackage.kjl
    public final List b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kji)) {
            return false;
        }
        kji kjiVar = (kji) obj;
        return affa.f(this.a, kjiVar.a) && this.b == kjiVar.b && affa.f(this.c, kjiVar.c) && this.d == kjiVar.d;
    }

    public final int hashCode() {
        return (((((this.a.a * 31) + a.f(this.b)) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "CarActionControl(action=" + this.a + ", enabled=" + this.b + ", metadata=" + this.c + ", sideAffinity=" + this.d + ")";
    }
}
