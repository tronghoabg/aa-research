package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.core.os.EnvironmentCompat;
import androidx.navigation.NavType;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class UNKNOWN extends NavType<String> {
    public static final UNKNOWN INSTANCE = new UNKNOWN();

    private UNKNOWN() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String get(Bundle bundle, String str) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        return null;
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String str) {
        x.f(str, "value");
        return "null";
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String str, String str2) {
        x.f(bundle, "bundle");
        x.f(str, "key");
        x.f(str2, "value");
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ String get(Bundle bundle, String str) {
        get(bundle, str);
        return null;
    }
}
