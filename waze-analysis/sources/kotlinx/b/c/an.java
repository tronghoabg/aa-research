package kotlinx.b.c;

import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an extends x {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f50964a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(kotlinx.b.b bVar) {
        super(bVar);
        h.g.b.x.f(bVar, "eSerializer");
        this.f50964a = new am(bVar.getDescriptor());
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        HashSet hashSet = (HashSet) obj;
        h.g.b.x.f(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // kotlinx.b.c.a
    public final /* synthetic */ Object c() {
        return new HashSet();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        HashSet hashSet = (HashSet) obj;
        h.g.b.x.f(hashSet, "<this>");
        return hashSet;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void g(Object obj, int i2) {
        h.g.b.x.f((HashSet) obj, "<this>");
    }

    @Override // kotlinx.b.c.w, kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f50964a;
    }

    @Override // kotlinx.b.c.w
    public final /* bridge */ /* synthetic */ void k(Object obj, int i2, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        h.g.b.x.f(hashSet, "<this>");
        hashSet.add(obj2);
    }
}
