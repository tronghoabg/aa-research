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
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class EntityBundle$$serializer implements ak<EntityBundle> {
    public static final EntityBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        EntityBundle$$serializer entityBundle$$serializer = new EntityBundle$$serializer();
        INSTANCE = entityBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.EntityBundle", entityBundle$$serializer, 6);
        brVar.l("tableName", false);
        brVar.l("createSql", false);
        brVar.l("fields", false);
        brVar.l("primaryKey", false);
        brVar.l("indices", true);
        brVar.l("foreignKeys", true);
        descriptor = brVar;
    }

    private EntityBundle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        f[] fVarArr = EntityBundle.$childSerializers;
        cf cfVar = cf.f51036a;
        return new b[]{cfVar, cfVar, fVarArr[2].getValue(), PrimaryKeyBundle$$serializer.INSTANCE, fVarArr[4].getValue(), fVarArr[5].getValue()};
    }

    @Override // kotlinx.b.a
    public final EntityBundle deserialize(e eVar) {
        List list;
        String str;
        List list2;
        String str2;
        PrimaryKeyBundle primaryKeyBundle;
        List list3;
        int i2;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = EntityBundle.$childSerializers;
        List list4 = null;
        if (cVarBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 0);
            String strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, 1);
            List list5 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 2, (a) fVarArr[2].getValue(), null);
            PrimaryKeyBundle primaryKeyBundle2 = (PrimaryKeyBundle) cVarBeginStructure.decodeSerializableElement(qVar, 3, PrimaryKeyBundle$$serializer.INSTANCE, null);
            List list6 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), null);
            list = (List) cVarBeginStructure.decodeSerializableElement(qVar, 5, (a) fVarArr[5].getValue(), null);
            str = strDecodeStringElement;
            primaryKeyBundle = primaryKeyBundle2;
            i2 = 63;
            str2 = strDecodeStringElement2;
            list3 = list5;
            list2 = list6;
        } else {
            boolean z = true;
            int i3 = 0;
            List list7 = null;
            PrimaryKeyBundle primaryKeyBundle3 = null;
            List list8 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement4 = cVarBeginStructure.decodeStringElement(qVar, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(qVar, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        list8 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 2, (a) fVarArr[2].getValue(), list8);
                        i3 |= 4;
                        break;
                    case 3:
                        primaryKeyBundle3 = (PrimaryKeyBundle) cVarBeginStructure.decodeSerializableElement(qVar, 3, PrimaryKeyBundle$$serializer.INSTANCE, primaryKeyBundle3);
                        i3 |= 8;
                        break;
                    case 4:
                        list7 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), list7);
                        i3 |= 16;
                        break;
                    case 5:
                        list4 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 5, (a) fVarArr[5].getValue(), list4);
                        i3 |= 32;
                        break;
                    default:
                        throw new r(iDecodeElementIndex);
                }
            }
            String str3 = strDecodeStringElement4;
            list = list4;
            str = str3;
            String str4 = strDecodeStringElement3;
            list2 = list7;
            str2 = str4;
            List list9 = list8;
            primaryKeyBundle = primaryKeyBundle3;
            list3 = list9;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new EntityBundle(i2, str, str2, list3, primaryKeyBundle, list2, list, (ca) null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, EntityBundle entityBundle) {
        x.f(fVar, "encoder");
        x.f(entityBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        EntityBundle.write$Self(entityBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
