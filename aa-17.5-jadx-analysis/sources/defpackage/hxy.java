package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hxy {
    public final Context a;
    public final ActivityManager b;
    public float c;
    public final gms d;

    public hxy(Context context) {
        this.c = 1.0f;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.d = new gms(context.getResources().getDisplayMetrics(), (byte[]) null);
        if (activityManager.isLowRamDevice()) {
            this.c = BitmapDescriptorFactory.HUE_RED;
        }
    }
}
