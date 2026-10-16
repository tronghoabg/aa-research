package Tb;

import df.InterfaceC2432a;

/* loaded from: classes5.dex */
public final class a implements InterfaceC2432a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11823c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2432a f11824a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11825b;

    public static InterfaceC2432a a(InterfaceC2432a interfaceC2432a) {
        interfaceC2432a.getClass();
        if (interfaceC2432a instanceof a) {
            return interfaceC2432a;
        }
        a aVar = new a();
        aVar.f11825b = f11823c;
        aVar.f11824a = interfaceC2432a;
        return aVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        Object obj;
        Object obj2 = this.f11825b;
        Object obj3 = f11823c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f11825b;
                if (obj == obj3) {
                    obj = this.f11824a.get();
                    Object obj4 = this.f11825b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f11825b = obj;
                    this.f11824a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
