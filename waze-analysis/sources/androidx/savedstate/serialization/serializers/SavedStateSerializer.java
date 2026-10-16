package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import h.g.b.x;
import h.k;
import h.k.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateSerializer implements b<Bundle> {
    public static final SavedStateSerializer INSTANCE = new SavedStateSerializer();
    private static final q descriptor = n.y("androidx.savedstate.SavedState", new q[0], new z(5));

    private SavedStateSerializer() {
    }

    @Override // kotlinx.b.a
    public Bundle deserialize(e eVar) {
        k[] kVarArr;
        x.f(eVar, "decoder");
        if (eVar instanceof SavedStateDecoder) {
            SavedStateDecoder savedStateDecoder = (SavedStateDecoder) eVar;
            if (x.n(savedStateDecoder.getKey$savedstate(), "")) {
                return savedStateDecoder.getSavedState$savedstate();
            }
            Bundle savedState$savedstate = savedStateDecoder.getSavedState$savedstate();
            SavedStateReader.m13269constructorimpl(savedState$savedstate);
            return SavedStateReader.m13326getSavedStateimpl(savedState$savedstate, savedStateDecoder.getKey$savedstate());
        }
        Map<String, Object> mapUnwrapMap = SavedStateValueConverter.INSTANCE.unwrapMap((Map) eVar.decodeSerializableValue(SavedStateSerializerKt.FALLBACK_SERIALIZER));
        if (mapUnwrapMap.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapUnwrapMap.size());
            for (Map.Entry<String, Object> entry : mapUnwrapMap.entrySet()) {
                arrayList.add(new k(entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, Bundle bundle) {
        x.f(fVar, "encoder");
        x.f(bundle, "value");
        if (!(fVar instanceof SavedStateEncoder)) {
            SavedStateReader.m13269constructorimpl(bundle);
            fVar.encodeSerializableValue(SavedStateSerializerKt.FALLBACK_SERIALIZER, SavedStateValueConverter.INSTANCE.wrapMap(SavedStateReader.m13350toMapimpl(bundle)));
            return;
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) fVar;
        if (x.n(savedStateEncoder.getKey$savedstate(), "")) {
            Bundle savedState$savedstate = savedStateEncoder.getSavedState$savedstate();
            SavedStateWriter.m13355constructorimpl(savedState$savedstate);
            SavedStateWriter.m13359putAllimpl(savedState$savedstate, bundle);
        } else {
            Bundle savedState$savedstate2 = savedStateEncoder.getSavedState$savedstate();
            SavedStateWriter.m13355constructorimpl(savedState$savedstate2);
            SavedStateWriter.m13382putSavedStateimpl(savedState$savedstate2, savedStateEncoder.getKey$savedstate(), bundle);
        }
    }
}
