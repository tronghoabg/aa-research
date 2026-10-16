package androidx.media3.common;

import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MediaLibraryInfo {
    public static final int INTERFACE_VERSION = 10;
    public static final String TAG = "AndroidXMedia3";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "1.11.0-alpha01";
    public static final int VERSION_INT = 1011000001;
    public static final String VERSION_SLASHY = "AndroidXMedia3/1.11.0-alpha01";
    private static boolean enableWorkarounds = true;
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "media3.common";

    private MediaLibraryInfo() {
    }

    public static boolean enableWorkarounds() {
        return enableWorkarounds;
    }

    public static synchronized void registerModule(String str) {
        if (registeredModules.add(str)) {
            registeredModulesString = registeredModulesString + ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return registeredModulesString;
    }

    public static void setEnableWorkarounds(boolean z) {
        enableWorkarounds = z;
    }
}
