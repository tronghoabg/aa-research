package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class svt {
    public static final com.google.android.gms.common.Feature a;
    public static final com.google.android.gms.common.Feature b;
    public static final com.google.android.gms.common.Feature c;
    public static final com.google.android.gms.common.Feature[] d;

    static {
        com.google.android.gms.common.Feature feature = new com.google.android.gms.common.Feature("get_last_reset_time_api", -1, 1L, true);
        a = feature;
        com.google.android.gms.common.Feature feature2 = new com.google.android.gms.common.Feature("get_dwid_api", -1, 1L, false);
        b = feature2;
        com.google.android.gms.common.Feature feature3 = new com.google.android.gms.common.Feature("set_dwid_api", -1, 1L, false);
        c = feature3;
        d = new com.google.android.gms.common.Feature[]{feature, feature2, feature3};
    }
}
