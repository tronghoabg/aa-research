package com.waze.nav_connect.b;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.util.Objects;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nav_connect.a.f f30835a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.nav_connect.c.b f30836b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.nav_connect.a f30837c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30838d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f30839e;

    /* renamed from: f, reason: collision with root package name */
    private final bm f30840f;

    /* renamed from: g, reason: collision with root package name */
    private final bq f30841g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f30842h;

    /* renamed from: i, reason: collision with root package name */
    private final ch f30843i;

    public w(com.waze.nav_connect.a.f fVar, com.waze.nav_connect.c.b bVar, com.waze.nav_connect.a aVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(fVar, "navConnectRepository");
        h.g.b.x.f(bVar, "statsSender");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "dispatcher");
        this.f30835a = fVar;
        this.f30836b = bVar;
        this.f30837c = aVar;
        this.f30838d = eVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "NavConnectButtonStateHolder");
        this.f30839e = afVarP;
        bm bmVarE = bu.e(0, 0, null, 7);
        this.f30840f = bmVarE;
        this.f30841g = ai.S(bmVarE);
        kotlinx.coroutines.b.k kVarQ = ai.q(aVar.a(), aVar.b(), new o(this, null));
        int i2 = bz.f51630a;
        ch chVarV = ai.V(kVarQ, afVarP, by.b(), false);
        this.f30842h = chVarV;
        this.f30843i = ai.V(ai.r(fVar.b(), chVarV, ai.H(new u(ai.y(new r(fVar.b())), this), abVar), new v(this, null)), afVarP, by.b(), new h());
    }

    public static final /* synthetic */ Bitmap e(w wVar, com.google.v.v vVar) {
        try {
            byte[] bArrX = vVar.x();
            return BitmapFactory.decodeByteArray(bArrX, 0, bArrX.length);
        } catch (Exception e2) {
            wVar.f30838d.c("NavConnect button icon failed to convert ByteString to Bitmap", e2);
            return null;
        }
    }

    @Override // com.waze.nav_connect.b.j
    public final bq a() {
        return this.f30841g;
    }

    @Override // com.waze.nav_connect.b.j
    public final ch b() {
        return this.f30843i;
    }

    @Override // com.waze.nav_connect.b.j
    public final void c() throws PendingIntent.CanceledException {
        com.waze.shared_infra.i.e eVar = this.f30838d;
        eVar.a("NavConnect button clicked.");
        com.waze.nav_connect.a.f fVar = this.f30835a;
        PendingIntent pendingIntentA = fVar.a();
        this.f30836b.d((com.waze.map.isolated.k) fVar.b().d(), false, pendingIntentA == null);
        if (pendingIntentA == null) {
            eVar.g("NavConnect button clicked but no PendingIntent. Do nothing.");
            return;
        }
        String creatorPackage = pendingIntentA.getCreatorPackage();
        Object objD = fVar.b().d();
        com.waze.nav_connect.a.b bVar = objD instanceof com.waze.nav_connect.a.b ? (com.waze.nav_connect.a.b) objD : null;
        String strC = bVar != null ? bVar.a().c() : null;
        String str = strC;
        if (str == null || str.length() == 0 || !h.g.b.x.n(creatorPackage, strC)) {
            this.f30838d.b("Security violation: PendingIntent creator package (" + creatorPackage + ") does not match expected partner package (" + strC + ")!");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 34) {
                eVar.a("Sending PendingIntent for SDK version " + Build.VERSION.SDK_INT + ".");
                pendingIntentA.send();
                return;
            }
            eVar.a("Sending PendingIntent for SDK version " + Build.VERSION.SDK_INT + " with MODE_BACKGROUND_ACTIVITY_START_ALLOWED.");
            pendingIntentA.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e2) {
            this.f30838d.c("PendingIntent was canceled.", e2);
        } catch (Exception e3) {
            this.f30838d.c("Failed to send PendingIntent", e3);
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f30839e, null);
    }

    @Override // com.waze.nav_connect.b.j
    public final void d() {
        com.waze.nav_connect.a.f fVar = this.f30835a;
        Object objD = fVar.b().d();
        Objects.toString(objD);
        this.f30838d.a("NavConnect button long clicked. state=".concat(String.valueOf(objD)));
        this.f30836b.d((com.waze.map.isolated.k) fVar.b().d(), true, fVar.a() == null);
        aj.z(this.f30839e, null, null, new ac(this, (h.c.e) null, 1), 3);
    }
}
