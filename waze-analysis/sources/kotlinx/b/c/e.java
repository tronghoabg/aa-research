package kotlinx.b.c;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends x {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f51074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.b.b bVar) {
        super(bVar);
        h.g.b.x.f(bVar, "element");
        this.f51074a = new d(bVar.getDescriptor());
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.b.c.a
    public final /* synthetic */ Object c() {
        return new ArrayList();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void g(Object obj, int i2) {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        arrayList.ensureCapacity(i2);
    }

    @Override // kotlinx.b.c.w, kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f51074a;
    }

    @Override // kotlinx.b.c.w
    public final /* bridge */ /* synthetic */ void k(Object obj, int i2, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        h.g.b.x.f(arrayList, "<this>");
        arrayList.add(i2, obj2);
    }
}
