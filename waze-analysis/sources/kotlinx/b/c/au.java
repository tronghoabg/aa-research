package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class au<K, V, R> implements kotlinx.b.b<R> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.b f50973a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.b f50974b;

    public /* synthetic */ au(kotlinx.b.b bVar, kotlinx.b.b bVar2) {
        this.f50973a = bVar;
        this.f50974b = bVar2;
    }

    protected abstract Object a(Object obj);

    protected abstract Object b(Object obj);

    protected abstract Object c(Object obj, Object obj2);

    @Override // kotlinx.b.a
    public final R deserialize(kotlinx.b.b.e eVar) {
        R r;
        h.g.b.x.f(eVar, "decoder");
        kotlinx.b.a.q descriptor = getDescriptor();
        kotlinx.b.b.c cVarBeginStructure = eVar.beginStructure(descriptor);
        if (cVarBeginStructure.decodeSequentially()) {
            r = (R) c(cVarBeginStructure.decodeSerializableElement(getDescriptor(), 0, this.f50973a, null), cVarBeginStructure.decodeSerializableElement(getDescriptor(), 1, this.f50974b, null));
        } else {
            Object objDecodeSerializableElement = ck.f51049a;
            Object objDecodeSerializableElement2 = ck.f51049a;
            while (true) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        objDecodeSerializableElement = cVarBeginStructure.decodeSerializableElement(getDescriptor(), 0, this.f50973a, null);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new kotlinx.b.k("Invalid index: " + iDecodeElementIndex);
                        }
                        objDecodeSerializableElement2 = cVarBeginStructure.decodeSerializableElement(getDescriptor(), 1, this.f50974b, null);
                    }
                } else {
                    if (objDecodeSerializableElement == ck.f51049a) {
                        throw new kotlinx.b.k("Element 'key' is missing");
                    }
                    if (objDecodeSerializableElement2 == ck.f51049a) {
                        throw new kotlinx.b.k("Element 'value' is missing");
                    }
                    r = (R) c(objDecodeSerializableElement, objDecodeSerializableElement2);
                }
            }
        }
        cVarBeginStructure.endStructure(descriptor);
        return r;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, R r) {
        h.g.b.x.f(fVar, "encoder");
        kotlinx.b.b.d dVarBeginStructure = fVar.beginStructure(getDescriptor());
        dVarBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f50973a, a(r));
        dVarBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f50974b, b(r));
        dVarBeginStructure.endStructure(getDescriptor());
    }
}
