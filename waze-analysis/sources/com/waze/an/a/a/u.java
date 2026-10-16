package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f14513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.waze.an.a.u f14514b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14515c;

    public /* synthetic */ u(h.g.a.l lVar, com.waze.an.a.u uVar, int i2) {
        this.f14515c = i2;
        this.f14513a = lVar;
        this.f14514b = uVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f14515c;
        if (i2 == 0) {
            com.waze.an.a.u uVar = this.f14514b;
            return bd.f(this.f14513a, uVar, (com.waze.an.a.u) obj);
        }
        if (i2 == 1) {
            com.waze.an.a.u uVar2 = this.f14514b;
            return bd.f(this.f14513a, uVar2, (com.waze.an.a.u) obj);
        }
        if (i2 == 2) {
            com.waze.an.a.u uVar3 = this.f14514b;
            return bd.f(this.f14513a, uVar3, (com.waze.an.a.u) obj);
        }
        if (i2 != 3) {
            com.waze.an.a.u uVar4 = this.f14514b;
            return bd.f(this.f14513a, uVar4, (com.waze.an.a.u) obj);
        }
        com.waze.an.a.u uVar5 = this.f14514b;
        return bd.f(this.f14513a, uVar5, (com.waze.an.a.u) obj);
    }
}
