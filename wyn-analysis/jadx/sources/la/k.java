package la;

import com.google.gson.internal.bind.AbstractC1773t;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class k extends AbstractC1773t {

    /* renamed from: a, reason: collision with root package name */
    public z f40192a = null;

    @Override // la.z
    public final Object b(C3962a c3962a) {
        z zVar = this.f40192a;
        if (zVar != null) {
            return zVar.b(c3962a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) {
        z zVar = this.f40192a;
        if (zVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        zVar.c(c3963b, obj);
    }

    @Override // com.google.gson.internal.bind.AbstractC1773t
    public final z d() {
        z zVar = this.f40192a;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
