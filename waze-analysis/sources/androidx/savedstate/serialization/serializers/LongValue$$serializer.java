package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ak;
import kotlinx.b.c.bb;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class LongValue$$serializer implements ak<LongValue> {
    public static final LongValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        LongValue$$serializer longValue$$serializer = new LongValue$$serializer();
        INSTANCE = longValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.LongValue", longValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private LongValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{bb.f50981a};
    }

    @Override // kotlinx.b.a
    public final LongValue deserialize(e eVar) {
        long jDecodeLongElement;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            jDecodeLongElement = cVarBeginStructure.decodeLongElement(qVar, 0);
        } else {
            long jDecodeLongElement2 = 0;
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
                    jDecodeLongElement2 = cVarBeginStructure.decodeLongElement(qVar, 0);
                    i3 = 1;
                }
            }
            jDecodeLongElement = jDecodeLongElement2;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new LongValue(i2, jDecodeLongElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, LongValue longValue) {
        x.f(fVar, "encoder");
        x.f(longValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeLongElement(qVar, 0, longValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
