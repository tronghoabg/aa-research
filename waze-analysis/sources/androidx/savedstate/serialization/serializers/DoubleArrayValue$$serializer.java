package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ab;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class DoubleArrayValue$$serializer implements ak<DoubleArrayValue> {
    public static final DoubleArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        DoubleArrayValue$$serializer doubleArrayValue$$serializer = new DoubleArrayValue$$serializer();
        INSTANCE = doubleArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.DoubleArrayValue", doubleArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private DoubleArrayValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{ab.f50945a};
    }

    @Override // kotlinx.b.a
    public final DoubleArrayValue deserialize(e eVar) {
        double[] dArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            dArr = (double[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ab.f50945a, null);
        } else {
            boolean z = true;
            dArr = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    dArr = (double[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ab.f50945a, dArr);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new DoubleArrayValue(i2, dArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, DoubleArrayValue doubleArrayValue) {
        x.f(fVar, "encoder");
        x.f(doubleArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, ab.f50945a, doubleArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
