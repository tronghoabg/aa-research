package com.google.android.apps.auto.components.ui.actionpanel;

import android.content.Context;
import android.content.res.Resources;
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
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.eow;
import defpackage.geu;
import defpackage.krj;
import defpackage.ldz;
import defpackage.nmp;
import defpackage.olj;
import defpackage.yph;
import defpackage.yzz;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MaterialInCallViewExpandingActionPanel extends RelativeLayout {
    public static final /* synthetic */ int n = 0;
    final List a;
    public boolean b;
    public Context c;
    public yzz d;
    FrameLayout e;
    public MaterialActionButtonView f;
    public FrameLayout g;
    public LinearLayout h;
    public boolean i;
    public View j;
    public geu k;
    public ImageButton l;
    ViewGroupOverlay m;
    private final FrameLayout[] o;
    private FlexboxLayout p;
    private RelativeLayout q;
    private FrameLayout r;
    private FrameLayout s;
    private FrameLayout t;
    private ConstraintLayout u;
    private int v;
    private int w;
    private int x;

    static {
        yph.c("GH.ExpandingPanel");
    }

    public MaterialInCallViewExpandingActionPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new FrameLayout[6];
        this.a = new ArrayList();
        this.b = false;
        this.d = yzz.UNKNOWN_CONTEXT;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.c = context;
    }

    private static View f(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() == 0) {
            return null;
        }
        return frameLayout.getChildAt(0);
    }

    private final List g() {
        ArrayList arrayList = new ArrayList();
        FrameLayout[] frameLayoutArr = this.o;
        int length = frameLayoutArr.length;
        for (int i = 0; i < 6; i++) {
            FrameLayout frameLayout = frameLayoutArr[i];
            if (f(frameLayout) != null) {
                arrayList.add(frameLayout);
            }
        }
        return arrayList;
    }

    private final void h(FrameLayout frameLayout, View view) {
        frameLayout.removeAllViews();
        if (view != null) {
            this.m.clear();
            frameLayout.addView(view);
            frameLayout.setOnFocusChangeListener(new krj((Object) view, 3));
            view.setFocusable(false);
            view.setClickable(false);
        }
        View viewF = f(frameLayout);
        if (viewF == null) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.setOnClickListener(new nmp(viewF, 18));
        frameLayout.setFocusable(!this.i || viewF.isEnabled());
        if (this.i) {
            frameLayout.setClickable(viewF.isEnabled());
        }
        frameLayout.setDescendantFocusability(393216);
    }

    private final void i(View view) {
        h(this.r, view);
        if (this.r.getVisibility() == 8) {
            this.r.setVisibility(4);
        }
    }

    private final void j(View view) {
        h(this.t, view);
        if (this.t.getVisibility() == 8) {
            this.t.setVisibility(4);
        }
    }

    private final void k(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        frameLayout.setPadding(0, 0, 0, 0);
        layoutParams.width = this.c.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
        layoutParams.height = this.c.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
        frameLayout.setBackground(null);
        frameLayout.setForeground(this.c.getDrawable(R.drawable.gearhead_material_oval_activatable_focus_background));
    }

    public final void a(boolean z) {
        this.b = z;
        this.l.setActivated(z);
        TransitionSet transitionSet = new TransitionSet();
        boolean z2 = this.b;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setInterpolator(new eow());
            changeBounds.setDuration(getResources().getInteger(R.integer.un_expandable_action_shelf_open_duration));
            olj oljVar = new olj();
            oljVar.setInterpolator(changeBounds.getInterpolator());
            oljVar.setDuration(changeBounds.getDuration());
            Fade fade = new Fade(1);
            fade.setDuration(getResources().getInteger(R.integer.un_expandable_action_icon_fade_in_duration));
            fade.setStartDelay(getResources().getInteger(R.integer.un_expandable_action_icon_fade_in_duration));
            Fade fade2 = new Fade(2);
            fade2.setDuration(getResources().getInteger(R.integer.un_expandable_action_text_fade_out_duration));
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(fade);
            transitionSet.addTransition(fade2);
            transitionSet.addTransition(oljVar);
            TransitionManager.beginDelayedTransition(this, transitionSet);
            for (FrameLayout frameLayout : g()) {
                frameLayout.setClickable(true);
                frameLayout.setVisibility(0);
                frameLayout.setFocusable(true);
            }
            this.h.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.j.setVisibility(0);
        } else {
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds2.setInterpolator(new eow());
            changeBounds2.setDuration(getResources().getInteger(R.integer.un_expandable_action_shelf_close_duration));
            olj oljVar2 = new olj();
            oljVar2.setInterpolator(changeBounds2.getInterpolator());
            oljVar2.setDuration(changeBounds2.getDuration());
            Fade fade3 = new Fade(2);
            fade3.setDuration(getResources().getInteger(R.integer.un_expandable_action_icon_fade_out_duration));
            Fade fade4 = new Fade(1);
            fade4.setDuration(getResources().getInteger(R.integer.un_expandable_action_icon_fade_in_duration));
            transitionSet.addTransition(changeBounds2);
            transitionSet.addTransition(fade3);
            transitionSet.addTransition(fade4);
            transitionSet.addTransition(oljVar2);
            TransitionManager.beginDelayedTransition(this, transitionSet);
            for (FrameLayout frameLayout2 : g()) {
                frameLayout2.setClickable(false);
                frameLayout2.setVisibility(4);
                frameLayout2.setFocusable(false);
            }
            this.h.setVisibility(0);
            this.j.setVisibility(4);
            this.h.setAlpha(1.0f);
            this.h.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout != null) {
            relativeLayout.setDescendantFocusability(true != this.b ? 262144 : 393216);
            View childAt = this.q.getChildAt(0);
            if (childAt != null) {
                childAt.setClickable(!this.b);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.action_panel_secondary_shelf_bottom_margin);
        FlexboxLayout flexboxLayout = this.p;
        if (!this.b) {
            f = dimensionPixelSize;
        }
        flexboxLayout.setTranslationY(f);
    }

    public final void b(View view) {
        h(this.e, view);
        View viewF = f(this.e);
        if (viewF == null || viewF.getVisibility() != 4) {
            return;
        }
        this.e.setFocusable(false);
        this.e.setClickable(false);
    }

    public final void c(View view) {
        h(this.g, view);
        View viewF = f(this.g);
        if (viewF == null || viewF.getVisibility() != 4) {
            return;
        }
        this.g.setFocusable(false);
        this.g.setClickable(false);
    }

    public final void d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = this.c.getResources().getDimensionPixelSize(R.dimen.material_dialer_audio_route_selector_button_width);
        layoutParams.height = this.c.getResources().getDimensionPixelSize(R.dimen.material_dialer_audio_route_selector_button_height);
        view.setForeground(this.c.getDrawable(R.drawable.gearhead_material_audio_route_selector_focus_background));
    }

    public final void e(List list) {
        FrameLayout[] frameLayoutArr;
        ArrayList arrayList = new ArrayList(list);
        this.r.removeAllViews();
        this.t.removeAllViews();
        for (int i = 0; i < 6; i++) {
            this.o[i].removeAllViews();
        }
        if (arrayList.isEmpty()) {
            i(null);
            j(null);
        } else {
            i((View) arrayList.remove(0));
            if (arrayList.size() > 1) {
                j(this.l);
            } else if (arrayList.size() == 1) {
                j((View) arrayList.remove(0));
            } else {
                j(null);
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
                h(frameLayoutArr[i2], null);
            } else {
                View view = (View) arrayList.remove(0);
                h(frameLayoutArr[i2], view);
                frameLayoutArr[i2].setFocusable(this.b);
                frameLayoutArr[i2].setClickable(this.b);
                frameLayoutArr[i2].setVisibility(true == this.b ? 0 : 4);
                if (view.getId() == R.id.expanding_action_panel_audio_route_button) {
                    d(frameLayoutArr[i2]);
                }
            }
            i2++;
        }
        if (g().size() == 0) {
            if (this.b) {
                a(false);
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
        this.j.setVisibility(true != this.b ? 4 : 0);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        ConstraintLayout constraintLayout = this.u;
        if (constraintLayout != null) {
            constraintLayout.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
        }
        View viewFindViewById = findViewById(R.id.lower_action_bar);
        if (ldz.a().b() && viewFindViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            marginLayoutParams.bottomMargin = this.v + windowInsets.getSystemWindowInsetBottom();
            marginLayoutParams.leftMargin = this.w + windowInsets.getSystemWindowInsetLeft();
            marginLayoutParams.rightMargin = this.x + windowInsets.getSystemWindowInsetRight();
            viewFindViewById.setLayoutParams(marginLayoutParams);
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialer_incall_activatable_button_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        ImageButton imageButton = new ImageButton(this.c, null, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel, R.style.Widget_Boardwalk_Button_Borderless_ActionPanel);
        this.l = imageButton;
        imageButton.setLayoutParams(layoutParams);
        this.l.setImageDrawable(getResources().getDrawable(R.drawable.material_ic_more, this.c.getTheme()));
        this.l.setImageTintList(this.c.getColorStateList(R.color.material_ic_activatable_button_color));
        this.l.setBackgroundResource(R.drawable.material_ic_activatable_button_oval_background);
        this.l.setOnClickListener(new nmp(this, 19));
        this.q = (RelativeLayout) findViewById(R.id.action_panel_above_panel_holder);
        this.p = (FlexboxLayout) findViewById(R.id.action_shelf);
        this.j = findViewById(R.id.action_panel_scrim);
        this.u = (ConstraintLayout) findViewById(R.id.metadata_inset);
        this.h = (LinearLayout) findViewById(R.id.metadata_holder);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.left_most_wrapper);
        this.r = frameLayout;
        List list = this.a;
        list.add(frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.left_wrapper);
        this.e = frameLayout2;
        list.add(frameLayout2);
        this.s = (FrameLayout) findViewById(R.id.prime_action_container);
        this.f = (MaterialActionButtonView) findViewById(R.id.end_call_button);
        list.add(this.s);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.right_wrapper);
        this.g = frameLayout3;
        list.add(frameLayout3);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.right_most_wrapper);
        this.t = frameLayout4;
        list.add(frameLayout4);
        View viewFindViewById = findViewById(R.id.lower_action_bar);
        if (viewFindViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            this.v = marginLayoutParams.bottomMargin;
            this.w = marginLayoutParams.leftMargin;
            this.x = marginLayoutParams.rightMargin;
        }
        ViewGroup.LayoutParams layoutParams2 = this.l.getLayoutParams();
        layoutParams2.width = this.c.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
        layoutParams2.height = this.c.getResources().getDimensionPixelSize(R.dimen.material_dialer_action_panel_button_size);
        k(this.r);
        k(this.e);
        k(this.g);
        k(this.t);
        int[] iArr = {R.id.custom_wrapper_1, R.id.custom_wrapper_2, R.id.custom_wrapper_3, R.id.custom_wrapper_4, R.id.custom_wrapper_5, R.id.custom_wrapper_6};
        for (int i = 0; i < 6; i++) {
            FrameLayout frameLayout5 = (FrameLayout) findViewById(iArr[i]);
            k(frameLayout5);
            this.o[i] = frameLayout5;
            list.add(frameLayout5);
        }
        this.m = getOverlay();
    }

    public MaterialInCallViewExpandingActionPanel(Context context) {
        super(context);
        this.o = new FrameLayout[6];
        this.a = new ArrayList();
        this.b = false;
        this.d = yzz.UNKNOWN_CONTEXT;
        this.v = 0;
        this.w = 0;
        this.x = 0;
    }
}
