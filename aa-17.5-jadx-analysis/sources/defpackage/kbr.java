package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentModerationWrapperLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialTitleHeaderView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class kbr extends hlf {
    private final ViewGroup a;
    private final MaterialTitleHeaderView b;
    private final ContentView c;
    private final ImageView d;
    private final List e;
    private final List f;
    private final LinearLayout g;
    private final View h;
    private boolean p;
    private final boolean q;

    public kbr(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        this.p = false;
        this.q = gzcVar.a();
        boolean zA = this.o.a();
        GridWrapperTemplate gridWrapperTemplate = (GridWrapperTemplate) C();
        Context contextThemeWrapper = zA ? new ContextThemeWrapper(geuVar, R.style.ThemeOverlay_Template_Card_Material) : geuVar;
        if (gridWrapperTemplate.isLauncher() && gridWrapperTemplate.getBackgroundImage() != null) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, R.style.ThemeOverlay_Template_Grid_Launcher_Material);
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.material_grid_wrapper_template_layout, (ViewGroup) null);
        this.a = viewGroup;
        MaterialTitleHeaderView materialTitleHeaderView = (MaterialTitleHeaderView) viewGroup.findViewById(R.id.header_view);
        this.b = materialTitleHeaderView;
        ContentView contentView = (ContentView) viewGroup.findViewById(R.id.grid_content_view);
        this.c = contentView;
        this.d = (ImageView) viewGroup.findViewById(R.id.grid_background);
        this.g = (LinearLayout) viewGroup.findViewById(R.id.floating_action_container);
        this.e = yfq.q(materialTitleHeaderView);
        this.f = yfq.q(contentView);
        this.h = viewGroup.findViewById(R.id.row_header_divider);
        ((ContentModerationWrapperLayout) viewGroup.findViewById(R.id.park_only_container)).a(geuVar, this.k);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void B() {
        super.B();
        if (this.p) {
            View viewA = this.c.a();
            if (viewA instanceof GridView) {
                ((ype) ContentView.a.l().ai((char) 2927)).u("Scrolling grid to top");
                ((GridView) viewA).c();
            }
        }
    }

    @Override // defpackage.hlf
    protected final View a() {
        ContentView contentView = this.c;
        return contentView.getVisibility() == 0 ? contentView : this.a;
    }

    @Override // defpackage.hlf
    public final void d() throws Resources.NotFoundException {
        f();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbr.f():void");
    }

    @Override // defpackage.hlf
    public final void g(hlf hlfVar, View view) {
        this.b.setVisibility(8);
        super.g(hlfVar, view);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        if (i == 19) {
            if (hlf.J(this.f, this.e, false)) {
                return true;
            }
        } else if (i == 20 && hlf.J(this.e, this.f, false)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        super.z(windowInsets, 0);
        if (i > (Build.VERSION.SDK_INT >= 30 ? windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime()).top : windowInsets.getSystemWindowInsetTop())) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, i, 0, 0);
            this.b.setLayoutParams(layoutParams);
        }
    }
}
