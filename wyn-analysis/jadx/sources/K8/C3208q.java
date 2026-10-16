package k8;

import java.io.Serializable;

/* renamed from: k8.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3208q implements InterfaceC3207p, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f39313a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3207p f39314b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f39315c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f39316d;

    public C3208q(InterfaceC3207p interfaceC3207p) {
        this.f39314b = interfaceC3207p;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        if (!this.f39315c) {
            synchronized (this.f39313a) {
                try {
                    if (!this.f39315c) {
                        Object obj = this.f39314b.get();
                        this.f39316d = obj;
                        this.f39315c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f39316d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f39315c) {
            obj = "<supplier that returned " + this.f39316d + ">";
        } else {
            obj = this.f39314b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
