package androidx.window.core;

import android.app.Activity;
import android.content.Context;
import androidx.window.reflection.WindowExtensionsConstants;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.k.n;
import h.l.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ConsumerAdapter {
    private final ClassLoader loader;

    /* compiled from: WazeSource */
    final class ConsumerHandler<T> implements InvocationHandler {
        private final c<T> clazz;
        private final l<T, ab> consumer;

        /* JADX WARN: Multi-variable type inference failed */
        public ConsumerHandler(c<T> cVar, l<? super T, ab> lVar) {
            x.f(cVar, "clazz");
            x.f(lVar, "consumer");
            this.clazz = cVar;
            this.consumer = lVar;
        }

        private final boolean isAccept(Method method, Object[] objArr) {
            return x.n(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean isEquals(Method method, Object[] objArr) {
            return x.n(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean isHashCode(Method method, Object[] objArr) {
            return x.n(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean isToString(Method method, Object[] objArr) {
            return x.n(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            x.f(obj, "obj");
            x.f(method, "method");
            if (isAccept(method, objArr)) {
                c<T> cVar = this.clazz;
                Object obj2 = objArr != null ? objArr[0] : null;
                n.v(cVar, obj2);
                invokeAccept(obj2);
                return ab.f48028a;
            }
            if (isEquals(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (isHashCode(method, objArr)) {
                return Integer.valueOf(this.consumer.hashCode());
            }
            if (isToString(method, objArr)) {
                return this.consumer.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }

        public final void invokeAccept(T t) {
            x.f(t, "parameter");
            this.consumer.invoke(t);
        }
    }

    /* compiled from: WazeSource */
    public interface Subscription {
        void dispose();
    }

    public ConsumerAdapter(ClassLoader classLoader) {
        x.f(classLoader, "loader");
        this.loader = classLoader;
    }

    private final <T> Object buildConsumer(c<T> cVar, l<? super T, ab> lVar) throws IllegalArgumentException {
        ConsumerHandler consumerHandler = new ConsumerHandler(cVar, lVar);
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{unsafeConsumerClass()}, consumerHandler);
        x.e(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    private final Class<?> unsafeConsumerClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.JAVA_CONSUMER);
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final <T> void addConsumer(Object obj, c<T> cVar, String str, l<? super T, ab> lVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(obj, "obj");
        x.f(cVar, "clazz");
        x.f(str, "methodName");
        x.f(lVar, "consumer");
        obj.getClass().getMethod(str, unsafeConsumerClass()).invoke(obj, buildConsumer(cVar, lVar));
    }

    public final Class<?> consumerClassOrNull$window() {
        try {
            return unsafeConsumerClass();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> void createConsumer(Object obj, c<T> cVar, String str, Activity activity, l<? super T, ab> lVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(obj, "obj");
        x.f(cVar, "clazz");
        x.f(str, "addMethodName");
        x.f(activity, "activity");
        x.f(lVar, "consumer");
        obj.getClass().getMethod(str, Activity.class, unsafeConsumerClass()).invoke(obj, activity, buildConsumer(cVar, lVar));
    }

    public final <T> Subscription createSubscription(final Object obj, c<T> cVar, String str, String str2, Activity activity, l<? super T, ab> lVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x.f(obj, "obj");
        x.f(cVar, "clazz");
        x.f(str, "addMethodName");
        x.f(str2, "removeMethodName");
        x.f(activity, "activity");
        x.f(lVar, "consumer");
        final Object objBuildConsumer = buildConsumer(cVar, lVar);
        obj.getClass().getMethod(str, Activity.class, unsafeConsumerClass()).invoke(obj, activity, objBuildConsumer);
        final Method method = obj.getClass().getMethod(str2, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscription.1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }

    public final <T> Subscription createSubscriptionNoActivity(final Object obj, c<T> cVar, String str, String str2, l<? super T, ab> lVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x.f(obj, "obj");
        x.f(cVar, "clazz");
        x.f(str, "addMethodName");
        x.f(str2, "removeMethodName");
        x.f(lVar, "consumer");
        final Object objBuildConsumer = buildConsumer(cVar, lVar);
        obj.getClass().getMethod(str, unsafeConsumerClass()).invoke(obj, objBuildConsumer);
        final Method method = obj.getClass().getMethod(str2, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscriptionNoActivity.1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }

    public final <T> Subscription createSubscription(final Object obj, c<T> cVar, String str, String str2, Context context, l<? super T, ab> lVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x.f(obj, "obj");
        x.f(cVar, "clazz");
        x.f(str, "addMethodName");
        x.f(str2, "removeMethodName");
        x.f(context, "context");
        x.f(lVar, "consumer");
        final Object objBuildConsumer = buildConsumer(cVar, lVar);
        obj.getClass().getMethod(str, Context.class, unsafeConsumerClass()).invoke(obj, context, objBuildConsumer);
        final Method method = obj.getClass().getMethod(str2, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscription.2
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }
}
