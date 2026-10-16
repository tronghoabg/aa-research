package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreferencesFactory {
    public static final Preferences create(Preferences.Pair<?>... pairArr) {
        x.f(pairArr, "pairs");
        return createMutable((Preferences.Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Preferences createEmpty() {
        return new MutablePreferences(null, true, 1 == true ? 1 : 0, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MutablePreferences createMutable(Preferences.Pair<?>... pairArr) {
        x.f(pairArr, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, 0 == true ? 1 : 0);
        mutablePreferences.putAll((Preferences.Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        return mutablePreferences;
    }
}
