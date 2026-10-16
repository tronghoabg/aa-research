package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import h.f;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavArgsLazy<Args extends NavArgs> implements f<Args> {
    private final a<Bundle> argumentProducer;
    private Args cached;
    private final c<Args> navArgsClass;

    public NavArgsLazy(c<Args> cVar, a<Bundle> aVar) {
        x.f(cVar, "navArgsClass");
        x.f(aVar, "argumentProducer");
        this.navArgsClass = cVar;
        this.argumentProducer = aVar;
    }

    @Override // h.f
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.argumentProducer.invoke();
        Method method = NavArgsLazy_androidKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class clsW = o.w(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazy_androidKt.getMethodSignature();
            method = clsW.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazy_androidKt.getMethodMap().put(this.navArgsClass, method);
            x.e(method, "also(...)");
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        x.d(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }

    @Override // h.f
    public boolean isInitialized() {
        return this.cached != null;
    }
}
