package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class skm {
    public static final com.google.android.gms.common.Feature a;
    public static final com.google.android.gms.common.Feature b;
    public static final com.google.android.gms.common.Feature c;
    public static final com.google.android.gms.common.Feature[] d;

    static {
        com.google.android.gms.common.Feature feature = new com.google.android.gms.common.Feature("CLIENT_TELEMETRY", -1, 1L, true);
        a = feature;
        com.google.android.gms.common.Feature feature2 = new com.google.android.gms.common.Feature("CLIENT_NOTIFICATION_TELEMETRY", -1, 1L, true);
        b = feature2;
        com.google.android.gms.common.Feature feature3 = new com.google.android.gms.common.Feature("CLIENT_THROTTLING_TELEMETRY", -1, 1L, true);
        c = feature3;
        d = new com.google.android.gms.common.Feature[]{feature, feature2, feature3};
    }
}
