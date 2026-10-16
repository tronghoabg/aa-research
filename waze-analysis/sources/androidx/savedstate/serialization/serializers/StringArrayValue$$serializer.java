package androidx.savedstate.serialization.serializers;

import h.f;
import h.g.b.x;
import kotlinx.b.a;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class StringArrayValue$$serializer implements ak<StringArrayValue> {
    public static final StringArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        StringArrayValue$$serializer stringArrayValue$$serializer = new StringArrayValue$$serializer();
        INSTANCE = stringArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.StringArrayValue", stringArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private StringArrayValue$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{StringArrayValue.$childSerializers[0].getValue()};
    }

    @Override // kotlinx.b.a
    public final StringArrayValue deserialize(e eVar) {
        String[] strArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = StringArrayValue.$childSerializers;
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            strArr = (String[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), null);
        } else {
            boolean z = true;
            String[] strArr2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    strArr2 = (String[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), strArr2);
                    i3 = 1;
                }
            }
            strArr = strArr2;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new StringArrayValue(i2, strArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, StringArrayValue stringArrayValue) {
        x.f(fVar, "encoder");
        x.f(stringArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, StringArrayValue.$childSerializers[0].getValue(), stringArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
