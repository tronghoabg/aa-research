package com.google.android.material.datepicker;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ed;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x extends ed {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f6494a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f6495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(z zVar, ao aoVar) {
        super(null);
        this.f6494a = aoVar;
        Objects.requireNonNull(zVar);
        this.f6495b = zVar;
    }

    @Override // android.support.v7.widget.ed
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        z zVar = this.f6495b;
        int iM = i2 < 0 ? zVar.b().M() : zVar.b().N();
        z zVar2 = this.f6495b;
        if (zVar2.o == null) {
            zVar2.f6500e = this.f6494a.b(iM);
        }
        zVar2.m.setText(this.f6494a.c(iM));
        zVar2.A(iM);
    }

    @Override // android.support.v7.widget.ed
    public final void f(RecyclerView recyclerView, int i2) {
        int iE;
        if (i2 == 0) {
            z zVar = this.f6495b;
            if (zVar.o == null) {
                return;
            }
            View viewB = zVar.o.b(zVar.b());
            if (viewB != null && (iE = recyclerView.e(viewB)) != -1) {
                ao aoVar = this.f6494a;
                zVar.f6500e = aoVar.b(iE);
                zVar.m.setText(aoVar.c(iE));
                zVar.A(iE);
            }
            zVar.z();
        }
    }
}
