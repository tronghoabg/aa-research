package com.google.android.apps.auto.components.apphost.view.widgets.common;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u0002\b\u000b¢\u0006\u0004\b\t\u0010\nÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/view/widgets/common/BleedingCardView;", "Lcom/android/car/libraries/apphost/basewidgets/BaseBleedingCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/jvm/JvmOverloads;", "horizontalInsets", "getCardWidthFraction", "", "Landroidx/annotation/VisibleForTesting;", "setCardWidthIfNeeded", "", "setWindowInset", "windowInset", "Landroid/view/WindowInsets;", "java.com.google.android.apps.auto.components.apphost.view.widgets.common_common", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class BleedingCardView extends defpackage.fvu {
    private int f;

    public /* synthetic */ BleedingCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, defpackage.affu affuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // defpackage.fvu
    public final void c() {
        float f = this.c;
        if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || getLayoutParams() == null) {
            return;
        }
        int i = getResources().getDisplayMetrics().widthPixels - this.f;
        int i2 = this.e;
        getLayoutParams().width = defpackage.afqt.e(defpackage.afqt.f((int) (i * f), i2), this.d);
    }

    public final void f(android.view.WindowInsets windowInsets) {
        int systemWindowInsetLeft;
        int systemWindowInsetRight;
        windowInsets.getClass();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars() | android.view.WindowInsets.Type.ime());
            insets.getClass();
            systemWindowInsetLeft = insets.left;
            systemWindowInsetRight = insets.right;
        } else {
            systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        }
        this.f = systemWindowInsetLeft + systemWindowInsetRight;
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleedingCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleedingCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleedingCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleedingCardView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
