package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class zjm extends moa {
    private float ivm;
    private float lw;
    private uef moa;

    public class uef {

        /* renamed from: oa, reason: collision with root package name */
        private View f24805oa;

        public uef(View view) {
            this.f24805oa = view;
        }

        public void uef(int i5) {
            if (!"top".equals(zjm.this.f24800oa.uef())) {
                ViewGroup.LayoutParams layoutParams = this.f24805oa.getLayoutParams();
                layoutParams.height = i5;
                this.f24805oa.setLayoutParams(layoutParams);
                this.f24805oa.requestLayout();
                return;
            }
            if (zjm.this.yo instanceof ViewGroup) {
                for (int i10 = 0; i10 < ((ViewGroup) zjm.this.yo).getChildCount(); i10++) {
                    ((ViewGroup) zjm.this.yo).getChildAt(i10).setTranslationY(i5 - zjm.this.lw);
                }
            }
            zjm zjmVar = zjm.this;
            zjmVar.yo.setTranslationY(zjmVar.lw - i5);
        }
    }

    public zjm(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        int i5;
        String str;
        View view = this.yo;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw)) {
            this.yo = (View) this.yo.getParent();
        }
        this.yo.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        this.moa = new uef(this.yo);
        final int i10 = this.yo.getLayoutParams().height;
        this.lw = i10;
        this.ivm = this.yo.getLayoutParams().width;
        if ("left".equals(this.f24800oa.uef()) || "right".equals(this.f24800oa.uef())) {
            i5 = (int) this.ivm;
            str = "width";
        } else {
            str = "height";
            i5 = i10;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.moa, str, 0, i5).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        arrayList.add(uef(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.uef.zjm.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                zjm.this.moa.uef(i10);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z2) {
            }
        });
        return arrayList;
    }
}
