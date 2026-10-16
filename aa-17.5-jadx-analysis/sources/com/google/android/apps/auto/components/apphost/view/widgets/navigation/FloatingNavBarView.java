package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.gpe;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006)"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/view/widgets/navigation/FloatingNavBarView;", "Lcom/android/car/libraries/apphost/map/widgets/BaseFloatingNavBarView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "turnSymbolView", "Landroid/widget/ImageView;", "distanceText", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/CarTextView;", "descriptionText", "onFinishInflate", "", "setTurnSymbol", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "turnIconParams", "Lcom/android/car/libraries/apphost/view/common/ImageViewParams;", "turnIcon", "Landroidx/car/app/model/CarIcon;", "setDistance", "distance", "Landroidx/car/app/model/Distance;", "setDescription", "cue", "Landroidx/car/app/model/CarText;", "updateFloatingNavBar", "navigationData", "Lcom/android/car/libraries/apphost/common/ResponsiveTurnCardData;", "floatingNavBarContainer", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/BleedingCardView;", "progressView", "Lcom/android/car/libraries/apphost/map/widgets/ProgressView;", "actionStrip", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/ActionStripView;", "mapActionStrip", "java.com.google.android.apps.auto.components.apphost.view.widgets.navigation_navigation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FloatingNavBarView extends gpe {
    public ImageView a;
    public CarTextView b;
    public CarTextView c;

    public /* synthetic */ FloatingNavBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.turn_symbol);
        viewFindViewById.getClass();
        this.a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.distance_text);
        viewFindViewById2.getClass();
        this.b = (CarTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.description_text);
        viewFindViewById3.getClass();
        this.c = (CarTextView) viewFindViewById3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
