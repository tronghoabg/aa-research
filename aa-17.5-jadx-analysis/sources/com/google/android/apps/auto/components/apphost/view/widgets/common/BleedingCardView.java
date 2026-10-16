package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.afeu;
import defpackage.afpt;
import defpackage.fvk;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/view/widgets/common/BleedingCardView;", "Lcom/android/car/libraries/apphost/basewidgets/BaseBleedingCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "horizontalInsets", "getCardWidthFraction", "", "setCardWidthIfNeeded", "", "setWindowInset", "windowInset", "Landroid/view/WindowInsets;", "java.com.google.android.apps.auto.components.apphost.view.widgets.common_common"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BleedingCardView extends fvk {
    private int f;

    public /* synthetic */ BleedingCardView(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // defpackage.fvk
    public final void c() {
        float f = this.c;
        if (f <= BitmapDescriptorFactory.HUE_RED || getLayoutParams() == null) {
            return;
        }
        int i = getResources().getDisplayMetrics().widthPixels - this.f;
        int i2 = this.e;
        getLayoutParams().width = afpt.e(afpt.f((int) (i * f), i2), this.d);
    }

    public final void f(WindowInsets windowInsets) {
        int systemWindowInsetLeft;
        int systemWindowInsetRight;
        windowInsets.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
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
    public BleedingCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleedingCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleedingCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleedingCardView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
