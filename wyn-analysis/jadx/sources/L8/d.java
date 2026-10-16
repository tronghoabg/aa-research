package L8;

import A7.AbstractC0279p0;
import R8.v;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements O9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6998b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f6997a = i5;
        this.f6998b = obj;
    }

    @Override // O9.b
    public final Object get() throws ClassNotFoundException {
        switch (this.f6997a) {
            case 0:
                String str = (String) this.f6998b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new o("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e7) {
                    throw new o(AbstractC0279p0.l("Could not instantiate ", str, "."), e7);
                } catch (InstantiationException e10) {
                    throw new o(AbstractC0279p0.l("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new o(v.f("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new o(v.f("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f6998b;
            default:
                return new Q9.c((s8.g) this.f6998b);
        }
    }
}
