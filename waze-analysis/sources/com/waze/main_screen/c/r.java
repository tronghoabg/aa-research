package com.waze.main_screen.c;

import com.waze.sdk.bd;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final a f26263a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.b.a.d f26264b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.ae.a.a f26265c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.j.a.g f26266d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.c.f.h f26267e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.nav_connect.b.g f26268f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.nav_connect.b.b f26269g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.main_screen.c.e.h f26270h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.o.d.b.a.b f26271i;

    /* renamed from: j, reason: collision with root package name */
    private final bd f26272j;

    public r(a aVar, com.waze.main_screen.b.a.d dVar, com.waze.main_screen.ae.a.a aVar2, com.waze.main_screen.j.a.g gVar, com.waze.main_screen.c.f.h hVar, com.waze.nav_connect.b.g gVar2, com.waze.nav_connect.b.b bVar, com.waze.main_screen.c.e.h hVar2, com.waze.o.d.b.a.b bVar2, bd bdVar) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(dVar, "audioSdkButtonStateHolderFactory");
        h.g.b.x.f(aVar2, "transportSdkButtonStateHolderFactory");
        h.g.b.x.f(gVar, "googleAssistantButtonStateHolderFactory");
        h.g.b.x.f(hVar, "soundButtonStateHolderFactory");
        h.g.b.x.f(gVar2, "navConnectButtonStateHolderFactory");
        h.g.b.x.f(bVar, "navConnectButtonFteTooltipStateHolderFactory");
        h.g.b.x.f(hVar2, "shareDriveButtonStateHolderFactory");
        h.g.b.x.f(bVar2, "companinioButtonStateHolderFactory");
        h.g.b.x.f(bdVar, "sdkManager");
        this.f26263a = aVar;
        this.f26264b = dVar;
        this.f26265c = aVar2;
        this.f26266d = gVar;
        this.f26267e = hVar;
        this.f26268f = gVar2;
        this.f26269g = bVar;
        this.f26270h = hVar2;
        this.f26271i = bVar2;
        this.f26272j = bdVar;
    }

    public final t a() {
        a aVar = this.f26263a;
        if (aVar.f()) {
            return new ai(aVar, this.f26264b, this.f26265c, this.f26266d, this.f26267e, this.f26268f, this.f26269g, this.f26270h, this.f26271i, this.f26272j);
        }
        return null;
    }
}
