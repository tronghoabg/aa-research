package com.google.android.apps.auto.components.apphost.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.affa;
import defpackage.geu;
import defpackage.jtu;
import defpackage.jxj;
import defpackage.jxk;
import defpackage.leh;
import defpackage.owu;
import defpackage.oww;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u00062"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/menu/WrapperMenuView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "emptyListTextView", "Landroid/widget/TextView;", "pagedListView", "Lcom/google/android/apps/auto/sdk/ui/PagedListView;", "recyclerView", "Lcom/google/android/apps/auto/sdk/ui/AutoTunedRecyclerView;", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "adapter", "Lcom/google/android/apps/auto/components/apphost/menu/WrapperMenuAdapter;", "defaultItemsPerRow", "gridItemHorizontalSpacing", "gridItemMinWidth", "gridItemImageSizeExtraLarge", "scrollBarViewColor", "scrollBarColor", "onFinishInflate", "", "setMenu", "wrappers", "", "", "dispatchGenericMotionEvent", "", "event", "Landroid/view/MotionEvent;", "getItemsPerRow", "gridItemSize", "Lcom/android/car/libraries/apphost/menu/model/MenuItemSize;", "logScrollEventForContentModeration", "scrollDeltaY", "showGutterButton", "action", "Landroidx/car/app/model/Action;", "showGutterButton$java_com_google_android_apps_auto_components_apphost_menu_menu", "jumpToPosition", "position", "jumpToPosition$java_com_google_android_apps_auto_components_apphost_menu_menu", "Companion", "java.com.google.android.apps.auto.components.apphost.menu_menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WrapperMenuView extends LinearLayout {
    public TextView a;
    public PagedListView b;
    public AutoTunedRecyclerView c;
    public geu d;
    public final jxj e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperMenuView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.e = new jxj(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateGridItemsPerRow, R.attr.templateGridItemHorizontalSpacingForSetItemSize, R.attr.templateGridItemMinimumWidth, R.attr.scrollBarViewColor, R.attr.scrollBarColor, R.attr.templateGridItemImageSizeExtraLarge});
        typedArrayObtainStyledAttributes.getClass();
        this.f = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.j = typedArrayObtainStyledAttributes.getColor(3, -1);
        typedArrayObtainStyledAttributes.getColor(4, -1);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws IllegalStateException {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.list_no_items_text);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.menu_recycler_view);
        viewFindViewById2.getClass();
        PagedListView pagedListView = (PagedListView) viewFindViewById2;
        this.b = pagedListView;
        PagedListView pagedListView2 = null;
        if (pagedListView == null) {
            affa.d("pagedListView");
            pagedListView = null;
        }
        owu owuVarI = pagedListView.i();
        owuVarI.getClass();
        this.c = (AutoTunedRecyclerView) owuVarI;
        PagedListView pagedListView3 = this.b;
        if (pagedListView3 == null) {
            affa.d("pagedListView");
            pagedListView3 = null;
        }
        pagedListView3.k();
        AutoTunedRecyclerView autoTunedRecyclerView = this.c;
        if (autoTunedRecyclerView == null) {
            affa.d("recyclerView");
            autoTunedRecyclerView = null;
        }
        autoTunedRecyclerView.Z(this.e);
        AutoTunedRecyclerView autoTunedRecyclerView2 = this.c;
        if (autoTunedRecyclerView2 == null) {
            affa.d("recyclerView");
            autoTunedRecyclerView2 = null;
        }
        oww owwVar = new oww(autoTunedRecyclerView2);
        AutoTunedRecyclerView autoTunedRecyclerView3 = this.c;
        if (autoTunedRecyclerView3 == null) {
            affa.d("recyclerView");
            autoTunedRecyclerView3 = null;
        }
        owwVar.e(autoTunedRecyclerView3);
        AutoTunedRecyclerView autoTunedRecyclerView4 = this.c;
        if (autoTunedRecyclerView4 == null) {
            affa.d("recyclerView");
            autoTunedRecyclerView4 = null;
        }
        Context context = getContext();
        context.getClass();
        jtu.e(autoTunedRecyclerView4, context, true, false);
        leh.a.a();
        View viewFindViewById3 = findViewById(R.id.page_up);
        viewFindViewById3.getClass();
        ((ImageView) viewFindViewById3).setImageDrawable(getResources().getDrawable(R.drawable.pagination_up_button, getContext().getTheme()));
        View viewFindViewById4 = findViewById(R.id.page_down);
        viewFindViewById4.getClass();
        ((ImageView) viewFindViewById4).setImageDrawable(getResources().getDrawable(R.drawable.pagination_down_button, getContext().getTheme()));
        View viewFindViewById5 = findViewById(R.id.paged_scroll_view);
        viewFindViewById5.getClass();
        ((PagedScrollBarView) viewFindViewById5).f(this.j);
        if (this.b == null) {
            affa.d("pagedListView");
        }
        PagedListView pagedListView4 = this.b;
        if (pagedListView4 == null) {
            affa.d("pagedListView");
            pagedListView4 = null;
        }
        pagedListView4.n(0);
        PagedListView pagedListView5 = this.b;
        if (pagedListView5 == null) {
            affa.d("pagedListView");
        } else {
            pagedListView2 = pagedListView5;
        }
        pagedListView2.q(new jxk(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrapperMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrapperMenuView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrapperMenuView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ WrapperMenuView(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
