package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.google.d.d.bn;
import com.waze.R;
import com.waze.a.af;
import com.waze.app_nav.w;
import com.waze.main_screen.bottom_bars.scrollable_eta.s;
import com.waze.navigate.ft;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeTextView;
import h.g.b.x;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class AddAStopWidget extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final List f26006a = bn.s(b.f26019a, b.f26021c, b.f26022d);

    /* renamed from: b, reason: collision with root package name */
    private static final List f26007b = bn.s(b.f26020b, b.f26021c, b.f26022d);

    /* renamed from: c, reason: collision with root package name */
    private OvalButton f26008c;

    /* renamed from: d, reason: collision with root package name */
    private WazeTextView f26009d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f26010e;

    /* renamed from: f, reason: collision with root package name */
    private View f26011f;

    /* renamed from: g, reason: collision with root package name */
    private List f26012g;

    /* renamed from: h, reason: collision with root package name */
    private s f26013h;

    /* renamed from: i, reason: collision with root package name */
    private ft f26014i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f26015j;

    /* renamed from: k, reason: collision with root package name */
    private int f26016k;

    /* renamed from: l, reason: collision with root package name */
    private int f26017l;
    private int m;
    private int n;
    private int o;
    private ViewTreeObserver.OnGlobalLayoutListener p;

    public AddAStopWidget(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i2);
        this.f26012g = new ArrayList();
        this.f26014i = new ft(false);
        this.f26015j = com.waze.shared_infra.o.b.a();
        this.p = new a(this);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.eta_widget_add_a_stop, this);
        setOrientation(1);
        this.f26008c = (OvalButton) viewInflate.findViewById(R.id.btnAddAStop);
        this.f26009d = (WazeTextView) viewInflate.findViewById(R.id.lblAddAStop);
        this.f26010e = (LinearLayout) viewInflate.findViewById(R.id.buttonContainer);
        this.f26011f = viewInflate.findViewById(R.id.separator);
        this.f26008c.setOnClickListener(new com.waze.feedback.b(this, 11));
        j();
    }

    public static /* synthetic */ void n(AddAStopWidget addAStopWidget) {
        i.d(com.waze.main_screen.bottom_bars.scrollable_eta.l.m);
        w wVarE = com.waze.alerters.a.k.e();
        x.f(wVarE, "<this>");
        af.j(wVarE, true, null, 2);
        addAStopWidget.f26013h.j();
    }

    private final void p() throws Resources.NotFoundException {
        this.f26017l = getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_add_a_stop_button_shadow_size);
        getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_add_a_stop_button_boundary_size);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.scrollable_eta_add_a_stop_button_height);
        int i2 = this.f26017l;
        this.m = dimensionPixelSize + i2 + i2;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_add_a_stop_button_margin);
        int i3 = this.f26017l;
        this.n = dimensionPixelOffset - (i3 + i3);
        this.o = getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_add_a_stop_button_padding) + this.f26017l;
        ViewGroup.LayoutParams layoutParams = this.f26008c.getLayoutParams();
        layoutParams.height = this.m;
        this.f26008c.setLayoutParams(layoutParams);
        this.f26008c.E();
        this.f26008c.w(this.f26017l);
        Iterator it = this.f26012g.iterator();
        while (it.hasNext()) {
            this.f26010e.removeView((View) it.next());
        }
        this.f26012g.clear();
        List list = this.f26014i.a() ? f26007b : f26006a;
        this.f26016k = 0;
        for (int i4 = 0; i4 < list.size() && i4 < 3; i4++) {
            g gVar = new g(this, getContext(), (b) list.get(i4));
            this.f26010e.addView(gVar);
            this.f26012g.add(gVar);
            if (gVar.getVisibility() == 0) {
                this.f26016k++;
            }
        }
        this.f26009d.getViewTreeObserver().removeOnGlobalLayoutListener(this.p);
        if (this.f26016k == 3) {
            this.f26009d.getViewTreeObserver().addOnGlobalLayoutListener(this.p);
        }
    }

    public final void j() throws Resources.NotFoundException {
        p();
        this.f26009d.setTextColor(ContextCompat.getColor(getContext(), R.color.primary_variant));
        this.f26011f.setVisibility(4);
        this.f26010e.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        int color = ContextCompat.getColor(getContext(), R.color.surface_default);
        int color2 = ContextCompat.getColor(getContext(), R.color.transparent);
        this.f26008c.bz(color);
        this.f26008c.v(color2);
        for (OvalButton ovalButton : this.f26012g) {
            ovalButton.bz(color);
            ovalButton.v(color2);
        }
    }

    public final void k(ft ftVar) throws Resources.NotFoundException {
        if (Objects.equals(this.f26014i, ftVar)) {
            this.f26014i = ftVar;
        } else {
            this.f26014i = ftVar;
            p();
        }
    }

    public final void l() {
        this.f26009d.setText(this.f26015j.c(R.string.ADD_A_STOP, new Object[0]));
    }

    public final void m(s sVar) {
        this.f26013h = sVar;
    }

    public AddAStopWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddAStopWidget(Context context) {
        this(context, null);
    }
}
