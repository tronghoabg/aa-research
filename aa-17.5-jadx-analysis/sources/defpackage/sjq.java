package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class sjq {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", -1, 1L, true);
        a = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", -1, 1L, true);
        b = feature2;
        Feature feature3 = new Feature("CLIENT_THROTTLING_TELEMETRY", -1, 1L, true);
        c = feature3;
        d = new Feature[]{feature, feature2, feature3};
    }
}
