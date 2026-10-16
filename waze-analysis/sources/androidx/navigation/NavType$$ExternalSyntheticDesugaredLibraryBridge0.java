package androidx.navigation;

import androidx.navigation.NavType;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final /* synthetic */ class NavType$$ExternalSyntheticDesugaredLibraryBridge0 {
    public static /* synthetic */ NavType m(NavType.Companion companion, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return companion.fromArgType(str, str2);
        }
        try {
            return companion.fromArgType("j$" + str.substring(4), str2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ClassNotFoundException) {
                return companion.fromArgType(str, str2);
            }
            throw e2;
        }
    }
}
