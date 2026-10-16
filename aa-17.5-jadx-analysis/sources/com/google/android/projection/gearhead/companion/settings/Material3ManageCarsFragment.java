package com.google.android.projection.gearhead.companion.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.projection.gearhead.R;
import defpackage.bc;
import defpackage.en;
import defpackage.jlo;
import defpackage.mhb;
import defpackage.mki;
import defpackage.omc;
import defpackage.pdn;
import defpackage.qsz;
import defpackage.wou;
import defpackage.wpq;
import defpackage.wzf;
import defpackage.xam;
import defpackage.xas;
import defpackage.yfu;
import defpackage.yfy;
import defpackage.ykd;
import defpackage.ykz;
import defpackage.ylx;
import defpackage.yph;
import defpackage.yrm;
import defpackage.yzz;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Material3ManageCarsFragment extends xas {
    public static final yph f = yph.c("GH.ANDROID_AUTO_APP");
    private static final yfy m = ylx.a;
    public jlo g;
    public MaterialSwitch h;
    public TextView i;
    public List j;
    public qsz k;
    public boolean l;
    private ViewSwitcher n;
    private ViewSwitcher o;
    private RecyclerView p;
    private RecyclerView q;
    private xam r;
    private xam s;
    private en t;
    private List u;
    private ykd v;

    public static final int s(boolean z) {
        return z ? R.string.add_new_cars_description_on : R.string.add_new_cars_description_off;
    }

    private static List t(List list) {
        return yrm.V(list, new ykz(1));
    }

    private final void u(RecyclerView recyclerView, xam xamVar) {
        getActivity();
        recyclerView.ab(new LinearLayoutManager(1));
        recyclerView.Z(xamVar);
    }

    private final void v(List list, xam xamVar, RecyclerView recyclerView, ViewSwitcher viewSwitcher) {
        List list2 = xamVar.a;
        list2.clear();
        list2.addAll(list);
        xamVar.g();
        recyclerView.setMinimumHeight(xamVar.a() * getResources().getDimensionPixelSize(R.dimen.companion_settings_row_height));
        viewSwitcher.setDisplayedChild(xamVar.a() == 0 ? 1 : 0);
    }

    @Override // defpackage.xas
    protected final yzz k() {
        return yzz.SETTINGS_CAR;
    }

    @Override // defpackage.xas
    protected final Map l() {
        return m;
    }

    @Override // android.support.v4.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            if (i2 != -1) {
                getActivity().finish();
            } else {
                if (this.k.c() || this.k.b()) {
                    return;
                }
                this.k.e();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.l) {
            activity.finish();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.aa_manage_cars, menu);
    }

    @Override // defpackage.xas, defpackage.exv, android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.material3_settings_cars, viewGroup, false);
        this.h = (MaterialSwitch) viewInflate.findViewById(R.id.add_new_cars_switch);
        this.i = (TextView) viewInflate.findViewById(R.id.add_new_cars_description);
        String string = getString(R.string.forget_all_cars_prompt_message);
        mhb mhbVar = new mhb(this, 12);
        wou wouVar = new wou(getActivity(), 0);
        wouVar.B(getString(R.string.confirmation));
        wouVar.v(string);
        wouVar.z(getString(android.R.string.ok), mhbVar);
        wouVar.x(getString(android.R.string.cancel), null);
        this.t = wouVar.b();
        this.v = new ykd(this);
        mki.a.g();
        bc activity = getActivity();
        activity.getClass();
        this.k = omc.b(activity, new pdn(this, 5), new wzf(this, 4), null, 0);
        ViewSwitcher viewSwitcher = (ViewSwitcher) viewInflate.findViewById(R.id.accepted_cars_view_switcher);
        this.n = viewSwitcher;
        this.p = (RecyclerView) viewSwitcher.findViewById(R.id.recycler_view);
        ykd ykdVar = this.v;
        yfu yfuVar = new yfu(4);
        yfuVar.e(1, 2131232079);
        yfuVar.e(3, Integer.valueOf(R.drawable.ic_manage_motorcycle));
        xam xamVar = new xam(ykdVar, yfuVar.d(true));
        this.r = xamVar;
        u(this.p, xamVar);
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) viewInflate.findViewById(R.id.rejected_cars_view_switcher);
        this.o = viewSwitcher2;
        this.q = (RecyclerView) viewSwitcher2.findViewById(R.id.recycler_view);
        ykd ykdVar2 = this.v;
        yfu yfuVar2 = new yfu(4);
        yfuVar2.e(1, 2131232612);
        yfuVar2.e(3, Integer.valueOf(R.drawable.ic_rejected_motorcycle));
        xam xamVar2 = new xam(ykdVar2, yfuVar2.d(true));
        this.s = xamVar2;
        u(this.q, xamVar2);
        Intent intent = getActivity().getIntent();
        if (intent.getBooleanExtra("highlight_only_known_cars", false)) {
            wpq.g((ViewGroup) viewInflate.findViewById(R.id.add_new_cars_relative_layout));
        }
        if (intent.getBooleanExtra("highlight_rejected_cars", false)) {
            wpq.g(viewInflate.findViewById(R.id.rejected_cars_text_view));
        }
        return viewInflate;
    }

    @Override // defpackage.xas, android.support.v4.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_forget_all_cars) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.t.show();
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        this.g.close();
        this.g = null;
        qsz qszVar = this.k;
        if (qszVar != null) {
            qszVar.g();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.g = new jlo(getActivity());
        qsz qszVar = this.k;
        if (qszVar != null) {
            qszVar.e();
        }
    }

    public final void r() {
        this.u = t(this.g.e());
        this.j = t(this.g.f());
        v(this.u, this.r, this.p, this.n);
        v(this.j, this.s, this.q, this.o);
    }

    @Override // defpackage.xas, defpackage.exv
    public final void e(Bundle bundle, String str) {
    }
}
