package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ak;
import kotlinx.b.c.as;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class IntValue$$serializer implements ak<IntValue> {
    public static final IntValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        IntValue$$serializer intValue$$serializer = new IntValue$$serializer();
        INSTANCE = intValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.IntValue", intValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private IntValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{as.f50970a};
    }

    @Override // kotlinx.b.a
    public final IntValue deserialize(e eVar) {
        int iDecodeIntElement;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            iDecodeIntElement = cVarBeginStructure.decodeIntElement(qVar, 0);
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    iDecodeIntElement = cVarBeginStructure.decodeIntElement(qVar, 0);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new IntValue(i2, iDecodeIntElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, IntValue intValue) {
        x.f(fVar, "encoder");
        x.f(intValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeIntElement(qVar, 0, intValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
