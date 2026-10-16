package D9;

import android.R;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public class s implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f2606a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2608c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2609d;

    /* renamed from: e, reason: collision with root package name */
    public final View f2610e;

    /* renamed from: f, reason: collision with root package name */
    public final S3.l f2611f;

    /* renamed from: g, reason: collision with root package name */
    public int f2612g = 1;

    /* renamed from: h, reason: collision with root package name */
    public float f2613h;

    /* renamed from: i, reason: collision with root package name */
    public float f2614i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2615j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2616l;

    /* renamed from: m, reason: collision with root package name */
    public float f2617m;

    public s(View view, S3.l lVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f2606a = viewConfiguration.getScaledTouchSlop();
        this.f2607b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f2608c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2609d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f2610e = view;
        this.f2611f = lVar;
    }

    public final void a(float f10, float f11, o oVar) {
        float fB = b();
        float f12 = f10 - fB;
        float alpha = this.f2610e.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f2609d);
        valueAnimatorOfFloat.addUpdateListener(new p(this, fB, f12, alpha, f11 - alpha));
        if (oVar != null) {
            valueAnimatorOfFloat.addListener(oVar);
        }
        valueAnimatorOfFloat.start();
    }

    public float b() {
        return this.f2610e.getTranslationX();
    }

    public void c(float f10) {
        this.f2610e.setTranslationX(f10);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        motionEvent.offsetLocation(this.f2617m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i5 = this.f2612g;
        View view2 = this.f2610e;
        if (i5 < 2) {
            this.f2612g = view2.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2613h = motionEvent.getRawX();
            this.f2614i = motionEvent.getRawY();
            this.f2611f.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f2616l = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.f2616l;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f2613h;
                    float rawY = motionEvent.getRawY() - this.f2614i;
                    float fAbs = Math.abs(rawX);
                    int i10 = this.f2606a;
                    if (fAbs > i10 && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.f2615j = true;
                        if (rawX <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            i10 = -i10;
                        }
                        this.k = i10;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.f2615j) {
                        this.f2617m = rawX;
                        c(rawX - this.k);
                        this.f2610e.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f2612g))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.f2616l != null) {
                a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, null);
                this.f2616l.recycle();
                this.f2616l = null;
                this.f2617m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f2613h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f2614i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f2615j = false;
                return false;
            }
        } else if (this.f2616l != null) {
            float rawX2 = motionEvent.getRawX() - this.f2613h;
            this.f2616l.addMovement(motionEvent);
            this.f2616l.computeCurrentVelocity(1000);
            float xVelocity = this.f2616l.getXVelocity();
            float fAbs2 = Math.abs(xVelocity);
            float fAbs3 = Math.abs(this.f2616l.getYVelocity());
            if (Math.abs(rawX2) > this.f2612g / 2 && this.f2615j) {
                z2 = rawX2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else if (this.f2607b > fAbs2 || fAbs2 > this.f2608c || fAbs3 >= fAbs2 || fAbs3 >= fAbs2 || !this.f2615j) {
                z2 = false;
                z = false;
            } else {
                z = ((xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (xVelocity == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) < 0) == ((rawX2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (rawX2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) < 0);
                z2 = this.f2616l.getXVelocity() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (z) {
                a(z2 ? this.f2612g : -this.f2612g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new o(this, 0));
            } else if (this.f2615j) {
                a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, null);
            }
            VelocityTracker velocityTracker2 = this.f2616l;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.f2616l = null;
            this.f2617m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2613h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2614i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2615j = false;
            return false;
        }
        return false;
    }
}
