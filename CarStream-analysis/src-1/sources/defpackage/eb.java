package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import com.carstream.tech.core.ui.SplashView;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class eb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ SplashView b;

    public eb(SplashView splashView, long j) {
        this.b = splashView;
        this.a = j;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.a;
        DecelerateInterpolator decelerateInterpolator = SplashView.i;
        this.b.a(jUptimeMillis);
    }
}
