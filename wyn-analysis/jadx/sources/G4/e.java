package G4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f4228e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f4230b;

    /* renamed from: c, reason: collision with root package name */
    public final Y9.c f4231c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4232d;

    static {
        f4228e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public e(Context context) {
        this.f4232d = f4228e;
        this.f4229a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f4230b = activityManager;
        this.f4231c = new Y9.c(context.getResources().getDisplayMetrics(), 9);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f4232d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
