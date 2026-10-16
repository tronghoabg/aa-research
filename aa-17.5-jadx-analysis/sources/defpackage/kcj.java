package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Distance;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.navigation.model.MessageInfo;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.car.app.navigation.model.RoutingInfo;
import androidx.car.app.navigation.model.Step;
import androidx.car.app.navigation.model.TravelEstimate;
import com.android.car.libraries.apphost.basewidgets.PanOverlayView;
import com.android.car.libraries.apphost.map.widgets.ProgressView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.CompactStepView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.DetailedStepView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.FloatingNavBarView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.MessageView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.TravelEstimateView;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class kcj extends hld {
    public final gzb a;
    public final ViewGroup b;
    public final kcl c;
    public final BleedingCardView g;
    public boolean h;
    public int p;
    public final BleedingCardView q;
    public int r;
    public final BleedingCardView s;
    public final ActionStripView t;
    public final ActionStripView u;
    public final PanOverlayView v;
    public boolean w;
    private final ViewTreeObserver.OnGlobalFocusChangeListener x;
    private final TravelEstimateView y;
    private final kch z;

    public kcj(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        this.x = new hle(this, 3);
        this.p = 4;
        this.r = 8;
        this.w = false;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.navigation_template_layout, (ViewGroup) null);
        this.b = viewGroup;
        BleedingCardView bleedingCardView = (BleedingCardView) viewGroup.findViewById(R.id.travel_estimate_card_container);
        this.q = bleedingCardView;
        this.y = (TravelEstimateView) viewGroup.findViewById(R.id.travel_estimate_view);
        ActionStripView actionStripView = (ActionStripView) viewGroup.findViewById(R.id.action_strip);
        this.t = actionStripView;
        ActionStripView actionStripView2 = (ActionStripView) viewGroup.findViewById(R.id.map_action_strip);
        this.u = actionStripView2;
        this.v = (PanOverlayView) viewGroup.findViewById(R.id.pan_overlay);
        bleedingCardView.setClickable(true);
        BleedingCardView bleedingCardView2 = (BleedingCardView) viewGroup.findViewById(R.id.nav_card_container);
        this.g = bleedingCardView2;
        kcl kclVar = new kcl(geuVar, bleedingCardView2, viewGroup);
        this.c = kclVar;
        kclVar.b(((NavigationTemplate) C()).getBackgroundColor());
        kclVar.o.setMaxHeight((int) (kclVar.b.getLayoutParams().width * 0.625f));
        kclVar.p.getLayoutParams().height = (int) (kclVar.b.getLayoutParams().width * 0.175f);
        actionStripView.e = this;
        actionStripView2.e = this;
        this.a = new gzb(geuVar.getResources().getDisplayMetrics());
        BleedingCardView bleedingCardView3 = (BleedingCardView) viewGroup.findViewById(R.id.alert_card_container);
        this.s = bleedingCardView3;
        this.z = new kch(geuVar, bleedingCardView3);
    }

    private final void N(final boolean z) {
        gev.c(new Runnable() { // from class: kci
            @Override // java.lang.Runnable
            public final void run() {
                int measuredHeight;
                int iC;
                CarColor tint;
                boolean z2 = z;
                kcj kcjVar = this.a;
                if (z2) {
                    kcjVar.v.setVisibility(0);
                    kcjVar.g.setVisibility(4);
                    kcjVar.t.c(false);
                    kcjVar.r();
                    return;
                }
                kcjVar.v.setVisibility(8);
                BleedingCardView bleedingCardView = kcjVar.g;
                kcl kclVar = kcjVar.c;
                bleedingCardView.setVisibility(kclVar.f);
                if (kclVar.f == 0) {
                    kcjVar.s();
                    View view = kcjVar.n;
                    int paddingTop = view != null ? view.getPaddingTop() : 0;
                    ViewGroup viewGroup = kcjVar.b;
                    int measuredHeight2 = (viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    int measuredHeight3 = bleedingCardView.getMeasuredHeight();
                    ImageView imageView = kclVar.o;
                    int i = measuredHeight2 - paddingTop;
                    int iC2 = measuredHeight3 - kcl.c(imageView, measuredHeight3, i, false);
                    if (kcjVar.r == 0) {
                        BleedingCardView bleedingCardView2 = kcjVar.s;
                        measuredHeight = bleedingCardView2.getMeasuredHeight();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bleedingCardView2.getLayoutParams();
                        if (marginLayoutParams != null) {
                            measuredHeight += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                        }
                    } else {
                        measuredHeight = 0;
                    }
                    int i2 = iC2 + measuredHeight;
                    ViewGroup viewGroup2 = kclVar.g;
                    if (viewGroup2.getVisibility() == 0) {
                        int iC3 = kcl.c(imageView, i2, i, false);
                        int iC4 = iC3 + kcl.c(kclVar.h, i2 - iC3, i, false);
                        int iC5 = iC4 + kcl.c(kclVar.p, i2 - iC4, i, false);
                        int iC6 = iC5 + kcl.c(kclVar.k, i2 - iC5, i, true);
                        iC = iC6 + kcl.c(kclVar.n, i2 - iC6, i, false);
                    } else {
                        iC = 0;
                    }
                    int i3 = i2 - iC;
                    int measuredHeight4 = kcjVar.p == 0 ? kcjVar.q.getMeasuredHeight() : 0;
                    int i4 = i3 + measuredHeight4;
                    if (i4 > i) {
                        kcjVar.p = 8;
                        i4 -= measuredHeight4;
                    }
                    if (kcjVar.r == 0 && i4 > i) {
                        ActionStripView actionStripView = kcjVar.t;
                        ActionStripView actionStripView2 = kcjVar.u;
                        actionStripView.getClass();
                        actionStripView2.getClass();
                        viewGroup2.setVisibility(8);
                        kclVar.m.setVisibility(8);
                        FloatingNavBarView floatingNavBarView = kclVar.j;
                        geu geuVar = kclVar.a;
                        gei geiVar = kclVar.q;
                        wz wzVar = kclVar.r;
                        CarTextView carTextView = null;
                        int iA = kclVar.a(null);
                        boolean z3 = wzVar instanceof RoutingInfo;
                        hrj hrjVar = gei.b;
                        if (z3) {
                            RoutingInfo routingInfo = (RoutingInfo) wzVar;
                            if (routingInfo.isLoading()) {
                                ArrayList arrayList = new ArrayList();
                                CarText carTextCreate = CarText.create("");
                                wi.e.a(carTextCreate);
                                hrjVar = new hrj(3, new Step(null, arrayList, null, carTextCreate, null), (Distance) null, iA);
                            } else {
                                hrjVar = new hrj(1, routingInfo.getCurrentStep(), routingInfo.getCurrentDistance(), iA);
                            }
                        } else if (wzVar instanceof MessageInfo) {
                            CarText title = ((MessageInfo) wzVar).getTitle();
                            if (title == null) {
                                title = CarText.create("");
                            }
                            ArrayList arrayList2 = new ArrayList();
                            wi.e.a(title);
                            hrjVar = new hrj(2, new Step(null, arrayList2, null, title, null), (Distance) null, iA);
                        }
                        BleedingCardView bleedingCardView3 = kclVar.b;
                        ProgressView progressView = kclVar.i;
                        int i5 = bleedingCardView3.b;
                        int i6 = hrjVar.b;
                        if (i6 != -1) {
                            i5 = i6;
                        }
                        bleedingCardView3.a(gbt.j(i5, 0.2f));
                        if (hrjVar.a == 3) {
                            gpe.a(bleedingCardView3, actionStripView, actionStripView2);
                            floatingNavBarView.setVisibility(8);
                            progressView.setVisibility(0);
                        } else {
                            progressView.setVisibility(8);
                            Object obj = hrjVar.c;
                            if (obj == null) {
                                bleedingCardView3.setVisibility(8);
                                actionStripView.setVisibility(0);
                                actionStripView2.setVisibility(0);
                            } else {
                                gpe.a(bleedingCardView3, actionStripView, actionStripView2);
                                floatingNavBarView.setVisibility(0);
                                Object obj2 = hrjVar.d;
                                Step step = (Step) obj;
                                Maneuver maneuver = step.getManeuver();
                                CarIcon icon = maneuver != null ? maneuver.getIcon() : null;
                                hmb hmbVar = hmb.a;
                                hmb hmbVar2 = new hmb(0, false, false, ghw.b, null, !((icon == null || (tint = icon.getTint()) == null) ? true : gbt.l(geuVar, tint, i5)), i5);
                                ImageView imageView2 = floatingNavBarView.a;
                                if (imageView2 == null) {
                                    affa.d("turnSymbolView");
                                    imageView2 = null;
                                }
                                boolean zJ = hbz.j(geuVar, icon, imageView2, hmbVar2);
                                ImageView imageView3 = floatingNavBarView.a;
                                if (imageView3 == null) {
                                    affa.d("turnSymbolView");
                                    imageView3 = null;
                                }
                                imageView3.setVisibility(true != zJ ? 8 : 0);
                                if (obj2 != null) {
                                    CarTextView carTextView2 = floatingNavBarView.b;
                                    if (carTextView2 == null) {
                                        affa.d("distanceText");
                                        carTextView2 = null;
                                    }
                                    carTextView2.setText(hly.b(geuVar, (Distance) obj2));
                                    CarTextView carTextView3 = floatingNavBarView.b;
                                    if (carTextView3 == null) {
                                        affa.d("distanceText");
                                        carTextView3 = null;
                                    }
                                    carTextView3.setVisibility(0);
                                } else {
                                    CarTextView carTextView4 = floatingNavBarView.b;
                                    if (carTextView4 == null) {
                                        affa.d("distanceText");
                                        carTextView4 = null;
                                    }
                                    carTextView4.setVisibility(8);
                                }
                                CarText cue = step.getCue();
                                if (CarText.isNullOrEmpty(cue)) {
                                    floatingNavBarView.setVisibility(8);
                                } else {
                                    CarTextView carTextView5 = floatingNavBarView.c;
                                    if (carTextView5 == null) {
                                        affa.d("descriptionText");
                                        carTextView5 = null;
                                    }
                                    hlv hlvVar = hlv.a;
                                    carTextView5.b(geuVar, cue, new hlu().a());
                                    CarTextView carTextView6 = floatingNavBarView.c;
                                    if (carTextView6 == null) {
                                        affa.d("descriptionText");
                                    } else {
                                        carTextView = carTextView6;
                                    }
                                    carTextView.setVisibility(0);
                                }
                            }
                        }
                        kcjVar.fb();
                    }
                }
                if (kcjVar.p != 0) {
                    kcjVar.r();
                    return;
                }
                BleedingCardView bleedingCardView4 = kcjVar.q;
                if (bleedingCardView4.getVisibility() == 0) {
                    return;
                }
                bleedingCardView4.setVisibility(0);
            }
        });
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void F() {
        super.F();
        this.j.c(this.z);
    }

    public final void L(ActionStrip actionStrip, boolean z) {
        this.u.h(this.i, actionStrip != null ? ((hld) this).d.e(this.i, actionStrip) : null, ghu.c, z, false);
    }

    public final void M() {
        gev.c(new kbs(this, 11));
    }

    @Override // defpackage.hlf
    protected final View a() {
        BleedingCardView bleedingCardView = this.s;
        if (bleedingCardView.getVisibility() == 0) {
            return bleedingCardView;
        }
        ActionStripView actionStripView = this.t;
        return actionStripView.getVisibility() == 0 ? actionStripView : this.b;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        this.j.d(this.z);
        super.b();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void c() {
        super.c();
        v();
        geu geuVar = this.i;
        gjv gjvVarB = geuVar.B();
        int i = 9;
        gjvVarB.b(this, 4, new kbs(this, i));
        gjvVarB.b(this, 5, new kbs(this, i));
        int i2 = 10;
        gjvVarB.b(this, 7, new kbs(this, i2));
        if (geuVar.b().getDisplayType() == 1) {
            gtt gttVar = (gtt) geuVar.l(gtt.class);
            gttVar.getClass();
            gttVar.a().fE(this, new hlg(this, i2));
        }
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().addOnGlobalFocusChangeListener(this.x);
        geuVar.v().b(true);
        kch kchVar = this.z;
        kchVar.g = new ajmd(this);
        gdl gdlVar = kchVar.d;
        int i3 = 8;
        if (gdlVar.b() != null && gdlVar.a() < 1.0f) {
            i3 = 0;
        }
        t(i3);
    }

    @Override // defpackage.hlf
    public final void d() {
        w();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.b;
    }

    @Override // defpackage.hld
    public final void fa(Rect rect, Rect rect2) {
        ActionStripView actionStripView = this.u;
        jtr.e(rect2, actionStripView);
        if (actionStripView.getVisibility() == 0) {
            jtr.e(rect, actionStripView);
        }
        int i = rect2.top;
        ActionStripView actionStripView2 = this.t;
        rect2.top = Math.max(i, actionStripView2.getBottom());
        if (actionStripView2.getVisibility() == 0) {
            rect.top = rect2.top;
            View view = this.n;
            if (view != null) {
                rect.top += view.getPaddingTop();
                rect2.top += view.getPaddingTop();
            }
        }
        if (this.r == 0) {
            BleedingCardView bleedingCardView = this.s;
            jtr.f(rect2, bleedingCardView);
            jtr.f(rect, bleedingCardView);
        }
        if (this.p == 0) {
            BleedingCardView bleedingCardView2 = this.q;
            jtr.f(rect2, bleedingCardView2);
            jtr.f(rect, bleedingCardView2);
        }
        if (this.c.f == 0) {
            BleedingCardView bleedingCardView3 = this.g;
            jtr.f(rect2, bleedingCardView3);
            jtr.f(rect, bleedingCardView3);
        }
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        return ((hld) this).d.d(i);
    }

    @Override // defpackage.hld, defpackage.hlk
    public final void m(boolean z) {
        v();
        N(z);
        xc panModeDelegate = ((NavigationTemplate) C()).getPanModeDelegate();
        if (panModeDelegate != null) {
            this.i.t().n(panModeDelegate, z);
        }
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void n() {
        geu geuVar = this.i;
        geuVar.v().b(false);
        gjv gjvVarB = geuVar.B();
        gjvVarB.c(this, 4);
        gjvVarB.c(this, 5);
        gjvVarB.c(this, 7);
        this.b.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.x);
        super.n();
    }

    @Override // defpackage.hld
    public final boolean p() {
        return ((ggk) this.i.F(ggk.class)).v();
    }

    public final void r() {
        BleedingCardView bleedingCardView = this.q;
        if (bleedingCardView.getVisibility() != 0) {
            return;
        }
        bleedingCardView.setVisibility(4);
    }

    public final void s() {
        int width;
        int height;
        View view = this.n;
        if (view != null) {
            width = view.getWidth();
            height = view.getHeight();
        } else {
            gzb gzbVar = this.a;
            int i = gzbVar.b;
            width = gzbVar.a;
            height = i;
        }
        ViewGroup viewGroup = this.b;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        viewGroup.layout(0, 0, width, height);
    }

    public final void t(int i) {
        if (this.r != i) {
            this.r = i;
            w();
            if (this.r == 0) {
                K();
            }
        }
    }

    public final void u(NavigationTemplate navigationTemplate) {
        int i;
        int dimensionPixelSize;
        int i2;
        geu geuVar = this.i;
        int i3 = 0;
        if (geuVar.b().getDisplayType() == 1) {
            if (this.h) {
                this.t.setVisibility(8);
            } else {
                this.p = 8;
                this.c.f = 8;
                while (true) {
                    ViewGroup viewGroup = this.b;
                    if (i3 >= viewGroup.getChildCount()) {
                        fb();
                        return;
                    }
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt != null) {
                        childAt.setVisibility(8);
                    }
                    i3++;
                }
            }
        }
        kcl kclVar = this.c;
        wz navigationInfo = navigationTemplate.getNavigationInfo();
        kclVar.r = navigationInfo;
        if (navigationInfo == null) {
            kclVar.f = 4;
            kclVar.i.setVisibility(8);
            kclVar.g.setVisibility(4);
            kclVar.m.setVisibility(8);
        } else if (navigationInfo instanceof RoutingInfo) {
            RoutingInfo routingInfo = (RoutingInfo) navigationInfo;
            if (routingInfo.isLoading()) {
                kclVar.f = 0;
                kclVar.i.setVisibility(0);
                kclVar.g.setVisibility(8);
                kclVar.m.setVisibility(8);
            } else {
                geu geuVar2 = kclVar.a;
                CarIcon junctionImage = routingInfo.getJunctionImage();
                ImageView imageView = kclVar.o;
                boolean zJ = hbz.j(geuVar2, junctionImage, imageView, hmb.a);
                DetailedStepView detailedStepView = kclVar.l;
                Step currentStep = routingInfo.getCurrentStep();
                Distance currentDistance = routingInfo.getCurrentDistance();
                hlv hlvVar = kclVar.c;
                if (currentStep == null) {
                    detailedStepView.setVisibility(8);
                } else {
                    Maneuver maneuver = currentStep.getManeuver();
                    CarIcon icon = maneuver == null ? null : maneuver.getIcon();
                    ImageView imageView2 = detailedStepView.a;
                    hmb hmbVar = detailedStepView.g;
                    detailedStepView.a.setVisibility(true != hbz.j(geuVar2, icon, imageView2, hmbVar) ? 8 : 0);
                    if (currentDistance != null) {
                        detailedStepView.b.setText(hly.b(geuVar2, currentDistance));
                        detailedStepView.b.setVisibility(0);
                        i = 8;
                    } else {
                        i = 8;
                        detailedStepView.b.setVisibility(8);
                    }
                    if (CarText.isNullOrEmpty(currentStep.getCue())) {
                        detailedStepView.c.setVisibility(i);
                    } else {
                        detailedStepView.c.b(geuVar2, currentStep.getCue(), hlvVar);
                        detailedStepView.c.setVisibility(0);
                    }
                    CarIcon lanesImage = currentStep.getLanesImage();
                    if (zJ || !hbz.j(geuVar2, lanesImage, detailedStepView.d, hmbVar)) {
                        detailedStepView.f.setVisibility(8);
                        dimensionPixelSize = detailedStepView.getResources().getDimensionPixelSize(R.dimen.template_padding_3);
                    } else {
                        detailedStepView.f.setVisibility(0);
                        dimensionPixelSize = 0;
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) detailedStepView.e.getLayoutParams();
                    layoutParams.bottomMargin = dimensionPixelSize;
                    detailedStepView.e.setLayoutParams(layoutParams);
                    detailedStepView.setVisibility(0);
                }
                CompactStepView compactStepView = kclVar.h;
                Step nextStep = routingInfo.getNextStep();
                hlv hlvVar2 = kclVar.d;
                if (nextStep == null) {
                    compactStepView.setVisibility(8);
                } else {
                    Maneuver maneuver2 = nextStep.getManeuver();
                    compactStepView.a.setVisibility(true != hbz.j(geuVar2, maneuver2 == null ? null : maneuver2.getIcon(), compactStepView.a, compactStepView.c) ? 8 : 0);
                    compactStepView.b.b(geuVar2, nextStep.getCue(), hlvVar2);
                    compactStepView.setVisibility(0);
                }
                Step nextStep2 = routingInfo.getNextStep();
                if (zJ) {
                    imageView.setVisibility(0);
                    i2 = 8;
                    compactStepView.setVisibility(8);
                } else {
                    i2 = 8;
                    imageView.setVisibility(8);
                    compactStepView.setVisibility(nextStep2 != null ? 0 : 8);
                }
                kclVar.f = 0;
                kclVar.i.setVisibility(i2);
                kclVar.g.setVisibility(0);
                kclVar.m.setVisibility(i2);
            }
        } else if (navigationInfo instanceof MessageInfo) {
            MessageInfo messageInfo = (MessageInfo) navigationInfo;
            CarText title = messageInfo.getTitle();
            if (title == null) {
                ((ype) kclVar.e.h()).u("Title for the message is expected but not set");
                title = CarText.create("");
            }
            MessageView messageView = kclVar.m;
            geu geuVar3 = kclVar.a;
            CarIcon image = messageInfo.getImage();
            CarText text = messageInfo.getText();
            messageView.a.setVisibility(true != hbz.j(geuVar3, image, messageView.a, messageView.d) ? 8 : 0);
            messageView.b.a(geuVar3, title);
            messageView.c.a(geuVar3, text);
            messageView.c.setVisibility(true != CarText.isNullOrEmpty(text) ? 0 : 8);
            kclVar.f = 0;
            kclVar.i.setVisibility(8);
            kclVar.g.setVisibility(8);
            kclVar.h.setVisibility(8);
            messageView.setVisibility(0);
        } else {
            ((ype) kclVar.e.h()).y("Unknown navigation info: %s", navigationInfo);
        }
        TravelEstimate destinationTravelEstimate = navigationTemplate.getDestinationTravelEstimate();
        TravelEstimateView travelEstimateView = this.y;
        if (destinationTravelEstimate == null) {
            travelEstimateView.a(geuVar, null);
            this.p = 8;
        } else {
            travelEstimateView.a(geuVar, destinationTravelEstimate);
            this.p = 0;
        }
        N(((hld) this).d.c);
        M();
        fb();
    }

    public final void v() {
        boolean z = ((hld) this).d.c;
        ActionStripView actionStripView = this.t;
        actionStripView.c(!z);
        ActionStripView actionStripView2 = this.u;
        actionStripView2.c(true);
        this.w = true;
        if (!this.b.hasFocus()) {
            K();
        }
        if ((actionStripView.hasFocus() || actionStripView2.hasFocus()) && H()) {
            gzb gzbVar = this.a;
            if (gzbVar.a > 800 && gzbVar.b > 480) {
                return;
            }
        }
        long j = ActionStripView.b;
        actionStripView.g(j);
        if (!z) {
            actionStripView2.g(j);
        }
        this.w = false;
    }

    public final void w() {
        NavigationTemplate navigationTemplate = (NavigationTemplate) C();
        boolean z = false;
        x(navigationTemplate.getActionStrip(), false);
        L(navigationTemplate.getMapActionStrip(), false);
        ActionStrip mapActionStrip = ((NavigationTemplate) C()).getMapActionStrip();
        if (mapActionStrip != null && mapActionStrip.getFirstActionOfType(Action.TYPE_PAN) != null) {
            z = true;
        }
        ((hld) this).d.b(z);
        kcl kclVar = this.c;
        kclVar.b(((NavigationTemplate) C()).getBackgroundColor());
        if (this.r == 8) {
            kclVar.j.setVisibility(8);
        }
        Transition transitionInflateTransition = TransitionInflater.from(this.i).inflateTransition(R.transition.routing_card_transition);
        transitionInflateTransition.excludeTarget(czd.class, true);
        ViewGroup viewGroup = this.b;
        TransitionManager.beginDelayedTransition(viewGroup, transitionInflateTransition);
        if (viewGroup.getMeasuredHeight() == 0) {
            gev.a(new jlh(this, navigationTemplate, 16));
        } else {
            u(navigationTemplate);
        }
    }

    public final void x(ActionStrip actionStrip, boolean z) {
        this.t.b(this.i, actionStrip, ghu.b, z, false);
    }

    @Override // defpackage.hld
    public final long y() {
        return aczg.f();
    }

    @Override // defpackage.hld, defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        super.z(windowInsets, i);
        this.g.f(windowInsets);
        this.q.f(windowInsets);
        this.s.f(windowInsets);
    }
}
