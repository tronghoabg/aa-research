package O;

import N.y0;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import q.s1;

/* loaded from: classes.dex */
public final class x extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final x f8746c;

    static {
        int i5 = 1;
        f8746c = new x(0, i5, i5);
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        y0Var.H(fVar.f(0));
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? JsonStorageKeyNames.DATA_KEY : super.c(i5);
    }
}
