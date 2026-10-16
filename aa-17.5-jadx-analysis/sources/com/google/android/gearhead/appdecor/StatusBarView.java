package com.google.android.gearhead.appdecor;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.onh;
import defpackage.org;
import defpackage.qct;
import defpackage.qhb;
import defpackage.ykd;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class StatusBarView extends FrameLayout {
    public static final yph a = yph.c("ADU.StatusBarView");
    private final Drawable A;
    public final ImageView b;
    public final TextView c;
    public final View d;
    public final View e;
    public final CarRestrictedEditText f;
    public final View g;
    public final ImageView h;
    public final ImageView i;
    public int j;
    public boolean k;
    public CharSequence l;
    public CharSequence m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    final Runnable r;
    final Runnable s;
    public ykd t;
    private final Context u;
    private final View v;
    private final View w;
    private final View.OnClickListener x;
    private final TextView y;
    private final ViewGroup z;

    public StatusBarView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        this.j = 0;
        int i3 = 11;
        this.r = new qct(this, 11, null);
        this.s = new qct(this, 12, null);
        ((ype) a.l().ai((char) 7231)).u("Constructor");
        LayoutInflater.from(context).inflate(R.layout.adu_status_bar_view, (ViewGroup) this, true);
        this.u = getContext();
        TextView textView = (TextView) findViewById(R.id.car_drawer_title);
        this.c = textView;
        this.b = (ImageView) findViewById(R.id.car_drawer_button);
        ImageView imageView = (ImageView) findViewById(R.id.car_mic_button);
        this.i = imageView;
        this.A = imageView.getBackground();
        this.n = imageView.getVisibility() == 0;
        View viewFindViewById = findViewById(R.id.car_search_box);
        this.d = viewFindViewById;
        this.w = viewFindViewById.findViewById(R.id.car_search_box_contents);
        this.e = findViewById(R.id.car_search_box_edit_text_container);
        this.f = (CarRestrictedEditText) findViewById(R.id.car_search_box_edit_text);
        this.v = findViewById(R.id.car_drawer_title_container);
        this.g = findViewById(R.id.car_search_box_hint_container);
        this.y = (TextView) findViewById(R.id.car_search_box_hint);
        this.h = (ImageView) findViewById(R.id.search_exit_button);
        this.x = new onh(this, i3);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.car_mic_underlay);
        this.z = viewGroup;
        viewGroup.getLayoutTransition().enableTransitionType(4);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_linear_in);
        Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(context, android.R.interpolator.linear_out_slow_in);
        Interpolator interpolatorLoadInterpolator3 = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        viewGroup.getLayoutTransition().setInterpolator(2, interpolatorLoadInterpolator);
        viewGroup.getLayoutTransition().setInterpolator(0, interpolatorLoadInterpolator3);
        viewGroup.getLayoutTransition().setInterpolator(3, interpolatorLoadInterpolator2);
        viewGroup.getLayoutTransition().setInterpolator(1, interpolatorLoadInterpolator3);
        viewGroup.getLayoutTransition().setInterpolator(4, interpolatorLoadInterpolator3);
        this.k = textView.getVisibility() == 0;
        g();
    }

    private final void g() {
        this.v.setVisibility(0);
        View view = this.w;
        view.setOnClickListener(null);
        view.setFocusable(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, 0, 0);
        view.setLayoutParams(marginLayoutParams);
        View view2 = this.d;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view2.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_app_layout_search_box_small_width);
        layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
        layoutParams.setMarginStart(this.n ? getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_menu_button_size) : getResources().getDimensionPixelOffset(R.dimen.gearhead_sdk_app_layout_search_box_small_margin));
        layoutParams.setMarginEnd(-layoutParams.width);
        view2.setLayoutParams(layoutParams);
        this.e.setVisibility(8);
    }

    public final void a() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7233)).u("hideTitle");
        this.k = false;
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
        arrayList.remove(this.f);
    }

    public final void b() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7236)).u("restoreOriginalTitle");
        this.m = null;
        f();
    }

    public final void c(int i) throws Resources.NotFoundException {
        this.q = i;
        f();
    }

    public final void d(CharSequence charSequence) throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7237)).y("setTemporaryTitle %s", charSequence);
        this.m = charSequence;
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f.hasFocus() && keyEvent.getKeyCode() == 19) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7240)).u("showTitle");
        this.k = true;
        f();
    }

    public final void f() throws Resources.NotFoundException {
        int i;
        CharSequence charSequence = this.m;
        if (charSequence == null) {
            charSequence = this.l;
        }
        TextView textView = this.c;
        textView.setText(charSequence);
        textView.setVisibility(true != this.k ? 8 : 0);
        this.b.setFocusable(this.o);
        int i2 = this.q;
        if (i2 == 1) {
            this.v.setVisibility(0);
            View view = this.d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_app_layout_search_box_small_width);
            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
            layoutParams.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.gearhead_sdk_app_layout_search_box_small_margin));
            layoutParams.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.gearhead_sdk_app_layout_search_box_small_margin));
            view.setLayoutParams(layoutParams);
            View view2 = this.w;
            view2.setFocusable(this.o);
            view2.setOnClickListener(this.x);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            if (this.n) {
                marginLayoutParams.setMargins(0, 0, (int) getResources().getDimension(R.dimen.gearhead_sdk_drawer_header_menu_button_size_small), 0);
            }
            view2.setLayoutParams(marginLayoutParams);
            View view3 = this.g;
            if (view3.getVisibility() != 0) {
                view3.setAlpha(BitmapDescriptorFactory.HUE_RED);
                view3.setVisibility(0);
            }
            view3.animate().alpha(1.0f).setStartDelay(300L);
            View view4 = this.e;
            if (view4.getVisibility() == 0) {
                view4.animate().alpha(BitmapDescriptorFactory.HUE_RED).setStartDelay(0L).withEndAction(this.s);
            }
        } else if (i2 != 2) {
            g();
        } else {
            this.v.setVisibility(8);
            View view5 = this.w;
            view5.setFocusable(this.o);
            view5.setOnClickListener(new onh(this, 12));
            int i3 = getResources().getDisplayMetrics().widthPixels;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_menu_button_size);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_card_max_width);
            if (i3 - (dimensionPixelSize + dimensionPixelSize) > dimensionPixelSize2) {
                int i4 = (i3 - dimensionPixelSize2) / 2;
                i = i4 - dimensionPixelSize;
                dimensionPixelSize = i4;
            } else {
                i = 0;
            }
            View view6 = this.d;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view6.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
            layoutParams2.setMarginStart(i);
            layoutParams2.setMarginEnd(dimensionPixelSize);
            view6.setLayoutParams(layoutParams2);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view5.getLayoutParams();
            marginLayoutParams2.setMargins(0, 0, 0, 0);
            view5.setLayoutParams(marginLayoutParams2);
            View view7 = this.e;
            if (view7.getVisibility() != 0) {
                view7.setAlpha(BitmapDescriptorFactory.HUE_RED);
                view7.setVisibility(0);
            }
            view7.animate().alpha(1.0f).setStartDelay(300L);
            View view8 = this.g;
            if (view8.getVisibility() == 0) {
                view8.animate().alpha(BitmapDescriptorFactory.HUE_RED).setStartDelay(0L).withEndAction(this.r);
            }
        }
        ykd ykdVar = this.t;
        if (ykdVar != null) {
            qhb qhbVar = (qhb) ykdVar.a;
            qhbVar.c(qhbVar.b);
        }
        ImageView imageView = this.i;
        imageView.setVisibility(true != this.n ? 8 : 0);
        imageView.setFocusable(this.o && this.n && !this.p);
        if (this.n) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (this.q == 1) {
                marginLayoutParams3.height = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_menu_button_size_small);
                marginLayoutParams3.width = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_menu_button_size_small);
                imageView.setBackground(org.b(this.u, R.attr.gearheadSearchBoxFocusBackground));
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                marginLayoutParams3.setMargins(0, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, 0);
            } else {
                marginLayoutParams3.height = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_height);
                marginLayoutParams3.width = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_menu_button_size);
                imageView.setBackground(this.A);
                marginLayoutParams3.setMargins(0, 0, 0, 0);
            }
            imageView.setLayoutParams(marginLayoutParams3);
        }
        this.z.requestLayout();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7235)).y("onConfigurationChanged %s", configuration);
        super.onConfigurationChanged(configuration);
        int color = getContext().getColor(R.color.search_box_card);
        int color2 = getContext().getColor(R.color.search_box_text_secondary);
        int color3 = getContext().getColor(R.color.search_box_text_primary);
        ((CardView) this.d).fB(color);
        this.w.setBackground(org.b(getContext(), R.attr.gearheadSearchBoxFocusBackground));
        this.y.setTextColor(color2);
        CarRestrictedEditText carRestrictedEditText = this.f;
        carRestrictedEditText.setTextColor(color3);
        carRestrictedEditText.setHintTextColor(color2);
        Drawable drawableB = org.b(getContext(), R.attr.gearheadHeaderButtonBackground);
        ImageView imageView = this.h;
        imageView.setBackground(drawableB);
        imageView.setImageDrawable(getContext().getDrawable(2131232005));
        f();
    }

    public StatusBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public StatusBarView(Context context) {
        this(context, null);
    }
}
