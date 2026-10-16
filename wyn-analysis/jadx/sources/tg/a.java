package tg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y3.C4552j;

/* loaded from: classes5.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C4552j f46041a;

    public a(C4552j c4552j) {
        this.f46041a = c4552j;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, C4552j.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f46041a, objArr);
        } catch (InvocationTargetException e7) {
            throw e7.getTargetException();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Reflection failed for method " + method, e10);
        }
    }
}
