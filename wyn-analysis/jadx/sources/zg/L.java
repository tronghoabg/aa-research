package zg;

import android.os.Build;
import com.qonversion.android.sdk.internal.api.Api;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class L {

    /* renamed from: c, reason: collision with root package name */
    public static final L f48544c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48545a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f48546b;

    static {
        L l10;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            l10 = new K(Build.VERSION.SDK_INT >= 24);
        } else {
            l10 = new L(true);
        }
        f48544c = l10;
    }

    public L(boolean z2) throws NoSuchMethodException, SecurityException {
        this.f48545a = z2;
        Constructor declaredConstructor = null;
        if (z2) {
            try {
                declaredConstructor = x4.g.e().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f48546b = declaredConstructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Object obj, Method method, Object... objArr) {
        Constructor constructor = this.f48546b;
        return (constructor != null ? x4.g.j(constructor.newInstance(Api.class, -1)) : MethodHandles.lookup()).unreflectSpecial(method, Api.class).bindTo(obj).invokeWithArguments(objArr);
    }
}
