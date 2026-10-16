package na;

import ba.C1521a;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f40994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40995c;

    public n(Method method, Object obj) {
        this.f40994b = method;
        this.f40995c = obj;
    }

    @Override // na.r
    public final Object a(Class cls) {
        String strK = C1521a.k(cls);
        if (strK == null) {
            return this.f40994b.invoke(this.f40995c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strK));
    }
}
