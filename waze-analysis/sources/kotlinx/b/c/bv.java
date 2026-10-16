package kotlinx.b.c;

import java.util.Iterator;
import kotlinx.b.c.bt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class bv<Element, Array, Builder extends bt<Array>> extends w<Element, Array, Builder> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f51021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(kotlinx.b.b bVar) {
        super(bVar);
        h.g.b.x.f(bVar, "primitiveSerializer");
        this.f51021a = new bu(bVar.getDescriptor());
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        bt btVar = (bt) obj;
        h.g.b.x.f(btVar, "<this>");
        return btVar.a();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object c() {
        return (bt) d(l());
    }

    @Override // kotlinx.b.c.a, kotlinx.b.a
    public final Array deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return (Array) i(eVar);
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        bt btVar = (bt) obj;
        h.g.b.x.f(btVar, "<this>");
        return btVar.b();
    }

    @Override // kotlinx.b.c.a
    protected final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void g(Object obj, int i2) {
        bt btVar = (bt) obj;
        h.g.b.x.f(btVar, "<this>");
        btVar.d(i2);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f51021a;
    }

    @Override // kotlinx.b.c.w
    public final /* bridge */ /* synthetic */ void k(Object obj, int i2, Object obj2) {
        h.g.b.x.f((bt) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    protected abstract Object l();

    protected abstract void m(kotlinx.b.b.d dVar, Object obj, int i2);

    @Override // kotlinx.b.c.w, kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, Array array) {
        h.g.b.x.f(fVar, "encoder");
        kotlinx.b.a.q qVar = this.f51021a;
        int iB = b(array);
        kotlinx.b.b.d dVarBeginCollection = fVar.beginCollection(qVar, iB);
        m(dVarBeginCollection, array, iB);
        dVarBeginCollection.endStructure(qVar);
    }
}
