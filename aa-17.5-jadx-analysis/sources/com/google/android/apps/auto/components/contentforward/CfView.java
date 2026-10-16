package com.google.android.apps.auto.components.contentforward;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard;
import com.google.android.apps.auto.components.nocontentview.NoContentView;
import com.google.android.apps.auto.components.ui.listview.GhListView;
import com.google.android.apps.auto.components.ui.listview.UnListView;
import com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.projection.gearhead.R;
import defpackage.jzv;
import defpackage.leh;
import defpackage.olk;
import defpackage.oll;
import defpackage.olm;
import defpackage.olr;
import defpackage.yph;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public class CfView extends FrameLayout {
    UnListView a;
    SpeedbumpView b;
    public ImageView c;
    public ViewGroup d;
    private final boolean e;
    private NoContentView f;
    private AlphaJumpKeyboard g;
    private final olk h;
    private final olk i;

    static {
        yph.c("GH.ContentForwardView");
    }

    public CfView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        leh.a();
        this.e = true;
        jzv jzvVar = new jzv(this, 3);
        this.h = jzvVar;
        jzv jzvVar2 = new jzv(this, 4);
        this.i = jzvVar2;
        int i3 = olr.a;
        new Semaphore(1);
        olm.a();
        new oll(context, jzvVar);
        olm.a();
        new oll(context, jzvVar2);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.g.dispatchApplyWindowInsets(windowInsets);
        this.a.dispatchApplyWindowInsets(windowInsets);
        this.f.dispatchApplyWindowInsets(windowInsets);
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        this.a = (UnListView) findViewById(R.id.list_view);
        findViewById(R.id.list_view_focus_cluster);
        this.f = (NoContentView) findViewById(R.id.no_content_view);
        findViewById(R.id.fab);
        this.g = (AlphaJumpKeyboard) findViewById(R.id.alpha_jump_keyboard);
        this.c = (ImageView) findViewById(R.id.transition_image_view);
        this.d = (ViewGroup) findViewById(R.id.transitionable_container);
        SpeedbumpView speedbumpView = (SpeedbumpView) findViewById(R.id.speedbump_view);
        this.b = speedbumpView;
        UnListView unListView = this.a;
        speedbumpView.f = unListView;
        CarLayoutManager carLayoutManager = unListView.a.g;
        carLayoutManager.h = true;
        carLayoutManager.j = true;
        carLayoutManager.k = true;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.app_bar_height);
        UnListView unListView2 = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) unListView2.a.getLayoutParams();
        marginLayoutParams.setMargins(0, dimensionPixelSize, 0, 0);
        unListView2.a.setLayoutParams(marginLayoutParams);
        boolean z = this.e;
        int i = true != z ? 2131233116 : R.drawable.pagination_up_button;
        UnListView unListView3 = this.a;
        Drawable drawable = getResources().getDrawable(i);
        Drawable drawable2 = getResources().getDrawable(true != z ? 2131233114 : R.drawable.pagination_down_button);
        GhListView ghListView = unListView3.a;
        ((ImageView) ghListView.findViewById(R.id.page_up)).setImageDrawable(drawable);
        ((ImageView) ghListView.findViewById(R.id.page_down)).setImageDrawable(drawable2);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public CfView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CfView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
