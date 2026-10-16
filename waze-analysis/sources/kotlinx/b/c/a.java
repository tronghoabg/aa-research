package kotlinx.b.c;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class a<Element, Collection, Builder> implements kotlinx.b.b<Collection> {
    protected abstract int a(Object obj);

    protected abstract int b(Object obj);

    protected abstract Object c();

    protected abstract Object d(Object obj);

    @Override // kotlinx.b.a
    public Collection deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return (Collection) i(eVar);
    }

    protected abstract Object e(Object obj);

    protected abstract Iterator f(Object obj);

    protected abstract void g(Object obj, int i2);

    protected abstract void h(kotlinx.b.b.c cVar, Object obj, int i2, int i3);

    public final Object i(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        Object objC = c();
        int iA = a(objC);
        kotlinx.b.b.c cVarBeginStructure = eVar.beginStructure(getDescriptor());
        if (!cVarBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                j(cVarBeginStructure, iDecodeElementIndex + iA, objC);
            }
        } else {
            int iDecodeCollectionSize = cVarBeginStructure.decodeCollectionSize(getDescriptor());
            g(objC, iDecodeCollectionSize);
            h(cVarBeginStructure, objC, iA, iDecodeCollectionSize);
        }
        cVarBeginStructure.endStructure(getDescriptor());
        return e(objC);
    }

    protected abstract void j(kotlinx.b.b.c cVar, int i2, Object obj);
}
