package com.google.android.apps.auto.components.system.dashboard.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.auto.components.coolwalk.card.CoolwalkCardView;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.affa;
import defpackage.hle;
import defpackage.mli;
import defpackage.mvg;
import defpackage.mwm;
import defpackage.mwu;
import defpackage.ype;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006K"}, d2 = {"Lcom/google/android/apps/auto/components/system/dashboard/design/DashboardCardView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lkotlin/Function0;", "", "onDismiss", "getOnDismiss", "()Lkotlin/jvm/functions/Function0;", "setOnDismiss", "(Lkotlin/jvm/functions/Function0;)V", "swipeToDismissEnabled", "", "getSwipeToDismissEnabled", "()Z", "setSwipeToDismissEnabled", "(Z)V", "swipeDismissTouchHandler", "Lcom/google/android/apps/auto/components/system/dashboard/design/SwipeDismissTouchHandler;", "<set-?>", "Lkotlin/Function1;", "", "swipeProgressListener", "getSwipeProgressListener$delegate", "(Lcom/google/android/apps/auto/components/system/dashboard/design/DashboardCardView;)Ljava/lang/Object;", "getSwipeProgressListener", "()Lkotlin/jvm/functions/Function1;", "setSwipeProgressListener", "(Lkotlin/jvm/functions/Function1;)V", "cardView", "Lcom/google/android/apps/auto/components/coolwalk/card/CoolwalkCardView;", "getCardView", "()Lcom/google/android/apps/auto/components/coolwalk/card/CoolwalkCardView;", "constraintLayout", "Landroid/support/constraint/ConstraintLayout;", "getConstraintLayout", "()Landroid/support/constraint/ConstraintLayout;", "closeButton", "Landroid/view/View;", "kotlin.jvm.PlatformType", "closeButtonInterceptor", "focusChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "onAttachedToWindow", "onDetachedFromWindow", "updateFocusState", "dismiss", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "onLayout", "changed", "l", "", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "generateLayoutParams", "Landroid/support/constraint/ConstraintLayout$LayoutParams;", "addView", "child", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "width", "height", "java.com.google.android.apps.auto.components.system.dashboard.design_design"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DashboardCardView extends ViewGroup {
    public final CoolwalkCardView a;
    public final ConstraintLayout b;
    public final View c;
    private boolean d;
    private final mwu e;
    private final ViewTreeObserver.OnGlobalFocusChangeListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.d = true;
        this.e = new mwu(this, false, new mvg(this, 3));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dashboard_card_base, (ViewGroup) null, false);
        viewInflate.getClass();
        CoolwalkCardView coolwalkCardView = (CoolwalkCardView) viewInflate;
        this.a = coolwalkCardView;
        View childAt = coolwalkCardView.getChildAt(0);
        childAt.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
        this.b = constraintLayout;
        View viewFindViewById = constraintLayout.findViewById(R.id.close_button_inner);
        this.c = viewFindViewById;
        constraintLayout.findViewById(R.id.close_button);
        this.f = new hle(this, 5, null);
        addView(coolwalkCardView, -1, new ViewGroup.LayoutParams(-1, -1));
        viewFindViewById.setOnClickListener(new mli(this, 11));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mwm.a, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(0, this.d);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (affa.f(view, this.a)) {
            super.addView(view);
        } else {
            this.b.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return this.b.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.d) {
            return this.e.e(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        CoolwalkCardView coolwalkCardView = this.a;
        coolwalkCardView.measure(i, i2);
        setMeasuredDimension(coolwalkCardView.getMeasuredWidth(), coolwalkCardView.getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.d) {
            mwu mwuVar = this.e;
            if (mwuVar.f) {
                int action = motionEvent.getAction();
                if ((action == 1 || action == 2 || action == 3) && !mwuVar.e.c(motionEvent)) {
                    ((ype) mwu.a.h()).u("unable to emit event");
                }
                if (motionEvent.getActionIndex() == 0) {
                    return true;
                }
            } else {
                mwuVar.e(motionEvent);
                if (motionEvent.getActionIndex() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (affa.f(view, this.a)) {
            super.addView(view, i);
        } else {
            this.b.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (affa.f(view, this.a)) {
            super.addView(view, i, i2);
        } else {
            this.b.addView(view, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (affa.f(view, this.a)) {
            super.addView(view, i, layoutParams);
        } else {
            this.b.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (affa.f(view, this.a)) {
            super.addView(view, layoutParams);
        } else {
            this.b.addView(view, layoutParams);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DashboardCardView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ DashboardCardView(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
