package x7;

import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final d7.d f47840a;

    /* renamed from: b, reason: collision with root package name */
    public static final d7.d f47841b;

    /* renamed from: c, reason: collision with root package name */
    public static final d7.d f47842c;

    /* renamed from: d, reason: collision with root package name */
    public static final d7.d f47843d;

    /* renamed from: e, reason: collision with root package name */
    public static final d7.d f47844e;

    /* renamed from: f, reason: collision with root package name */
    public static final d7.d f47845f;

    /* renamed from: g, reason: collision with root package name */
    public static final d7.d f47846g;

    /* renamed from: h, reason: collision with root package name */
    public static final d7.d f47847h;

    /* renamed from: i, reason: collision with root package name */
    public static final d7.d[] f47848i;

    static {
        d7.d dVar = new d7.d("name_ulr_private", 1L);
        d7.d dVar2 = new d7.d("name_sleep_segment_request", 1L);
        f47840a = dVar2;
        d7.d dVar3 = new d7.d("get_last_activity_feature_id", 1L);
        d7.d dVar4 = new d7.d("support_context_feature_id", 1L);
        d7.d dVar5 = new d7.d("get_current_location", 2L);
        f47841b = dVar5;
        d7.d dVar6 = new d7.d("get_last_location_with_request", 1L);
        f47842c = dVar6;
        d7.d dVar7 = new d7.d("set_mock_mode_with_callback", 1L);
        f47843d = dVar7;
        d7.d dVar8 = new d7.d("set_mock_location_with_callback", 1L);
        f47844e = dVar8;
        d7.d dVar9 = new d7.d("inject_location_with_callback", 1L);
        d7.d dVar10 = new d7.d("location_updates_with_callback", 1L);
        f47845f = dVar10;
        d7.d dVar11 = new d7.d("use_safe_parcelable_in_intents", 1L);
        d7.d dVar12 = new d7.d("flp_debug_updates", 1L);
        d7.d dVar13 = new d7.d("google_location_accuracy_enabled", 1L);
        f47846g = dVar13;
        d7.d dVar14 = new d7.d("geofences_with_callback", 1L);
        f47847h = dVar14;
        f47848i = new d7.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, new d7.d("location_enabled", 1L)};
    }

    public static String a(int i5) {
        switch (i5) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return N0.a.d(i5, "unknown status code: ", new StringBuilder(String.valueOf(i5).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static void b(int i5) {
        boolean z2;
        if (i5 == 100 || i5 == 102 || i5 == 104) {
            z2 = true;
        } else if (i5 == 105) {
            i5 = 105;
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC1732v.c(z2, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i5));
    }

    public static String c(int i5) {
        if (i5 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i5 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i5 == 104) {
            return "LOW_POWER";
        }
        if (i5 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static String d(int i5) {
        if (i5 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i5 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i5 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
