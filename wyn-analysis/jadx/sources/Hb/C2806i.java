package hb;

import java.lang.reflect.Method;

/* renamed from: hb.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2806i extends P {
    public final /* synthetic */ Method k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f36330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Class f36331m;

    public C2806i(Method method, Object obj, Class cls) {
        this.k = method;
        this.f36330l = obj;
        this.f36331m = cls;
    }

    @Override // hb.P
    public final Object e() {
        return this.k.invoke(this.f36330l, this.f36331m);
    }

    public final String toString() {
        return this.f36331m.getName();
    }
}
