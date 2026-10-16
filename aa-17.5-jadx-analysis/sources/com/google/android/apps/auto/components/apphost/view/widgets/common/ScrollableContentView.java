package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.jtq;
import defpackage.leh;
import defpackage.oxf;

/* loaded from: classes2.dex */
public class ScrollableContentView extends LinearLayout {
    public ObservableScrollView a;
    private final float b;
    private final int c;
    private final int d;
    private final boolean e;
    private PagedScrollBarView f;
    private ViewGroup g;
    private View h;

    public ScrollableContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        leh.a();
        this.e = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateAdaptiveWidthFraction, R.attr.templateScrollbarButtonPadding, R.attr.templateScrollbarWidth});
        this.b = typedArrayObtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void d() {
        if (this.h == null) {
            return;
        }
        int iC = jtq.c(getContext(), this.b);
        int i = this.d;
        int iMax = Math.max(iC, i);
        int i2 = this.f.getVisibility() == 0 ? iMax - i : iMax;
        ViewGroup viewGroup = this.g;
        viewGroup.setPaddingRelative(i2, viewGroup.getPaddingTop(), iMax, this.g.getPaddingBottom());
        ViewGroup viewGroup2 = this.g;
        viewGroup2.setClipToPadding(viewGroup2.getClipChildren());
    }

    public final void a() {
        this.a.scrollTo(0, 0);
    }

    public final void b(View view) {
        this.g.removeAllViews();
        if (view != null) {
            this.g.addView(view);
        }
        this.h = view;
        d();
        c();
    }

    public final void c() {
        int height = this.a.getHeight();
        int height2 = this.a.getChildAt(0).getHeight();
        int i = height - height2;
        PagedScrollBarView pagedScrollBarView = this.f;
        if (i < 0) {
            pagedScrollBarView.setVisibility(0);
            int scrollY = this.a.getScrollY();
            int iMin = Math.min(1000, (height * 1000) / height2);
            int i2 = height2 - height;
            this.f.e(1000, Math.min(1000, (scrollY * 1000) / i2), iMin, false);
            this.f.g(scrollY != 0);
            this.f.d(scrollY < i2);
        } else {
            pagedScrollBarView.setVisibility(8);
        }
        invalidate();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ObservableScrollView) findViewById(R.id.scroll_view);
        this.f = (PagedScrollBarView) findViewById(R.id.paged_scroll_bar_view);
        this.g = (ViewGroup) findViewById(R.id.content_container);
        Resources resources = getResources();
        ImageView imageView = (ImageView) findViewById(R.id.page_up);
        boolean z = this.e;
        int i = 1;
        imageView.setImageDrawable(resources.getDrawable(true != z ? 2131233116 : R.drawable.pagination_up_button));
        ((ImageView) findViewById(R.id.page_down)).setImageDrawable(resources.getDrawable(true != z ? 2131233114 : R.drawable.pagination_down_button));
        int i2 = this.c;
        this.f.setPadding(0, i2, 0, i2);
        this.a.setVerticalScrollBarEnabled(false);
        this.f.c(2);
        this.a.a = new ajmd(this);
        this.f.j = new oxf(this, i);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
        d();
    }

    public ScrollableContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollableContentView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ScrollableContentView(Context context) {
        this(context, null);
    }
}
