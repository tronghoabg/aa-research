package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cj implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.b f51045a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.b f51046b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.b.b f51047c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.b.a.q f51048d;

    public cj(kotlinx.b.b bVar, kotlinx.b.b bVar2, kotlinx.b.b bVar3) {
        h.g.b.x.f(bVar, "aSerializer");
        h.g.b.x.f(bVar2, "bSerializer");
        h.g.b.x.f(bVar3, "cSerializer");
        this.f51045a = bVar;
        this.f51046b = bVar2;
        this.f51047c = bVar3;
        this.f51048d = h.k.n.y("kotlin.Triple", new kotlinx.b.a.q[0], new ci(this, 0));
    }

    static final h.ab a(cj cjVar, kotlinx.b.a.a aVar) {
        h.g.b.x.f(aVar, "$this$buildClassSerialDescriptor");
        kotlinx.b.a.a.g(aVar, "first", cjVar.f51045a.getDescriptor());
        kotlinx.b.a.a.g(aVar, "second", cjVar.f51046b.getDescriptor());
        kotlinx.b.a.a.g(aVar, "third", cjVar.f51047c.getDescriptor());
        return h.ab.f48028a;
    }

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        kotlinx.b.a.q qVar = this.f51048d;
        kotlinx.b.b.c cVarBeginStructure = eVar.beginStructure(qVar);
        if (cVarBeginStructure.decodeSequentially()) {
            Object objDecodeSerializableElement = cVarBeginStructure.decodeSerializableElement(qVar, 0, this.f51045a, null);
            Object objDecodeSerializableElement2 = cVarBeginStructure.decodeSerializableElement(qVar, 1, this.f51046b, null);
            Object objDecodeSerializableElement3 = cVarBeginStructure.decodeSerializableElement(qVar, 2, this.f51047c, null);
            cVarBeginStructure.endStructure(qVar);
            return new h.p(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
        }
        Object objDecodeSerializableElement4 = ck.f51049a;
        Object objDecodeSerializableElement5 = ck.f51049a;
        Object objDecodeSerializableElement6 = ck.f51049a;
        while (true) {
            int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
            if (iDecodeElementIndex == -1) {
                cVarBeginStructure.endStructure(qVar);
                if (objDecodeSerializableElement4 == ck.f51049a) {
                    throw new kotlinx.b.k("Element 'first' is missing");
                }
                if (objDecodeSerializableElement5 == ck.f51049a) {
                    throw new kotlinx.b.k("Element 'second' is missing");
                }
                if (objDecodeSerializableElement6 != ck.f51049a) {
                    return new h.p(objDecodeSerializableElement4, objDecodeSerializableElement5, objDecodeSerializableElement6);
                }
                throw new kotlinx.b.k("Element 'third' is missing");
            }
            if (iDecodeElementIndex == 0) {
                objDecodeSerializableElement4 = cVarBeginStructure.decodeSerializableElement(qVar, 0, this.f51045a, null);
            } else if (iDecodeElementIndex == 1) {
                objDecodeSerializableElement5 = cVarBeginStructure.decodeSerializableElement(qVar, 1, this.f51046b, null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new kotlinx.b.k("Unexpected index " + iDecodeElementIndex);
                }
                objDecodeSerializableElement6 = cVarBeginStructure.decodeSerializableElement(qVar, 2, this.f51047c, null);
            }
        }
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f51048d;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        h.p pVar = (h.p) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(pVar, "value");
        kotlinx.b.a.q qVar = this.f51048d;
        kotlinx.b.b.d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, this.f51045a, pVar.d());
        dVarBeginStructure.encodeSerializableElement(qVar, 1, this.f51046b, pVar.e());
        dVarBeginStructure.encodeSerializableElement(qVar, 2, this.f51047c, pVar.f());
        dVarBeginStructure.endStructure(qVar);
    }
}
