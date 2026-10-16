package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Place;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.aczc;
import defpackage.ca;
import defpackage.gef;
import defpackage.geu;
import defpackage.hhx;
import defpackage.hii;
import defpackage.him;
import defpackage.hin;
import defpackage.kdw;
import defpackage.kdx;
import defpackage.keb;
import defpackage.kec;
import defpackage.ked;
import defpackage.oww;
import defpackage.uw;
import defpackage.yfl;
import defpackage.yfq;
import defpackage.yls;
import java.util.List;

/* loaded from: classes2.dex */
public class RowListView extends FrameLayout {
    public final int a;
    public final int b;
    public kdw c;
    public TextView d;
    public ViewGroup e;
    public ImageView f;
    public RowPagedListView g;
    public geu h;
    public hii i;
    public boolean j;
    public uw k;
    private final float l;
    private final int m;
    private final float n;
    private final float o;
    private ViewGroup p;
    private AutoTunedRecyclerView q;
    private boolean r;
    private final ca s;

    public RowListView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        this.s = new keb(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateHalfListBottomPadding, R.attr.templateFullListBottomPadding, R.attr.templateRowListStyle, R.attr.templateRowListToLargeImageRatio, R.attr.templateRowListLargeImageContainerMaxWidth, R.attr.templateRowListLargeImageAspectRatio});
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.n = typedArrayObtainStyledAttributes.getFloat(3, BitmapDescriptorFactory.HUE_RED);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.o = typedArrayObtainStyledAttributes.getFloat(5, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{R.attr.listWidthFraction});
        this.l = typedArrayObtainStyledAttributes2.getFloat(0, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public static final boolean i(CarIcon carIcon, boolean z) {
        return (carIcon == null || z) ? false : true;
    }

    private final void j(int i, boolean z) {
        kdx kdxVarB = b(i);
        if (kdxVarB != null) {
            kdxVarB.c(z, true);
        }
    }

    public final him a(int i) {
        List list = this.i.i;
        if (i < 0 || i >= ((yls) list).c) {
            return null;
        }
        return (him) list.get(i);
    }

    public final kdx b(int i) {
        View viewU = c().g.U(i);
        if (viewU instanceof kdx) {
            return (kdx) viewU;
        }
        return null;
    }

    public final RowPagedListView c() {
        RowPagedListView rowPagedListView = this.g;
        rowPagedListView.getClass();
        return rowPagedListView;
    }

    public final AutoTunedRecyclerView d() {
        AutoTunedRecyclerView autoTunedRecyclerView = this.q;
        autoTunedRecyclerView.getClass();
        return autoTunedRecyclerView;
    }

    public final void e() {
        Place place;
        AutoTunedRecyclerView autoTunedRecyclerView = this.q;
        autoTunedRecyclerView.getClass();
        CarLayoutManager carLayoutManagerG = autoTunedRecyclerView.g();
        carLayoutManagerG.getClass();
        int iM = carLayoutManagerG.m();
        int iX = carLayoutManagerG.x() + 1;
        if (this.h == null) {
            return;
        }
        yfl yflVar = new yfl(4);
        for (int i = iM; i < iX; i++) {
            him himVarA = a(i);
            if (himVarA != null && (place = himVarA.c.getPlace()) != null) {
                yflVar.i(place);
            }
        }
        geu geuVar = this.h;
        geuVar.getClass();
        ((gef) geuVar.F(gef.class)).e(yflVar.g());
        uw uwVar = this.k;
        if (uwVar != null) {
            geu geuVar2 = this.h;
            geuVar2.getClass();
            geuVar2.t().l(uwVar, iM, iX);
        }
    }

    public final void f(geu geuVar, int i, boolean z) {
        hin hinVar;
        Runnable runnable;
        him himVarA = a(i);
        if (himVarA == null || (hinVar = himVarA.l) == null) {
            return;
        }
        int i2 = hinVar.b;
        boolean z2 = i2 == i;
        if (!z2) {
            j(i, true);
            j(i2, false);
            hinVar.b(i);
            if (aczc.s()) {
                c().g.aV();
            }
            if ((this.i.k & 16) != 0) {
                post(new hhx(this, i, 9));
            }
        }
        geuVar.t().q(hinVar.a, hinVar.a(i));
        if (z2 && z && (runnable = this.i.h) != null) {
            runnable.run();
        }
    }

    public final void g() {
        Integer num = this.i.t;
        if (num == null) {
            num = 0;
        }
        CarLayoutManager carLayoutManager = c().g;
        if (num.intValue() != 0) {
            c().l(num.intValue());
            return;
        }
        carLayoutManager.i = false;
        c().l(num.intValue());
        carLayoutManager.i = true;
    }

    public final void h() {
        boolean z = this.j;
        ViewGroup viewGroup = this.p;
        if (z) {
            viewGroup.setVisibility(0);
            this.d.setVisibility(4);
            c().setVisibility(4);
            this.e.setVisibility(4);
            return;
        }
        viewGroup.setVisibility(8);
        int iA = this.c.a();
        TextView textView = this.d;
        if (iA == 0) {
            textView.setVisibility(0);
            c().setVisibility(8);
            this.e.setVisibility(8);
        } else {
            textView.setVisibility(8);
            c().setVisibility(0);
            hii hiiVar = this.i;
            this.e.setVisibility(true != i(hiiVar.f, hiiVar.o) ? 8 : 0);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws IllegalStateException {
        super.onFinishInflate();
        this.p = (ViewGroup) findViewById(R.id.progress_container);
        this.d = (TextView) findViewById(R.id.list_no_items_text);
        Context context = getContext();
        int i = yfq.d;
        this.c = new kdw(context, yls.a);
        RowPagedListView rowPagedListView = (RowPagedListView) findViewById(R.id.list_view);
        this.g = rowPagedListView;
        AutoTunedRecyclerView autoTunedRecyclerView = (AutoTunedRecyclerView) rowPagedListView.i();
        this.q = autoTunedRecyclerView;
        autoTunedRecyclerView.Z(this.c);
        new oww(this.q).e(this.q);
        d().ay(new kec(this));
        this.c.q(this.s);
        this.e = (ViewGroup) findViewById(R.id.large_image_container);
        this.f = (ImageView) findViewById(R.id.large_image);
        c().q(new ked(this));
        h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        kdx kdxVar;
        super.onLayout(z, i, i2, i3, i4);
        if (this.r) {
            return;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= c().g.av()) {
                kdxVar = null;
                break;
            }
            View viewAD = c().g.aD(i5);
            if (viewAD instanceof kdx) {
                kdxVar = (kdx) viewAD;
                if (kdxVar.a() != null) {
                    break;
                }
            }
            i5++;
        }
        if (kdxVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            if (this.l >= BitmapDescriptorFactory.HUE_RED) {
                int iMin = Math.min(this.m, (int) (this.n * ((int) (getResources().getDisplayMetrics().widthPixels * r3))));
                layoutParams.setMarginEnd(72);
                layoutParams.width = iMin;
                float f = this.o;
                layoutParams.height = (int) (iMin * f);
                if (this.g != null && layoutParams.height > this.g.getHeight()) {
                    layoutParams.height = this.g.getHeight();
                    layoutParams.width = (int) (layoutParams.height / f);
                }
            }
            layoutParams.topMargin = kdxVar.getTop();
            this.e.setLayoutParams(layoutParams);
            this.r = true;
        }
    }

    public RowListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RowListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RowListView(Context context) {
        this(context, null);
    }
}
