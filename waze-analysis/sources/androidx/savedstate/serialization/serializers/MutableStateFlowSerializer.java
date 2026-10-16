package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import h.k.n;
import kotlinx.b.a.p;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MutableStateFlowSerializer<T> implements b<bn<T>> {
    private final q descriptor;
    private final b<T> valueSerializer;

    public MutableStateFlowSerializer(b<T> bVar) {
        x.f(bVar, "valueSerializer");
        this.valueSerializer = bVar;
        kotlinx.b.a.x xVarH = this.valueSerializer.getDescriptor().h();
        this.descriptor = xVarH instanceof p ? n.w("kotlinx.coroutines.flow.MutableStateFlow", (p) xVarH) : n.x("kotlinx.coroutines.flow.MutableStateFlow", this.valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // kotlinx.b.a
    public bn<T> deserialize(e eVar) {
        x.f(eVar, "decoder");
        return ck.b(eVar.decodeSerializableValue(this.valueSerializer));
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.l
    public void serialize(f fVar, bn<T> bnVar) {
        x.f(fVar, "encoder");
        x.f(bnVar, "value");
        fVar.encodeSerializableValue(this.valueSerializer, bnVar.d());
    }
}
