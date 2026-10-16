package kotlinx.b.c;

import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax extends x {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f50976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(kotlinx.b.b bVar) {
        super(bVar);
        h.g.b.x.f(bVar, "eSerializer");
        this.f50976a = new aw(bVar.getDescriptor());
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        h.g.b.x.f(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // kotlinx.b.c.a
    public final /* synthetic */ Object c() {
        return new LinkedHashSet();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        h.g.b.x.f(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void g(Object obj, int i2) {
        h.g.b.x.f((LinkedHashSet) obj, "<this>");
    }

    @Override // kotlinx.b.c.w, kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f50976a;
    }

    @Override // kotlinx.b.c.w
    public final /* bridge */ /* synthetic */ void k(Object obj, int i2, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        h.g.b.x.f(linkedHashSet, "<this>");
        linkedHashSet.add(obj2);
    }
}
