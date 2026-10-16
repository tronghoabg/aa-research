package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u0002\b\u000b¢\u0006\u0004\b\t\u0010\n¨\u0006*"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/view/widgets/navigation/FloatingNavBarView;", "Lcom/android/car/libraries/apphost/map/widgets/BaseFloatingNavBarView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/jvm/JvmOverloads;", "turnSymbolView", "Landroid/widget/ImageView;", "distanceText", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/CarTextView;", "descriptionText", "onFinishInflate", "", "setTurnSymbol", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "turnIconParams", "Lcom/android/car/libraries/apphost/view/common/ImageViewParams;", "turnIcon", "Landroidx/car/app/model/CarIcon;", "setDistance", "distance", "Landroidx/car/app/model/Distance;", "setDescription", "cue", "Landroidx/car/app/model/CarText;", "updateFloatingNavBar", "navigationData", "Lcom/android/car/libraries/apphost/common/ResponsiveTurnCardData;", "floatingNavBarContainer", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/BleedingCardView;", "progressView", "Lcom/android/car/libraries/apphost/map/widgets/ProgressView;", "actionStrip", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/ActionStripView;", "mapActionStrip", "java.com.google.android.apps.auto.components.apphost.view.widgets.navigation_navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FloatingNavBarView extends defpackage.gpo {
    public android.widget.ImageView a;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView b;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView c;

    public /* synthetic */ FloatingNavBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, defpackage.affu affuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        android.view.View viewFindViewById = findViewById(com.google.android.projection.gearhead.R.id.turn_symbol);
        viewFindViewById.getClass();
        this.a = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(com.google.android.projection.gearhead.R.id.distance_text);
        viewFindViewById2.getClass();
        this.b = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) viewFindViewById2;
        android.view.View viewFindViewById3 = findViewById(com.google.android.projection.gearhead.R.id.description_text);
        viewFindViewById3.getClass();
        this.c = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) viewFindViewById3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingNavBarView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
