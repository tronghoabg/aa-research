package la;

import java.io.IOException;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class y extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f40213a;

    public y(z zVar) {
        this.f40213a = zVar;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) {
        if (c3962a.e0() != 9) {
            return this.f40213a.b(c3962a);
        }
        c3962a.a0();
        return null;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        if (obj == null) {
            c3963b.z();
        } else {
            this.f40213a.c(c3963b, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f40213a + "]";
    }
}
