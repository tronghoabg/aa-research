package zg;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

/* loaded from: classes5.dex */
public final class A extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final Method f48515b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48516c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4671j f48517d;

    public A(Method method, int i5, InterfaceC4671j interfaceC4671j) {
        this.f48515b = method;
        this.f48516c = i5;
        this.f48517d = interfaceC4671j;
    }

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        Method method = this.f48515b;
        int i5 = this.f48516c;
        if (obj == null) {
            throw a0.k(method, i5, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            n10.k = (RequestBody) this.f48517d.convert(obj);
        } catch (IOException e7) {
            throw a0.l(method, e7, i5, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
