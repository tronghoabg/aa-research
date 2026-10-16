package md;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class O {

    /* renamed from: b, reason: collision with root package name */
    public static final C3533a f40591b = new C3533a("internal:health-checking-config");

    /* renamed from: c, reason: collision with root package name */
    public static final C3542j f40592c = new C3542j(5);

    /* renamed from: d, reason: collision with root package name */
    public static final C3533a f40593d = new C3533a("internal:has-health-check-producer-listener");

    /* renamed from: e, reason: collision with root package name */
    public static final C3533a f40594e = new C3533a("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a, reason: collision with root package name */
    public int f40595a;

    public k0 a(L l10) {
        List list = l10.f40588a;
        if (!list.isEmpty() || b()) {
            int i5 = this.f40595a;
            this.f40595a = i5 + 1;
            if (i5 == 0) {
                d(l10);
            }
            this.f40595a = 0;
            return k0.f40674e;
        }
        k0 k0VarH = k0.f40682n.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + l10.f40589b);
        c(k0VarH);
        return k0VarH;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(k0 k0Var);

    public void d(L l10) {
        int i5 = this.f40595a;
        this.f40595a = i5 + 1;
        if (i5 == 0) {
            a(l10);
        }
        this.f40595a = 0;
    }

    public abstract void f();

    public void e() {
    }
}
