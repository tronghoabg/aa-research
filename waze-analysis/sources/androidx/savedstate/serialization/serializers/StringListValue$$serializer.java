package androidx.savedstate.serialization.serializers;

import h.f;
import h.g.b.x;
import java.util.List;
import kotlinx.b.a;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class StringListValue$$serializer implements ak<StringListValue> {
    public static final StringListValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        StringListValue$$serializer stringListValue$$serializer = new StringListValue$$serializer();
        INSTANCE = stringListValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.StringListValue", stringListValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private StringListValue$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{StringListValue.$childSerializers[0].getValue()};
    }

    @Override // kotlinx.b.a
    public final StringListValue deserialize(e eVar) {
        List list;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = StringListValue.$childSerializers;
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            list = (List) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), null);
        } else {
            boolean z = true;
            List list2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    list2 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), list2);
                    i3 = 1;
                }
            }
            list = list2;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new StringListValue(i2, list, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, StringListValue stringListValue) {
        x.f(fVar, "encoder");
        x.f(stringListValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, StringListValue.$childSerializers[0].getValue(), stringListValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
