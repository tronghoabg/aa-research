package com.google.android.gms.common.api.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final as f4825b;

    public g(as asVar, com.google.android.gms.o.w wVar) {
        super(4, wVar);
        this.f4825b = asVar;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final int a(ad adVar) {
        return ((be) adVar.h().get(this.f4825b)) != null ? 0 : -1;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final boolean c(ad adVar) {
        be beVar = (be) adVar.h().get(this.f4825b);
        return beVar != null && ((bb) beVar.f4790a).c();
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final com.google.android.gms.common.f[] d(ad adVar) {
        be beVar = (be) adVar.h().get(this.f4825b);
        if (beVar == null) {
            return null;
        }
        return ((bb) beVar.f4790a).d();
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void e(ad adVar) {
        be beVar = (be) adVar.h().remove(this.f4825b);
        if (beVar == null) {
            this.f4820a.e(false);
            return;
        }
        ((bq) beVar.f4791b).f4819a.f4785b.a(adVar.f(), this.f4820a);
        ((bb) beVar.f4790a).b();
    }

    @Override // com.google.android.gms.common.api.internal.c, com.google.android.gms.common.api.internal.h
    public final /* bridge */ /* synthetic */ void i(u uVar, boolean z) {
    }
}
