package kotlinx.b.c;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class av extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f50975a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(kotlinx.b.b bVar, kotlinx.b.b bVar2) {
        super(bVar, bVar2);
        h.g.b.x.f(bVar, "kSerializer");
        h.g.b.x.f(bVar2, "vSerializer");
        kotlinx.b.a.q descriptor = bVar.getDescriptor();
        kotlinx.b.a.q descriptor2 = bVar2.getDescriptor();
        h.g.b.x.f(descriptor, "keyDesc");
        h.g.b.x.f(descriptor2, "valueDesc");
        this.f50975a = new be("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        h.g.b.x.f(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        return size + size;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        Map map = (Map) obj;
        h.g.b.x.f(map, "<this>");
        return map.size();
    }

    @Override // kotlinx.b.c.a
    public final /* synthetic */ Object c() {
        return new LinkedHashMap();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        throw null;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        h.g.b.x.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Iterator f(Object obj) {
        Map map = (Map) obj;
        h.g.b.x.f(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ void g(Object obj, int i2) {
        h.g.b.x.f((LinkedHashMap) obj, "<this>");
    }

    @Override // kotlinx.b.c.bf, kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f50975a;
    }
}
