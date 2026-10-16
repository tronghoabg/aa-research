package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1474l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18912b;

    public /* synthetic */ RunnableC1474l(Object obj, int i5) {
        this.f18911a = i5;
        this.f18912b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f18912b;
        switch (this.f18911a) {
            case 0:
                C1478p c1478p = (C1478p) obj;
                int i5 = c1478p.f18932A;
                ValueAnimator valueAnimator = c1478p.f18958z;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                }
                c1478p.f18932A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).d();
                break;
        }
    }
}
