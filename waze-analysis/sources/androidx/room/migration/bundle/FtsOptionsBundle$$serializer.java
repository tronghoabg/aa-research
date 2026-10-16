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
public final /* synthetic */ class FtsOptionsBundle$$serializer implements ak<FtsOptionsBundle> {
    public static final FtsOptionsBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        FtsOptionsBundle$$serializer ftsOptionsBundle$$serializer = new FtsOptionsBundle$$serializer();
        INSTANCE = ftsOptionsBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.FtsOptionsBundle", ftsOptionsBundle$$serializer, 8);
        brVar.l("tokenizer", false);
        brVar.l("tokenizerArgs", false);
        brVar.l("contentTable", false);
        brVar.l("languageIdColumnName", false);
        brVar.l("matchInfo", false);
        brVar.l("notIndexedColumns", false);
        brVar.l("prefixSizes", false);
        brVar.l("preferredOrder", false);
        descriptor = brVar;
    }

    private FtsOptionsBundle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        f[] fVarArr = FtsOptionsBundle.$childSerializers;
        cf cfVar = cf.f51036a;
        return new b[]{cfVar, fVarArr[1].getValue(), cfVar, cfVar, cfVar, fVarArr[5].getValue(), fVarArr[6].getValue(), cfVar};
    }

    @Override // kotlinx.b.a
    public final FtsOptionsBundle deserialize(e eVar) {
        List list;
        String str;
        String str2;
        String strDecodeStringElement;
        List list2;
        List list3;
        String str3;
        int i2;
        String str4;
        int i3;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = FtsOptionsBundle.$childSerializers;
        int i4 = 7;
        int i5 = 1;
        String strDecodeStringElement2 = null;
        if (cVarBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(qVar, 0);
            list = (List) cVarBeginStructure.decodeSerializableElement(qVar, 1, (a) fVarArr[1].getValue(), null);
            String strDecodeStringElement4 = cVarBeginStructure.decodeStringElement(qVar, 2);
            String strDecodeStringElement5 = cVarBeginStructure.decodeStringElement(qVar, 3);
            String strDecodeStringElement6 = cVarBeginStructure.decodeStringElement(qVar, 4);
            List list4 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 5, (a) fVarArr[5].getValue(), null);
            list2 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 6, (a) fVarArr[6].getValue(), null);
            str3 = strDecodeStringElement3;
            strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 7);
            i2 = 255;
            str = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            str2 = strDecodeStringElement4;
            list3 = list4;
        } else {
            int i6 = 0;
            boolean z = true;
            list = null;
            List list5 = null;
            List list6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z) {
                int i7 = i5;
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = i7;
                    case 0:
                        i3 = i7;
                        strDecodeStringElement10 = cVarBeginStructure.decodeStringElement(qVar, 0);
                        i6 |= 1;
                        i5 = i3;
                        i4 = 7;
                    case 1:
                        i3 = i7;
                        list = (List) cVarBeginStructure.decodeSerializableElement(qVar, i3, (a) fVarArr[i7].getValue(), list);
                        i6 |= 2;
                        i5 = i3;
                        i4 = 7;
                    case 2:
                        strDecodeStringElement9 = cVarBeginStructure.decodeStringElement(qVar, 2);
                        i6 |= 4;
                        i5 = i7;
                    case 3:
                        strDecodeStringElement8 = cVarBeginStructure.decodeStringElement(qVar, 3);
                        i6 |= 8;
                        i5 = i7;
                    case 4:
                        strDecodeStringElement7 = cVarBeginStructure.decodeStringElement(qVar, 4);
                        i6 |= 16;
                        i5 = i7;
                    case 5:
                        list6 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 5, (a) fVarArr[5].getValue(), list6);
                        i6 |= 32;
                        i5 = i7;
                    case 6:
                        list5 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 6, (a) fVarArr[6].getValue(), list5);
                        i6 |= 64;
                        i5 = i7;
                    case 7:
                        strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, i4);
                        i6 |= 128;
                        i5 = i7;
                    default:
                        throw new r(iDecodeElementIndex);
                }
            }
            String str5 = strDecodeStringElement9;
            str = strDecodeStringElement8;
            str2 = str5;
            strDecodeStringElement = strDecodeStringElement2;
            list2 = list5;
            list3 = list6;
            str3 = strDecodeStringElement10;
            i2 = i6;
            str4 = strDecodeStringElement7;
        }
        List list7 = list;
        cVarBeginStructure.endStructure(qVar);
        return new FtsOptionsBundle(i2, str3, list7, str2, str, str4, list3, list2, strDecodeStringElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, FtsOptionsBundle ftsOptionsBundle) {
        x.f(fVar, "encoder");
        x.f(ftsOptionsBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        FtsOptionsBundle.write$Self$room_migration(ftsOptionsBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
