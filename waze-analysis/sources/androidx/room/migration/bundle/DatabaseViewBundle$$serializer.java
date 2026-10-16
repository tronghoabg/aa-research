package androidx.room.migration.bundle;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.c.cf;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class DatabaseViewBundle$$serializer implements ak<DatabaseViewBundle> {
    public static final DatabaseViewBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        DatabaseViewBundle$$serializer databaseViewBundle$$serializer = new DatabaseViewBundle$$serializer();
        INSTANCE = databaseViewBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.DatabaseViewBundle", databaseViewBundle$$serializer, 2);
        brVar.l("viewName", false);
        brVar.l("createSql", false);
        descriptor = brVar;
    }

    private DatabaseViewBundle$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        cf cfVar = cf.f51036a;
        return new b[]{cfVar, cfVar};
    }

    @Override // kotlinx.b.a
    public final DatabaseViewBundle deserialize(e eVar) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i2;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        if (cVarBeginStructure.decodeSequentially()) {
            strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 0);
            strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, 1);
            i2 = 3;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 0);
                    i3 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new r(iDecodeElementIndex);
                    }
                    strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(qVar, 1);
                    i3 |= 2;
                }
            }
            strDecodeStringElement2 = strDecodeStringElement3;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new DatabaseViewBundle(i2, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, DatabaseViewBundle databaseViewBundle) {
        x.f(fVar, "encoder");
        x.f(databaseViewBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        DatabaseViewBundle.write$Self$room_migration(databaseViewBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
