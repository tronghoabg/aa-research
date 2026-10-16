package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Pair;

/* loaded from: classes.dex */
public final class iue {
    public static final yph a = yph.c("CAR.CAM.PKGUTILS");

    public static final Pair b(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.taskOpenEnterAnimation, R.attr.taskOpenExitAnimation});
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            return Pair.create(Integer.valueOf(resourceId), Integer.valueOf(resourceId2));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getInt("com.google.android.projection.gearhead.WINDOW_ANIMATION_STYLE", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            ((ype) ((ype) a.g()).ai((char) 1349)).y("Could not get windowAnimationStyle for package %s", context.getPackageName());
            return 0;
        }
    }
}
