package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.auto.sdk.ui.MaxWidthLayout;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class kek extends PagedListView {
    public static final yph d = yph.c("CarApp.H.Tem");
    private final MaxWidthLayout a;
    private final Handler b;
    private final int c;
    public final PagedScrollBarView e;
    public int f;
    private final int v;
    private final boolean w;
    private final boolean x;
    private boolean y;
    private final ca z;

    protected kek(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        this.z = new keh(this);
        this.b = new Handler(new kej(0));
        leh.a();
        this.x = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kdv.e, i, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tuned_paginated_buttons_width);
        this.c = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.v = dimensionPixelSize2;
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.w = z;
        typedArrayObtainStyledAttributes.recycle();
        PagedScrollBarView pagedScrollBarView = (PagedScrollBarView) findViewById(R.id.paged_scroll_view);
        this.e = pagedScrollBarView;
        k();
        MaxWidthLayout maxWidthLayout = (MaxWidthLayout) findViewById(R.id.max_width_layout);
        this.a = maxWidthLayout;
        maxWidthLayout.f = 0;
        Context context2 = getContext();
        if (z) {
            TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.templateDividerThickness, R.attr.templateDividerColor});
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1);
            int color = typedArrayObtainStyledAttributes2.getColor(1, -1);
            typedArrayObtainStyledAttributes2.recycle();
            View view = new View(context2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize3, -1);
            layoutParams.gravity = 8388613;
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(color);
            pagedScrollBarView.addView(view);
        }
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(new int[]{R.attr.scrollBarViewColor, R.attr.scrollBarColor});
        int color2 = typedArrayObtainStyledAttributes3.getColor(0, -1);
        typedArrayObtainStyledAttributes3.getColor(1, -1);
        typedArrayObtainStyledAttributes3.recycle();
        pagedScrollBarView.f(color2);
        pagedScrollBarView.getChildAt(0).setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
        pagedScrollBarView.setPadding(pagedScrollBarView.getPaddingLeft(), 0, pagedScrollBarView.getPaddingRight(), 0);
        ((ImageView) findViewById(R.id.page_up)).setImageDrawable(context2.getDrawable(R.drawable.pagination_up_button));
        ((ImageView) findViewById(R.id.page_down)).setImageDrawable(context2.getDrawable(R.drawable.pagination_down_button));
        n(2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pagedScrollBarView.getLayoutParams();
        layoutParams2.width = dimensionPixelSize;
        pagedScrollBarView.setLayoutParams(layoutParams2);
        pagedScrollBarView.setVisibility(8);
        i().ay(new kei(this));
        this.k = true;
        this.g.l = false;
        this.n = nrd.a().c();
        if (!(pagedScrollBarView.a.getVisibility() == 0 && pagedScrollBarView.b.getVisibility() == 0) && nrd.a().e()) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.sU).l());
        }
    }

    protected abstract yfq a();

    protected final void b() {
        Handler handler = this.b;
        yfq yfqVarA = a();
        handler.removeMessages(1);
        Message messageObtainMessage = handler.obtainMessage(1);
        messageObtainMessage.obj = yfqVarA;
        if (yfqVarA.isEmpty()) {
            handler.sendMessageDelayed(messageObtainMessage, 150L);
        } else {
            handler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedListView
    public final void c(lt ltVar) {
        lt ltVar2 = this.l ? this.p.m : this.o.m;
        if (ltVar2 != null) {
            ltVar2.r(this.z);
        }
        ltVar.q(this.z);
        super.c(ltVar);
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedListView
    public final void d(boolean z) {
        super.d(z);
        PagedScrollBarView pagedScrollBarView = this.e;
        boolean z2 = pagedScrollBarView.getVisibility() == 0;
        if (!z2) {
            pagedScrollBarView.setVisibility(8);
        }
        if (this.y == z2) {
            return;
        }
        this.y = z2;
        MaxWidthLayout maxWidthLayout = this.a;
        if (maxWidthLayout.isInLayout()) {
            maxWidthLayout.getClass();
            maxWidthLayout.post(new kea(maxWidthLayout, 2));
        }
    }

    protected kek(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected kek(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    protected kek(Context context) {
        this(context, null);
    }
}
