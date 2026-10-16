package kotlinx.b.d;

import h.g.b.ar;
import kotlinx.b.d.a.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class i<T> implements kotlinx.b.b<T> {
    private final h.l.c<T> baseClass;
    private final kotlinx.b.a.q descriptor;

    public i(h.l.c<T> cVar) {
        h.g.b.x.f(cVar, "baseClass");
        this.baseClass = cVar;
        this.descriptor = h.k.n.z("JsonContentPolymorphicSerializer<" + cVar.c() + '>', kotlinx.b.a.e.f50910a, new kotlinx.b.a.q[0], new kotlinx.coroutines.z(6));
    }

    private final Void throwSubtypeNotRegistered(h.l.c<?> cVar, h.l.c<?> cVar2) {
        String strC = cVar.c();
        if (strC == null) {
            strC = String.valueOf(cVar);
        }
        throw new kotlinx.b.k("Class '" + strC + "' is not registered for polymorphic serialization " + ("in the scope of '" + cVar2.c() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // kotlinx.b.a
    public final T deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        j jVarB = aa.b(eVar);
        k kVarI = jVarB.i();
        kotlinx.b.a<T> aVarSelectDeserializer = selectDeserializer(kVarI);
        h.g.b.x.d(aVarSelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        b bVarH = jVarB.h();
        kotlinx.b.b bVar = (kotlinx.b.b) aVarSelectDeserializer;
        h.g.b.x.f(bVar, "deserializer");
        h.g.b.x.f(kVarI, "element");
        return (T) ai.c(bVarH, kVarI, bVar);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public kotlinx.b.a.q getDescriptor() {
        return this.descriptor;
    }

    protected abstract kotlinx.b.a<T> selectDeserializer(k kVar);

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, T t) {
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(t, "value");
        kotlinx.b.b bVarC = fVar.getSerializersModule().c(this.baseClass, t);
        if (bVarC == null) {
            Class<?> cls = t.getClass();
            int i2 = ar.f48106a;
            kotlinx.b.b bVarB = kotlinx.b.p.b(new h.g.b.m(cls));
            if (bVarB == null) {
                throwSubtypeNotRegistered(new h.g.b.m(t.getClass()), this.baseClass);
                throw new h.e();
            }
            bVarC = bVarB;
        }
        ((kotlinx.b.b) bVarC).serialize(fVar, t);
    }
}
