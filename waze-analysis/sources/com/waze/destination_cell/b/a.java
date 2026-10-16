package com.waze.destination_cell.b;

import com.waze.R;
import com.waze.location.bg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class a extends com.waze.destination_cell.view.d {

    /* renamed from: a, reason: collision with root package name */
    com.waze.menus.k f23492a;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f23493c;

    public a(com.waze.destination_cell.view.c cVar) {
        super(cVar);
        this.f23493c = com.waze.shared_infra.o.b.a();
    }

    @Override // com.waze.destination_cell.view.d
    protected final int a() {
        return R.drawable.destination_cell_ripple_transparent;
    }

    public final void b(com.waze.menus.k kVar) {
        this.f23492a = kVar;
        c(kVar);
    }

    protected void c(com.waze.menus.k kVar) {
        com.waze.sharedui.utils.c cVarF;
        super.l();
        com.waze.destination_cell.view.c cVar = this.f23556b;
        cVar.o(kVar.g());
        cVar.m(kVar.f());
        cVar.p(1);
        if (!kVar.d().h() || (cVarF = bg.f(this.f23492a.d())) == null) {
            return;
        }
        cVar.e(cVarF.a());
        cVar.c(cVarF.c(this.f23493c));
        cVar.x();
    }

    @Override // com.waze.destination_cell.view.d
    protected final void d() {
    }
}
