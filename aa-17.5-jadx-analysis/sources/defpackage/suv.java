package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class suv {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("get_last_reset_time_api", -1, 1L, true);
        a = feature;
        Feature feature2 = new Feature("get_dwid_api", -1, 1L, false);
        b = feature2;
        Feature feature3 = new Feature("set_dwid_api", -1, 1L, false);
        c = feature3;
        d = new Feature[]{feature, feature2, feature3};
    }
}
