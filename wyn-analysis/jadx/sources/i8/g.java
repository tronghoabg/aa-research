package i8;

/* loaded from: classes4.dex */
public final class g implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f36906c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile h f36907a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f36908b;

    /* JADX WARN: Multi-variable type inference failed */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        g gVar = new g();
        gVar.f36908b = f36906c;
        gVar.f36907a = hVar;
        return gVar;
    }

    @Override // i8.i
    public final Object a() {
        Object objA;
        Object obj = this.f36908b;
        Object obj2 = f36906c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f36908b;
                if (objA == obj2) {
                    objA = this.f36907a.a();
                    Object obj3 = this.f36908b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f36908b = objA;
                    this.f36907a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
