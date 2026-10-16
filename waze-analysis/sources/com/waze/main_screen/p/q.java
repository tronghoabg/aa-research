package com.waze.main_screen.p;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class q implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bf f27330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f27331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f27332c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27334e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f27335f;

    public /* synthetic */ q(bf bfVar, h.g.a.l lVar, h.g.a.a aVar, boolean z, int i2, int i3) {
        this.f27335f = i3;
        this.f27330a = bfVar;
        this.f27331b = lVar;
        this.f27332c = aVar;
        this.f27333d = z;
        this.f27334e = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f27335f != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f27334e;
            h.g.a.a aVar = this.f27332c;
            boolean z = this.f27333d;
            h.g.a.l lVar = this.f27331b;
            return bi.s(this.f27330a, lVar, z, aVar, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f27334e;
        boolean z2 = this.f27333d;
        h.g.a.a aVar2 = this.f27332c;
        h.g.a.l lVar2 = this.f27331b;
        return bi.x(this.f27330a, lVar2, aVar2, z2, i3, (Composer) obj);
    }

    public /* synthetic */ q(bf bfVar, h.g.a.l lVar, boolean z, h.g.a.a aVar, int i2, int i3) {
        this.f27335f = i3;
        this.f27330a = bfVar;
        this.f27331b = lVar;
        this.f27333d = z;
        this.f27332c = aVar;
        this.f27334e = i2;
    }
}
