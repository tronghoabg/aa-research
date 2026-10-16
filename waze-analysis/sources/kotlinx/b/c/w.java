package kotlinx.b.c;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class w<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.b f51099a;

    public /* synthetic */ w(kotlinx.b.b bVar) {
        this.f51099a = bVar;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public abstract kotlinx.b.a.q getDescriptor();

    @Override // kotlinx.b.c.a
    protected final void h(kotlinx.b.b.c cVar, Object obj, int i2, int i3) {
        h.g.b.x.f(cVar, "decoder");
        if (i3 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            j(cVar, i2 + i4, obj);
        }
    }

    @Override // kotlinx.b.c.a
    protected void j(kotlinx.b.b.c cVar, int i2, Object obj) {
        h.g.b.x.f(cVar, "decoder");
        k(obj, i2, cVar.decodeSerializableElement(getDescriptor(), i2, this.f51099a, null));
    }

    protected abstract void k(Object obj, int i2, Object obj2);

    @Override // kotlinx.b.l
    public void serialize(kotlinx.b.b.f fVar, Collection collection) {
        h.g.b.x.f(fVar, "encoder");
        int iB = b(collection);
        kotlinx.b.a.q descriptor = getDescriptor();
        kotlinx.b.b.d dVarBeginCollection = fVar.beginCollection(descriptor, iB);
        Iterator itF = f(collection);
        for (int i2 = 0; i2 < iB; i2++) {
            dVarBeginCollection.encodeSerializableElement(getDescriptor(), i2, this.f51099a, itF.next());
        }
        dVarBeginCollection.endStructure(descriptor);
    }
}
