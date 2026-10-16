package com.google.android.apps.auto.components.coolwalk.focusring;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\t¨\u0006&"}, d2 = {"Lcom/google/android/apps/auto/components/coolwalk/focusring/FocusInterceptor;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "dispatchSetPressed", "", "pressed", "", "performClick", "Landroid/annotation/SuppressLint;", "value", "ClickableViewAccessibility", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "getNextFocusForwardId", "getNextFocusDownId", "getNextFocusLeftId", "getNextFocusRightId", "getNextFocusUpId", "focusRingChildView", "Landroid/view/View;", "getFocusRingChildView", "()Landroid/view/View;", "focusRingChild", "Lcom/google/android/apps/auto/components/coolwalk/focusring/FocusRingHolder;", "getFocusRingChild", "()Lcom/google/android/apps/auto/components/coolwalk/focusring/FocusRingHolder;", "Companion", "java.com.google.android.apps.auto.components.coolwalk.focusring_focusring"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FocusInterceptor extends android.widget.FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInterceptor(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setFocusable(true);
        setClickable(true);
        setDescendantFocusability(393216);
    }

    public static final void a(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor) {
            com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor focusInterceptor = (com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor) parent;
            if (focusInterceptor.getFocusable() != view.getFocusable()) {
                focusInterceptor.setFocusable(view.getFocusable());
            }
            if (focusInterceptor.isClickable() != view.isClickable()) {
                focusInterceptor.setClickable(view.isClickable());
            }
            if (focusInterceptor.isDuplicateParentStateEnabled() != view.isDuplicateParentStateEnabled()) {
                focusInterceptor.setDuplicateParentStateEnabled(view.isDuplicateParentStateEnabled());
            }
            if (focusInterceptor.isEnabled() != view.isEnabled()) {
                focusInterceptor.setEnabled(view.isEnabled());
            }
        }
    }

    public static final void b(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        parent.getClass();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        if ((viewGroup instanceof android.support.constraint.ConstraintLayout) || (viewGroup instanceof androidx.constraintlayout.widget.ConstraintLayout) || (viewGroup instanceof android.widget.RelativeLayout)) {
            throw new java.lang.IllegalStateException(defpackage.afzh.Q(view.getClass().getSimpleName() + " cannot be directly added to a ConstraintLayout or\n              | RelativeLayout and must be wrapped in another layout class. If a new wrapper is\n              | introduced for this purpose, prefer using FocusInterceptor unless other\n              | functionality is needed.\n              | Affected View: " + view));
        }
        if (viewGroup instanceof com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor) {
            defpackage.jya.g(view, (com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor) viewGroup);
            return;
        }
        android.content.Context context = view.getContext();
        context.getClass();
        com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor focusInterceptor = new com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor(context, null, 0, 6, null);
        focusInterceptor.setLayoutParams(view.getLayoutParams());
        focusInterceptor.setVisibility(view.getVisibility());
        focusInterceptor.setFocusable(view.getFocusable());
        focusInterceptor.setClickable(view.isClickable());
        focusInterceptor.setDuplicateParentStateEnabled(view.isDuplicateParentStateEnabled());
        focusInterceptor.setEnabled(view.isEnabled());
        int iIndexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        focusInterceptor.addView(view, -1, -1);
        viewGroup.addView(focusInterceptor, iIndexOfChild);
        defpackage.jya.g(view, focusInterceptor);
    }

    private final android.view.View c() {
        if (getChildCount() == 1) {
            android.view.View childAt = getChildAt(0);
            if (childAt instanceof defpackage.kwp) {
                return childAt;
            }
            throw new java.lang.IllegalStateException("FocusInterceptor's child should be a FocusRingHolder");
        }
        throw new java.lang.IllegalStateException("FocusInterceptor should have exactly one child, instead was " + getChildCount());
    }

    private final defpackage.kwp d() {
        if (getChildCount() == 1) {
            android.view.KeyEvent.Callback childAt = getChildAt(0);
            if (childAt instanceof defpackage.kwp) {
                return (defpackage.kwp) childAt;
            }
            throw new java.lang.IllegalStateException("FocusInterceptor's child should be a FocusRingHolder");
        }
        throw new java.lang.IllegalStateException("FocusInterceptor should have exactly one child, instead was " + getChildCount());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSetPressed(boolean z) {
        c().setPressed(z);
    }

    @Override // android.view.View
    public final int getNextFocusDownId() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(super.getNextFocusDownId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusDownId();
    }

    @Override // android.view.View
    public final int getNextFocusForwardId() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(super.getNextFocusForwardId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusForwardId();
    }

    @Override // android.view.View
    public final int getNextFocusLeftId() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(super.getNextFocusLeftId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusLeftId();
    }

    @Override // android.view.View
    public final int getNextFocusRightId() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(super.getNextFocusRightId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusRightId();
    }

    @Override // android.view.View
    public final int getNextFocusUpId() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(super.getNextFocusUpId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusUpId();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        d().c().a.a(z);
        d().c().b.a(z);
        c().setActivated(z);
        android.view.View.OnFocusChangeListener onFocusChangeListener = c().getOnFocusChangeListener();
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(c(), z);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return c().performClick();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusInterceptor(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusInterceptor(android.content.Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ FocusInterceptor(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.affu affuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
