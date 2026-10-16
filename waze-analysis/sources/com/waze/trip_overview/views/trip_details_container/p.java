package com.waze.trip_overview.views.trip_details_container;

import android.content.Context;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.trip_overview.at;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f41579a;

    /* renamed from: b, reason: collision with root package name */
    private final k f41580b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41581c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f41582d;

    /* renamed from: e, reason: collision with root package name */
    private l f41583e;

    /* renamed from: f, reason: collision with root package name */
    private final List f41584f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f41585g;

    public p(q qVar, k kVar) {
        x.f(kVar, "cardViewAdjuster");
        this.f41579a = qVar;
        this.f41580b = kVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewRoutesAdapter");
        x.e(eVarD, "create(...)");
        this.f41582d = eVarD;
        this.f41583e = new l(null);
        this.f41584f = new ArrayList();
        this.f41585g = true;
    }

    static final void h(p pVar, com.waze.trip_overview.views.i iVar) {
        if (pVar.f(iVar) || !pVar.f41585g) {
            return;
        }
        com.waze.trip_overview.c.a.d dVarU = pVar.f41579a.u();
        if (dVarU != null) {
            dVarU.c(iVar.b(), null);
        }
        pVar.f41580b.c();
    }

    public final int a() {
        Iterator it = this.f41584f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((com.waze.trip_overview.views.i) it.next()).i(this.f41583e.a())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final List b() {
        return this.f41584f;
    }

    public final void c(l lVar) {
        x.f(lVar, "data");
        this.f41583e = lVar;
        Objects.toString(lVar);
        this.f41582d.a("onCreate ".concat(lVar.toString()));
        notifyDataSetChanged();
    }

    public final void d(boolean z) {
        this.f41585g = z;
    }

    public final void e(boolean z) {
        this.f41581c = z;
    }

    public final boolean f(com.waze.trip_overview.views.i iVar) {
        x.f(iVar, "route");
        return iVar.i(this.f41583e.a());
    }

    public final boolean g() {
        return this.f41583e.c();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f41583e.b().size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        o oVar = (o) feVar;
        x.f(oVar, "holder");
        oVar.a().h(this.f41583e.c(), (at) this.f41583e.b().get(i2));
        com.waze.trip_overview.views.i iVarA = oVar.a();
        com.waze.ui.r.a.d.c cVar = com.waze.ui.r.a.d.c.R;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar);
        sb.append(i2);
        iVarA.setContentDescription(sb.toString());
        com.waze.trip_overview.views.i iVarA2 = oVar.a();
        iVarA2.findViewById(R.id.cardDividerBottom).setBackgroundColor((!this.f41581c || i2 == getItemCount() + (-1)) ? 0 : ContextCompat.getColor(iVarA2.getContext(), R.color.hairline));
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        x.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        x.e(context, "getContext(...)");
        final com.waze.trip_overview.views.i iVar = new com.waze.trip_overview.views.i(context);
        this.f41584f.add(iVar);
        iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.waze.trip_overview.views.trip_details_container.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.h(this.f41574a, iVar);
            }
        };
        x.f(onClickListener, "onClickListener");
        iVar.setOnClickListener(onClickListener);
        iVar.g(new CompoundButton.OnCheckedChangeListener() { // from class: com.waze.trip_overview.views.trip_details_container.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                com.waze.trip_overview.c.a.d dVarU;
                x.f(compoundButton, "<unused var>");
                p pVar = this.f41576a;
                com.waze.trip_overview.views.i iVar2 = iVar;
                if (!pVar.f(iVar2) || (dVarU = pVar.f41579a.u()) == null) {
                    return;
                }
                dVarU.c(iVar2.b(), Boolean.valueOf(iVar2.j()));
            }
        });
        iVar.l(this.f41579a.u());
        return new o(iVar);
    }
}
