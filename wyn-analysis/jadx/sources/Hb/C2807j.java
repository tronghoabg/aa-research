package hb;

import java.lang.reflect.Method;

/* renamed from: hb.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2807j extends P {
    public final /* synthetic */ Method k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f36332l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f36333m;

    public C2807j(Method method, Class cls, int i5) {
        this.k = method;
        this.f36332l = cls;
        this.f36333m = i5;
    }

    @Override // hb.P
    public final Object e() {
        return this.k.invoke(null, this.f36332l, Integer.valueOf(this.f36333m));
    }

    public final String toString() {
        return this.f36332l.getName();
    }
}
