package na;

import ba.C1521a;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class p extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f40998b;

    public p(Method method) {
        this.f40998b = method;
    }

    @Override // na.r
    public final Object a(Class cls) {
        String strK = C1521a.k(cls);
        if (strK == null) {
            return this.f40998b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strK));
    }
}
