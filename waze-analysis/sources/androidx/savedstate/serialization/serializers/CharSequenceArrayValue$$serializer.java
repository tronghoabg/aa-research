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
public final /* synthetic */ class CharSequenceArrayValue$$serializer implements ak<CharSequenceArrayValue> {
    public static final CharSequenceArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        CharSequenceArrayValue$$serializer charSequenceArrayValue$$serializer = new CharSequenceArrayValue$$serializer();
        INSTANCE = charSequenceArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.CharSequenceArrayValue", charSequenceArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private CharSequenceArrayValue$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{CharSequenceArrayValue.$childSerializers[0].getValue()};
    }

    @Override // kotlinx.b.a
    public final CharSequenceArrayValue deserialize(e eVar) {
        String[] strArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = CharSequenceArrayValue.$childSerializers;
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
        return new CharSequenceArrayValue(i2, strArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, CharSequenceArrayValue charSequenceArrayValue) {
        x.f(fVar, "encoder");
        x.f(charSequenceArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, CharSequenceArrayValue.$childSerializers[0].getValue(), charSequenceArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
