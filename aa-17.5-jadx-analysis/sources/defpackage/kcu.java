package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Alert;
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
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.map.widgets.ProgressView;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTurnCardViewContainer;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class kcu extends hld {
    public boolean a;
    public final gdl b;
    public final ogz c;
    private final yph g;
    private final ViewGroup h;
    private final BleedingCardView p;
    private final ViewGroup q;
    private final int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private final gvb w;
    private final kcr x;
    private final lks y;

    public kcu(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        kcr kcxVar;
        List<Action> actions;
        super(geuVar, templateWrapper, gzcVar);
        this.g = yph.c("CarApp.H.Tem");
        this.s = 2;
        hem hemVarL = geuVar.l(gdl.class);
        hemVarL.getClass();
        this.b = (gdl) hemVarL;
        this.w = (gvb) geuVar.F(gvb.class);
        View viewInflate = LayoutInflater.from(geuVar).inflate(R.layout.minimized_navigation_layout, (ViewGroup) null);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.h = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.responsive_card_content_container);
        viewFindViewById.getClass();
        BleedingCardView bleedingCardView = (BleedingCardView) viewFindViewById;
        this.p = bleedingCardView;
        this.r = bleedingCardView.b;
        if (aczc.r()) {
            ArrayList arrayList = new ArrayList();
            ActionStrip mapActionStrip = u().getMapActionStrip();
            if (mapActionStrip != null && (actions = mapActionStrip.getActions()) != null) {
                arrayList.addAll(actions);
            }
            List<Action> actions2 = u().getActionStrip().getActions();
            if (actions2 != null) {
                arrayList.addAll(actions2);
            }
            kcxVar = new kct(viewGroup, this.i, arrayList);
        } else {
            ResponsiveTravelEstimateView responsiveTravelEstimateView = (ResponsiveTravelEstimateView) viewGroup.findViewById(R.id.responsive_travel_estimate_view);
            responsiveTravelEstimateView.getClass();
            kcxVar = new kcx(responsiveTravelEstimateView, geuVar);
        }
        this.x = kcxVar;
        this.y = new lks(viewGroup, geuVar);
        View viewFindViewById2 = viewGroup.findViewById(R.id.action_strip);
        viewFindViewById2.getClass();
        this.c = new ogz((ActionStripView) viewFindViewById2, geuVar);
        View viewFindViewById3 = viewGroup.findViewById(R.id.focus_frame);
        viewFindViewById3.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById3;
        this.q = viewGroup2;
        viewGroup2.setOnClickListener(new ie(this, 17, null));
    }

    private final NavigationTemplate u() {
        return ((MinimizedStateNavigationTemplate) C()).getOriginalTemplate();
    }

    private final void v(int i) throws Resources.NotFoundException {
        if (i != 2) {
            i = 1;
        } else if (!this.v) {
            this.c.g();
            this.x.c(null);
            this.y.a(null);
        }
        if (this.s != i) {
            this.s = i;
            s();
        }
    }

    @Override // defpackage.hld, defpackage.hlf, defpackage.hlo
    public final void A() {
        super.A();
        this.b.b.k(new ewg(new eyr((Object) this, 10, (int[][]) null), 10));
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void F() {
        super.F();
        this.b.b.fE(this, new ewg(new eyr((Object) this, 9, (int[][]) null), 10));
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void c() {
        super.c();
        geu geuVar = this.i;
        if (geuVar.b().getDisplayType() == 1) {
            hem hemVarL = geuVar.l(gtt.class);
            if (hemVarL == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ((gtt) hemVarL).a().fE(this, new ewg(new kaa(this, 4), 10));
        }
    }

    @Override // defpackage.hlf
    public final void d() {
        s();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.h;
    }

    @Override // defpackage.hld
    public final void fa(Rect rect, Rect rect2) {
        BleedingCardView bleedingCardView = (BleedingCardView) this.y.d;
        if (bleedingCardView.getVisibility() == 0) {
            rect2.top = bleedingCardView.getBottom();
        } else {
            ActionStripView actionStripView = (ActionStripView) this.c.b;
            if (actionStripView.getVisibility() == 0) {
                rect2.top = actionStripView.getBottom();
            } else {
                rect2.top = this.h.getTop();
            }
        }
        ViewGroup viewGroup = this.h;
        rect2.left = viewGroup.getLeft() + viewGroup.getPaddingLeft();
        rect2.right = viewGroup.getRight() - viewGroup.getPaddingRight();
        kcr kcrVar = this.x;
        if (kcrVar.a().getVisibility() == 0) {
            rect2.bottom = kcrVar.a().getTop();
        } else {
            rect2.bottom = viewGroup.getBottom() - viewGroup.getPaddingBottom();
        }
        rect.set(rect2);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void n() {
        super.n();
        if (aczc.q()) {
            this.h.setVisibility(8);
        }
    }

    public final void r() {
        hem hemVarL = this.i.l(gsf.class);
        hemVarL.getClass();
        ((gsf) hemVarL).b();
        this.c.g();
        this.x.c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        ogz ogzVar;
        String str;
        ynp ynpVar;
        geu geuVar;
        hlv hlvVarA;
        int i;
        int i2;
        if (aczc.q()) {
            this.h.setVisibility(0);
        }
        geu geuVar2 = this.i;
        if (geuVar2.b().getDisplayType() == 1 && !this.a) {
            this.h.setVisibility(8);
            fb();
            return;
        }
        ViewGroup viewGroup = this.h;
        viewGroup.setVisibility(0);
        sx sxVar = new sx();
        sw swVar = new sw();
        swVar.c(new CarIcon(new tj(IconCompat.m(geuVar2, R.drawable.ic_more_list))));
        swVar.d(new gec(this, 12));
        sxVar.b(swVar.a());
        ActionStrip actionStripA = sxVar.a();
        ogz ogzVar2 = this.c;
        ActionStripView actionStripView = (ActionStripView) ogzVar2.b;
        actionStripView.b(geuVar2, actionStripA, ghu.b, false, false);
        geu geuVar3 = geuVar2;
        Transition transitionInflateTransition = TransitionInflater.from(geuVar3).inflateTransition(R.transition.minimized_routing_card_transition);
        transitionInflateTransition.excludeTarget(czd.class, true);
        TransitionManager.beginDelayedTransition(viewGroup, transitionInflateTransition);
        CarColor backgroundColor = u().getBackgroundColor();
        int iK = backgroundColor != null ? gbt.k(geuVar3, backgroundColor, false, -16777216, ghv.a, 0) : this.r;
        BleedingCardView bleedingCardView = this.p;
        bleedingCardView.a(gbt.j(iK, 0.2f));
        TypedArray typedArrayObtainStyledAttributes = geuVar3.obtainStyledAttributes(new int[]{R.attr.templateResponsiveNavCardRadius});
        typedArrayObtainStyledAttributes.getClass();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        bleedingCardView.b(dimensionPixelSize);
        kcr kcrVar = this.x;
        kcrVar.b().b(dimensionPixelSize);
        float f = bleedingCardView.a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, f, f});
        gradientDrawable.setColor(gbt.j(iK, 0.4f));
        wz navigationInfo = u().getNavigationInfo();
        TravelEstimate destinationTravelEstimate = u().getDestinationTravelEstimate();
        if (navigationInfo == null && destinationTravelEstimate == null) {
            ((ProgressView) this.y.c).setVisibility(8);
            this.v = false;
            v(2);
        } else {
            ogzVar2.g();
            String str2 = " · ";
            if (navigationInfo instanceof RoutingInfo) {
                lks lksVar = this.y;
                lksVar.b(new kbs(this, 13));
                RoutingInfo routingInfo = (RoutingInfo) navigationInfo;
                routingInfo.getClass();
                if (routingInfo.isLoading()) {
                    ((ProgressView) lksVar.c).setVisibility(0);
                    ((ViewGroup) lksVar.f).setVisibility(8);
                    ((ResponsiveTurnCardViewContainer) lksVar.b).setVisibility(8);
                    ogzVar = ogzVar2;
                } else {
                    Object obj = lksVar.b;
                    Object obj2 = lksVar.e;
                    Step currentStep = routingInfo.getCurrentStep();
                    Distance currentDistance = routingInfo.getCurrentDistance();
                    geu geuVar4 = (geu) obj2;
                    TypedArray typedArrayObtainStyledAttributes2 = geuVar4.obtainStyledAttributes(new int[]{R.attr.templateRoutingImageSpanBody3MaxHeight});
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
                    typedArrayObtainStyledAttributes2.recycle();
                    hlv hlvVar = hlv.a;
                    hlu hluVar = new hlu();
                    ogzVar = ogzVar2;
                    hluVar.c = new Rect(0, 0, Alert.DURATION_SHOW_INDEFINITELY, dimensionPixelSize2);
                    hluVar.d = 10;
                    hluVar.a = ghv.c;
                    hluVar.f = 4;
                    hlv hlvVarA2 = hluVar.a();
                    gks.i("CarApp.H.Tem", "Setting detailed step view with step: %s, and distance: %s", currentStep, currentDistance);
                    if (currentStep == null) {
                        ((ResponsiveTurnCardViewContainer) obj).setVisibility(8);
                        i = 0;
                        i2 = 8;
                    } else {
                        Maneuver maneuver = currentStep.getManeuver();
                        CarIcon icon = maneuver == null ? null : maneuver.getIcon();
                        ResponsiveTurnCardViewContainer responsiveTurnCardViewContainer = (ResponsiveTurnCardViewContainer) obj;
                        ImageView imageView = responsiveTurnCardViewContainer.d;
                        hmb hmbVar = responsiveTurnCardViewContainer.j;
                        responsiveTurnCardViewContainer.d.setVisibility(true != hbz.j(geuVar4, icon, imageView, hmbVar) ? 8 : 0);
                        if (grx.d(responsiveTurnCardViewContainer.i)) {
                            responsiveTurnCardViewContainer.f.setMaxLines(1);
                        } else {
                            responsiveTurnCardViewContainer.f.setMaxLines(2);
                        }
                        if (!grx.d(responsiveTurnCardViewContainer.i)) {
                            responsiveTurnCardViewContainer.b(responsiveTurnCardViewContainer.e, R.attr.templateResponsiveNavCardDistanceLargeTextStyle);
                        }
                        if (currentDistance != null) {
                            responsiveTurnCardViewContainer.e.setText(hly.b(geuVar4, currentDistance));
                            responsiveTurnCardViewContainer.e.setVisibility(0);
                        } else {
                            responsiveTurnCardViewContainer.e.setVisibility(8);
                        }
                        CarText cue = currentStep.getCue();
                        if (cue == null || CarText.isNullOrEmpty(cue)) {
                            responsiveTurnCardViewContainer.f.setVisibility(8);
                            hlvVarA = hlvVarA2;
                        } else {
                            if (responsiveTurnCardViewContainer.f.getMaxLines() == 1) {
                                hlu hluVarA = hlv.a(hlvVarA2);
                                hluVarA.g = true;
                                hlvVarA = hluVarA.a();
                            } else {
                                hlvVarA = hlvVarA2;
                            }
                            responsiveTurnCardViewContainer.f.b(geuVar4, currentStep.getCue(), hlvVarA);
                            responsiveTurnCardViewContainer.f.setVisibility(0);
                        }
                        if (hbz.j(geuVar4, currentStep.getLanesImage(), responsiveTurnCardViewContainer.h, hmbVar)) {
                            responsiveTurnCardViewContainer.g.setVisibility(0);
                            responsiveTurnCardViewContainer.a(R.dimen.template_padding_1);
                        } else {
                            responsiveTurnCardViewContainer.g.setVisibility(8);
                            if (!grx.d(responsiveTurnCardViewContainer.i)) {
                                responsiveTurnCardViewContainer.a(R.dimen.template_padding_3);
                            }
                        }
                        if (currentDistance != null) {
                            StringBuilder sb = new StringBuilder(hly.b(geuVar4, currentDistance));
                            if (!CarText.isNullOrEmpty(currentStep.getCue()) && grx.d(responsiveTurnCardViewContainer.i)) {
                                sb.append(" · ");
                            }
                            responsiveTurnCardViewContainer.e.setText(sb.toString());
                        }
                        responsiveTurnCardViewContainer.f.b(geuVar4, currentStep.getCue(), hlvVarA);
                        i = 0;
                        responsiveTurnCardViewContainer.a.setVisibility(0);
                        i2 = 8;
                        responsiveTurnCardViewContainer.c.setVisibility(8);
                    }
                    ((ProgressView) lksVar.c).setVisibility(i2);
                    ((ViewGroup) lksVar.f).setVisibility(i);
                    ((ResponsiveTurnCardViewContainer) obj).setVisibility(i);
                }
            } else {
                ogzVar = ogzVar2;
                boolean z = navigationInfo instanceof MessageInfo;
                lks lksVar2 = this.y;
                if (z) {
                    lksVar2.b(new kbs(this, 14));
                    MessageInfo messageInfo = (MessageInfo) navigationInfo;
                    messageInfo.getClass();
                    CarText title = messageInfo.getTitle();
                    CarIcon image = messageInfo.getImage();
                    CarText text = messageInfo.getText();
                    gks.i("CarApp.H.Tem", "Setting responsive message view with message: %s secondary: %s image: %s", title, text, image);
                    ResponsiveTurnCardViewContainer responsiveTurnCardViewContainer2 = (ResponsiveTurnCardViewContainer) lksVar2.b;
                    hmb hmbVar2 = responsiveTurnCardViewContainer2.j;
                    ImageView imageView2 = responsiveTurnCardViewContainer2.k;
                    geu geuVar5 = (geu) lksVar2.e;
                    responsiveTurnCardViewContainer2.k.setVisibility(true != hbz.j(geuVar5, image, imageView2, hmbVar2) ? 8 : 0);
                    responsiveTurnCardViewContainer2.l.a(geuVar5, title);
                    if (responsiveTurnCardViewContainer2.i != 1) {
                        responsiveTurnCardViewContainer2.m.a(geuVar5, text);
                        responsiveTurnCardViewContainer2.m.setVisibility(true != CarText.isNullOrEmpty(text) ? 0 : 8);
                    }
                    if (grx.d(responsiveTurnCardViewContainer2.i)) {
                        responsiveTurnCardViewContainer2.b(responsiveTurnCardViewContainer2.l, R.attr.templateResponsiveNavCardDistanceSmallTextStyle);
                        responsiveTurnCardViewContainer2.m.setMaxLines(1);
                    } else {
                        responsiveTurnCardViewContainer2.b(responsiveTurnCardViewContainer2.l, R.attr.templateResponsiveNavCardDistanceLargeTextStyle);
                        responsiveTurnCardViewContainer2.m.setMaxLines(2);
                    }
                    responsiveTurnCardViewContainer2.a.setVisibility(8);
                    responsiveTurnCardViewContainer2.g.setVisibility(8);
                    responsiveTurnCardViewContainer2.c.setVisibility(0);
                    ((ProgressView) lksVar2.c).setVisibility(8);
                    ((ViewGroup) lksVar2.f).setVisibility(0);
                    responsiveTurnCardViewContainer2.setVisibility(0);
                } else {
                    lksVar2.a(new kbs(this, 15));
                    ((ype) this.g.h()).y("Unknown navigation info: %s", navigationInfo);
                }
            }
            if (destinationTravelEstimate != null) {
                ResponsiveTravelEstimateView responsiveTravelEstimateViewB = kcrVar.b();
                gks.i("CarApp.H.Tem", "Setting travel estimate view: %s", destinationTravelEstimate);
                TypedArray typedArrayObtainStyledAttributes3 = responsiveTravelEstimateViewB.getContext().obtainStyledAttributes(new int[]{R.attr.templateResponsiveTravelEstimatePrimaryTextStyle, R.attr.templateResponsiveTravelEstimateSecondaryTextStyle, R.attr.templateButtonMinTargetSize});
                int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, -1);
                int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, -1);
                int dimensionPixelSize3 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(2, 0);
                typedArrayObtainStyledAttributes3.recycle();
                gth gthVarB = gmn.b(destinationTravelEstimate, geuVar3);
                CharSequence charSequenceC = hlb.c(gthVarB.b);
                yfq yfqVarT = yfq.t(new maw(charSequenceC != null ? charSequenceC.toString() : null, 0, resourceId2, null), new maw(gthVarB.d, resourceId, resourceId2, null), new maw(gthVarB.c, 0, resourceId2, destinationTravelEstimate.getRemainingTimeColor()), new maw(gthVarB.e, resourceId2, resourceId2, destinationTravelEstimate.getRemainingDistanceColor()));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ynp ynpVarListIterator = yfqVarT.listIterator(0);
                int i3 = 0;
                while (ynpVarListIterator.hasNext()) {
                    maw mawVar = (maw) ynpVarListIterator.next();
                    String str3 = mawVar.c;
                    if (str3.isEmpty() || str3.length() > 16 || i3 >= 3) {
                        str = str2;
                        ynpVar = ynpVarListIterator;
                    } else {
                        if (spannableStringBuilder.length() + 3 + str3.length() > 32) {
                            break;
                        }
                        if (i3 > 0) {
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        SpannableString spannableString = new SpannableString(str3);
                        if (mawVar.a != 0) {
                            geuVar = geuVar3;
                            spannableString.setSpan(new TextAppearanceSpan(geuVar3, mawVar.b), 0, spannableString.length(), 33);
                        } else {
                            geuVar = geuVar3;
                        }
                        Object obj3 = mawVar.d;
                        if (obj3 != null) {
                            CarColor carColor = (CarColor) obj3;
                            geuVar3 = geuVar;
                            str = str2;
                            ynpVar = ynpVarListIterator;
                            spannableString.setSpan(new ForegroundColorSpan(gbt.k(geuVar3, carColor, false, -1, ghv.b, 0)), 0, spannableString.length(), 33);
                        } else {
                            ynpVar = ynpVarListIterator;
                            geuVar3 = geuVar;
                            str = str2;
                        }
                        spannableStringBuilder.append((CharSequence) spannableString);
                        i3++;
                    }
                    str2 = str;
                    ynpVarListIterator = ynpVar;
                }
                responsiveTravelEstimateViewB.f.setText(new SpannableString(spannableStringBuilder));
                if (geuVar3.b().getDisplayType() == 1) {
                    responsiveTravelEstimateViewB.g.setVisibility(8);
                } else {
                    sw swVar2 = new sw();
                    swVar2.c(new CarIcon(new tj(IconCompat.m(geuVar3, R.drawable.ic_stop_nav))));
                    CarIcon carIconH = hbz.h(swVar2.a());
                    ImageView imageView3 = responsiveTravelEstimateViewB.h;
                    hmb hmbVar3 = hmb.a;
                    hbz.j(geuVar3, carIconH, imageView3, new hmb(-1, true, false, ghw.b, null, false, 0));
                    ols.e(responsiveTravelEstimateViewB.g, dimensionPixelSize3);
                    responsiveTravelEstimateViewB.g.setOnClickListener(new kep(geuVar3, 0));
                }
                ogzVar.g();
                kcrVar.d(new kbs(this, 17));
            } else {
                kcrVar.c(new kbs(this, 18));
            }
            this.v = true;
            v(1);
        }
        if (kio.b().r() && geuVar3.x().b()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.minimized_template);
            h hVar = new h();
            hVar.e(constraintLayout);
            int i4 = this.s;
            ViewGroup viewGroup2 = this.q;
            if (i4 == 1) {
                hVar.h(viewGroup2.getId(), 3, constraintLayout.getId(), 3);
                hVar.h(viewGroup2.getId(), 4, kcrVar.a().getId(), 3);
            } else {
                hVar.h(viewGroup2.getId(), 3, actionStripView.getId(), 4);
                hVar.h(viewGroup2.getId(), 4, constraintLayout.getId(), 4);
            }
            hVar.b(constraintLayout);
        }
        fb();
    }

    public final void t(Alert alert) {
        gvb gvbVar = this.w;
        if (alert != null) {
            gvbVar.h(alert, new kok(this, 1));
        } else {
            gvbVar.g();
        }
    }

    @Override // defpackage.hld, defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        int systemWindowInsetTop;
        int systemWindowInsetBottom;
        windowInsets.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
            insets.getClass();
            this.t = Math.max(this.t, insets.left);
            systemWindowInsetTop = insets.top;
            this.u = Math.max(this.u, insets.right);
            systemWindowInsetBottom = insets.bottom;
        } else {
            this.t = Math.max(this.t, windowInsets.getSystemWindowInsetLeft());
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            this.u = Math.max(this.u, windowInsets.getSystemWindowInsetRight());
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        }
        this.h.setPadding(this.t, systemWindowInsetTop, this.u, systemWindowInsetBottom);
    }
}
