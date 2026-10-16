package androidx.savedstate.serialization.serializers;

import androidx.camera.video.AudioStats;
import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ac;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class DoubleValue$$serializer implements ak<DoubleValue> {
    public static final DoubleValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        DoubleValue$$serializer doubleValue$$serializer = new DoubleValue$$serializer();
        INSTANCE = doubleValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.DoubleValue", doubleValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private DoubleValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{ac.f50946a};
    }

    @Override // kotlinx.b.a
    public final DoubleValue deserialize(e eVar) {
        double dDecodeDoubleElement;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            dDecodeDoubleElement = cVarBeginStructure.decodeDoubleElement(qVar, 0);
        } else {
            double dDecodeDoubleElement2 = AudioStats.AUDIO_AMPLITUDE_NONE;
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
                    dDecodeDoubleElement2 = cVarBeginStructure.decodeDoubleElement(qVar, 0);
                    i3 = 1;
                }
            }
            dDecodeDoubleElement = dDecodeDoubleElement2;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new DoubleValue(i2, dDecodeDoubleElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, DoubleValue doubleValue) {
        x.f(fVar, "encoder");
        x.f(doubleValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeDoubleElement(qVar, 0, doubleValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
