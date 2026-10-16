package com.google.firebase.installations;

import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final m f10032a;

    /* renamed from: b, reason: collision with root package name */
    private final w f10033b;

    public g(m mVar, w wVar) {
        this.f10032a = mVar;
        this.f10033b = wVar;
    }

    @Override // com.google.firebase.installations.l
    public final boolean a(Exception exc) {
        this.f10033b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.l
    public final boolean b(com.google.firebase.installations.b.d dVar) {
        if (!dVar.d() || this.f10032a.c(dVar)) {
            return false;
        }
        w wVar = this.f10033b;
        i iVar = new i();
        iVar.b(dVar.i());
        iVar.d(dVar.f());
        iVar.c(dVar.g());
        wVar.c(iVar.a());
        return true;
    }
}
