package xg;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class e implements vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f47903a;

    /* renamed from: b, reason: collision with root package name */
    public volatile vg.b f47904b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f47905c;

    /* renamed from: d, reason: collision with root package name */
    public Method f47906d;

    /* renamed from: e, reason: collision with root package name */
    public wg.a f47907e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f47908f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47909g;

    public e(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z2) {
        this.f47903a = str;
        this.f47908f = linkedBlockingQueue;
        this.f47909g = z2;
    }

    @Override // vg.b
    public final boolean a() {
        return w().a();
    }

    @Override // vg.b
    public final boolean b() {
        return w().b();
    }

    @Override // vg.b
    public final void c(String str, Object... objArr) {
        w().c(str, objArr);
    }

    @Override // vg.b
    public final boolean d() {
        return w().d();
    }

    @Override // vg.b
    public final void debug(String str) {
        w().debug(str);
    }

    @Override // vg.b
    public final boolean e() {
        return w().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e.class == obj.getClass() && this.f47903a.equals(((e) obj).f47903a);
    }

    @Override // vg.b
    public final void error(String str, Throwable th) {
        w().error(str, th);
    }

    @Override // vg.b
    public final void f(String str, Object obj, Serializable serializable) {
        w().f(str, obj, serializable);
    }

    @Override // vg.b
    public final void g(String str, Object... objArr) {
        w().g(str, objArr);
    }

    @Override // vg.b
    public final String getName() {
        return this.f47903a;
    }

    @Override // vg.b
    public final void h(String str, Throwable th) {
        w().h(str, th);
    }

    public final int hashCode() {
        return this.f47903a.hashCode();
    }

    @Override // vg.b
    public final void i(Object obj, String str) {
        w().i(obj, str);
    }

    @Override // vg.b
    public final void info(String str) {
        w().info(str);
    }

    @Override // vg.b
    public final void j(Object obj, String str, Object obj2) {
        w().j(obj, str, obj2);
    }

    @Override // vg.b
    public final void k(Integer num, String str) {
        w().k(num, str);
    }

    @Override // vg.b
    public final void l(String str, Serializable serializable) {
        w().l(str, serializable);
    }

    @Override // vg.b
    public final void m(String str, Object obj, Serializable serializable) {
        w().m(str, obj, serializable);
    }

    @Override // vg.b
    public final boolean n() {
        return w().n();
    }

    @Override // vg.b
    public final void o(String str, Object obj) {
        w().o(str, obj);
    }

    @Override // vg.b
    public final void p(Object... objArr) {
        w().p(objArr);
    }

    @Override // vg.b
    public final void q(Integer num, String str) {
        w().q(num, str);
    }

    @Override // vg.b
    public final void r(String str, Throwable th) {
        w().r(str, th);
    }

    @Override // vg.b
    public final void s(String str) {
        w().s(str);
    }

    @Override // vg.b
    public final boolean t(int i5) {
        return w().t(i5);
    }

    @Override // vg.b
    public final void u(Object obj, String str) {
        w().u(obj, str);
    }

    @Override // vg.b
    public final void v(String str, Object obj, Serializable serializable) {
        w().v(str, obj, serializable);
    }

    public final vg.b w() {
        if (this.f47904b != null) {
            return this.f47904b;
        }
        if (this.f47909g) {
            return b.f47898a;
        }
        if (this.f47907e == null) {
            wg.a aVar = new wg.a();
            aVar.f47485b = this;
            aVar.f47484a = this.f47903a;
            aVar.f47486c = this.f47908f;
            this.f47907e = aVar;
        }
        return this.f47907e;
    }

    @Override // vg.b
    public final void warn(String str) {
        w().warn(str);
    }

    public final boolean x() {
        Boolean bool = this.f47905c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f47906d = this.f47904b.getClass().getMethod("log", wg.c.class);
            this.f47905c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f47905c = Boolean.FALSE;
        }
        return this.f47905c.booleanValue();
    }
}
