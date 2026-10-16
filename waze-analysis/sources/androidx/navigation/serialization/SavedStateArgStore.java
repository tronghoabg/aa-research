package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import androidx.savedstate.SavedStateReader;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class SavedStateArgStore extends ArgStore {
    private final Bundle savedState;
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateArgStore(Bundle bundle, Map<String, ? extends NavType<?>> map) {
        x.f(bundle, "savedState");
        x.f(map, "typeMap");
        this.savedState = bundle;
        this.typeMap = map;
    }

    @Override // androidx.navigation.serialization.ArgStore
    public boolean contains(String str) {
        x.f(str, "key");
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13270containsimpl(bundle, str);
    }

    @Override // androidx.navigation.serialization.ArgStore
    public Object get(String str) {
        x.f(str, "key");
        NavType<?> navType = this.typeMap.get(str);
        if (navType != null) {
            return navType.get(this.savedState, str);
        }
        return null;
    }
}
