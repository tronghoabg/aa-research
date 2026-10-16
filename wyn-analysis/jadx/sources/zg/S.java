package zg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class S implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final L f48598a = L.f48544c;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f48599b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f48600c;

    public S(T t10) {
        this.f48600c = t10;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        U uA;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f48599b;
        }
        L l10 = this.f48598a;
        if (l10.f48545a && method.isDefault()) {
            return l10.b(obj, method, objArr);
        }
        T t10 = this.f48600c;
        U u10 = (U) t10.f48601a.get(method);
        if (u10 == null) {
            synchronized (t10.f48601a) {
                try {
                    uA = (U) t10.f48601a.get(method);
                    if (uA == null) {
                        uA = U.a(t10, method);
                        t10.f48601a.put(method, uA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            u10 = uA;
        }
        AbstractC4678q abstractC4678q = (AbstractC4678q) u10;
        return abstractC4678q.b(new C4683w(abstractC4678q.f48633a, objArr, abstractC4678q.f48634b, abstractC4678q.f48635c), objArr);
    }
}
