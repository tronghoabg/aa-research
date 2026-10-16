package defpackage;

import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.PlaceListMapTemplate;
import androidx.car.app.model.TemplateWrapper;
import com.google.android.apps.auto.components.apphost.basewidgets.action.MaterialActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialTitleHeaderView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kce extends hlf {
    public final ViewGroup a;
    public final MaterialCardView b;
    public final MaterialActionStripView c;
    private final MaterialTitleHeaderView d;
    private final ContentView e;
    private final gpc f;
    private final ViewTreeObserver.OnGlobalLayoutListener g;

    public kce(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.material_map_template_layout, (ViewGroup) null);
        this.a = viewGroup;
        viewGroup.findViewById(R.id.row_header_divider).setVisibility(0);
        MaterialCardView materialCardView = (MaterialCardView) viewGroup.findViewById(R.id.card);
        this.b = materialCardView;
        this.d = (MaterialTitleHeaderView) viewGroup.findViewById(R.id.header_view);
        this.e = (ContentView) viewGroup.findViewById(R.id.content_view);
        this.c = (MaterialActionStripView) viewGroup.findViewById(R.id.horizontal_floating_actions);
        gpd gpdVar = (gpd) geuVar.l(gpd.class);
        gpdVar.getClass();
        gpc gpcVarA = gpdVar.a();
        this.f = gpcVarA;
        viewGroup.addView(gpcVarA, 0);
        materialCardView.setVisibility(0);
        this.g = new klu(this, geuVar, 1);
    }

    private final void m(eps epsVar) {
        this.f.h(epsVar);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void A() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.g);
        m(eps.d);
        super.A();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void B() {
        super.B();
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.g);
        m(eps.e);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void F() {
        super.F();
        m(eps.c);
    }

    @Override // defpackage.hlf
    protected final View a() {
        ContentView contentView = this.e;
        return contentView.getVisibility() == 0 ? contentView : this.a;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        this.a.removeView(this.f);
        super.b();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void c() {
        super.c();
        m(eps.d);
        this.i.B().b(this, 12, new kbs(this, 8));
    }

    @Override // defpackage.hlf
    public final void d() {
        f();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.a;
    }

    public final void f() {
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) C();
        boolean zIsLoading = placeListMapTemplate.isLoading();
        geu geuVar = this.i;
        if (zIsLoading) {
            gef gefVar = (gef) geuVar.l(gef.class);
            gefVar.getClass();
            int i = yfq.d;
            gefVar.e(yls.a);
        }
        Transition transitionInflateTransition = TransitionInflater.from(geuVar).inflateTransition(R.transition.map_template_transition);
        transitionInflateTransition.excludeTarget(czd.class, true);
        TransitionManager.beginDelayedTransition(this.a, transitionInflateTransition);
        if (CarText.isNullOrEmpty(placeListMapTemplate.getTitle()) && placeListMapTemplate.getHeaderAction() == null) {
            this.d.setVisibility(8);
        } else {
            MaterialTitleHeaderView materialTitleHeaderView = this.d;
            materialTitleHeaderView.a(geuVar, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
            materialTitleHeaderView.setVisibility(0);
        }
        hih hihVarD = guo.d(geuVar, placeListMapTemplate.getItemList());
        hihVarD.i = placeListMapTemplate.isLoading();
        hihVarD.a();
        hihVarD.f = ghz.c;
        hihVarD.j = this.k.isRefresh();
        hihVarD.n = true;
        this.e.b(geuVar, new hii(hihVarD));
        gpc gpcVar = this.f;
        gpcVar.j(placeListMapTemplate.isCurrentLocationEnabled());
        gpcVar.i(placeListMapTemplate.getAnchor());
        h();
        ActionStrip actionStrip = placeListMapTemplate.getActionStrip();
        MaterialActionStripView materialActionStripView = this.c;
        if (actionStrip == null) {
            materialActionStripView.setVisibility(8);
        } else {
            materialActionStripView.a(geuVar, actionStrip.getActions());
            materialActionStripView.setVisibility(0);
        }
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean ff() {
        return true;
    }

    public final void h() {
        gef gefVar = (gef) this.i.l(gef.class);
        gefVar.getClass();
        this.f.k(gefVar.b());
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        if (i == 22) {
            if (hlf.J(yfq.q(this.b), yfq.q(this.c), false)) {
                return true;
            }
        } else if (i == 21) {
            if (hlf.J(yfq.q(this.c), yfq.q(this.e), false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void n() {
        m(eps.c);
        geu geuVar = this.i;
        gef gefVar = (gef) geuVar.l(gef.class);
        gefVar.getClass();
        int i = yfq.d;
        gefVar.e(yls.a);
        geuVar.B().c(this, 12);
        super.n();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        super.z(windowInsets, 0);
    }
}
