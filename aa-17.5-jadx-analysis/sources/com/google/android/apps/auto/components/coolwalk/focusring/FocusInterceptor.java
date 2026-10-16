package com.google.android.apps.auto.components.coolwalk.focusring;

import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import defpackage.afeu;
import defpackage.afyh;
import defpackage.fww;
import defpackage.kwj;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\""}, d2 = {"Lcom/google/android/apps/auto/components/coolwalk/focusring/FocusInterceptor;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dispatchSetPressed", "", "pressed", "", "performClick", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "getNextFocusForwardId", "getNextFocusDownId", "getNextFocusLeftId", "getNextFocusRightId", "getNextFocusUpId", "focusRingChildView", "Landroid/view/View;", "getFocusRingChildView", "()Landroid/view/View;", "focusRingChild", "Lcom/google/android/apps/auto/components/coolwalk/focusring/FocusRingHolder;", "getFocusRingChild", "()Lcom/google/android/apps/auto/components/coolwalk/focusring/FocusRingHolder;", "Companion", "java.com.google.android.apps.auto.components.coolwalk.focusring_focusring"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FocusInterceptor extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInterceptor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setFocusable(true);
        setClickable(true);
        setDescendantFocusability(393216);
    }

    public static final void a(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof FocusInterceptor) {
            FocusInterceptor focusInterceptor = (FocusInterceptor) parent;
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

    public static final void b(View view) {
        ViewParent parent = view.getParent();
        parent.getClass();
        ViewGroup viewGroup = (ViewGroup) parent;
        if ((viewGroup instanceof ConstraintLayout) || (viewGroup instanceof androidx.constraintlayout.widget.ConstraintLayout) || (viewGroup instanceof RelativeLayout)) {
            throw new IllegalStateException(afyh.Q(view.getClass().getSimpleName() + " cannot be directly added to a ConstraintLayout or\n              | RelativeLayout and must be wrapped in another layout class. If a new wrapper is\n              | introduced for this purpose, prefer using FocusInterceptor unless other\n              | functionality is needed.\n              | Affected View: " + view));
        }
        if (viewGroup instanceof FocusInterceptor) {
            fww.u(view, (FocusInterceptor) viewGroup);
            return;
        }
        Context context = view.getContext();
        context.getClass();
        FocusInterceptor focusInterceptor = new FocusInterceptor(context, null, 0, 6, null);
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
        fww.u(view, focusInterceptor);
    }

    private final View c() {
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (childAt instanceof kwj) {
                return childAt;
            }
            throw new IllegalStateException("FocusInterceptor's child should be a FocusRingHolder");
        }
        throw new IllegalStateException("FocusInterceptor should have exactly one child, instead was " + getChildCount());
    }

    private final kwj d() {
        if (getChildCount() == 1) {
            KeyEvent.Callback childAt = getChildAt(0);
            if (childAt instanceof kwj) {
                return (kwj) childAt;
            }
            throw new IllegalStateException("FocusInterceptor's child should be a FocusRingHolder");
        }
        throw new IllegalStateException("FocusInterceptor should have exactly one child, instead was " + getChildCount());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSetPressed(boolean z) {
        c().setPressed(z);
    }

    @Override // android.view.View
    public final int getNextFocusDownId() {
        Integer numValueOf = Integer.valueOf(super.getNextFocusDownId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusDownId();
    }

    @Override // android.view.View
    public final int getNextFocusForwardId() {
        Integer numValueOf = Integer.valueOf(super.getNextFocusForwardId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusForwardId();
    }

    @Override // android.view.View
    public final int getNextFocusLeftId() {
        Integer numValueOf = Integer.valueOf(super.getNextFocusLeftId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusLeftId();
    }

    @Override // android.view.View
    public final int getNextFocusRightId() {
        Integer numValueOf = Integer.valueOf(super.getNextFocusRightId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusRightId();
    }

    @Override // android.view.View
    public final int getNextFocusUpId() {
        Integer numValueOf = Integer.valueOf(super.getNextFocusUpId());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : c().getNextFocusUpId();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        d().c().a.a(z);
        d().c().b.a(z);
        c().setActivated(z);
        View.OnFocusChangeListener onFocusChangeListener = c().getOnFocusChangeListener();
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(c(), z);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return c().performClick();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusInterceptor(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusInterceptor(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ FocusInterceptor(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
