package defpackage;

import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.basewidgets.PanOverlayView;
import com.google.android.apps.auto.components.apphost.basewidgets.action.MaterialActionStripView;
import com.google.android.apps.auto.components.apphost.view.presenters.navigation.minimized.MinimizedTurnCardView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class jxb extends gnv {
    public final MinimizedTurnCardView c;
    private final ViewGroup g;
    private final ViewGroup h;
    private final MaterialActionStripView p;
    private final MaterialActionStripView q;
    private final PanOverlayView r;
    private final ViewGroup s;
    private final gjv t;

    public jxb(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) throws Resources.NotFoundException {
        super(geuVar, templateWrapper, gzcVar);
        boolean z = gzcVar == gzc.d;
        View viewInflate = LayoutInflater.from(z ? new ContextThemeWrapper(geuVar, R.style.ThemeOverlay_Template_MapWithContent_Minimized_Material) : geuVar).inflate(R.layout.material_unified_map_template, (ViewGroup) null);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.g = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.focus_frame);
        viewFindViewById.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        this.s = viewGroup2;
        if (z) {
            viewGroup2.setOnClickListener(new ie(this, 10, null));
        } else {
            viewGroup2.setVisibility(8);
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.card);
        viewFindViewById2.getClass();
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById2;
        this.h = viewGroup3;
        View viewFindViewById3 = viewGroup.findViewById(R.id.horizontal_floating_actions);
        viewFindViewById3.getClass();
        this.p = (MaterialActionStripView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.vertical_floating_actions);
        viewFindViewById4.getClass();
        MaterialActionStripView materialActionStripView = (MaterialActionStripView) viewFindViewById4;
        this.q = materialActionStripView;
        View viewFindViewById5 = viewGroup.findViewById(R.id.pan_overlay);
        viewFindViewById5.getClass();
        this.r = (PanOverlayView) viewFindViewById5;
        viewGroup3.setVisibility(0);
        this.t = new gjv((fvp) materialActionStripView);
        geuVar.getResources().getDimension(R.dimen.padding_p2);
        View viewFindViewById6 = viewGroup.findViewById(R.id.minimized_turn_card);
        viewFindViewById6.getClass();
        this.c = (MinimizedTurnCardView) viewFindViewById6;
        ((gnv) this).b.a.fE(this, new ewg(new eyr((Object) this, 8, (char[][]) null), 7));
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.g;
    }

    @Override // defpackage.gnv
    public final View f() {
        return this.p;
    }

    @Override // defpackage.hld
    public final void fa(Rect rect, Rect rect2) {
        View viewFindViewById = this.g.findViewById(R.id.card_container);
        MaterialActionStripView materialActionStripView = this.q;
        if (materialActionStripView.getVisibility() != 8) {
            rect2.right = afpt.f(rect.right, materialActionStripView.getLeft() - this.f);
        }
        if (materialActionStripView.getVisibility() == 0) {
            rect.right = rect2.right;
        }
        int i = rect2.top;
        MaterialActionStripView materialActionStripView2 = this.p;
        int i2 = this.f;
        rect2.top = afpt.e(i, materialActionStripView2.getBottom() + i2);
        MinimizedTurnCardView minimizedTurnCardView = this.c;
        if (minimizedTurnCardView.getVisibility() == 0) {
            rect2.top = afpt.e(rect2.top, minimizedTurnCardView.getBottom() + i2);
            rect.top = afpt.e(rect.top, minimizedTurnCardView.getBottom() + i2);
        }
        if (materialActionStripView2.getVisibility() == 0) {
            rect.top = materialActionStripView2.getBottom() + i2;
        }
        rect2.left = afpt.e(rect2.left, viewFindViewById.getRight() + i2);
        if (viewFindViewById.getVisibility() == 0) {
            rect.left = rect2.left;
        }
    }

    @Override // defpackage.gnv
    public final View h() {
        return this.q;
    }

    @Override // defpackage.gnv
    public final ViewGroup j() {
        return this.h;
    }

    @Override // defpackage.gnv
    public final TemplateWrapper k(wb wbVar) {
        hmh hmhVar = hmh.a;
        geu geuVar = this.i;
        geuVar.getClass();
        return hmhVar.c(geuVar, TemplateWrapper.wrap(wbVar), gzc.c);
    }

    @Override // defpackage.gnv
    public final PanOverlayView l() {
        return this.r;
    }

    @Override // defpackage.gnv
    public final void o(ActionStrip actionStrip) {
        List<Action> actions;
        geu geuVar = this.i;
        geuVar.getClass();
        List listBU = null;
        if (actionStrip != null && (actions = actionStrip.getActions()) != null) {
            listBU = woy.bU(actions);
        }
        if (listBU == null) {
            listBU = afbe.a;
        }
        this.p.a(geuVar, listBU);
    }

    @Override // defpackage.gnv
    public final gjv s() {
        return this.t;
    }

    public final void t(hrj hrjVar) {
        Object obj = hrjVar.c;
        MinimizedTurnCardView minimizedTurnCardView = this.c;
        if (obj == null) {
            minimizedTurnCardView.setVisibility(8);
            this.p.setVisibility(0);
            this.q.setVisibility(0);
            new Handler(Looper.getMainLooper()).postDelayed(new joo(this, 12, null), 300L);
            return;
        }
        minimizedTurnCardView.setVisibility(0);
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        new Handler(Looper.getMainLooper()).postDelayed(new joo(this, 13, null), 300L);
    }

    @Override // defpackage.hld
    public final long y() {
        return aczg.f();
    }

    @Override // defpackage.hld, defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        int systemWindowInsetLeft;
        int systemWindowInsetRight;
        windowInsets.getClass();
        hem hemVarL = this.i.l(gsf.class);
        hemVarL.getClass();
        boolean zC = ((gsf) hemVarL).c();
        MaterialActionStripView materialActionStripView = this.p;
        if (zC) {
            materialActionStripView.setVisibility(8);
            this.q.setVisibility(8);
        } else {
            materialActionStripView.setVisibility(0);
            this.q.setVisibility(0);
        }
        super.z(windowInsets, i);
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
            insets.getClass();
            systemWindowInsetLeft = insets.left;
            systemWindowInsetRight = insets.right;
        } else {
            systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        }
        ViewGroup viewGroup = this.g;
        viewGroup.setPadding(systemWindowInsetLeft, viewGroup.getPaddingTop(), systemWindowInsetRight, viewGroup.getPaddingBottom());
    }
}
