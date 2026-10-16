package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.util.ObjectsCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AnimationUtilsCompat {
    private AnimationUtilsCompat() {
    }

    public static Interpolator loadInterpolator(Context context, int i2) throws Resources.NotFoundException {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i2);
        ObjectsCompat.requireNonNull(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }
}
