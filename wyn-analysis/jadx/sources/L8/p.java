package L8;

/* loaded from: classes4.dex */
public final class p implements O9.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7023c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f7024a = f7023c;

    /* renamed from: b, reason: collision with root package name */
    public volatile O9.b f7025b;

    public p(O9.b bVar) {
        this.f7025b = bVar;
    }

    @Override // O9.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f7024a;
        Object obj3 = f7023c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7024a;
                if (obj == obj3) {
                    obj = this.f7025b.get();
                    this.f7024a = obj;
                    this.f7025b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
