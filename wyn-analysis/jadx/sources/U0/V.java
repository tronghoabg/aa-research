package u0;

import java.lang.reflect.Method;
import jf.InterfaceC3107g;

/* loaded from: classes.dex */
public final class V implements InterfaceC3107g, p0.i, InterfaceC4189n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ V f46174a = new V();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ V f46175b = new V();

    public static final boolean a() throws ClassNotFoundException {
        Class cls = C4188n.f46260o0;
        try {
            if (C4188n.f46260o0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C4188n.f46260o0 = cls2;
                C4188n.f46261p0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C4188n.f46261p0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
