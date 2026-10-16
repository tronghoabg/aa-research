package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sxg {
    public static final com.google.android.gms.common.Feature a;
    public static final com.google.android.gms.common.Feature b;
    public static final com.google.android.gms.common.Feature c;
    public static final com.google.android.gms.common.Feature d;
    public static final com.google.android.gms.common.Feature e;
    public static final com.google.android.gms.common.Feature f;
    public static final com.google.android.gms.common.Feature[] g;

    static {
        com.google.android.gms.common.Feature feature = new com.google.android.gms.common.Feature("usage_and_diagnostics_listener", -1, 1L, true);
        a = feature;
        com.google.android.gms.common.Feature feature2 = new com.google.android.gms.common.Feature("usage_and_diagnostics_consents", -1, 1L, true);
        b = feature2;
        com.google.android.gms.common.Feature feature3 = new com.google.android.gms.common.Feature("usage_and_diagnostics_check_consents", -1, 1L, true);
        c = feature3;
        com.google.android.gms.common.Feature feature4 = new com.google.android.gms.common.Feature("usage_and_diagnostics_settings_access", -1, 1L, true);
        d = feature4;
        com.google.android.gms.common.Feature feature5 = new com.google.android.gms.common.Feature("el_capitan", -1, 1L, false);
        e = feature5;
        com.google.android.gms.common.Feature feature6 = new com.google.android.gms.common.Feature("stats", -1, 1L, true);
        f = feature6;
        g = new com.google.android.gms.common.Feature[]{feature, feature2, feature3, feature4, feature5, feature6};
    }
}
