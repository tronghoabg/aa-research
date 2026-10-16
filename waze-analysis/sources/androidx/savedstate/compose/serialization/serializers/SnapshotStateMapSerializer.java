package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import h.g.b.x;
import h.k.n;
import java.util.Map;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SnapshotStateMapSerializer<K, V> implements b<SnapshotStateMap<K, V>> {
    private final b<Map<K, V>> base;
    private final q descriptor;

    public SnapshotStateMapSerializer(b<K> bVar, b<V> bVar2) {
        x.f(bVar, "keySerializer");
        x.f(bVar2, "valueSerializer");
        b<Map<K, V>> bVarK = kotlinx.b.a.b.k(bVar, bVar2);
        this.base = bVarK;
        this.descriptor = n.x("androidx.compose.runtime.SnapshotStateMap", bVarK.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // kotlinx.b.a
    public SnapshotStateMap<K, V> deserialize(e eVar) {
        x.f(eVar, "decoder");
        Map<? extends K, ? extends V> map = (Map) eVar.decodeSerializableValue(this.base);
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(map);
        return snapshotStateMap;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, SnapshotStateMap<K, V> snapshotStateMap) {
        x.f(fVar, "encoder");
        x.f(snapshotStateMap, "value");
        fVar.encodeSerializableValue(this.base, snapshotStateMap);
    }
}
