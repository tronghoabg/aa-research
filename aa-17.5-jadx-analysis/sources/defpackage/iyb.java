package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class iyb {
    public static final Intent a = new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_NAVIGATION").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
    public static final Intent b = new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_OEM").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
    public static final Intent c = new Intent("android.media.browse.MediaBrowserService");
    public static final Intent d = new Intent("androidx.car.app.CarAppService");
    public static final Intent e = new Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.NAVIGATION");
    public static final Intent f = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
}
