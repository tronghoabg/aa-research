package com.waze.ifs.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ed;
import android.support.v7.widget.fa;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.settings.de;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class an extends ed {

    /* renamed from: a, reason: collision with root package name */
    as f24517a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fa f24518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ at f24519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(at atVar, fa faVar) {
        super(null);
        this.f24518b = faVar;
        Objects.requireNonNull(atVar);
        this.f24519c = atVar;
    }

    @Override // android.support.v7.widget.ed
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        at atVar = this.f24519c;
        View viewC = atVar.c();
        atVar.f24535e.setText(((aq) atVar.f24539i.get(recyclerView.e(viewC) % atVar.b())).f24523b);
        float fAbs = Math.abs(viewC.getLeft() - atVar.k(viewC));
        float f2 = atVar.f24536f;
        float fRound = (f2 - Math.round(Math.min(fAbs, f2))) / f2;
        float f3 = fRound * fRound;
        atVar.f24534d.setAlpha(f3);
        as asVar = (as) recyclerView.o(viewC);
        asVar.c(f3);
        as asVar2 = this.f24517a;
        if (asVar2 != null && asVar2 != asVar) {
            asVar2.c(0.0f);
        }
        this.f24517a = asVar;
    }

    @Override // android.support.v7.widget.ed
    public final void f(RecyclerView recyclerView, int i2) {
        at atVar;
        View viewC;
        int iE;
        if (i2 != 0 || (iE = recyclerView.e((viewC = (atVar = this.f24519c).c()))) == -1) {
            return;
        }
        if (Math.abs(viewC.getLeft() - atVar.k(viewC)) >= 2.0f) {
            fa faVar = this.f24518b;
            faVar.h(iE);
            atVar.f24533c.bh(faVar);
            return;
        }
        com.waze.shared_infra.i.h.a("SNAPPED POS = " + iE);
        int iB = iE % atVar.b();
        atVar.f24537g = iB;
        if (atVar.f24540j != null && iB >= 0) {
            com.waze.settings.tree.views.h hVar = atVar.f24540j;
            com.waze.settings.tree.m mVar = hVar.f37622c;
            int i3 = hVar.f37620a;
            ConstraintLayout constraintLayout = hVar.f37623d;
            de deVar = hVar.f37621b;
            com.waze.shared_infra.i.h.a("setting config to ".concat(String.valueOf(((com.waze.settings.tree.d.g) mVar.f().get(iB)).s())));
            String strS = i3 == -1 ? "" : ((com.waze.settings.tree.d.g) mVar.f().get(i3)).s();
            mVar.d().c(constraintLayout, ((com.waze.settings.tree.d.g) mVar.f().get(iB)).s(), strS);
            com.waze.search.v2.o.i(mVar, deVar, strS, ((com.waze.settings.tree.d.g) mVar.f().get(iB)).s());
        }
        int iB2 = ((atVar.b() * 10) / 2) + atVar.f24537g;
        if (iE != iB2) {
            recyclerView.ar();
            atVar.f24533c.ab(iB2, Math.round(atVar.k(viewC)));
            ((as) recyclerView.o(viewC)).c(0.0f);
        }
        atVar.f24535e.setText(((aq) atVar.f24539i.get(atVar.f24537g)).f24523b);
    }
}
