package androidx.room.migration.bundle;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ak;
import kotlinx.b.c.as;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class SchemaBundle$$serializer implements ak<SchemaBundle> {
    public static final SchemaBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        SchemaBundle$$serializer schemaBundle$$serializer = new SchemaBundle$$serializer();
        INSTANCE = schemaBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.SchemaBundle", schemaBundle$$serializer, 2);
        brVar.l("formatVersion", false);
        brVar.l("database", false);
        descriptor = brVar;
    }

    private SchemaBundle$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{as.f50970a, DatabaseBundle$$serializer.INSTANCE};
    }

    @Override // kotlinx.b.a
    public final SchemaBundle deserialize(e eVar) {
        int iDecodeIntElement;
        DatabaseBundle databaseBundle;
        int i2;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        if (cVarBeginStructure.decodeSequentially()) {
            iDecodeIntElement = cVarBeginStructure.decodeIntElement(qVar, 0);
            databaseBundle = (DatabaseBundle) cVarBeginStructure.decodeSerializableElement(qVar, 1, DatabaseBundle$$serializer.INSTANCE, null);
            i2 = 3;
        } else {
            DatabaseBundle databaseBundle2 = null;
            boolean z = true;
            iDecodeIntElement = 0;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = cVarBeginStructure.decodeIntElement(qVar, 0);
                    i3 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new r(iDecodeElementIndex);
                    }
                    databaseBundle2 = (DatabaseBundle) cVarBeginStructure.decodeSerializableElement(qVar, 1, DatabaseBundle$$serializer.INSTANCE, databaseBundle2);
                    i3 |= 2;
                }
            }
            databaseBundle = databaseBundle2;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new SchemaBundle(i2, iDecodeIntElement, databaseBundle, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, SchemaBundle schemaBundle) {
        x.f(fVar, "encoder");
        x.f(schemaBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        SchemaBundle.write$Self$room_migration(schemaBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
