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
public final /* synthetic */ class FtsEntityBundle$$serializer implements ak<FtsEntityBundle> {
    public static final FtsEntityBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        FtsEntityBundle$$serializer ftsEntityBundle$$serializer = new FtsEntityBundle$$serializer();
        INSTANCE = ftsEntityBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.FtsEntityBundle", ftsEntityBundle$$serializer, 9);
        brVar.l("tableName", false);
        brVar.l("createSql", false);
        brVar.l("fields", false);
        brVar.l("primaryKey", false);
        brVar.l("indices", true);
        brVar.l("foreignKeys", true);
        brVar.l("ftsVersion", false);
        brVar.l("ftsOptions", false);
        brVar.l("contentSyncTriggers", false);
        descriptor = brVar;
    }

    private FtsEntityBundle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        f[] fVarArr = FtsEntityBundle.$childSerializers;
        cf cfVar = cf.f51036a;
        return new b[]{cfVar, cfVar, fVarArr[2].getValue(), PrimaryKeyBundle$$serializer.INSTANCE, fVarArr[4].getValue(), fVarArr[5].getValue(), cfVar, FtsOptionsBundle$$serializer.INSTANCE, fVarArr[8].getValue()};
    }

    @Override // kotlinx.b.a
    public final FtsEntityBundle deserialize(e eVar) {
        PrimaryKeyBundle primaryKeyBundle;
        String strDecodeStringElement;
        int i2;
        List list;
        List list2;
        FtsOptionsBundle ftsOptionsBundle;
        List list3;
        List list4;
        String str;
        String str2;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = FtsEntityBundle.$childSerializers;
        int i3 = 7;
        int i4 = 6;
        List list5 = null;
        if (cVarBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, 0);
            String strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(qVar, 1);
            List list6 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 2, (a) fVarArr[2].getValue(), null);
            PrimaryKeyBundle primaryKeyBundle2 = (PrimaryKeyBundle) cVarBeginStructure.decodeSerializableElement(qVar, 3, PrimaryKeyBundle$$serializer.INSTANCE, null);
            List list7 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), null);
            List list8 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 5, (a) fVarArr[5].getValue(), null);
            String strDecodeStringElement4 = cVarBeginStructure.decodeStringElement(qVar, 6);
            FtsOptionsBundle ftsOptionsBundle2 = (FtsOptionsBundle) cVarBeginStructure.decodeSerializableElement(qVar, 7, FtsOptionsBundle$$serializer.INSTANCE, null);
            list2 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 8, (a) fVarArr[8].getValue(), null);
            ftsOptionsBundle = ftsOptionsBundle2;
            strDecodeStringElement = strDecodeStringElement4;
            primaryKeyBundle = primaryKeyBundle2;
            list4 = list8;
            list3 = list7;
            i2 = 511;
            list = list6;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 2;
            List list9 = null;
            List list10 = null;
            primaryKeyBundle = null;
            FtsOptionsBundle ftsOptionsBundle3 = null;
            strDecodeStringElement = null;
            List list11 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        i4 = 6;
                        i6 = 2;
                    case 0:
                        strDecodeStringElement6 = cVarBeginStructure.decodeStringElement(qVar, 0);
                        i5 |= 1;
                        i3 = 7;
                        i4 = 6;
                        i6 = 2;
                    case 1:
                        strDecodeStringElement5 = cVarBeginStructure.decodeStringElement(qVar, 1);
                        i5 |= 2;
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        list11 = (List) cVarBeginStructure.decodeSerializableElement(qVar, i6, (a) fVarArr[i6].getValue(), list11);
                        i5 |= 4;
                        i3 = 7;
                        i4 = 6;
                    case 3:
                        primaryKeyBundle = (PrimaryKeyBundle) cVarBeginStructure.decodeSerializableElement(qVar, 3, PrimaryKeyBundle$$serializer.INSTANCE, primaryKeyBundle);
                        i5 |= 8;
                        i3 = 7;
                    case 4:
                        list9 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), list9);
                        i5 |= 16;
                    case 5:
                        list10 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 5, (a) fVarArr[5].getValue(), list10);
                        i5 |= 32;
                    case 6:
                        strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, i4);
                        i5 |= 64;
                    case 7:
                        ftsOptionsBundle3 = (FtsOptionsBundle) cVarBeginStructure.decodeSerializableElement(qVar, i3, FtsOptionsBundle$$serializer.INSTANCE, ftsOptionsBundle3);
                        i5 |= 128;
                    case 8:
                        list5 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 8, (a) fVarArr[8].getValue(), list5);
                        i5 |= 256;
                    default:
                        throw new r(iDecodeElementIndex);
                }
            }
            i2 = i5;
            list = list11;
            list2 = list5;
            ftsOptionsBundle = ftsOptionsBundle3;
            list3 = list9;
            list4 = list10;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
        }
        cVarBeginStructure.endStructure(qVar);
        return new FtsEntityBundle(i2, str2, str, list, primaryKeyBundle, list3, list4, strDecodeStringElement, ftsOptionsBundle, list2, (ca) null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, FtsEntityBundle ftsEntityBundle) {
        x.f(fVar, "encoder");
        x.f(ftsEntityBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        FtsEntityBundle.write$Self$room_migration(ftsEntityBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
