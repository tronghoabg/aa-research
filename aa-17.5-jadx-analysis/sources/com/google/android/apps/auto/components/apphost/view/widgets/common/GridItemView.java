package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.car.app.model.CarText;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.projection.gearhead.R;
import defpackage.geu;
import defpackage.ghv;
import defpackage.hlu;
import defpackage.hlv;
import defpackage.yph;

/* loaded from: classes2.dex */
public class GridItemView extends LinearLayout {
    private static final int[] A;
    public static final hlv a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final Drawable o;
    public final Drawable p;
    public final int q;
    public final int r;
    public LinearLayout s;
    public CarTextView t;
    public CarTextView u;
    public ShapeableImageView v;
    public ProgressBar w;
    public ShapeableImageView x;
    public ImageView y;
    public LinearLayout z;

    static {
        yph.c("CarApp.H.Tem");
        A = new int[]{R.attr.templateFocusStateInactive};
        hlv hlvVar = hlv.a;
        hlu hluVar = new hlu();
        hluVar.a = ghv.b;
        hluVar.d = 0;
        a = hluVar.a();
    }

    public GridItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateGridItemImageSizeSmall, R.attr.templateGridItemImageSizeMedium, R.attr.templateGridItemDefaultIconTint, R.attr.templateGridItemTextBottomPadding, R.attr.templateGridItemBackground, R.attr.templateGridItemBadgeDotDefaultColor, R.attr.templateGridItemIconBadgeSizeMedium, R.attr.templateGridItemViewPadding, R.attr.templateGridItemImageSizeLarge, R.attr.templateGridItemImageSizeExtraLarge, R.attr.templateGridItemImagePlaceholderCircle, R.attr.templateGridItemImagePlaceholderSquare, R.attr.templateGridItemNotificationBadgeSizeMedium, R.attr.templateGridItemNotificationBadgeMarginMedium, R.attr.colorSecondary, R.attr.colorOnSecondary});
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.g = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.i = typedArrayObtainStyledAttributes.getDrawable(4);
        this.j = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
        this.o = typedArrayObtainStyledAttributes.getDrawable(10);
        this.p = typedArrayObtainStyledAttributes.getDrawable(11);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        this.k = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.l = typedArrayObtainStyledAttributes.getColor(15, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void b(geu geuVar, CarTextView carTextView, CarText carText, hlv hlvVar, boolean z) {
        carTextView.setVisibility(true != z ? 8 : 0);
        carTextView.b(geuVar, carText, hlvVar);
    }

    public final hlu a(CarTextView carTextView) {
        hlv hlvVar = hlv.a;
        hlu hluVar = new hlu();
        hluVar.d = 10;
        hluVar.c = new Rect(0, 0, (int) carTextView.getTextSize(), (int) carTextView.getTextSize());
        hluVar.e = carTextView.getCurrentTextColor();
        return hluVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        if (!this.b) {
            return super.onCreateDrawableState(i);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(iArrOnCreateDrawableState, A);
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.s = (LinearLayout) findViewById(R.id.grid_item_text_container);
        this.t = (CarTextView) findViewById(R.id.grid_item_title);
        this.u = (CarTextView) findViewById(R.id.grid_item_text);
        this.v = (ShapeableImageView) findViewById(R.id.grid_item_image);
        this.w = (ProgressBar) findViewById(R.id.grid_item_progress_bar);
        this.x = (ShapeableImageView) findViewById(R.id.grid_item_icon_badge);
        this.z = (LinearLayout) findViewById(R.id.grid_item_image_container);
        this.y = (ImageView) findViewById(R.id.notification_badge);
    }

    public GridItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridItemView(Context context) {
        this(context, null);
    }
}
