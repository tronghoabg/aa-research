package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import h.a.i;
import h.g.b.x;
import h.k.n;
import java.util.List;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SnapshotStateListSerializer<T> implements b<SnapshotStateList<T>> {
    private final b<List<T>> base;
    private final q descriptor;
    private final b<T> elementSerializer;

    public SnapshotStateListSerializer(b<T> bVar) {
        x.f(bVar, "elementSerializer");
        this.elementSerializer = bVar;
        b<List<T>> bVarI = kotlinx.b.a.b.i(bVar);
        this.base = bVarI;
        this.descriptor = n.x("androidx.compose.runtime.SnapshotStateList", bVarI.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // kotlinx.b.a
    public SnapshotStateList<T> deserialize(e eVar) {
        x.f(eVar, "decoder");
        List list = (List) eVar.decodeSerializableValue(this.base);
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(i.ao(list));
        return snapshotStateList;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, SnapshotStateList<T> snapshotStateList) {
        x.f(fVar, "encoder");
        x.f(snapshotStateList, "value");
        fVar.encodeSerializableValue(this.base, snapshotStateList);
    }
}
