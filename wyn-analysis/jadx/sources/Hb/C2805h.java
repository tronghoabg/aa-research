package hb;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: hb.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2805h extends P {
    public final /* synthetic */ int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f36328l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AccessibleObject f36329m;

    public C2805h(Constructor constructor, Class cls) {
        this.f36329m = constructor;
        this.f36328l = cls;
    }

    @Override // hb.P
    public final Object e() {
        AccessibleObject accessibleObject = this.f36329m;
        switch (this.k) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.f36328l, Object.class);
        }
    }

    public final String toString() {
        switch (this.k) {
        }
        return this.f36328l.getName();
    }

    public C2805h(Method method, Class cls) {
        this.f36329m = method;
        this.f36328l = cls;
    }
}
