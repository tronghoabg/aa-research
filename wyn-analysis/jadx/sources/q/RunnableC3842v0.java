package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: q.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3842v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC3844w0 f43926b;

    public /* synthetic */ RunnableC3842v0(AbstractViewOnTouchListenerC3844w0 abstractViewOnTouchListenerC3844w0, int i5) {
        this.f43925a = i5;
        this.f43926b = abstractViewOnTouchListenerC3844w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43925a) {
            case 0:
                ViewParent parent = this.f43926b.f43932d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC3844w0 abstractViewOnTouchListenerC3844w0 = this.f43926b;
                abstractViewOnTouchListenerC3844w0.a();
                View view = abstractViewOnTouchListenerC3844w0.f43932d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC3844w0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC3844w0.f43935g = true;
                    break;
                }
                break;
        }
    }
}
