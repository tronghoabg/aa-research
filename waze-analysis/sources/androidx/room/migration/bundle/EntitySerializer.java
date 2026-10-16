package androidx.room.migration.bundle;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import kotlinx.b.a;
import kotlinx.b.d.i;
import kotlinx.b.d.k;
import kotlinx.b.d.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class EntitySerializer extends i<BaseEntityBundle> {
    public static final EntitySerializer INSTANCE = new EntitySerializer();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EntitySerializer() {
        super(new m(BaseEntityBundle.class));
        int i2 = ar.f48106a;
    }

    @Override // kotlinx.b.d.i
    protected a<BaseEntityBundle> selectDeserializer(k kVar) {
        x.f(kVar, "element");
        return l.d(kVar).containsKey("ftsVersion") ? FtsEntityBundle.Companion.serializer() : EntityBundle.Companion.serializer();
    }
}
