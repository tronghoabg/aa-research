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
import kotlinx.b.c.p;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class CharArrayValue$$serializer implements ak<CharArrayValue> {
    public static final CharArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        CharArrayValue$$serializer charArrayValue$$serializer = new CharArrayValue$$serializer();
        INSTANCE = charArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.CharArrayValue", charArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private CharArrayValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{p.f51089a};
    }

    @Override // kotlinx.b.a
    public final CharArrayValue deserialize(e eVar) {
        char[] cArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            cArr = (char[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, p.f51089a, null);
        } else {
            boolean z = true;
            cArr = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    cArr = (char[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, p.f51089a, cArr);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new CharArrayValue(i2, cArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, CharArrayValue charArrayValue) {
        x.f(fVar, "encoder");
        x.f(charArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, p.f51089a, charArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
