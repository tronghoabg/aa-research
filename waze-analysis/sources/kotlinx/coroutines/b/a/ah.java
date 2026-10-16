package kotlinx.coroutines.b.a;

import kotlinx.coroutines.b.bt;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah extends bt implements ch {
    public ah(int i2) {
        super(1, Integer.MAX_VALUE, kotlinx.coroutines.a.a.f51272b);
        c(Integer.valueOf(i2));
    }

    @Override // kotlinx.coroutines.b.ch
    public final /* bridge */ /* synthetic */ Object d() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) g()).intValue());
        }
        return numValueOf;
    }

    public final void r(int i2) {
        synchronized (this) {
            c(Integer.valueOf(((Number) g()).intValue() + i2));
        }
    }
}
