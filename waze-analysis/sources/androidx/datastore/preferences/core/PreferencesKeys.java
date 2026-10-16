package androidx.datastore.preferences.core;

import androidx.autofill.HintConstants;
import androidx.datastore.preferences.core.Preferences;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreferencesKeys {
    public static final Preferences.Key<Boolean> booleanKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<byte[]> byteArrayKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Double> doubleKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Float> floatKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Integer> intKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Long> longKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<String> stringKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }

    public static final Preferences.Key<Set<String>> stringSetKey(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new Preferences.Key<>(str);
    }
}
