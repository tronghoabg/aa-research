package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oyt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class moa implements oyt {

    /* renamed from: oa, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.moa.uef f24800oa;
    public View yo;
    private Set<ScheduledFuture<?>> moa = new HashSet();
    public List<ObjectAnimator> uef = uef();

    public class uef implements Runnable {

        /* renamed from: oa, reason: collision with root package name */
        ScheduledFuture<?> f24803oa;
        ObjectAnimator uef;

        public uef(ObjectAnimator objectAnimator) {
            this.uef = objectAnimator;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo() != null) {
                com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().yo().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa.uef.1
                    @Override // java.lang.Runnable
                    public void run() {
                        uef.this.uef.resume();
                    }
                });
                if (this.f24803oa != null) {
                    moa.this.moa.remove(this.f24803oa);
                }
            }
        }

        public void uef(ScheduledFuture<?> scheduledFuture) {
            this.f24803oa = scheduledFuture;
        }
    }

    public moa(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        this.yo = view;
        this.f24800oa = uefVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oyt
    public void oa() {
        List<ObjectAnimator> list = this.uef;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.moa.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public abstract List<ObjectAnimator> uef();

    public void yo() {
        List<ObjectAnimator> list = this.uef;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f24800oa.bs() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        uef uefVar = moa.this.new uef(objectAnimator);
                        ScheduledFuture<?> scheduledFutureUef = com.bytedance.sdk.component.adexpress.moa.moa.uef(uefVar, (long) (moa.this.f24800oa.bs() * 1000.0d), TimeUnit.MILLISECONDS);
                        uefVar.uef(scheduledFutureUef);
                        moa.this.moa.add(scheduledFutureUef);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    public ObjectAnimator uef(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f24800oa.dz() * 1000.0d));
        if (this.f24800oa.wk() > 0) {
            objectAnimator.setRepeatCount(this.f24800oa.wk() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f24800oa.ab())) {
            if ("alternate".equals(this.f24800oa.ab()) || "alternate-reverse".equals(this.f24800oa.ab())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f24800oa.cq())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f24800oa.ab())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f24800oa.ab())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    moa.this.yo.setVisibility(0);
                    if (moa.this.yo.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm) {
                        ((View) moa.this.yo.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
