package com.waze.sharedui.f;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final q f38891a;

    /* renamed from: b, reason: collision with root package name */
    private final c f38892b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.h.a f38893c;

    /* renamed from: d, reason: collision with root package name */
    private final g f38894d;

    /* renamed from: e, reason: collision with root package name */
    private final p f38895e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f38896f;

    public /* synthetic */ d(com.waze.sharedui.profile.b bVar, q qVar, c cVar, com.waze.sharedui.h.a aVar, g gVar, p pVar, int i2) {
        qVar = (i2 & 2) != 0 ? q.f38922a : qVar;
        cVar = (i2 & 4) != 0 ? c.f38887a : cVar;
        pVar = (i2 & 64) != 0 ? null : pVar;
        x.f(bVar, "elementAdapter");
        x.f(qVar, "transactionQueue");
        x.f(cVar, "authenticationMethod");
        x.f(aVar, "statApiEnum");
        x.f(gVar, "priority");
        this.f38896f = bVar;
        this.f38891a = qVar;
        this.f38892b = cVar;
        this.f38893c = aVar;
        this.f38894d = gVar;
        this.f38895e = pVar;
    }

    public final c d() {
        return this.f38892b;
    }

    public final g e() {
        return this.f38894d;
    }

    public final p f() {
        return this.f38895e;
    }

    public final q g() {
        return this.f38891a;
    }

    public final com.waze.sharedui.h.a h() {
        return this.f38893c;
    }

    public final com.waze.sharedui.profile.b i() {
        return this.f38896f;
    }
}
