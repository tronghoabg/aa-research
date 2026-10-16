package androidx.room.migration.bundle;

import androidx.autofill.HintConstants;
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
import kotlinx.b.c.h;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class IndexBundle$$serializer implements ak<IndexBundle> {
    public static final IndexBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        IndexBundle$$serializer indexBundle$$serializer = new IndexBundle$$serializer();
        INSTANCE = indexBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.IndexBundle", indexBundle$$serializer, 5);
        brVar.l(HintConstants.AUTOFILL_HINT_NAME, false);
        brVar.l("unique", false);
        brVar.l("columnNames", true);
        brVar.l("orders", true);
        brVar.l("createSql", false);
        descriptor = brVar;
    }

    private IndexBundle$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        f[] fVarArr = IndexBundle.$childSerializers;
        cf cfVar = cf.f51036a;
        return new b[]{cfVar, h.f51078a, kotlinx.b.a.b.l((b) fVarArr[2].getValue()), kotlinx.b.a.b.l((b) fVarArr[3].getValue()), cfVar};
    }

    @Override // kotlinx.b.a
    public final IndexBundle deserialize(e eVar) {
        int i2;
        boolean z;
        String strDecodeStringElement;
        List list;
        List list2;
        String str;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = IndexBundle.$childSerializers;
        if (cVarBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, 0);
            boolean zDecodeBooleanElement = cVarBeginStructure.decodeBooleanElement(qVar, 1);
            List list3 = (List) cVarBeginStructure.decodeNullableSerializableElement(qVar, 2, (a) fVarArr[2].getValue(), null);
            list = (List) cVarBeginStructure.decodeNullableSerializableElement(qVar, 3, (a) fVarArr[3].getValue(), null);
            str = strDecodeStringElement2;
            strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 4);
            i2 = 31;
            z = zDecodeBooleanElement;
            list2 = list3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String strDecodeStringElement3 = null;
            List list4 = null;
            List list5 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = cVarBeginStructure.decodeStringElement(qVar, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement2 = cVarBeginStructure.decodeBooleanElement(qVar, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list5 = (List) cVarBeginStructure.decodeNullableSerializableElement(qVar, 2, (a) fVarArr[2].getValue(), list5);
                    i3 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list4 = (List) cVarBeginStructure.decodeNullableSerializableElement(qVar, 3, (a) fVarArr[3].getValue(), list4);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new r(iDecodeElementIndex);
                    }
                    strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(qVar, 4);
                    i3 |= 16;
                }
            }
            i2 = i3;
            z = zDecodeBooleanElement2;
            strDecodeStringElement = strDecodeStringElement3;
            list = list4;
            list2 = list5;
            str = strDecodeStringElement4;
        }
        cVarBeginStructure.endStructure(qVar);
        return new IndexBundle(i2, str, z, list2, list, strDecodeStringElement, (ca) null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, IndexBundle indexBundle) {
        x.f(fVar, "encoder");
        x.f(indexBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        IndexBundle.write$Self$room_migration(indexBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
