package com.waze.settings;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.design_components.button.WazeButton;
import com.waze.ifs.ui.SpringyNestedScrollView;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba extends android.support.v4.app.ar implements de, org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36843a = 0;
    private com.waze.settings.tree.e A;
    private final List B;
    private final List C;
    private final List D;
    private boolean E;
    private float F;
    private final h.f G;
    private boolean H;
    private String I;
    private boolean J;
    private final h.f K;
    private final cs L;

    /* renamed from: b, reason: collision with root package name */
    private h.g.a.a f36844b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f36845c;

    /* renamed from: d, reason: collision with root package name */
    private ConstraintLayout f36846d;

    /* renamed from: e, reason: collision with root package name */
    private View f36847e;

    /* renamed from: f, reason: collision with root package name */
    private View f36848f;

    /* renamed from: g, reason: collision with root package name */
    private View f36849g;

    /* renamed from: h, reason: collision with root package name */
    private View f36850h;

    /* renamed from: i, reason: collision with root package name */
    private SpringyNestedScrollView f36851i;

    /* renamed from: j, reason: collision with root package name */
    private View f36852j;

    /* renamed from: k, reason: collision with root package name */
    private TitleBar f36853k;

    /* renamed from: l, reason: collision with root package name */
    private TitleBar f36854l;
    private ImageView m;
    private LinearLayout n;
    private LinearLayout o;
    private View p;
    private ConstraintLayout q;
    private WazeButton r;
    private ImageView s;
    private TextView t;
    private int u;
    private ValueAnimator v;
    private boolean w;
    private int x;
    private boolean y;
    private final List z;

    static {
        h.g.b.x.e(com.waze.shared_infra.i.a.d("QuickSettingsPageView"), "create(...)");
    }

    public ba() {
        ao aoVar = new ao(0);
        h.g.b.x.f(aoVar, "closeFragment");
        this.f36844b = aoVar;
        ba baVar = this;
        this.f36845c = org.a.b.b.d.a(baVar);
        this.y = true;
        this.z = new ArrayList();
        this.B = new LinkedList();
        this.C = new LinkedList();
        this.D = new LinkedList();
        z zVar = new z(baVar, 2);
        h.h hVar = h.h.f48132c;
        this.G = h.g.b(hVar, new az(baVar, zVar, 1));
        this.H = true;
        this.K = h.g.b(hVar, new az(baVar, new z(baVar, 3), 0));
        this.L = new ay(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final void H(com.waze.settings.ba r7, boolean r8, float r9, int r10) {
        /*
            boolean r0 = r7.w
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 8
            r2 = 0
            if (r8 == 0) goto L7b
            int r8 = r7.x
            java.lang.String r3 = "theTitleBar"
            java.lang.String r4 = "topShadow"
            java.lang.String r5 = "hoverTitleBar"
            if (r10 <= r8) goto L57
            com.waze.view.title.TitleBar r8 = r7.f36854l
            if (r8 != 0) goto L1d
            h.g.b.x.j(r5)
            r8 = r2
        L1d:
            r8.setVisibility(r0)
            com.waze.view.title.TitleBar r8 = r7.f36853k
            if (r8 != 0) goto L28
            h.g.b.x.j(r3)
            r8 = r2
        L28:
            r3 = 0
            r8.setAlpha(r3)
            int r8 = r7.x
            float r8 = (float) r8
            r6 = 1116471296(0x428c0000, float:70.0)
            float r9 = r9 * r6
            float r10 = (float) r10
            float r8 = r8 + r9
            float r8 = r8 - r10
            float r8 = java.lang.Math.max(r8, r3)
            android.widget.ImageView r9 = r7.m
            if (r9 != 0) goto L41
            h.g.b.x.j(r4)
            r9 = r2
        L41:
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 != 0) goto L47
            r10 = r0
            goto L48
        L47:
            r10 = r1
        L48:
            r9.setVisibility(r10)
            com.waze.view.title.TitleBar r9 = r7.f36854l
            if (r9 != 0) goto L53
            h.g.b.x.j(r5)
            r9 = r2
        L53:
            r9.setTranslationY(r8)
            goto L7b
        L57:
            com.waze.view.title.TitleBar r8 = r7.f36854l
            if (r8 != 0) goto L5f
            h.g.b.x.j(r5)
            r8 = r2
        L5f:
            r9 = 4
            r8.setVisibility(r9)
            android.widget.ImageView r8 = r7.m
            if (r8 != 0) goto L6b
            h.g.b.x.j(r4)
            r8 = r2
        L6b:
            r8.setVisibility(r1)
            com.waze.view.title.TitleBar r8 = r7.f36853k
            if (r8 != 0) goto L76
            h.g.b.x.j(r3)
            r8 = r2
        L76:
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.setAlpha(r9)
        L7b:
            android.widget.ImageView r8 = r7.s
            if (r8 != 0) goto L85
            java.lang.String r8 = "bottomShadow"
            h.g.b.x.j(r8)
            r8 = r2
        L85:
            com.waze.settings.tree.e r9 = r7.A
            if (r9 == 0) goto La2
            boolean r9 = r9.d()
            r10 = 1
            if (r9 != r10) goto La2
            com.waze.ifs.ui.SpringyNestedScrollView r7 = r7.f36851i
            if (r7 != 0) goto L9a
            java.lang.String r7 = "scroll"
            h.g.b.x.j(r7)
            goto L9b
        L9a:
            r2 = r7
        L9b:
            boolean r7 = r2.canScrollVertically(r10)
            if (r7 == 0) goto La2
            goto La3
        La2:
            r0 = r1
        La3:
            r8.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.ba.H(com.waze.settings.ba, boolean, float, int):void");
    }

    static final void I(ba baVar) {
        Iterator it = baVar.z.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(null);
        }
        baVar.E = true;
        baVar.X();
    }

    static final void J(ba baVar) {
        baVar.U(20002);
    }

    static final void K(ba baVar) {
        baVar.U(20003);
    }

    static final void L(ba baVar) {
        baVar.U(0);
    }

    static final void M(ba baVar) {
        baVar.U(0);
    }

    private final ViewGroup O() {
        LinearLayout linearLayout;
        String str;
        LinearLayout linearLayout2 = null;
        if (this.H) {
            linearLayout = this.n;
            if (linearLayout == null) {
                str = "content";
                h.g.b.x.j(str);
            }
            linearLayout2 = linearLayout;
        } else {
            linearLayout = this.o;
            if (linearLayout == null) {
                str = "content2";
                h.g.b.x.j(str);
            }
            linearLayout2 = linearLayout;
        }
        return linearLayout2;
    }

    private final ViewGroup P() {
        LinearLayout linearLayout;
        String str;
        LinearLayout linearLayout2 = null;
        if (this.H) {
            linearLayout = this.o;
            if (linearLayout == null) {
                str = "content2";
                h.g.b.x.j(str);
            }
            linearLayout2 = linearLayout;
        } else {
            linearLayout = this.n;
            if (linearLayout == null) {
                str = "content";
                h.g.b.x.j(str);
            }
            linearLayout2 = linearLayout;
        }
        return linearLayout2;
    }

    private final bb Q() {
        return (bb) this.G.getValue();
    }

    private final gy R() {
        return (gy) this.K.getValue();
    }

    private final void S() {
        android.support.v4.app.av avVarRequireActivity = requireActivity();
        h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(avVarRequireActivity, InputMethodManager.class);
        if (inputMethodManager == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.f36846d;
        if (constraintLayout == null) {
            h.g.b.x.j("root");
            constraintLayout = null;
        }
        inputMethodManager.hideSoftInputFromWindow(constraintLayout.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(com.waze.settings.tree.e eVar, String str) {
        ai aiVar = eVar.f37568e;
        if (aiVar != null && aiVar != null) {
            ai.d(eVar);
        }
        TitleBar titleBar = this.f36853k;
        SpringyNestedScrollView springyNestedScrollView = null;
        if (titleBar == null) {
            h.g.b.x.j("theTitleBar");
            titleBar = null;
        }
        titleBar.f(true);
        TitleBar titleBar2 = this.f36854l;
        if (titleBar2 == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar2 = null;
        }
        titleBar2.f(true);
        if (!Q().a().isEmpty()) {
            List list = this.B;
            SpringyNestedScrollView springyNestedScrollView2 = this.f36851i;
            if (springyNestedScrollView2 == null) {
                h.g.b.x.j("scroll");
                springyNestedScrollView2 = null;
            }
            list.add(0, Integer.valueOf(springyNestedScrollView2.getScrollY()));
            this.C.add(0, Boolean.valueOf(this.y));
            this.D.add(0, this.I);
        }
        this.I = str;
        Q().c(eVar);
        V(Q().a().size() == 1 ? 2 : 0);
        SpringyNestedScrollView springyNestedScrollView3 = this.f36851i;
        if (springyNestedScrollView3 == null) {
            h.g.b.x.j("scroll");
        } else {
            springyNestedScrollView = springyNestedScrollView3;
        }
        springyNestedScrollView.post(new m(this, 3));
        this.y = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(int i2) {
        if (this.w) {
            return;
        }
        com.waze.search.v2.o.e(this, 3);
        S();
        float f2 = requireContext().getResources().getDisplayMetrics().density;
        SpringyNestedScrollView springyNestedScrollView = this.f36851i;
        View view = null;
        if (springyNestedScrollView == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView = null;
        }
        springyNestedScrollView.animate().translationYBy(requireContext().getResources().getDisplayMetrics().heightPixels).setInterpolator(new LinearInterpolator()).setStartDelay(0L).setDuration(400L).withEndAction(new com.waze.beacons.p(this.f36844b, 7)).start();
        TitleBar titleBar = this.f36854l;
        if (titleBar == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar = null;
        }
        titleBar.animate().translationYBy(requireContext().getResources().getDisplayMetrics().heightPixels).setInterpolator(new LinearInterpolator()).setStartDelay(0L).setDuration(400L).start();
        ImageView imageView = this.m;
        if (imageView == null) {
            h.g.b.x.j("topShadow");
            imageView = null;
        }
        imageView.animate().translationYBy(requireContext().getResources().getDisplayMetrics().heightPixels).setInterpolator(new LinearInterpolator()).setStartDelay(0L).setDuration(400L).start();
        ImageView imageView2 = this.s;
        if (imageView2 == null) {
            h.g.b.x.j("bottomShadow");
            imageView2 = null;
        }
        imageView2.animate().translationYBy(requireContext().getResources().getDisplayMetrics().heightPixels).setInterpolator(new LinearInterpolator()).setStartDelay(0L).setDuration(400L).start();
        View view2 = this.f36850h;
        if (view2 == null) {
            h.g.b.x.j("bgOverscroll");
            view2 = null;
        }
        view2.animate().translationYBy(requireContext().getResources().getDisplayMetrics().heightPixels).setStartDelay(0L).setDuration(400L).start();
        ConstraintLayout constraintLayout = this.q;
        if (constraintLayout == null) {
            h.g.b.x.j("bottomFrame");
            constraintLayout = null;
        }
        constraintLayout.animate().translationYBy(f2 * 70.0f).setInterpolator(new DecelerateInterpolator()).setStartDelay(220L).setDuration(220L).setListener(new ax(this, i2)).start();
        View view3 = this.f36847e;
        if (view3 == null) {
            h.g.b.x.j("background");
            view3 = null;
        }
        view3.animate().alpha(0.0f).setStartDelay(120L).setDuration(200L).start();
        this.w = true;
        requireActivity().getWindow().setSoftInputMode(48);
        View view4 = this.f36850h;
        if (view4 == null) {
            h.g.b.x.j("bgOverscroll");
        } else {
            view = view4;
        }
        view.setVisibility(8);
    }

    private final void V(int i2) {
        TitleBar titleBar = this.f36853k;
        if (titleBar == null) {
            h.g.b.x.j("theTitleBar");
            titleBar = null;
        }
        titleBar.l(false);
        TitleBar titleBar2 = this.f36854l;
        if (titleBar2 == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar2 = null;
        }
        titleBar2.l(false);
        requireActivity().getWindow().setSoftInputMode(34);
        S();
        this.z.clear();
        com.waze.settings.tree.e eVar = (com.waze.settings.tree.e) Q().a().get(0);
        this.A = eVar;
        ConstraintLayout constraintLayout = this.q;
        if (constraintLayout == null) {
            h.g.b.x.j("bottomFrame");
            constraintLayout = null;
        }
        int i3 = 1;
        constraintLayout.setVisibility(true != eVar.d() ? 8 : 0);
        ImageView imageView = this.s;
        if (imageView == null) {
            h.g.b.x.j("bottomShadow");
            imageView = null;
        }
        imageView.setVisibility(true != eVar.d() ? 8 : 0);
        WazeButton wazeButton = this.r;
        if (wazeButton == null) {
            h.g.b.x.j("bottomButton");
            wazeButton = null;
        }
        wazeButton.h(com.waze.shared_infra.o.b.a().c(R.string.QUICK_SETTINGS_BOTTOM_BUTTON_TEXT, new Object[0]));
        k().O(eVar.c());
        TextView textView = this.t;
        if (textView == null) {
            h.g.b.x.j("bottomLabel");
            textView = null;
        }
        textView.setVisibility(8);
        TitleBar titleBar3 = this.f36853k;
        if (titleBar3 == null) {
            h.g.b.x.j("theTitleBar");
            titleBar3 = null;
        }
        titleBar3.setVisibility(true != eVar.e() ? 8 : 0);
        View view = this.f36848f;
        if (view == null) {
            h.g.b.x.j("bg");
            view = null;
        }
        view.setVisibility(true != eVar.e() ? 8 : 0);
        View view2 = this.f36849g;
        if (view2 == null) {
            h.g.b.x.j("bgNoTitle");
            view2 = null;
        }
        view2.setVisibility(true != eVar.e() ? 0 : 8);
        final boolean zE = eVar.e();
        ConstraintLayout constraintLayout2 = this.f36846d;
        if (constraintLayout2 == null) {
            h.g.b.x.j("root");
            constraintLayout2 = null;
        }
        constraintLayout2.setClipChildren(zE);
        final float f2 = requireContext().getResources().getDisplayMetrics().density;
        SpringyNestedScrollView springyNestedScrollView = this.f36851i;
        if (springyNestedScrollView == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView = null;
        }
        springyNestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.waze.settings.an
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
                ba.H(this.f36781a, zE, f2, i5);
            }
        });
        TitleBar titleBar4 = this.f36853k;
        if (titleBar4 == null) {
            h.g.b.x.j("theTitleBar");
            titleBar4 = null;
        }
        titleBar4.p(eVar.t());
        TitleBar titleBar5 = this.f36854l;
        if (titleBar5 == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar5 = null;
        }
        titleBar5.p(eVar.t());
        if (i2 != 2) {
            this.H = !this.H;
        }
        O().removeViewsInLayout(this.u, O().getChildCount() - this.u);
        Iterator it = eVar.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View viewK = ((com.waze.settings.tree.f) it.next()).k(this);
            if (viewK != null) {
                viewK.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                O().addView(viewK);
            }
        }
        ViewGroup.LayoutParams layoutParams = O().getLayoutParams();
        layoutParams.height = -2;
        O().setLayoutParams(layoutParams);
        O().setVisibility(0);
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (i2 == 2) {
            O().setTranslationX(0.0f);
            return;
        }
        int i4 = 1 != i2 ? 1 : -1;
        P().setTranslationX(0.0f);
        P().animate().translationX((-O().getWidth()) * i4).start();
        O().setTranslationX(O().getWidth() * i4);
        O().animate().translationX(0.0f).start();
        ViewGroup viewGroupP = P();
        int height = P().getHeight();
        h.g.b.x.c(viewGroupP);
        ViewGroup.LayoutParams layoutParams2 = viewGroupP.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, 0);
        valueAnimatorOfInt.addListener(new aq(viewGroupP, layoutParams2));
        valueAnimatorOfInt.addUpdateListener(new at(layoutParams2, viewGroupP, i3));
        valueAnimatorOfInt.start();
        h.g.b.x.c(valueAnimatorOfInt);
        this.v = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.start();
        }
    }

    private static final void W(View view, int i2, int i3, int i4) {
        view.setPadding(view.getPaddingLeft() + i2, view.getPaddingTop(), view.getPaddingRight() + i3, view.getPaddingBottom() + i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        if (Q().a().isEmpty()) {
            com.waze.shared_infra.i.h.j("onBackPressed called for quick settings with quickSettingsViewModel.containers.size() == 0");
            return;
        }
        int i2 = true != this.E ? 0 : 20002;
        this.E = false;
        this.y = true;
        k().F(Integer.valueOf(i2));
        if (Q().a().size() == 1) {
            U(0);
            return;
        }
        ai aiVar = ((com.waze.settings.tree.e) Q().a().get(0)).f37568e;
        if (aiVar != null) {
            aiVar.c((com.waze.settings.tree.g) Q().a().get(0), i2);
        }
        Q().b();
        int size = Q().a().size();
        TitleBar titleBar = this.f36853k;
        SpringyNestedScrollView springyNestedScrollView = null;
        if (size == 1) {
            if (titleBar == null) {
                h.g.b.x.j("theTitleBar");
                titleBar = null;
            }
            titleBar.f(false);
            TitleBar titleBar2 = this.f36854l;
            if (titleBar2 == null) {
                h.g.b.x.j("hoverTitleBar");
                titleBar2 = null;
            }
            titleBar2.f(false);
        } else {
            if (titleBar == null) {
                h.g.b.x.j("theTitleBar");
                titleBar = null;
            }
            titleBar.f(true);
            TitleBar titleBar3 = this.f36854l;
            if (titleBar3 == null) {
                h.g.b.x.j("hoverTitleBar");
                titleBar3 = null;
            }
            titleBar3.f(true);
        }
        com.waze.search.v2.o.e(this, i2);
        V(1);
        SpringyNestedScrollView springyNestedScrollView2 = this.f36851i;
        if (springyNestedScrollView2 == null) {
            h.g.b.x.j("scroll");
        } else {
            springyNestedScrollView = springyNestedScrollView2;
        }
        springyNestedScrollView.post(new m(this, 2));
        List list = this.C;
        this.y = ((Boolean) list.get(0)).booleanValue();
        list.remove(0);
        List list2 = this.D;
        this.I = (String) list2.get(0);
        list2.remove(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.reports_v2.c.r Y() {
        return R().o();
    }

    static final h.ab o(ba baVar, Boolean bool) {
        h.g.b.x.c(bool);
        boolean zBooleanValue = bool.booleanValue();
        WazeButton wazeButton = baVar.r;
        if (wazeButton == null) {
            h.g.b.x.j("bottomButton");
            wazeButton = null;
        }
        wazeButton.d(zBooleanValue);
        return h.ab.f48028a;
    }

    static final h.ab p(ba baVar, Boolean bool) {
        h.g.b.x.c(bool);
        boolean zBooleanValue = bool.booleanValue();
        TitleBar titleBar = baVar.f36853k;
        TitleBar titleBar2 = null;
        if (titleBar == null) {
            h.g.b.x.j("theTitleBar");
            titleBar = null;
        }
        boolean z = !zBooleanValue;
        titleBar.g(z);
        TitleBar titleBar3 = baVar.f36854l;
        if (titleBar3 == null) {
            h.g.b.x.j("hoverTitleBar");
        } else {
            titleBar2 = titleBar3;
        }
        titleBar2.g(z);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void q(ba baVar, String str, String str2) {
        com.waze.bs.a.f(str, str2, true);
        baVar.U(0);
    }

    public static final /* synthetic */ void s(ba baVar, int i2) {
        for (com.waze.settings.tree.e eVar : baVar.Q().a()) {
            ai aiVar = eVar.f37568e;
            if (aiVar != null) {
                aiVar.c(eVar, i2);
            }
        }
    }

    static final void v(ba baVar) {
        SpringyNestedScrollView springyNestedScrollView = baVar.f36851i;
        if (springyNestedScrollView == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView = null;
        }
        List list = baVar.B;
        ObjectAnimator.ofInt(springyNestedScrollView, "scrollY", ((Number) list.get(0)).intValue()).setDuration(250L).start();
        list.remove(0);
    }

    static final void w(ba baVar, float f2) {
        SpringyNestedScrollView springyNestedScrollView = baVar.f36851i;
        if (springyNestedScrollView == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView = null;
        }
        springyNestedScrollView.smoothScrollBy(0, h.h.a.b(baVar.x + (f2 * 35.0f)));
    }

    static final void x(ba baVar) {
        SpringyNestedScrollView springyNestedScrollView = baVar.f36851i;
        if (springyNestedScrollView != null) {
            baVar.J = springyNestedScrollView.getHeight() < baVar.O().getHeight();
            com.waze.search.v2.o.f(baVar);
        }
    }

    @Override // com.waze.settings.de
    public final void A(View.OnClickListener onClickListener) {
        h.g.b.x.f(onClickListener, "listener");
        this.z.add(onClickListener);
        TitleBar titleBar = this.f36853k;
        TitleBar titleBar2 = null;
        if (titleBar == null) {
            h.g.b.x.j("theTitleBar");
            titleBar = null;
        }
        titleBar.i(com.waze.shared_infra.o.b.a().c(R.string.SAVE, new Object[0]));
        if (this.f36853k == null) {
            h.g.b.x.j("theTitleBar");
        }
        TitleBar titleBar3 = this.f36854l;
        if (titleBar3 == null) {
            h.g.b.x.j("hoverTitleBar");
        } else {
            titleBar2 = titleBar3;
        }
        titleBar2.i(com.waze.shared_infra.o.b.a().c(R.string.SAVE, new Object[0]));
        if (this.f36854l == null) {
            h.g.b.x.j("hoverTitleBar");
        }
    }

    public final void B(int i2, int i3, int i4) {
        ConstraintLayout constraintLayout = null;
        if (i2 > 0) {
            ConstraintLayout constraintLayout2 = this.q;
            if (constraintLayout2 == null) {
                h.g.b.x.j("bottomFrame");
                constraintLayout2 = null;
            }
            W(constraintLayout2, 0, 0, i2);
        }
        if (i3 > 0 || i4 > 0) {
            ViewGroup[] viewGroupArr = new ViewGroup[5];
            TitleBar titleBar = this.f36853k;
            if (titleBar == null) {
                h.g.b.x.j("theTitleBar");
                titleBar = null;
            }
            viewGroupArr[0] = titleBar;
            TitleBar titleBar2 = this.f36854l;
            if (titleBar2 == null) {
                h.g.b.x.j("hoverTitleBar");
                titleBar2 = null;
            }
            viewGroupArr[1] = titleBar2;
            LinearLayout linearLayout = this.n;
            if (linearLayout == null) {
                h.g.b.x.j("content");
                linearLayout = null;
            }
            viewGroupArr[2] = linearLayout;
            LinearLayout linearLayout2 = this.o;
            if (linearLayout2 == null) {
                h.g.b.x.j("content2");
                linearLayout2 = null;
            }
            viewGroupArr[3] = linearLayout2;
            ConstraintLayout constraintLayout3 = this.q;
            if (constraintLayout3 == null) {
                h.g.b.x.j("bottomFrame");
            } else {
                constraintLayout = constraintLayout3;
            }
            viewGroupArr[4] = constraintLayout;
            Iterator it = h.a.i.i(viewGroupArr).iterator();
            while (it.hasNext()) {
                W((ViewGroup) it.next(), i3, i4, 0);
            }
        }
    }

    @Override // com.waze.settings.de
    public final boolean E() {
        return this.J;
    }

    @Override // com.waze.settings.ce
    public final cs a() {
        return this.L;
    }

    @Override // com.waze.settings.dd
    public final com.waze.settings.tree.g b() {
        return Q().a().isEmpty() ? this.A : (com.waze.settings.tree.g) Q().a().get(0);
    }

    @Override // com.waze.settings.de, com.waze.settings.dd
    public final /* synthetic */ String c() {
        return com.waze.bs.a.d(this);
    }

    @Override // com.waze.settings.dd
    public final String d() {
        return this.I;
    }

    @Override // com.waze.settings.de
    public final Context g() {
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    @Override // com.waze.settings.de
    public final LifecycleOwner h() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }

    @Override // com.waze.settings.de
    public final com.waze.as.a j() {
        return R().b();
    }

    @Override // com.waze.settings.de
    public final ds k() {
        return R().e();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f36845c.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.quick_settings_page, viewGroup, false);
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        super.onDestroyView();
        SpringyNestedScrollView springyNestedScrollView = this.f36851i;
        if (springyNestedScrollView == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView = null;
        }
        springyNestedScrollView.animate().cancel();
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        View viewFindViewById = view.findViewById(R.id.content);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.n = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content2);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.o = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.theTitleBar);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        this.f36853k = (TitleBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.hoverTitleBar);
        h.g.b.x.e(viewFindViewById4, "findViewById(...)");
        this.f36854l = (TitleBar) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.bottom_button);
        h.g.b.x.e(viewFindViewById5, "findViewById(...)");
        this.r = (WazeButton) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.pad);
        h.g.b.x.e(viewFindViewById6, "findViewById(...)");
        this.p = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.topPad);
        h.g.b.x.e(viewFindViewById7, "findViewById(...)");
        this.f36852j = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.scroll);
        h.g.b.x.e(viewFindViewById8, "findViewById(...)");
        this.f36851i = (SpringyNestedScrollView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.bottom_frame);
        h.g.b.x.e(viewFindViewById9, "findViewById(...)");
        this.q = (ConstraintLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.bg_overscroll);
        h.g.b.x.e(viewFindViewById10, "findViewById(...)");
        this.f36850h = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.background);
        h.g.b.x.e(viewFindViewById11, "findViewById(...)");
        this.f36847e = viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.root);
        h.g.b.x.e(viewFindViewById12, "findViewById(...)");
        this.f36846d = (ConstraintLayout) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.top_shadow);
        h.g.b.x.e(viewFindViewById13, "findViewById(...)");
        this.m = (ImageView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.bottom_shadow);
        h.g.b.x.e(viewFindViewById14, "findViewById(...)");
        this.s = (ImageView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.bg);
        h.g.b.x.e(viewFindViewById15, "findViewById(...)");
        this.f36848f = viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.bg_no_title);
        h.g.b.x.e(viewFindViewById16, "findViewById(...)");
        this.f36849g = viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.bottom_label);
        h.g.b.x.e(viewFindViewById17, "findViewById(...)");
        this.t = (TextView) viewFindViewById17;
        TitleBar titleBar = this.f36853k;
        TitleBar titleBar2 = null;
        TitleBar titleBar3 = null;
        if (titleBar == null) {
            h.g.b.x.j("theTitleBar");
            titleBar = null;
        }
        titleBar.q();
        int i2 = 0;
        titleBar.l(false);
        titleBar.m(new com.waze.planned_drive.af(this, 11));
        TitleBar titleBar4 = this.f36854l;
        if (titleBar4 == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar4 = null;
        }
        titleBar4.q();
        titleBar4.l(false);
        titleBar4.setVisibility(4);
        titleBar4.m(new com.waze.planned_drive.af(this, 12));
        this.u = O().getChildCount();
        g gVar = new g(this, 6);
        TitleBar titleBar5 = this.f36854l;
        if (titleBar5 == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar5 = null;
        }
        titleBar5.n(gVar);
        TitleBar titleBar6 = this.f36853k;
        if (titleBar6 == null) {
            h.g.b.x.j("theTitleBar");
            titleBar6 = null;
        }
        titleBar6.n(gVar);
        TitleBar titleBar7 = this.f36854l;
        if (titleBar7 == null) {
            h.g.b.x.j("hoverTitleBar");
            titleBar7 = null;
        }
        titleBar7.o(ContextCompat.getColor(requireContext(), R.color.content_default));
        TitleBar titleBar8 = this.f36853k;
        if (titleBar8 == null) {
            h.g.b.x.j("theTitleBar");
            titleBar8 = null;
        }
        titleBar8.o(ContextCompat.getColor(requireContext(), R.color.content_default));
        WazeButton wazeButton = this.r;
        if (wazeButton == null) {
            h.g.b.x.j("bottomButton");
            wazeButton = null;
        }
        wazeButton.setOnClickListener(new g(this, 7));
        TextView textView = this.t;
        if (textView == null) {
            h.g.b.x.j("bottomLabel");
            textView = null;
        }
        textView.setOnClickListener(new g(this, 8));
        View view2 = this.p;
        if (view2 == null) {
            h.g.b.x.j("pad");
            view2 = null;
        }
        view2.setOnClickListener(new g(this, 9));
        View view3 = this.f36852j;
        if (view3 == null) {
            h.g.b.x.j("topPad");
            view3 = null;
        }
        view3.setOnClickListener(new g(this, 10));
        final float f2 = requireContext().getResources().getDisplayMetrics().density;
        this.x = Math.max(0, requireContext().getResources().getDisplayMetrics().heightPixels - h.h.a.b(280.0f * f2));
        SpringyNestedScrollView springyNestedScrollView = this.f36851i;
        if (springyNestedScrollView == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView = null;
        }
        springyNestedScrollView.setTranslationY(requireContext().getResources().getDisplayMetrics().heightPixels);
        ConstraintLayout constraintLayout = this.q;
        if (constraintLayout == null) {
            h.g.b.x.j("bottomFrame");
            constraintLayout = null;
        }
        constraintLayout.setTranslationY(70.0f * f2);
        View view4 = this.f36850h;
        if (view4 == null) {
            h.g.b.x.j("bgOverscroll");
            view4 = null;
        }
        view4.setTranslationY(requireContext().getResources().getDisplayMetrics().heightPixels);
        View view5 = this.f36850h;
        if (view5 == null) {
            h.g.b.x.j("bgOverscroll");
            view5 = null;
        }
        view5.setVisibility(0);
        View view6 = this.f36850h;
        if (view6 == null) {
            h.g.b.x.j("bgOverscroll");
            view6 = null;
        }
        view6.animate().translationY(0.0f).setStartDelay(0L).setInterpolator(new LinearInterpolator()).setDuration(200L);
        SpringyNestedScrollView springyNestedScrollView2 = this.f36851i;
        if (springyNestedScrollView2 == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView2 = null;
        }
        springyNestedScrollView2.animate().translationY(0.0f).setStartDelay(120L).setInterpolator(new LinearInterpolator()).setDuration(200L).withEndAction(new Runnable() { // from class: com.waze.settings.ap
            @Override // java.lang.Runnable
            public final void run() {
                ba.w(this.f36785a, f2);
            }
        }).start();
        ConstraintLayout constraintLayout2 = this.q;
        if (constraintLayout2 == null) {
            h.g.b.x.j("bottomFrame");
            constraintLayout2 = null;
        }
        constraintLayout2.animate().setStartDelay(200L).translationY(0.0f).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
        View view7 = this.p;
        if (view7 == null) {
            h.g.b.x.j("pad");
            view7 = null;
        }
        ViewGroup.LayoutParams layoutParams = view7.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.x;
        view7.setLayoutParams(layoutParams);
        View view8 = this.f36847e;
        if (view8 == null) {
            h.g.b.x.j("background");
            view8 = null;
        }
        view8.setAlpha(0.0f);
        View view9 = this.f36847e;
        if (view9 == null) {
            h.g.b.x.j("background");
            view9 = null;
        }
        view9.animate().alpha(1.0f).setStartDelay(200L).setDuration(200L).start();
        this.F = 0.0f;
        SpringyNestedScrollView springyNestedScrollView3 = this.f36851i;
        if (springyNestedScrollView3 == null) {
            h.g.b.x.j("scroll");
            springyNestedScrollView3 = null;
        }
        springyNestedScrollView3.f24479b = new av(f2, this);
        this.w = false;
        k().d().observe(getViewLifecycleOwner(), new aw(new am(this, 2), 0));
        k().b().observe(getViewLifecycleOwner(), new aw(new am(this, i2), 0));
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new as(this));
        if (Q().a().isEmpty()) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("model") : null;
            Bundle arguments2 = getArguments();
            String string2 = arguments2 != null ? arguments2.getString(TtmlNode.ATTR_TTS_ORIGIN) : null;
            if (string == null) {
                string = "";
            }
            this.I = string2;
            com.waze.settings.tree.f fVarC = Y().c(string);
            h.g.b.x.d(fVarC, "null cannot be cast to non-null type com.waze.settings.tree.QuickSettingPage");
            T((com.waze.settings.tree.e) fVarC, string2);
            return;
        }
        int size = Q().a().size();
        TitleBar titleBar9 = this.f36853k;
        if (size == 0) {
            if (titleBar9 == null) {
                h.g.b.x.j("theTitleBar");
                titleBar9 = null;
            }
            titleBar9.f(false);
            TitleBar titleBar10 = this.f36854l;
            if (titleBar10 == null) {
                h.g.b.x.j("hoverTitleBar");
            } else {
                titleBar3 = titleBar10;
            }
            titleBar3.f(false);
        } else {
            if (titleBar9 == null) {
                h.g.b.x.j("theTitleBar");
                titleBar9 = null;
            }
            titleBar9.f(true);
            TitleBar titleBar11 = this.f36854l;
            if (titleBar11 == null) {
                h.g.b.x.j("hoverTitleBar");
            } else {
                titleBar2 = titleBar11;
            }
            titleBar2.f(true);
        }
        V(2);
    }

    @Override // com.waze.settings.de
    public final void y() {
    }

    public final void z(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "<set-?>");
        this.f36844b = aVar;
    }
}
