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
import kotlinx.b.c.cf;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class StringValue$$serializer implements ak<StringValue> {
    public static final StringValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        StringValue$$serializer stringValue$$serializer = new StringValue$$serializer();
        INSTANCE = stringValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.StringValue", stringValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private StringValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{cf.f51036a};
    }

    @Override // kotlinx.b.a
    public final StringValue deserialize(e eVar) {
        String strDecodeStringElement;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 0);
        } else {
            strDecodeStringElement = null;
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
                    strDecodeStringElement = cVarBeginStructure.decodeStringElement(qVar, 0);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new StringValue(i2, strDecodeStringElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, StringValue stringValue) {
        x.f(fVar, "encoder");
        x.f(stringValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeStringElement(qVar, 0, stringValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
