package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.aj;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class FloatValue$$serializer implements ak<FloatValue> {
    public static final FloatValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        FloatValue$$serializer floatValue$$serializer = new FloatValue$$serializer();
        INSTANCE = floatValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.FloatValue", floatValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private FloatValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{aj.f50961a};
    }

    @Override // kotlinx.b.a
    public final FloatValue deserialize(e eVar) {
        float fDecodeFloatElement;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            fDecodeFloatElement = cVarBeginStructure.decodeFloatElement(qVar, 0);
        } else {
            fDecodeFloatElement = 0.0f;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    fDecodeFloatElement = cVarBeginStructure.decodeFloatElement(qVar, 0);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new FloatValue(i2, fDecodeFloatElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, FloatValue floatValue) {
        x.f(fVar, "encoder");
        x.f(floatValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeFloatElement(qVar, 0, floatValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
