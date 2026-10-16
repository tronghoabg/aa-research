package com.google.android.apps.auto.components.ui.actionpanel;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.eow;
import defpackage.krj;
import defpackage.leh;
import defpackage.nmp;
import defpackage.olh;
import defpackage.yph;
import defpackage.yzz;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ExpandingActionPanel extends RelativeLayout {
    public static final yph a = yph.c("GH.ExpandingPanel");
    final List b;
    public boolean c;
    public Rect d;
    public yzz e;
    public ComponentName f;
    public RelativeLayout g;
    FrameLayout h;
    public FrameLayout i;
    public ConstraintLayout j;
    public boolean k;
    public View l;
    public ImageButton m;
    ViewGroupOverlay n;
    private final FrameLayout[] o;
    private final boolean p;
    private Context q;
    private FlexboxLayout r;
    private FrameLayout s;
    private FrameLayout t;
    private FrameLayout u;
    private LinearLayout v;

    public ExpandingActionPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new FrameLayout[6];
        this.b = new ArrayList();
        this.c = false;
        this.e = yzz.UNKNOWN_CONTEXT;
        this.q = context;
        leh.a();
        this.p = true;
    }

    private static View h(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() == 0) {
            return null;
        }
        return frameLayout.getChildAt(0);
    }

    private final List i() {
        ArrayList arrayList = new ArrayList();
        FrameLayout[] frameLayoutArr = this.o;
        int length = frameLayoutArr.length;
        for (int i = 0; i < 6; i++) {
            FrameLayout frameLayout = frameLayoutArr[i];
            if (h(frameLayout) != null) {
                arrayList.add(frameLayout);
            }
        }
        return arrayList;
    }

    private final void j(FrameLayout frameLayout, View view) {
        frameLayout.removeAllViews();
        if (view != null) {
            this.n.clear();
            frameLayout.addView(view);
            if (this.p) {
                frameLayout.setOnFocusChangeListener(new krj((Object) view, 2));
            }
            view.setFocusable(false);
            view.setClickable(false);
        }
        View viewH = h(frameLayout);
        if (viewH == null) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.setOnClickListener(new nmp(viewH, 17));
        frameLayout.setFocusable(!this.k || viewH.isEnabled());
        if (this.k) {
            frameLayout.setClickable(viewH.isEnabled());
        }
        frameLayout.setDescendantFocusability(393216);
    }

    private final void k(View view) {
        j(this.s, view);
        if (this.s.getVisibility() == 8) {
            this.s.setVisibility(4);
        }
    }

    private final void l(View view) {
        j(this.u, view);
        if (this.u.getVisibility() == 8) {
            this.u.setVisibility(4);
        }
    }

    private final void m(FrameLayout frameLayout, int i) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        frameLayout.setPadding(0, 0, 0, 0);
        layoutParams.width = this.q.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
        layoutParams.height = this.q.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
        frameLayout.setBackground(null);
        frameLayout.setForeground(this.q.getDrawable(i));
    }

    public final void a(List list, boolean z) {
        FrameLayout[] frameLayoutArr;
        ArrayList arrayList = new ArrayList(list);
        this.s.removeAllViews();
        this.u.removeAllViews();
        for (int i = 0; i < 6; i++) {
            this.o[i].removeAllViews();
        }
        if (arrayList.isEmpty()) {
            k(null);
            l(null);
        } else {
            if (z) {
                k(null);
            } else {
                k((View) arrayList.remove(0));
            }
            if (arrayList.size() > 1) {
                l(this.m);
            } else if (arrayList.size() == 1) {
                l((View) arrayList.remove(0));
            } else {
                l(null);
            }
        }
        int i2 = 0;
        while (true) {
            frameLayoutArr = this.o;
            int length = frameLayoutArr.length;
            if (i2 >= 6) {
                break;
            }
            if (arrayList.isEmpty()) {
                j(frameLayoutArr[i2], null);
            } else {
                j(frameLayoutArr[i2], (View) arrayList.remove(0));
                frameLayoutArr[i2].setFocusable(this.c);
                frameLayoutArr[i2].setClickable(this.c);
                frameLayoutArr[i2].setVisibility(true == this.c ? 0 : 4);
            }
            i2++;
        }
        if (i().size() == 0) {
            if (this.c) {
                b(false);
                return;
            }
            return;
        }
        FlexboxLayout.LayoutParams layoutParams = (FlexboxLayout.LayoutParams) frameLayoutArr[3].getLayoutParams();
        FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) frameLayoutArr[2].getLayoutParams();
        layoutParams.s();
        layoutParams2.s();
        frameLayoutArr[3].setLayoutParams(layoutParams);
        frameLayoutArr[2].setLayoutParams(layoutParams2);
        this.l.setVisibility(true != this.c ? 4 : 0);
    }

    public final void b(boolean z) {
        this.c = z;
        this.m.setActivated(z);
        TransitionSet transitionSet = new TransitionSet();
        boolean z2 = this.c;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setInterpolator(new eow());
            changeBounds.setDuration(getResources().getInteger(R.integer.un_expandable_action_shelf_open_duration));
            olh olhVar = new olh();
            olhVar.setInterpolator(changeBounds.getInterpolator());
            olhVar.setDuration(changeBounds.getDuration());
            Fade fade = new Fade(1);
            fade.setDuration(getResources().getInteger(R.integer.un_expandable_action_icon_fade_in_duration));
            fade.setStartDelay(getResources().getInteger(R.integer.un_expandable_action_icon_fade_in_duration));
            Fade fade2 = new Fade(2);
            fade2.setDuration(getResources().getInteger(R.integer.un_expandable_action_text_fade_out_duration));
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(fade);
            transitionSet.addTransition(fade2);
            transitionSet.addTransition(olhVar);
            TransitionManager.beginDelayedTransition(this, transitionSet);
            for (FrameLayout frameLayout : i()) {
                frameLayout.setClickable(true);
                frameLayout.setVisibility(0);
                frameLayout.setFocusable(true);
            }
            this.v.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.l.setVisibility(0);
        } else {
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds2.setInterpolator(new eow());
            changeBounds2.setDuration(getResources().getInteger(R.integer.un_expandable_action_shelf_close_duration));
            olh olhVar2 = new olh();
            olhVar2.setInterpolator(changeBounds2.getInterpolator());
            olhVar2.setDuration(changeBounds2.getDuration());
            Fade fade3 = new Fade(2);
            fade3.setDuration(getResources().getInteger(R.integer.un_expandable_action_icon_fade_out_duration));
            Fade fade4 = new Fade(1);
            fade4.setDuration(getResources().getInteger(R.integer.un_expandable_action_icon_fade_in_duration));
            transitionSet.addTransition(changeBounds2);
            transitionSet.addTransition(fade3);
            transitionSet.addTransition(fade4);
            transitionSet.addTransition(olhVar2);
            TransitionManager.beginDelayedTransition(this, transitionSet);
            for (FrameLayout frameLayout2 : i()) {
                frameLayout2.setClickable(false);
                frameLayout2.setVisibility(4);
                frameLayout2.setFocusable(false);
            }
            this.v.setVisibility(0);
            this.l.setVisibility(4);
            this.v.setAlpha(1.0f);
            this.v.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout != null) {
            relativeLayout.setDescendantFocusability(true != this.c ? 262144 : 393216);
            View childAt = this.g.getChildAt(0);
            if (childAt != null) {
                childAt.setClickable(!this.c);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.action_panel_secondary_shelf_bottom_margin);
        FlexboxLayout flexboxLayout = this.r;
        if (!this.c) {
            f = dimensionPixelSize;
        }
        flexboxLayout.setTranslationY(f);
    }

    public final void c(View view) {
        this.i.removeAllViews();
        if (view == null) {
            this.i.setVisibility(4);
            return;
        }
        this.n.clear();
        this.i.addView(view);
        this.i.setVisibility(0);
        this.i.setOnClickListener(new nmp(view, 15));
        this.i.setOnFocusChangeListener(view.getOnFocusChangeListener());
        this.i.setDescendantFocusability(393216);
        this.i.setFocusable(true);
        view.setDuplicateParentStateEnabled(true);
    }

    public final void d(View view) {
        j(this.h, view);
        View viewH = h(this.h);
        if (viewH == null || viewH.getVisibility() != 4) {
            return;
        }
        this.h.setFocusable(false);
        this.h.setClickable(false);
    }

    public final void e(View view) {
        j(this.t, view);
        View viewH = h(this.t);
        if (viewH == null || viewH.getVisibility() != 4) {
            return;
        }
        this.t.setFocusable(false);
        this.t.setClickable(false);
    }

    public final void f(View view) {
        this.v.removeAllViews();
        if (view != null) {
            this.v.addView(view);
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean g() {
        return this.i.requestFocus();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        ConstraintLayout constraintLayout = this.j;
        if (constraintLayout != null) {
            constraintLayout.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        super.onFinishInflate();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialer_incall_activatable_button_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        ImageButton imageButton = new ImageButton(this.q, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
        this.m = imageButton;
        imageButton.setLayoutParams(layoutParams);
        ImageButton imageButton2 = this.m;
        Resources resources = getResources();
        Resources.Theme theme = this.q.getTheme();
        boolean z3 = this.p;
        imageButton2.setImageDrawable(resources.getDrawable(true != z3 ? R.drawable.ic_more_vert_black_circle_no_circle : R.drawable.material_ic_more, theme));
        ImageButton imageButton3 = this.m;
        Context context = this.q;
        if (z3) {
            colorStateList = context.getColorStateList(R.color.material_ic_activatable_button_color);
            z2 = false;
            z = true;
        } else {
            colorStateList = context.getColorStateList(R.color.boardwalk_ic_activatable_button_color);
            z = false;
            z2 = true;
        }
        imageButton3.setImageTintList(colorStateList);
        this.m.setBackgroundResource(true != z2 ? R.drawable.material_ic_activatable_button_oval_background : R.drawable.boardwalk_ic_activatable_button_background);
        this.m.setOnClickListener(new nmp(this, 16));
        this.g = (RelativeLayout) findViewById(R.id.action_panel_above_panel_holder);
        this.r = (FlexboxLayout) findViewById(R.id.action_shelf);
        this.l = findViewById(R.id.action_panel_scrim);
        this.j = (ConstraintLayout) findViewById(R.id.metadata_inset);
        this.v = (LinearLayout) findViewById(R.id.metadata_holder);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.left_most_wrapper);
        this.s = frameLayout;
        List list = this.b;
        list.add(frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.left_wrapper);
        this.h = frameLayout2;
        list.add(frameLayout2);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.prime_action_container);
        this.i = frameLayout3;
        list.add(frameLayout3);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.right_wrapper);
        this.t = frameLayout4;
        list.add(frameLayout4);
        FrameLayout frameLayout5 = (FrameLayout) findViewById(R.id.right_most_wrapper);
        this.u = frameLayout5;
        list.add(frameLayout5);
        if (z) {
            ViewGroup.LayoutParams layoutParams2 = this.m.getLayoutParams();
            layoutParams2.width = this.q.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
            layoutParams2.height = this.q.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
            m(this.s, R.drawable.gearhead_material_oval_focus_background);
            m(this.h, R.drawable.gearhead_material_oval_focus_background);
            m(this.t, R.drawable.gearhead_material_oval_focus_background);
            m(this.u, R.drawable.gearhead_material_oval_activatable_focus_background);
        }
        int[] iArr = {R.id.custom_wrapper_1, R.id.custom_wrapper_2, R.id.custom_wrapper_3, R.id.custom_wrapper_4, R.id.custom_wrapper_5, R.id.custom_wrapper_6};
        for (int i = 0; i < 6; i++) {
            if (z) {
                FrameLayout frameLayout6 = (FrameLayout) findViewById(iArr[i]);
                m(frameLayout6, R.drawable.gearhead_material_oval_focus_background);
                this.o[i] = frameLayout6;
                list.add(frameLayout6);
            } else {
                FrameLayout[] frameLayoutArr = this.o;
                FrameLayout frameLayout7 = (FrameLayout) findViewById(iArr[i]);
                frameLayoutArr[i] = frameLayout7;
                list.add(frameLayout7);
            }
        }
        if (!z) {
            ((Space) findViewById(R.id.left_most_space)).setVisibility(0);
            ((Space) findViewById(R.id.right_most_space)).setVisibility(0);
        }
        this.n = getOverlay();
    }

    public ExpandingActionPanel(Context context) {
        super(context);
        this.o = new FrameLayout[6];
        this.b = new ArrayList();
        this.c = false;
        this.e = yzz.UNKNOWN_CONTEXT;
        leh.a();
        this.p = true;
    }
}
