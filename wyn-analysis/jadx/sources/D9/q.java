package D9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f2601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2603c;

    public q(s sVar, ViewGroup.LayoutParams layoutParams, int i5) {
        this.f2603c = sVar;
        this.f2601a = layoutParams;
        this.f2602b = i5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s sVar = this.f2603c;
        S3.l lVar = sVar.f2611f;
        View view = sVar.f2610e;
        E9.c cVar = (E9.c) lVar.f10967a;
        if (cVar.h() != null) {
            cVar.h().onClick(view);
        }
        sVar.f2610e.setAlpha(1.0f);
        sVar.f2610e.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ViewGroup.LayoutParams layoutParams = this.f2601a;
        layoutParams.height = this.f2602b;
        sVar.f2610e.setLayoutParams(layoutParams);
    }
}
