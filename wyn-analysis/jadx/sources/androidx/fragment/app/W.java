package androidx.fragment.app;

import A7.AbstractC0279p0;
import x.C4429v;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: b, reason: collision with root package name */
    public static final C4429v f18345b = new C4429v(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f18346a;

    public W(e0 e0Var) {
        this.f18346a = e0Var;
    }

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C4429v c4429v = f18345b;
        C4429v c4429v2 = (C4429v) c4429v.get(classLoader);
        if (c4429v2 == null) {
            c4429v2 = new C4429v(0);
            c4429v.put(classLoader, c4429v2);
        }
        Class cls = (Class) c4429v2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c4429v2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e7) {
            throw new E5.Q(AbstractC0279p0.l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7, 6);
        } catch (ClassNotFoundException e10) {
            throw new E5.Q(AbstractC0279p0.l("Unable to instantiate fragment ", str, ": make sure class name exists"), e10, 6);
        }
    }
}
