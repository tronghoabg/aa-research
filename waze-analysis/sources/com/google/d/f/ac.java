package com.google.d.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac extends af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f7674a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f7675b;

    ac(af afVar, af afVar2) {
        this.f7674a = afVar;
        this.f7675b = afVar2;
    }

    @Override // com.google.d.f.af
    public final void b() {
        try {
            this.f7674a.b();
        } finally {
            this.f7675b.b();
        }
    }
}
