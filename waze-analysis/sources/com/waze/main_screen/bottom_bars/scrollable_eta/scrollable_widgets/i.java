package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.br;
import com.waze.config.ConfigValues;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.location.aa;
import com.waze.main_screen.bottom_bars.scrollable_eta.s;
import com.waze.main_screen.p.a.b.b.al;
import com.waze.navigate.NavResultData;
import com.waze.navigate.fu;
import com.waze.ui.z.as;
import com.waze.web.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    private static i f26031a;

    /* renamed from: b, reason: collision with root package name */
    private NavResultData f26032b;

    /* renamed from: c, reason: collision with root package name */
    private fu f26033c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f26034d;

    /* renamed from: e, reason: collision with root package name */
    private List f26035e;

    /* renamed from: f, reason: collision with root package name */
    private j f26036f;

    /* renamed from: g, reason: collision with root package name */
    private s f26037g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f26038h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26039i;

    public i(Context context) throws Resources.NotFoundException {
        NavResultData navResultData;
        super(context, null, 0);
        this.f26035e = new ArrayList();
        this.f26039i = false;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f26034d = linearLayout;
        linearLayout.setOrientation(1);
        this.f26034d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        as.i(getResources());
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_half_margin);
        this.f26034d.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        this.f26034d.setClipChildren(true);
        this.f26034d.setClipToPadding(true);
        setClipChildren(true);
        setClipToPadding(true);
        addView(this.f26034d);
        o oVar = new o(getContext());
        this.f26035e.add(oVar);
        this.f26034d.addView(oVar);
        k kVar = new k(getContext());
        this.f26035e.add(kVar);
        this.f26034d.addView(kVar);
        j jVar = new j(getContext());
        this.f26036f = jVar;
        this.f26035e.add(jVar);
        this.f26034d.addView(this.f26036f);
        l lVar = new l(getContext());
        this.f26035e.add(lVar);
        this.f26034d.addView(lVar);
        if (ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_FEATURE_ENABLED.b().booleanValue()) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, com.waze.design_components.g.b.c(getContext(), 1));
            marginLayoutParams.topMargin = com.waze.design_components.g.b.c(getContext(), 16);
            view.setLayoutParams(marginLayoutParams);
            view.setBackgroundColor(getResources().getColor(R.color.hairline));
            WazeTextView wazeTextView = new WazeTextView(getContext());
            r.a(wazeTextView, R.string.ND4C_ALGO_TRANSPARENCY_LINK_ROUTES_TITLE, new aa(9));
            this.f26034d.addView(view);
            this.f26034d.addView(wazeTextView);
        }
        if (this.f26037g != null) {
            Iterator it = this.f26035e.iterator();
            while (it.hasNext()) {
                ((h) it.next()).i(this.f26037g);
            }
        }
        b(this.f26033c);
        i iVar = f26031a;
        if (iVar != null && (navResultData = iVar.f26032b) != null) {
            c(navResultData);
        }
        i iVar2 = f26031a;
        if (iVar2 != null) {
            b(iVar2.f26033c);
        }
        f26031a = this;
        Iterator it2 = this.f26035e.iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).h();
        }
    }

    static void d(com.waze.main_screen.bottom_bars.scrollable_eta.l lVar) {
        com.waze.main_screen.a.b.h.d().b(lVar);
    }

    public final void a() {
        if (this.f26035e.isEmpty()) {
            return;
        }
        boolean z = !com.waze.ad.a.j.t(getContext());
        Boolean bool = this.f26038h;
        if (bool == null || bool.booleanValue() != z) {
            this.f26038h = Boolean.valueOf(z);
            setBackgroundColor(ContextCompat.getColor(getContext(), R.color.surface_default));
            Iterator it = this.f26035e.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(z);
            }
        }
    }

    public final void b(fu fuVar) {
        if (fuVar == null) {
            return;
        }
        this.f26033c = fuVar;
        Iterator it = this.f26035e.iterator();
        while (it.hasNext()) {
            ((h) it.next()).e(fuVar);
        }
    }

    public final void c(NavResultData navResultData) {
        this.f26032b = navResultData;
        Iterator it = this.f26035e.iterator();
        while (it.hasNext()) {
            ((h) it.next()).f(this.f26032b);
        }
    }

    public final void e(s sVar) {
        this.f26037g = sVar;
        Iterator it = this.f26035e.iterator();
        while (it.hasNext()) {
            ((h) it.next()).i(sVar);
        }
    }

    public final void f(al alVar, boolean z) {
        NavResultData navResultData = alVar.f26913a;
        if (navResultData == null || alVar.f26916d) {
            Iterator it = this.f26035e.iterator();
            while (it.hasNext()) {
                ((h) it.next()).g();
            }
        } else {
            c(navResultData);
            Iterator it2 = this.f26035e.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).c();
            }
            b(alVar.f26914b);
            br brVar = alVar.f26915c;
            j jVar = this.f26036f;
            if (jVar != null) {
                jVar.k(brVar);
            }
        }
        if (this.f26039i == z) {
            return;
        }
        this.f26039i = z;
        if (z) {
            Iterator it3 = this.f26035e.iterator();
            while (it3.hasNext()) {
                ((h) it3.next()).d();
            }
        }
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getResources().getConfiguration().orientation == 1) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
