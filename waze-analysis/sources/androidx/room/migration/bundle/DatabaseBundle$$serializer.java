package androidx.room.migration.bundle;

import h.f;
import h.g.b.x;
import java.util.List;
import kotlinx.b.a;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.c.ak;
import kotlinx.b.c.as;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class DatabaseBundle$$serializer implements ak<DatabaseBundle> {
    public static final DatabaseBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        DatabaseBundle$$serializer databaseBundle$$serializer = new DatabaseBundle$$serializer();
        INSTANCE = databaseBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.DatabaseBundle", databaseBundle$$serializer, 5);
        brVar.l("version", false);
        brVar.l("identityHash", false);
        brVar.l("entities", false);
        brVar.l("views", true);
        brVar.l("setupQueries", false);
        descriptor = brVar;
    }

    private DatabaseBundle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        f[] fVarArr = DatabaseBundle.$childSerializers;
        return new b[]{as.f50970a, cf.f51036a, fVarArr[2].getValue(), fVarArr[3].getValue(), fVarArr[4].getValue()};
    }

    @Override // kotlinx.b.a
    public final DatabaseBundle deserialize(e eVar) {
        int iDecodeIntElement;
        int i2;
        List list;
        List list2;
        List list3;
        String str;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = DatabaseBundle.$childSerializers;
        if (cVarBeginStructure.decodeSequentially()) {
            iDecodeIntElement = cVarBeginStructure.decodeIntElement(qVar, 0);
            String strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 1);
            List list4 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 2, (a) fVarArr[2].getValue(), null);
            List list5 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 3, (a) fVarArr[3].getValue(), null);
            list = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), null);
            list2 = list5;
            str = strDecodeStringElement;
            list3 = list4;
            i2 = 31;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            List list6 = null;
            List list7 = null;
            List list8 = null;
            String strDecodeStringElement2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = cVarBeginStructure.decodeIntElement(qVar, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list8 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 2, (a) fVarArr[2].getValue(), list8);
                    i3 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list7 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 3, (a) fVarArr[3].getValue(), list7);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new r(iDecodeElementIndex);
                    }
                    list6 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), list6);
                    i3 |= 16;
                }
            }
            i2 = i3;
            list = list6;
            list2 = list7;
            list3 = list8;
            str = strDecodeStringElement2;
        }
        int i4 = iDecodeIntElement;
        cVarBeginStructure.endStructure(qVar);
        return new DatabaseBundle(i2, i4, str, list3, list2, list, (ca) null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, DatabaseBundle databaseBundle) {
        x.f(fVar, "encoder");
        x.f(databaseBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        DatabaseBundle.write$Self$room_migration(databaseBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
