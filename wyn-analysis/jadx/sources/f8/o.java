package f8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import q.Y;

/* loaded from: classes4.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f35181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f35183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f35184e;

    public o(q qVar, int i5, TextView textView, int i10, TextView textView2) {
        this.f35184e = qVar;
        this.f35180a = i5;
        this.f35181b = textView;
        this.f35182c = i10;
        this.f35183d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Y y10;
        int i5 = this.f35180a;
        q qVar = this.f35184e;
        qVar.f35200n = i5;
        qVar.f35198l = null;
        TextView textView = this.f35181b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f35182c == 1 && (y10 = qVar.f35204r) != null) {
                y10.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f35183d;
        if (textView2 != null) {
            textView2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f35183d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
