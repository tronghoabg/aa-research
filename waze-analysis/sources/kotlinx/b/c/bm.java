package kotlinx.b.c;

import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bm<T> implements kotlinx.b.b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f51001a;

    /* renamed from: b, reason: collision with root package name */
    private final List f51002b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f51003c;

    public bm(String str, Object obj) {
        h.g.b.x.f(str, "serialName");
        h.g.b.x.f(obj, "objectInstance");
        this.f51001a = obj;
        this.f51002b = h.a.i.h();
        this.f51003c = h.g.b(h.h.f48131b, new com.waze.ui.m.cq(str, this, 1));
    }

    static final h.ab a(bm bmVar, kotlinx.b.a.a aVar) {
        h.g.b.x.f(aVar, "$this$buildSerialDescriptor");
        aVar.f(bmVar.f51002b);
        return h.ab.f48028a;
    }

    @Override // kotlinx.b.a
    public final T deserialize(kotlinx.b.b.e eVar) {
        int iDecodeElementIndex;
        h.g.b.x.f(eVar, "decoder");
        kotlinx.b.a.q descriptor = getDescriptor();
        kotlinx.b.b.c cVarBeginStructure = eVar.beginStructure(descriptor);
        if (cVarBeginStructure.decodeSequentially() || (iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(getDescriptor())) == -1) {
            cVarBeginStructure.endStructure(descriptor);
            return (T) this.f51001a;
        }
        throw new kotlinx.b.k("Unexpected index " + iDecodeElementIndex);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return (kotlinx.b.a.q) this.f51003c.getValue();
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, T t) {
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(t, "value");
        fVar.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bm(Object obj, Annotation[] annotationArr) {
        this("androidx.savedstate.serialization.serializers.NullValue", obj);
        h.g.b.x.f("androidx.savedstate.serialization.serializers.NullValue", "serialName");
        h.g.b.x.f(obj, "objectInstance");
        h.g.b.x.f(annotationArr, "classAnnotations");
        this.f51002b = h.a.c.i(annotationArr);
    }
}
