package com.waze.main_screen.t;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ am f27563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f27564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f27565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27566d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f27567e;

    public /* synthetic */ g(am amVar, h.g.a.a aVar, h.g.a.l lVar, int i2, int i3) {
        this.f27567e = i3;
        this.f27563a = amVar;
        this.f27564b = aVar;
        this.f27565c = lVar;
        this.f27566d = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f27567e != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f27566d;
            h.g.a.l lVar = this.f27565c;
            h.g.a.a aVar = this.f27564b;
            return al.u(this.f27563a, aVar, lVar, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f27566d;
        h.g.a.l lVar2 = this.f27565c;
        h.g.a.a aVar2 = this.f27564b;
        return al.q(this.f27563a, aVar2, lVar2, i3, (Composer) obj);
    }
}
