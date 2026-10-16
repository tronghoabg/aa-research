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
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.c.h;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class FieldBundle$$serializer implements ak<FieldBundle> {
    public static final FieldBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        FieldBundle$$serializer fieldBundle$$serializer = new FieldBundle$$serializer();
        INSTANCE = fieldBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.FieldBundle", fieldBundle$$serializer, 5);
        brVar.l("fieldPath", false);
        brVar.l("columnName", false);
        brVar.l("affinity", false);
        brVar.l("notNull", true);
        brVar.l("defaultValue", true);
        descriptor = brVar;
    }

    private FieldBundle$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        cf cfVar = cf.f51036a;
        return new b[]{cfVar, cfVar, cfVar, h.f51078a, kotlinx.b.a.b.l(cfVar)};
    }

    @Override // kotlinx.b.a
    public final FieldBundle deserialize(e eVar) {
        boolean zDecodeBooleanElement;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        if (cVarBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 0);
            String strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(qVar, 1);
            String strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(qVar, 2);
            str4 = strDecodeStringElement;
            zDecodeBooleanElement = cVarBeginStructure.decodeBooleanElement(qVar, 3);
            str = (String) cVarBeginStructure.decodeNullableSerializableElement(qVar, 4, cf.f51036a, null);
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            i2 = 31;
        } else {
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            String str5 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i3 = 0;
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
                    zDecodeBooleanElement2 = cVarBeginStructure.decodeBooleanElement(qVar, 3);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new r(iDecodeElementIndex);
                    }
                    str5 = (String) cVarBeginStructure.decodeNullableSerializableElement(qVar, 4, cf.f51036a, str5);
                    i3 |= 16;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i2 = i3;
            str = str5;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        cVarBeginStructure.endStructure(qVar);
        return new FieldBundle(i2, str4, str3, str2, zDecodeBooleanElement, str, (ca) null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, FieldBundle fieldBundle) {
        x.f(fVar, "encoder");
        x.f(fieldBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        FieldBundle.write$Self$room_migration(fieldBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
