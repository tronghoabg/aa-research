package kotlinx.b.d.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends w {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.d.v f51188a;

    /* renamed from: b, reason: collision with root package name */
    private final List f51189b;

    /* renamed from: c, reason: collision with root package name */
    private final int f51190c;

    /* renamed from: d, reason: collision with root package name */
    private int f51191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlinx.b.d.b bVar, kotlinx.b.d.v vVar) {
        super(bVar, vVar, (String) null, 12);
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(vVar, "value");
        this.f51188a = vVar;
        List listAo = h.a.i.ao(vVar.a());
        this.f51189b = listAo;
        int size = listAo.size();
        this.f51190c = size + size;
        this.f51191d = -1;
    }

    @Override // kotlinx.b.d.a.w, kotlinx.b.b.c
    public final int decodeElementIndex(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        int i2 = this.f51190c;
        int i3 = this.f51191d;
        if (i3 >= i2 - 1) {
            return -1;
        }
        int i4 = i3 + 1;
        this.f51191d = i4;
        return i4;
    }

    @Override // kotlinx.b.d.a.w, kotlinx.b.d.a.b, kotlinx.b.c.ch, kotlinx.b.b.c
    public final void endStructure(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
    }

    @Override // kotlinx.b.d.a.w, kotlinx.b.c.ch
    protected final String o(kotlinx.b.a.q qVar, int i2) {
        h.g.b.x.f(qVar, "descriptor");
        return (String) this.f51189b.get(i2 / 2);
    }

    @Override // kotlinx.b.d.a.w, kotlinx.b.d.a.b
    protected final kotlinx.b.d.k v(String str) {
        h.g.b.x.f(str, "tag");
        if (this.f51191d % 2 != 0) {
            return (kotlinx.b.d.k) h.a.r.h(this.f51188a, str);
        }
        int i2 = kotlinx.b.d.l.f51213a;
        return str == null ? kotlinx.b.d.t.f51222a : new kotlinx.b.d.q(str, true);
    }

    @Override // kotlinx.b.d.a.w, kotlinx.b.d.a.b
    public final /* synthetic */ kotlinx.b.d.k x() {
        return this.f51188a;
    }

    @Override // kotlinx.b.d.a.w
    /* renamed from: y */
    public final kotlinx.b.d.v x() {
        return this.f51188a;
    }
}
