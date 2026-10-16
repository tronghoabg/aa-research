package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.g.b.x;
import h.k.n;
import kotlinx.b.a.p;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MutableStateSerializer<T> implements b<MutableState<T>> {
    private final q descriptor;
    private final b<T> valueSerializer;

    public MutableStateSerializer(b<T> bVar) {
        x.f(bVar, "valueSerializer");
        this.valueSerializer = bVar;
        kotlinx.b.a.x xVarH = this.valueSerializer.getDescriptor().h();
        this.descriptor = xVarH instanceof p ? n.w("androidx.compose.runtime.MutableState", (p) xVarH) : n.x("androidx.compose.runtime.MutableState", this.valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // kotlinx.b.a
    public MutableState<T> deserialize(e eVar) {
        x.f(eVar, "decoder");
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(eVar.decodeSerializableValue(this.valueSerializer), null, 2, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, MutableState<T> mutableState) {
        x.f(fVar, "encoder");
        x.f(mutableState, "value");
        fVar.encodeSerializableValue(this.valueSerializer, mutableState.getValue());
    }
}
