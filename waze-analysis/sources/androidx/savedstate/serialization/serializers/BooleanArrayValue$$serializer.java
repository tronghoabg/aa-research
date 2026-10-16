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
import kotlinx.b.c.g;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class BooleanArrayValue$$serializer implements ak<BooleanArrayValue> {
    public static final BooleanArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        BooleanArrayValue$$serializer booleanArrayValue$$serializer = new BooleanArrayValue$$serializer();
        INSTANCE = booleanArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.BooleanArrayValue", booleanArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private BooleanArrayValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{g.f51077a};
    }

    @Override // kotlinx.b.a
    public final BooleanArrayValue deserialize(e eVar) {
        boolean[] zArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            zArr = (boolean[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, g.f51077a, null);
        } else {
            boolean z = true;
            zArr = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    zArr = (boolean[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, g.f51077a, zArr);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new BooleanArrayValue(i2, zArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, BooleanArrayValue booleanArrayValue) {
        x.f(fVar, "encoder");
        x.f(booleanArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, g.f51077a, booleanArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
