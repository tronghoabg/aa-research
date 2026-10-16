package androidx.lifecycle;

import A7.AbstractC0279p0;
import android.os.Looper;
import java.util.Map;
import r.C3894a;
import s.C3983c;
import s.C3984d;
import s.C3986f;

/* loaded from: classes.dex */
public abstract class D {
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f18579a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C3986f f18580b = new C3986f();

    /* renamed from: c, reason: collision with root package name */
    public int f18581c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18582d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f18583e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f18584f;

    /* renamed from: g, reason: collision with root package name */
    public int f18585g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18586h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18587i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.V f18588j;

    public D() {
        Object obj = k;
        this.f18584f = obj;
        this.f18588j = new A7.V(this, 23);
        this.f18583e = obj;
        this.f18585g = -1;
    }

    public static void a(String str) {
        C3894a.h0().f44285a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0279p0.l("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(C c10) {
        if (c10.f18576b) {
            if (!c10.d()) {
                c10.a(false);
                return;
            }
            int i5 = c10.f18577c;
            int i10 = this.f18585g;
            if (i5 >= i10) {
                return;
            }
            c10.f18577c = i10;
            c10.f18575a.b(this.f18583e);
        }
    }

    public final void c(C c10) {
        if (this.f18586h) {
            this.f18587i = true;
            return;
        }
        this.f18586h = true;
        do {
            this.f18587i = false;
            if (c10 != null) {
                b(c10);
                c10 = null;
            } else {
                C3986f c3986f = this.f18580b;
                c3986f.getClass();
                C3984d c3984d = new C3984d(c3986f);
                c3986f.f44823c.put(c3984d, Boolean.FALSE);
                while (c3984d.hasNext()) {
                    b((C) ((Map.Entry) c3984d.next()).getValue());
                    if (this.f18587i) {
                        break;
                    }
                }
            }
        } while (this.f18587i);
        this.f18586h = false;
    }

    public final void d(InterfaceC1457v interfaceC1457v, F f10) {
        Object obj;
        a("observe");
        if (interfaceC1457v.getLifecycle().b() == EnumC1450n.f18676a) {
            return;
        }
        B b5 = new B(this, interfaceC1457v, f10);
        C3986f c3986f = this.f18580b;
        C3983c c3983cA = c3986f.a(f10);
        if (c3983cA != null) {
            obj = c3983cA.f44815b;
        } else {
            C3983c c3983c = new C3983c(f10, b5);
            c3986f.f44824d++;
            C3983c c3983c2 = c3986f.f44822b;
            if (c3983c2 == null) {
                c3986f.f44821a = c3983c;
                c3986f.f44822b = c3983c;
            } else {
                c3983c2.f44816c = c3983c;
                c3983c.f44817d = c3983c2;
                c3986f.f44822b = c3983c;
            }
            obj = null;
        }
        C c10 = (C) obj;
        if (c10 != null && !c10.c(interfaceC1457v)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c10 != null) {
            return;
        }
        interfaceC1457v.getLifecycle().a(b5);
    }

    public final void e(F f10) {
        Object obj;
        a("observeForever");
        A a5 = new A(this, f10);
        C3986f c3986f = this.f18580b;
        C3983c c3983cA = c3986f.a(f10);
        if (c3983cA != null) {
            obj = c3983cA.f44815b;
        } else {
            C3983c c3983c = new C3983c(f10, a5);
            c3986f.f44824d++;
            C3983c c3983c2 = c3986f.f44822b;
            if (c3983c2 == null) {
                c3986f.f44821a = c3983c;
                c3986f.f44822b = c3983c;
            } else {
                c3983c2.f44816c = c3983c;
                c3983c.f44817d = c3983c2;
                c3986f.f44822b = c3983c;
            }
            obj = null;
        }
        C c10 = (C) obj;
        if (c10 instanceof B) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c10 != null) {
            return;
        }
        a5.a(true);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(Object obj) {
        boolean z2;
        synchronized (this.f18579a) {
            z2 = this.f18584f == k;
            this.f18584f = obj;
        }
        if (z2) {
            C3894a.h0().i0(this.f18588j);
        }
    }

    public void i(F f10) {
        a("removeObserver");
        C c10 = (C) this.f18580b.b(f10);
        if (c10 == null) {
            return;
        }
        c10.b();
        c10.a(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.f18585g++;
        this.f18583e = obj;
        c(null);
    }
}
