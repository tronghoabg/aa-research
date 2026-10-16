package androidx.savedstate.compose.serialization.serializers;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import h.g.b.x;
import h.k.n;
import java.util.Set;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ax;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SnapshotStateSetSerializer<T> implements b<SnapshotStateSet<T>> {
    private final b<Set<T>> base;
    private final q descriptor;
    private final b<T> elementSerializer;

    public SnapshotStateSetSerializer(b<T> bVar) {
        x.f(bVar, "elementSerializer");
        this.elementSerializer = bVar;
        x.f(bVar, "elementSerializer");
        ax axVar = new ax(bVar);
        this.base = axVar;
        this.descriptor = n.x("androidx.compose.runtime.SnapshotStateSet", axVar.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // kotlinx.b.a
    public SnapshotStateSet<T> deserialize(e eVar) {
        x.f(eVar, "decoder");
        Set set = (Set) eVar.decodeSerializableValue(this.base);
        SnapshotStateSet<T> snapshotStateSetMutableStateSetOf = SnapshotStateKt.mutableStateSetOf();
        snapshotStateSetMutableStateSetOf.addAll(set);
        return snapshotStateSetMutableStateSetOf;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, SnapshotStateSet<T> snapshotStateSet) {
        x.f(fVar, "encoder");
        x.f(snapshotStateSet, "value");
        fVar.encodeSerializableValue(this.base, snapshotStateSet);
    }
}
