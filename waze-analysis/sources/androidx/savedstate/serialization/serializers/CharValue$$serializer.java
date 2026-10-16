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
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class CharValue$$serializer implements ak<CharValue> {
    public static final CharValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        CharValue$$serializer charValue$$serializer = new CharValue$$serializer();
        INSTANCE = charValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.CharValue", charValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private CharValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{kotlinx.b.c.q.f51090a};
    }

    @Override // kotlinx.b.a
    public final CharValue deserialize(e eVar) {
        char cDecodeCharElement;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            cDecodeCharElement = cVarBeginStructure.decodeCharElement(qVar, 0);
        } else {
            boolean z = true;
            cDecodeCharElement = 0;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    cDecodeCharElement = cVarBeginStructure.decodeCharElement(qVar, 0);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new CharValue(i2, cDecodeCharElement, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, CharValue charValue) {
        x.f(fVar, "encoder");
        x.f(charValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeCharElement(qVar, 0, charValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
