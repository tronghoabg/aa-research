package defpackage;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.internal.model.TabInternal;
import com.google.android.apps.auto.components.apphost.tab.MaterialTabHeaderView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kbv extends hgr {
    private final View b;
    private final View c;
    private final MaterialTabHeaderView g;
    private final ViewGroup h;

    public kbv(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        View viewInflate = LayoutInflater.from(geuVar).inflate(R.layout.material_tab_template_layout, (ViewGroup) null);
        viewInflate.getClass();
        this.b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.progress_container);
        viewFindViewById.getClass();
        this.c = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.header_view);
        viewFindViewById2.getClass();
        this.g = (MaterialTabHeaderView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.content_container);
        viewFindViewById3.getClass();
        this.h = (ViewGroup) viewFindViewById3;
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.b;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        hlo hloVar;
        if (((hgr) this).a != null && this.h.hasFocus() && (hloVar = ((hgr) this).a) != null && hloVar.i(i, keyEvent)) {
            return true;
        }
        MaterialTabHeaderView materialTabHeaderView = this.g;
        materialTabHeaderView.getClass();
        TabLayout tabLayout = materialTabHeaderView.a;
        wwg wwgVarC = tabLayout.c(tabLayout.a());
        if (i == 4 || i == 19) {
            if (wwgVarC != null && hld.I(this.h, wwgVarC.g, acob.K())) {
                return true;
            }
        } else if (i == 20 && hlf.I(materialTabHeaderView, this.h, false)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hgr
    protected final View r() {
        return this.h;
    }

    @Override // defpackage.hgr
    public final View s() {
        return this.g;
    }

    @Override // defpackage.hgr
    protected final View t() {
        return this.c;
    }

    @Override // defpackage.hgr
    public final View u() {
        return this.g;
    }

    @Override // defpackage.hgr
    protected final void v(View view) {
        ViewGroup viewGroup = this.h;
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    @Override // defpackage.hgr
    protected final void w(Action action) {
        geu geuVar = this.i;
        geuVar.getClass();
        kds.e(this.g, geuVar, action, null, 12);
    }

    @Override // defpackage.hgr
    protected final void x(List list, String str, vu vuVar) {
        boolean z;
        list.getClass();
        vuVar.getClass();
        geu geuVar = this.i;
        geuVar.getClass();
        jzi jziVar = new jzi(this, vuVar, 2, null);
        MaterialTabHeaderView materialTabHeaderView = this.g;
        TabLayout tabLayout = materialTabHeaderView.a;
        tabLayout.A.clear();
        tabLayout.i();
        if (list.isEmpty()) {
            z = true;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((TabInternal) it.next()).getIcon() == null) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TabInternal tabInternal = (TabInternal) it2.next();
            boolean zF = affa.f(str, tabInternal.getContentId());
            wwg wwgVarD = tabLayout.d();
            wwgVarD.a = tabInternal;
            View viewInflate = LayoutInflater.from(geuVar).inflate(z ? R.layout.material_tab_item : R.layout.material_iconless_tab_item, (ViewGroup) materialTabHeaderView, false);
            if (tabInternal.getTitle() != null) {
                ((TextView) viewInflate.findViewById(R.id.tab_title)).setText(hlb.d(geuVar, tabInternal.getTitle()));
            }
            if (z && tabInternal.getIcon() != null) {
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.tab_icon);
                CarIcon icon = tabInternal.getIcon();
                icon.getClass();
                imageView.setImageDrawable(hbz.g(geuVar, icon, new hmb(0, false, false, ghw.b, null, true, 0)));
            }
            viewInflate.setActivated(true);
            wwgVarD.d = viewInflate;
            wwgVarD.b();
            tabLayout.f(wwgVarD, zF);
            wwi wwiVar = wwgVarD.g;
            wwiVar.getClass();
            MaterialTabHeaderView.b(wwiVar, zF);
            wwgVarD.g.setBackground(materialTabHeaderView.getContext().getDrawable(z ? R.drawable.material_tab_background : R.drawable.material_iconless_tab_background));
        }
        tabLayout.e(new jzp(jziVar));
    }
}
