package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class swi {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;
    public static final Feature[] g;

    static {
        Feature feature = new Feature("usage_and_diagnostics_listener", -1, 1L, true);
        a = feature;
        Feature feature2 = new Feature("usage_and_diagnostics_consents", -1, 1L, true);
        b = feature2;
        Feature feature3 = new Feature("usage_and_diagnostics_check_consents", -1, 1L, true);
        c = feature3;
        Feature feature4 = new Feature("usage_and_diagnostics_settings_access", -1, 1L, true);
        d = feature4;
        Feature feature5 = new Feature("el_capitan", -1, 1L, false);
        e = feature5;
        Feature feature6 = new Feature("stats", -1, 1L, true);
        f = feature6;
        g = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6};
    }
}
