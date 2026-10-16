package com.waze.an.a.a;

import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af implements com.waze.an.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final bn f14363a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f14364b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.an.a.x f14365c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.location.q f14366d;

    public af() {
        bn bnVarB = ck.b(null);
        this.f14363a = bnVarB;
        this.f14364b = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f14366d = com.waze.an.a.w.f14611a;
        this.f14365c = com.waze.an.a.x.f14613b;
    }

    @Override // com.waze.an.a.q
    public final ch a() {
        return this.f14364b;
    }

    public final void b(String str) {
        h.g.b.x.f(str, "label");
        this.f14363a.e(str);
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14365c;
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ void k() {
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ void l() {
    }

    @Override // com.waze.an.a.r
    public final com.waze.location.q m() {
        return this.f14366d;
    }
}
