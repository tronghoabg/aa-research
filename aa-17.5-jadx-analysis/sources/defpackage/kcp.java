package defpackage;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.TemplateWrapper;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.apphost.basewidgets.action.MaterialActionStripView;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate;
import com.google.android.apps.auto.components.apphost.view.presenters.navigation.minimized.MinimizedTurnCardView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kcp extends hld {
    public final MinimizedTurnCardView a;
    public final MaterialActionStripView b;
    private final ViewGroup c;
    private final ViewGroup g;
    private final mal h;
    private final ole p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private boolean u;

    public kcp(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        this.h = mal.a();
        this.q = false;
        this.r = 2;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.material_minimized_map_based_layout, (ViewGroup) null);
        this.c = viewGroup;
        this.a = (MinimizedTurnCardView) viewGroup.findViewById(R.id.minimized_turn_card);
        this.b = (MaterialActionStripView) viewGroup.findViewById(R.id.horizontal_floating_actions);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.focus_frame);
        this.g = viewGroup2;
        ole oleVar = new ole();
        this.p = oleVar;
        oleVar.b.fE(this, new hlg(this, 11));
        oleVar.a.fE(this, new hlg(this, 12));
        oleVar.e.fE(this, new hlg(this, 13));
        oleVar.f.fE(this, new hlg(this, 14));
        viewGroup2.setOnClickListener(new ie(this, 16, null));
    }

    private final void x() throws Resources.NotFoundException {
        MinimizedTurnCardView minimizedTurnCardView = this.a;
        if (minimizedTurnCardView.getVisibility() == 8) {
            return;
        }
        this.b.setVisibility(8);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.i, R.anim.responsive_turn_card_hide_animation);
        animationLoadAnimation.setAnimationListener(new kcn(this));
        minimizedTurnCardView.setAnimation(animationLoadAnimation);
    }

    @Override // defpackage.hlf
    public final void d() throws Resources.NotFoundException {
        v();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.c;
    }

    @Override // defpackage.hld
    public final void fa(Rect rect, Rect rect2) {
        MinimizedTurnCardView minimizedTurnCardView = this.a;
        if (minimizedTurnCardView.getVisibility() == 0) {
            rect2.top = minimizedTurnCardView.getBottom() + this.f;
        } else {
            MaterialActionStripView materialActionStripView = this.b;
            if (materialActionStripView.getVisibility() == 0) {
                rect2.top = materialActionStripView.getBottom() + this.f;
            } else {
                ViewGroup viewGroup = this.c;
                rect2.top = viewGroup.getTop() + this.f;
            }
        }
        ViewGroup viewGroup2 = this.c;
        int left = viewGroup2.getLeft() + viewGroup2.getPaddingLeft();
        int i = this.f;
        rect2.left = left + i;
        rect2.right = (viewGroup2.getRight() - viewGroup2.getPaddingRight()) - i;
        rect2.bottom = (viewGroup2.getBottom() - viewGroup2.getPaddingBottom()) - i;
        rect.set(rect2);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void n() {
        super.n();
        if (aczc.q()) {
            this.c.setVisibility(8);
        }
    }

    public final void r() {
        gsf gsfVar = (gsf) this.i.l(gsf.class);
        gsfVar.getClass();
        gsfVar.b();
        x();
    }

    public final void s(String str) {
        if (!this.q || str == null) {
            return;
        }
        MinimizedTurnCardView minimizedTurnCardView = this.a;
        geu geuVar = this.i;
        CarText carTextCreate = CarText.create(str);
        hlv hlvVar = hlv.a;
        hlu hluVar = new hlu();
        hluVar.g = true;
        minimizedTurnCardView.a(gey.a(geuVar, carTextCreate, hluVar.a()));
    }

    public final void t(String str) {
        if (this.q) {
            this.a.k(str);
        }
    }

    public final void u(old oldVar) throws Resources.NotFoundException {
        Drawable drawable;
        if (this.q && oldVar != null) {
            byte[] bArr = oldVar.b;
            if (bArr != null) {
                drawable = new BitmapDrawable(this.i.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } else {
                geu geuVar = this.i;
                drawable = geuVar.getResources().getDrawable(oldVar.a, geuVar.getTheme());
            }
            gab gabVar = new gab(new gfu(drawable), null, null);
            MinimizedTurnCardView minimizedTurnCardView = this.a;
            minimizedTurnCardView.n(gabVar);
            minimizedTurnCardView.b = oldVar.c;
            minimizedTurnCardView.o();
        }
    }

    public final void v() throws Resources.NotFoundException {
        ActionStrip actionStripA;
        if (aczc.q()) {
            this.c.setVisibility(0);
        }
        geu geuVar = this.i;
        if (geuVar.b().getDisplayType() == 1) {
            this.c.setVisibility(8);
            fb();
            return;
        }
        int i = 11;
        if (((MinimizedStateMapBasedTemplate) C()).getOriginalTemplate() instanceof MessageTemplate) {
            sx sxVar = new sx();
            sw swVar = new sw();
            swVar.e(geuVar.getString(R.string.message_temp_action_strip_in_minimized_state));
            swVar.d(new gec(this, i));
            sxVar.b(swVar.a());
            actionStripA = sxVar.a();
        } else {
            sx sxVar2 = new sx();
            sw swVar2 = new sw();
            swVar2.c(new CarIcon(new tj(IconCompat.m(geuVar, R.drawable.gs_list_vd_theme_24))));
            swVar2.d(new gec(this, i));
            sxVar2.b(swVar2.a());
            actionStripA = sxVar2.a();
        }
        MaterialActionStripView materialActionStripView = this.b;
        materialActionStripView.a(geuVar, actionStripA.getActions());
        materialActionStripView.setVisibility(0);
        Transition transitionInflateTransition = TransitionInflater.from(geuVar).inflateTransition(R.transition.minimized_routing_card_transition);
        transitionInflateTransition.excludeTarget(czd.class, true);
        ViewGroup viewGroup = this.c;
        TransitionManager.beginDelayedTransition(viewGroup, transitionInflateTransition);
        ajmd ajmdVarF = this.h.f();
        this.q = ajmdVarF == null ? false : ((gmh) geuVar.d()).a.equals(ajmdVarF.D());
        ole oleVar = this.p;
        s((String) oleVar.b.e());
        t((String) oleVar.a.e());
        u((old) oleVar.e.e());
        if (this.q) {
            this.u = true;
            materialActionStripView.setVisibility(8);
            MinimizedTurnCardView minimizedTurnCardView = this.a;
            if (minimizedTurnCardView.getVisibility() != 0) {
                minimizedTurnCardView.setVisibility(0);
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(geuVar, R.anim.responsive_turn_card_show_animation);
                animationLoadAnimation.setAnimationListener(new kcm(this));
                minimizedTurnCardView.setAnimation(animationLoadAnimation);
            }
        } else {
            this.u = false;
            x();
        }
        Integer num = (Integer) oleVar.f.e();
        w(num != null ? num.intValue() : 0);
        if (geuVar.x().b()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.minimized_template);
            h hVar = new h();
            hVar.e(constraintLayout);
            if (this.r != 1) {
                ViewGroup viewGroup2 = this.g;
                hVar.h(viewGroup2.getId(), 3, materialActionStripView.getId(), 4);
                hVar.h(viewGroup2.getId(), 4, constraintLayout.getId(), 4);
            }
            hVar.b(constraintLayout);
        }
        fb();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L9
            r0 = 4
            if (r2 == r0) goto L9
            if (r2 != 0) goto L10
            r2 = 0
        L9:
            boolean r0 = r1.u
            if (r0 != 0) goto L10
            r1.x()
        L10:
            int r0 = r1.r
            if (r0 == r2) goto L19
            r1.r = r2
            r1.v()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcp.w(int):void");
    }

    @Override // defpackage.hld, defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        int systemWindowInsetTop;
        int systemWindowInsetBottom;
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
            this.s = Math.max(this.s, insets.left);
            systemWindowInsetTop = insets.top;
            this.t = Math.max(this.t, insets.right);
            systemWindowInsetBottom = insets.bottom;
        } else {
            this.s = Math.max(this.s, windowInsets.getSystemWindowInsetLeft());
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            this.t = Math.max(this.t, windowInsets.getSystemWindowInsetRight());
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        }
        this.c.setPadding(this.s, systemWindowInsetTop, this.t, systemWindowInsetBottom);
    }
}
