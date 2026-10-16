package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.carstream.tech.phone.ActivateActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivateActivity b;

    public /* synthetic */ g(ActivateActivity activateActivity, int i) {
        this.a = i;
        this.b = activateActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                long jUptimeMillis = SystemClock.uptimeMillis();
                ActivateActivity activateActivity = this.b;
                activateActivity.drive(jUptimeMillis - activateActivity.driveStart);
                break;
            case 1:
                ActivateActivity activateActivity2 = this.b;
                ViewGroup.LayoutParams layoutParams = activateActivity2.progressFill.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                activateActivity2.progressFill.setLayoutParams(layoutParams);
                break;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ActivateActivity activateActivity3 = this.b;
                activateActivity3.glyph.i = (1.4f * animatedFraction) + 0.9f;
                activateActivity3.glyph.j = (1.0f - animatedFraction) * 0.5f;
                activateActivity3.glyph.invalidate();
                break;
        }
    }
}
