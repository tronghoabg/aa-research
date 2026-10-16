package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class omz {
    public static final Uri a = new Uri.Builder().scheme("android.resource").authority("com.google.android.projection.gearhead").appendPath("raw").appendPath("auto_speedbump_resume_250").build();

    public static fhl a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((float) displayMetrics.widthPixels) / displayMetrics.density < 480.0f ? olm.b(context) ? fhl.a(context, R.drawable.speedbump_animation_small_night) : fhl.a(context, R.drawable.speedbump_animation_small_day) : olm.b(context) ? fhl.a(context, R.drawable.speedbump_animation_big_night) : fhl.a(context, R.drawable.speedbump_animation_big_day);
    }
}
