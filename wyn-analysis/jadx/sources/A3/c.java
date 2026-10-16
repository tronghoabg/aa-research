package A3;

import ef.C2515C;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f283a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.b f284b;

    public c(KClass clazz, F3.b bVar) {
        AbstractC3340k.e(clazz, "clazz");
        this.f283a = clazz;
        this.f284b = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC3340k.e(obj, "obj");
        AbstractC3340k.e(method, "method");
        boolean zA = AbstractC3340k.a(method.getName(), "accept");
        F3.b bVar = this.f284b;
        if (zA && objArr != null && objArr.length == 1) {
            Object parameter = KClasses.cast(this.f283a, objArr[0]);
            AbstractC3340k.e(parameter, "parameter");
            bVar.invoke(parameter);
            return C2515C.f34653a;
        }
        if (AbstractC3340k.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (AbstractC3340k.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(bVar.hashCode());
        }
        if (AbstractC3340k.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return bVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
