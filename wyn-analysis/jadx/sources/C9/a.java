package C9;

import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class a implements InterfaceC2432a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1959c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2432a f1960a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1961b;

    public static InterfaceC2432a a(InterfaceC2432a interfaceC2432a) {
        if (interfaceC2432a instanceof a) {
            return interfaceC2432a;
        }
        a aVar = new a();
        aVar.f1961b = f1959c;
        aVar.f1960a = interfaceC2432a;
        return aVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        Object obj;
        Object obj2 = this.f1961b;
        Object obj3 = f1959c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f1961b;
                if (obj == obj3) {
                    obj = this.f1960a.get();
                    Object obj4 = this.f1961b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f1961b = obj;
                    this.f1960a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
