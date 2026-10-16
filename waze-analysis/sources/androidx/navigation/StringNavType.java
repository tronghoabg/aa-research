package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StringNavType extends NavType<String> {
    public StringNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str) || SavedStateReader.m13348isNullimpl(bundle, str)) {
            return null;
        }
        return SavedStateReader.m13340getStringimpl(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_STRING;
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String str) {
        x.f(str, "value");
        if (x.n(str, "null")) {
            return null;
        }
        return str;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, String str2) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateWriter.m13355constructorimpl(bundle);
        if (str2 != null) {
            SavedStateWriter.m13388putStringimpl(bundle, str, str2);
        } else {
            SavedStateWriter.m13378putNullimpl(bundle, str);
        }
    }

    @Override // androidx.navigation.NavType
    public String serializeAsValue(String str) {
        String strEncode$default;
        return (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) ? "null" : strEncode$default;
    }
}
