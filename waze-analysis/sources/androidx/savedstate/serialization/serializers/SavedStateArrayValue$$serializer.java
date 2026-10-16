package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import h.f;
import h.g.b.x;
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
public final /* synthetic */ class SavedStateArrayValue$$serializer implements ak<SavedStateArrayValue> {
    public static final SavedStateArrayValue$$serializer INSTANCE;
    private static final q descriptor;

    static {
        SavedStateArrayValue$$serializer savedStateArrayValue$$serializer = new SavedStateArrayValue$$serializer();
        INSTANCE = savedStateArrayValue$$serializer;
        br brVar = new br("androidx.savedstate.serialization.serializers.SavedStateArrayValue", savedStateArrayValue$$serializer, 1);
        brVar.l("value", false);
        descriptor = brVar;
    }

    private SavedStateArrayValue$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{SavedStateArrayValue.$childSerializers[0].getValue()};
    }

    @Override // kotlinx.b.a
    public final SavedStateArrayValue deserialize(e eVar) {
        Bundle[] bundleArr;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = SavedStateArrayValue.$childSerializers;
        int i2 = 1;
        if (cVarBeginStructure.decodeSequentially()) {
            bundleArr = (Bundle[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), null);
        } else {
            boolean z = true;
            Bundle[] bundleArr2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new r(iDecodeElementIndex);
                    }
                    bundleArr2 = (Bundle[]) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), bundleArr2);
                    i3 = 1;
                }
            }
            bundleArr = bundleArr2;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new SavedStateArrayValue(i2, bundleArr, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, SavedStateArrayValue savedStateArrayValue) {
        x.f(fVar, "encoder");
        x.f(savedStateArrayValue, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        dVarBeginStructure.encodeSerializableElement(qVar, 0, SavedStateArrayValue.$childSerializers[0].getValue(), savedStateArrayValue.value);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public b<?>[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
