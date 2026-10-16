package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ons {
    public static final android.net.Uri a = new android.net.Uri.Builder().scheme("android.resource").authority("com.google.android.projection.gearhead").appendPath("raw").appendPath("auto_speedbump_resume_250").build();

    public static defpackage.fhr a(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels / displayMetrics.density < 480.0f) {
            return defpackage.omf.r(context) ? defpackage.fhr.a(context, com.google.android.projection.gearhead.R.drawable.speedbump_animation_small_night) : defpackage.fhr.a(context, com.google.android.projection.gearhead.R.drawable.speedbump_animation_small_day);
        }
        return defpackage.omf.r(context) ? defpackage.fhr.a(context, com.google.android.projection.gearhead.R.drawable.speedbump_animation_big_night) : defpackage.fhr.a(context, com.google.android.projection.gearhead.R.drawable.speedbump_animation_big_day);
    }
}
