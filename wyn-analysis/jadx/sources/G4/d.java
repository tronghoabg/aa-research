package G4;

import E4.B;
import E4.o;
import W1.r;

/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: d, reason: collision with root package name */
    public o f4227d;

    @Override // W1.r
    public final int c(Object obj) {
        B b5 = (B) obj;
        if (b5 == null) {
            return 1;
        }
        return b5.getSize();
    }

    @Override // W1.r
    public final void d(Object obj, Object obj2) {
        B b5 = (B) obj2;
        o oVar = this.f4227d;
        if (oVar == null || b5 == null) {
            return;
        }
        oVar.f2946e.s(b5, true);
    }
}
