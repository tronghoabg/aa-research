package kotlinx.b.c;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd extends au {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f50985a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(kotlinx.b.b bVar, kotlinx.b.b bVar2) {
        super(bVar, bVar2);
        h.g.b.x.f(bVar, "keySerializer");
        h.g.b.x.f(bVar2, "valueSerializer");
        this.f50985a = h.k.n.z("kotlin.collections.Map.Entry", kotlinx.b.a.aa.f50902a, new kotlinx.b.a.q[0], new com.waze.ui.u(bVar, bVar2, 9, null));
    }

    @Override // kotlinx.b.c.au
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        h.g.b.x.f(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.b.c.au
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        h.g.b.x.f(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.b.c.au
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2) {
        return new bc(obj, obj2);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f50985a;
    }
}
