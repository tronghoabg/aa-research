package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ai;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class FloatArrayValue$$serializer implements ak<FloatArrayValue> {
    public static final FloatArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        FloatArrayValue$$serializer floatArrayValue$$serializer = new FloatArrayValue$$serializer();
        INSTANCE = floatArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.FloatArrayValue", floatArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private FloatArrayValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{ai.f50960a};
    }

    @Override // kotlinx.b.a
    public final FloatArrayValue deserialize(e eVar) {
        float[] fArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            fArr = (float[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ai.f50960a, null);
        } else {
            boolean z = true;
            fArr = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    fArr = (float[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ai.f50960a, fArr);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new FloatArrayValue(i2, fArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, FloatArrayValue floatArrayValue) {
        x.f(fVar, "encoder");
        x.f(floatArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, ai.f50960a, floatArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
