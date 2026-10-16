package v5;

import df.InterfaceC2432a;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4300a implements InterfaceC2432a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f46831c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC4301b f46832a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f46833b;

    public static InterfaceC2432a a(InterfaceC4301b interfaceC4301b) {
        if (interfaceC4301b instanceof C4300a) {
            return interfaceC4301b;
        }
        C4300a c4300a = new C4300a();
        c4300a.f46833b = f46831c;
        c4300a.f46832a = interfaceC4301b;
        return c4300a;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        Object obj;
        Object obj2 = this.f46833b;
        Object obj3 = f46831c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f46833b;
                if (obj == obj3) {
                    obj = this.f46832a.get();
                    Object obj4 = this.f46833b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f46833b = obj;
                    this.f46832a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
