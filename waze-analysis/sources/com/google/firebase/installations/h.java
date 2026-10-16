package com.google.firebase.installations;

import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    final w f10034a;

    public h(w wVar) {
        this.f10034a = wVar;
    }

    @Override // com.google.firebase.installations.l
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.l
    public final boolean b(com.google.firebase.installations.b.d dVar) {
        if (!dVar.e() && !dVar.d() && !dVar.b()) {
            return false;
        }
        this.f10034a.e(dVar.j());
        return true;
    }
}
