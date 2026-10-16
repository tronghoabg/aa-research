package na;

import ba.C1521a;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class o extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f40996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40997c;

    public o(int i5, Method method) {
        this.f40996b = method;
        this.f40997c = i5;
    }

    @Override // na.r
    public final Object a(Class cls) {
        String strK = C1521a.k(cls);
        if (strK == null) {
            return this.f40996b.invoke(null, cls, Integer.valueOf(this.f40997c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strK));
    }
}
