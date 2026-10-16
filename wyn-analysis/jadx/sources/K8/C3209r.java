package k8;

import E5.C0467q;

/* renamed from: k8.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3209r implements InterfaceC3207p {

    /* renamed from: d, reason: collision with root package name */
    public static final C0467q f39317d = new C0467q(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f39318a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC3207p f39319b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39320c;

    public C3209r(InterfaceC3207p interfaceC3207p) {
        this.f39319b = interfaceC3207p;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        InterfaceC3207p interfaceC3207p = this.f39319b;
        C0467q c0467q = f39317d;
        if (interfaceC3207p != c0467q) {
            synchronized (this.f39318a) {
                try {
                    if (this.f39319b != c0467q) {
                        Object obj = this.f39319b.get();
                        this.f39320c = obj;
                        this.f39319b = c0467q;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f39320c;
    }

    public final String toString() {
        Object obj = this.f39319b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == f39317d) {
            obj = "<supplier that returned " + this.f39320c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
