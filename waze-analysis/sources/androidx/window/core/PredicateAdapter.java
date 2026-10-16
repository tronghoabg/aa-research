package androidx.window.core;

import android.util.Pair;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.k.n;
import h.l.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PredicateAdapter {
    private final ClassLoader loader;

    /* compiled from: WazeSource */
    abstract class BaseHandler<T> implements InvocationHandler {
        private final c<T> clazz;

        public BaseHandler(c<T> cVar) {
            x.f(cVar, "clazz");
            this.clazz = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            x.f(obj, "obj");
            x.f(method, "method");
            if (isTest(method, objArr)) {
                c<T> cVar = this.clazz;
                obj2 = objArr != null ? objArr[0] : null;
                n.v(cVar, obj2);
                return Boolean.valueOf(invokeTest(obj, obj2));
            }
            if (isEquals(method, objArr)) {
                obj2 = objArr != null ? objArr[0] : null;
                x.c(obj2);
                return Boolean.valueOf(obj == obj2);
            }
            if (isHashCode(method, objArr)) {
                return Integer.valueOf(hashCode());
            }
            if (isToString(method, objArr)) {
                return toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }

        public abstract boolean invokeTest(Object obj, T t);

        protected final boolean isEquals(Method method, Object[] objArr) {
            x.f(method, "<this>");
            return x.n(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        protected final boolean isHashCode(Method method, Object[] objArr) {
            x.f(method, "<this>");
            return x.n(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        protected final boolean isTest(Method method, Object[] objArr) {
            x.f(method, "<this>");
            return x.n(method.getName(), "test") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        protected final boolean isToString(Method method, Object[] objArr) {
            x.f(method, "<this>");
            return x.n(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }
    }

    /* compiled from: WazeSource */
    final class PairPredicateStubHandler<T, U> extends BaseHandler<Pair<?, ?>> {
        private final c<T> clazzT;
        private final c<U> clazzU;
        private final p<T, U, Boolean> predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PairPredicateStubHandler(c<T> cVar, c<U> cVar2, p<? super T, ? super U, Boolean> pVar) {
            super(new m(Pair.class));
            x.f(cVar, "clazzT");
            x.f(cVar2, "clazzU");
            x.f(pVar, "predicate");
            int i2 = ar.f48106a;
            this.clazzT = cVar;
            this.clazzU = cVar2;
            this.predicate = pVar;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public boolean invokeTest(Object obj, Pair<?, ?> pair) {
            x.f(obj, "obj");
            x.f(pair, "parameter");
            c<T> cVar = this.clazzT;
            Object obj2 = pair.first;
            n.v(cVar, obj2);
            c<U> cVar2 = this.clazzU;
            Object obj3 = pair.second;
            n.v(cVar2, obj3);
            return ((Boolean) this.predicate.invoke(obj2, obj3)).booleanValue();
        }

        public String toString() {
            return this.predicate.toString();
        }
    }

    /* compiled from: WazeSource */
    final class PredicateStubHandler<T> extends BaseHandler<T> {
        private final l<T, Boolean> predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PredicateStubHandler(c<T> cVar, l<? super T, Boolean> lVar) {
            super(cVar);
            x.f(cVar, "clazzT");
            x.f(lVar, "predicate");
            this.predicate = lVar;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public boolean invokeTest(Object obj, T t) {
            x.f(obj, "obj");
            x.f(t, "parameter");
            return this.predicate.invoke(t).booleanValue();
        }

        public String toString() {
            return this.predicate.toString();
        }
    }

    public PredicateAdapter(ClassLoader classLoader) {
        x.f(classLoader, "loader");
        this.loader = classLoader;
    }

    private final Class<?> predicateClassOrThrow() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("java.util.function.Predicate");
        x.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final <T, U> Object buildPairPredicate(c<T> cVar, c<U> cVar2, p<? super T, ? super U, Boolean> pVar) throws IllegalArgumentException {
        x.f(cVar, "firstClazz");
        x.f(cVar2, "secondClazz");
        x.f(pVar, "predicate");
        PairPredicateStubHandler pairPredicateStubHandler = new PairPredicateStubHandler(cVar, cVar2, pVar);
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, pairPredicateStubHandler);
        x.e(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    public final <T> Object buildPredicate(c<T> cVar, l<? super T, Boolean> lVar) throws IllegalArgumentException {
        x.f(cVar, "clazz");
        x.f(lVar, "predicate");
        PredicateStubHandler predicateStubHandler = new PredicateStubHandler(cVar, lVar);
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, predicateStubHandler);
        x.e(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    public final Class<?> predicateClassOrNull$window() {
        try {
            return predicateClassOrThrow();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
