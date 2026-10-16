package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ak;
import kotlinx.b.c.ar;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class IntArrayValue$$serializer implements ak<IntArrayValue> {
    public static final IntArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        IntArrayValue$$serializer intArrayValue$$serializer = new IntArrayValue$$serializer();
        INSTANCE = intArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.IntArrayValue", intArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private IntArrayValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{ar.f50969a};
    }

    @Override // kotlinx.b.a
    public final IntArrayValue deserialize(e eVar) {
        int[] iArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            iArr = (int[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ar.f50969a, null);
        } else {
            boolean z = true;
            iArr = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    iArr = (int[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ar.f50969a, iArr);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new IntArrayValue(i2, iArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, IntArrayValue intArrayValue) {
        x.f(fVar, "encoder");
        x.f(intArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, ar.f50969a, intArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
