package S;

import A.C0230x;
import ff.AbstractC2652g;

/* loaded from: classes.dex */
public class c extends AbstractC2652g implements Q.d {

    /* renamed from: c, reason: collision with root package name */
    public static final c f10799c = new c(n.f10824e, 0);

    /* renamed from: a, reason: collision with root package name */
    public final n f10800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10801b;

    public c(n nVar, int i5) {
        this.f10800a = nVar;
        this.f10801b = i5;
    }

    @Override // Q.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c c(Object obj, T.a aVar) {
        C0230x c0230xU = this.f10800a.u(obj != null ? obj.hashCode() : 0, obj, aVar, 0);
        return c0230xU == null ? this : new c((n) c0230xU.f188c, this.f10801b + c0230xU.f187b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f10800a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f10800a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
