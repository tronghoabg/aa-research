package org.chromium.net;

/* loaded from: classes2.dex */
public class ApiVersion {
    private static final int API_LEVEL = 49;
    private static final String CRONET_VERSION = "151.0.7922.83";
    private static final String LAST_CHANGE = "73e29e5bf2d97557c29b3d4c196c73e04f13ab4a-refs/branch-heads/7922_47@{#28}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "151.0.7922.83@73e29e5b";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 49;
    }
}
