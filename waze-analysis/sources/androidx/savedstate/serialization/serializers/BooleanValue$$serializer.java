package androidx.savedstate.serialization.serializers;

import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.c.h;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class BooleanValue$$serializer implements ak<BooleanValue> {
    public static final BooleanValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        BooleanValue$$serializer booleanValue$$serializer = new BooleanValue$$serializer();
        INSTANCE = booleanValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.BooleanValue", booleanValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private BooleanValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{h.f51078a};
    }

    @Override // kotlinx.b.a
    public final BooleanValue deserialize(e eVar) {
        boolean zDecodeBooleanElement;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = cVarBeginStructure.decodeBooleanElement(qVar, 0);
        } else {
            boolean z = true;
            zDecodeBooleanElement = false;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement = cVarBeginStructure.decodeBooleanElement(qVar, 0);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new BooleanValue(i2, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, BooleanValue booleanValue) {
        x.f(fVar, "encoder");
        x.f(booleanValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeBooleanElement(qVar, 0, booleanValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
