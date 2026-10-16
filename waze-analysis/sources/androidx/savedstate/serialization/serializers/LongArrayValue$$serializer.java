package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ak;
import kotlinx.b.c.ba;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class LongArrayValue$$serializer implements ak<LongArrayValue> {
    public static final LongArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        LongArrayValue$$serializer longArrayValue$$serializer = new LongArrayValue$$serializer();
        INSTANCE = longArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.LongArrayValue", longArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private LongArrayValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{ba.f50980a};
    }

    @Override // kotlinx.b.a
    public final LongArrayValue deserialize(e eVar) {
        long[] jArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            jArr = (long[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ba.f50980a, null);
        } else {
            boolean z = true;
            jArr = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    jArr = (long[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, ba.f50980a, jArr);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new LongArrayValue(i2, jArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, LongArrayValue longArrayValue) {
        x.f(fVar, "encoder");
        x.f(longArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, ba.f50980a, longArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
