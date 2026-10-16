package com.waze.v;

import com.google.android.gms.common.api.internal.bc;
import com.waze.NativeManager;
import com.waze.av.b.n;
import com.waze.av.d.k;
import com.waze.dv;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.Address;
import com.waze.modules.c.ch;
import com.waze.reports.ed;
import com.waze.search.v2.cv;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.e.ac;
import l.a.bht;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44930a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f44931b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.j f44932c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f44933d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f44934e;

    /* renamed from: f, reason: collision with root package name */
    private final j f44935f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f44936g;

    /* renamed from: h, reason: collision with root package name */
    private final af f44937h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f44938i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f44939j;

    /* renamed from: k, reason: collision with root package name */
    private VenueData f44940k;

    public i(com.waze.shared_infra.o.a aVar, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.q.j jVar, com.waze.sharedui.e.g gVar, ch chVar, j jVar2, com.waze.shared_infra.i.e eVar2) {
        x.f(aVar, "stringProvider");
        x.f(eVar, "clock");
        x.f(jVar, "dateFormat");
        x.f(gVar, "locationService");
        x.f(chVar, "routeCalculator");
        x.f(jVar2, "statsSender");
        x.f(eVar2, "logger");
        this.f44930a = aVar;
        this.f44931b = eVar;
        this.f44932c = jVar;
        this.f44933d = gVar;
        this.f44934e = chVar;
        this.f44935f = jVar2;
        this.f44936g = eVar2;
        int i2 = av.f51370a;
        this.f44937h = aj.e(ac.f51860a.c().plus(aj.Q()));
        bn bnVarB = ck.b(null);
        this.f44938i = bnVarB;
        this.f44939j = ai.U(bnVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(com.waze.v.i r18, h.c.e r19) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.v.i.a(com.waze.v.i, h.c.e):java.lang.Object");
    }

    public final kotlinx.coroutines.b.ch c() {
        return this.f44939j;
    }

    public final void d() {
        this.f44936g.a("clear called");
        NativeManager.Post(new bc(10));
        aj.h(this.f44937h, bo.g("Clear called", null));
    }

    public final void e(VenueData venueData) {
        x.f(venueData, "venueData");
        this.f44940k = venueData;
        k kVarH = com.waze.ad.c.b.h(new ed(venueData));
        n nVarE = kVarH != null ? com.waze.ad.c.b.e(kVarH) : null;
        String takeoverLabel = venueData.getTakeoverLabel();
        x.e(takeoverLabel, "getTakeoverLabel(...)");
        String takeoverImage = venueData.getTakeoverImage();
        x.e(takeoverImage, "getTakeoverImage(...)");
        com.waze.ui.ac.g gVar = new com.waze.ui.ac.g(takeoverImage);
        Address address = venueData.getAddress();
        x.e(address, "getAddress(...)");
        this.f44938i.e(new f(nVarE, takeoverLabel, gVar, com.waze.nightmode.e.k(address), h.a.i.j(kVarH != null ? cv.c(com.waze.av.d.j.f16079a, kVarH.d(), kVarH.z(), this.f44930a, this.f44931b, null, new dv(this, 9)) : null)));
        aj.z(this.f44937h, null, null, new h(this, null), 3);
    }

    public final void f(bht bhtVar) {
        x.f(bhtVar, "action");
        VenueData venueData = this.f44940k;
        if (venueData != null) {
            this.f44935f.a(venueData, bhtVar);
        }
    }

    public final void g() {
        VenueData venueData = this.f44940k;
        if (venueData != null) {
            this.f44935f.b(venueData);
        }
    }
}
