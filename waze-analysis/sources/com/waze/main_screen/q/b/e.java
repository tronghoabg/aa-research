package com.waze.main_screen.q.b;

import com.waze.navbar.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements com.waze.navbar.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f27392a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f27393b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27394c;

    e(p pVar, i iVar, int i2) {
        this.f27394c = i2;
        this.f27392a = pVar;
        this.f27393b = iVar;
    }

    @Override // com.waze.navbar.n
    public final void a() {
        int i2 = this.f27394c;
        i iVar = this.f27393b;
        if (i2 != 0) {
            iVar.c();
        } else {
            iVar.c();
        }
    }

    @Override // com.waze.navbar.n
    public final void b() {
        int i2 = this.f27394c;
        p pVar = this.f27392a;
        if (i2 != 0) {
            com.waze.ad.a.j.g(pVar, true);
        } else {
            com.waze.ad.a.j.g(pVar, true);
        }
    }
}
