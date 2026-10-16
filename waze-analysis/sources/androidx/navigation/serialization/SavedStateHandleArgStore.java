package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class SavedStateHandleArgStore extends ArgStore {
    private final SavedStateHandle handle;
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleArgStore(SavedStateHandle savedStateHandle, Map<String, ? extends NavType<?>> map) {
        x.f(savedStateHandle, "handle");
        x.f(map, "typeMap");
        this.handle = savedStateHandle;
        this.typeMap = map;
    }

    @Override // androidx.navigation.serialization.ArgStore
    public boolean contains(String str) {
        x.f(str, "key");
        return this.handle.contains(str);
    }

    @Override // androidx.navigation.serialization.ArgStore
    public Object get(String str) {
        k[] kVarArr;
        x.f(str, "key");
        Map mapE = r.e(new k(str, this.handle.get(str)));
        if (mapE.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapE.size());
            for (Map.Entry entry : mapE.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        NavType<?> navType = this.typeMap.get(str);
        if (navType != null) {
            return navType.get(bundleBundleOf, str);
        }
        throw new IllegalStateException("Failed to find type for " + str + " when decoding " + this.handle);
    }
}
