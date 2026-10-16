package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
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
import kotlinx.b.c.ca;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class SavedStateValue$$serializer implements ak<SavedStateValue> {
    public static final SavedStateValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        SavedStateValue$$serializer savedStateValue$$serializer = new SavedStateValue$$serializer();
        INSTANCE = savedStateValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.SavedStateValue", savedStateValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private SavedStateValue$$serializer() {
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{SavedStateSerializer.INSTANCE};
    }

    @Override // kotlinx.b.a
    public final SavedStateValue deserialize(e eVar) {
        Bundle bundle;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        int i2 = 1;
        ca caVar = null;
        if (cVarBeginStructure.decodeSequentially()) {
            bundle = (Bundle) cVarBeginStructure.decodeSerializableElement(qVar, 0, SavedStateSerializer.INSTANCE, null);
        } else {
            boolean z = true;
            bundle = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    bundle = (Bundle) cVarBeginStructure.decodeSerializableElement(qVar, 0, SavedStateSerializer.INSTANCE, bundle);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new SavedStateValue(i2, bundle, caVar);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, SavedStateValue savedStateValue) {
        x.f(fVar, "encoder");
        x.f(savedStateValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, SavedStateSerializer.INSTANCE, savedStateValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
