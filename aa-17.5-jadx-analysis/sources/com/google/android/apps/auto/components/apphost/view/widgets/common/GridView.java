package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;
import com.google.android.projection.gearhead.R;
import defpackage.ca;
import defpackage.geu;
import defpackage.kdk;
import defpackage.kdm;
import defpackage.kdn;
import defpackage.nrd;
import defpackage.oww;
import defpackage.uw;
import defpackage.yfq;
import defpackage.yls;

/* loaded from: classes2.dex */
public class GridView extends FrameLayout {
    public final int a;
    public kdk b;
    public TextView c;
    public AutoTunedRecyclerView d;
    public geu e;
    public boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public uw k;
    private ViewGroup l;
    private GridPagedListView m;
    private final ca n;

    public GridView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = new kdm(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateGridItemsPerRow, R.attr.templateGridItemHorizontalSpacingForSetItemSize, R.attr.templateGridItemMinimumWidth, R.attr.templateGridLauncherWidthFraction, R.attr.templateHalfGridBottomPadding, R.attr.templateHalfGridHorizontalPadding});
        this.a = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void e(int i) {
        a().setVisibility(i);
    }

    public final GridPagedListView a() {
        GridPagedListView gridPagedListView = this.m;
        gridPagedListView.getClass();
        return gridPagedListView;
    }

    public final AutoTunedRecyclerView b() {
        AutoTunedRecyclerView autoTunedRecyclerView = this.d;
        autoTunedRecyclerView.getClass();
        return autoTunedRecyclerView;
    }

    public final void c() {
        a().l(0);
    }

    public final void d() {
        boolean z = this.f;
        ViewGroup viewGroup = this.l;
        if (z) {
            viewGroup.setVisibility(0);
            this.c.setVisibility(4);
            e(4);
            return;
        }
        viewGroup.setVisibility(8);
        int iA = this.b.a();
        TextView textView = this.c;
        if (iA == 0) {
            textView.setVisibility(0);
            e(8);
            this.c.setFocusable(true);
        } else {
            textView.setVisibility(8);
            e(0);
        }
        setClipChildren(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws IllegalStateException {
        super.onFinishInflate();
        this.l = (ViewGroup) findViewById(R.id.progress_container);
        this.c = (TextView) findViewById(R.id.list_no_items_text);
        Context context = getContext();
        int i = yfq.d;
        this.b = new kdk(context, yls.a);
        GridPagedListView gridPagedListView = (GridPagedListView) findViewById(R.id.grid_paged_list_view);
        this.m = gridPagedListView;
        gridPagedListView.getClass();
        gridPagedListView.c(this.b);
        this.m.n = nrd.a().c();
        AutoTunedRecyclerView autoTunedRecyclerView = (AutoTunedRecyclerView) this.m.i();
        this.d = autoTunedRecyclerView;
        autoTunedRecyclerView.getClass();
        autoTunedRecyclerView.Z(this.b);
        new oww(this.d).e(this.d);
        b().ay(new kdn(this));
        this.b.q(this.n);
        d();
    }

    public GridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public GridView(Context context) {
        this(context, null);
    }
}
