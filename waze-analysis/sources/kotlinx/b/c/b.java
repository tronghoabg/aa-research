package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class b<T> implements kotlinx.b.b<T> {
    public abstract h.l.c b();

    public kotlinx.b.a d(kotlinx.b.b.c cVar, String str) {
        h.g.b.x.f(cVar, "decoder");
        return cVar.getSerializersModule().a(b(), str);
    }

    @Override // kotlinx.b.a
    public final T deserialize(kotlinx.b.b.e eVar) {
        T t;
        h.g.b.x.f(eVar, "decoder");
        kotlinx.b.a.q descriptor = getDescriptor();
        kotlinx.b.b.c cVarBeginStructure = eVar.beginStructure(descriptor);
        h.g.b.aq aqVar = new h.g.b.aq();
        if (cVarBeginStructure.decodeSequentially()) {
            t = (T) cVarBeginStructure.decodeSerializableElement(getDescriptor(), 1, kotlinx.b.p.f(this, cVarBeginStructure, cVarBeginStructure.decodeStringElement(getDescriptor(), 0)), null);
        } else {
            Object objDecodeSerializableElement = null;
            while (true) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        aqVar.f48105a = cVarBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            String str = (String) aqVar.f48105a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iDecodeElementIndex);
                            throw new kotlinx.b.k(sb.toString());
                        }
                        Object obj = aqVar.f48105a;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        aqVar.f48105a = obj;
                        objDecodeSerializableElement = cVarBeginStructure.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, kotlinx.b.p.f(this, cVarBeginStructure, (String) aqVar.f48105a), null);
                    }
                } else {
                    if (objDecodeSerializableElement == null) {
                        throw new IllegalArgumentException("Polymorphic value has not been read for class ".concat(String.valueOf((String) aqVar.f48105a)));
                    }
                    t = (T) objDecodeSerializableElement;
                }
            }
        }
        cVarBeginStructure.endStructure(descriptor);
        return t;
    }

    public kotlinx.b.l e(kotlinx.b.b.f fVar, Object obj) {
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(obj, "value");
        return fVar.getSerializersModule().c(b(), obj);
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, T t) {
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(t, "value");
        kotlinx.b.l<? super T> lVarG = kotlinx.b.p.g(this, fVar, t);
        kotlinx.b.a.q descriptor = getDescriptor();
        kotlinx.b.b.d dVarBeginStructure = fVar.beginStructure(descriptor);
        dVarBeginStructure.encodeStringElement(getDescriptor(), 0, lVarG.getDescriptor().d());
        dVarBeginStructure.encodeSerializableElement(getDescriptor(), 1, lVarG, t);
        dVarBeginStructure.endStructure(descriptor);
    }
}
