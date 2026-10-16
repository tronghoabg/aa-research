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
import kotlinx.b.c.cf;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ForeignKeyBundle$$serializer implements ak<ForeignKeyBundle> {
    public static final ForeignKeyBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        ForeignKeyBundle$$serializer foreignKeyBundle$$serializer = new ForeignKeyBundle$$serializer();
        INSTANCE = foreignKeyBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.ForeignKeyBundle", foreignKeyBundle$$serializer, 5);
        brVar.l("table", false);
        brVar.l("onDelete", false);
        brVar.l("onUpdate", false);
        brVar.l("columns", false);
        brVar.l("referencedColumns", false);
        descriptor = brVar;
    }

    private ForeignKeyBundle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        f[] fVarArr = ForeignKeyBundle.$childSerializers;
        cf cfVar = cf.f51036a;
        return new b[]{cfVar, cfVar, cfVar, fVarArr[3].getValue(), fVarArr[4].getValue()};
    }

    @Override // kotlinx.b.a
    public final ForeignKeyBundle deserialize(e eVar) {
        int i2;
        List list;
        List list2;
        String str;
        String str2;
        String str3;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = ForeignKeyBundle.$childSerializers;
        List list3 = null;
        if (cVarBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 0);
            String strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, 1);
            String strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(qVar, 2);
            List list4 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 3, (a) fVarArr[3].getValue(), null);
            list = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), null);
            str3 = strDecodeStringElement;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            list2 = list4;
            i2 = 31;
        } else {
            int i3 = 0;
            boolean z = true;
            List list5 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement6 = cVarBeginStructure.decodeStringElement(qVar, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = cVarBeginStructure.decodeStringElement(qVar, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement4 = cVarBeginStructure.decodeStringElement(qVar, 2);
                    i3 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list5 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 3, (a) fVarArr[3].getValue(), list5);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new r(iDecodeElementIndex);
                    }
                    list3 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 4, (a) fVarArr[4].getValue(), list3);
                    i3 |= 16;
                }
            }
            i2 = i3;
            list = list3;
            list2 = list5;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        cVarBeginStructure.endStructure(qVar);
        return new ForeignKeyBundle(i2, str3, str2, str, list2, list, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, ForeignKeyBundle foreignKeyBundle) {
        x.f(fVar, "encoder");
        x.f(foreignKeyBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        ForeignKeyBundle.write$Self$room_migration(foreignKeyBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
