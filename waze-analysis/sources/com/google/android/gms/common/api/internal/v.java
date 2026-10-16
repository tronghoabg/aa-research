package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.ArraySet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends o {

    /* renamed from: e, reason: collision with root package name */
    private final ArraySet f4852e;

    /* renamed from: f, reason: collision with root package name */
    private final ah f4853f;

    private v(ao aoVar, ah ahVar) {
        super(aoVar, com.google.android.gms.common.h.b());
        this.f4852e = new ArraySet();
        this.f4853f = ahVar;
        this.f4752d.b(this);
    }

    public static void j(Activity activity, ah ahVar, i iVar) {
        ao aoVarD = activity instanceof android.support.v4.app.av ? bl.d((android.support.v4.app.av) activity) : ap.d(activity);
        v vVar = (v) aoVarD.c(v.class);
        if (vVar == null) {
            vVar = new v(aoVarD, ahVar);
        }
        vVar.f4852e.add(iVar);
        ahVar.u(vVar);
    }

    private final void o() {
        if (this.f4852e.isEmpty()) {
            return;
        }
        this.f4853f.u(this);
    }

    @Override // com.google.android.gms.common.api.internal.o
    protected final void f(com.google.android.gms.common.d dVar, int i2) {
        this.f4853f.r(dVar, i2);
    }

    @Override // com.google.android.gms.common.api.internal.o
    protected final void g() {
        this.f4853f.s();
    }

    final ArraySet i() {
        return this.f4852e;
    }

    @Override // com.google.android.gms.common.api.internal.an
    public final void k() {
        o();
    }

    @Override // com.google.android.gms.common.api.internal.an
    public final void l() {
        this.f4842a = true;
        o();
    }

    @Override // com.google.android.gms.common.api.internal.an
    public final void m() {
        this.f4842a = false;
        this.f4853f.x(this);
    }
}
