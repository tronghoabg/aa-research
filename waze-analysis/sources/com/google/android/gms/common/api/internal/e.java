package com.google.android.gms.common.api.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public final be f4822b;

    public e(be beVar, com.google.android.gms.o.w wVar) {
        super(3, wVar);
        this.f4822b = beVar;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final int a(ad adVar) {
        return 0;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final boolean c(ad adVar) {
        return ((bb) this.f4822b.f4790a).c();
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final com.google.android.gms.common.f[] d(ad adVar) {
        return ((bb) this.f4822b.f4790a).d();
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void e(ad adVar) {
        com.google.android.gms.common.api.h hVarF = adVar.f();
        be beVar = this.f4822b;
        bb bbVar = (bb) beVar.f4790a;
        bbVar.e(hVarF, this.f4820a);
        as asVarA = bbVar.a();
        if (asVarA != null) {
            adVar.h().put(asVarA, beVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c, com.google.android.gms.common.api.internal.h
    public final /* bridge */ /* synthetic */ void i(u uVar, boolean z) {
    }
}
