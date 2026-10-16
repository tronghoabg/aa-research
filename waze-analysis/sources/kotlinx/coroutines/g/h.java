package kotlinx.coroutines.g;

import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f51984a;

    /* renamed from: b, reason: collision with root package name */
    public final q f51985b;

    /* renamed from: c, reason: collision with root package name */
    public Object f51986c;

    /* renamed from: d, reason: collision with root package name */
    public int f51987d = -1;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f51988e;

    /* renamed from: f, reason: collision with root package name */
    private final q f51989f;

    /* renamed from: g, reason: collision with root package name */
    private final q f51990g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f51991h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f51992i;

    public h(k kVar, Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
        this.f51988e = kVar;
        this.f51984a = obj;
        this.f51989f = qVar;
        this.f51990g = qVar2;
        this.f51991h = obj2;
        this.f51992i = obj3;
        this.f51985b = qVar3;
    }

    public final Object a(Object obj, h.c.e eVar) {
        Object obj2 = this.f51991h;
        Object obj3 = this.f51992i;
        return obj2 == n.f() ? ((h.g.a.l) obj3).invoke(eVar) : ((p) obj3).invoke(obj, eVar);
    }

    public final Object b(Object obj) {
        return this.f51990g.invoke(this.f51984a, this.f51991h, obj);
    }

    public final q c(l lVar, Object obj) {
        q qVar = this.f51985b;
        if (qVar != null) {
            return (q) qVar.invoke(lVar, this.f51991h, obj);
        }
        return null;
    }

    public final void d() {
        Object obj = this.f51986c;
        if (obj instanceof kotlinx.coroutines.e.e) {
            ((kotlinx.coroutines.e.e) obj).l(this.f51987d, this.f51988e.e());
            return;
        }
        ax axVar = obj instanceof ax ? (ax) obj : null;
        if (axVar != null) {
            axVar.dispose();
        }
    }

    public final boolean e(k kVar) {
        int i2 = ai.f51347a;
        this.f51989f.invoke(this.f51984a, kVar, this.f51991h);
        return kVar.f52004f == n.f52009e;
    }
}
