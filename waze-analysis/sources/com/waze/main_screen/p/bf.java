package com.waze.main_screen.p;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.LifecycleOwner;
import com.waze.navigate.fo;
import com.waze.sharedrive.e.cc;
import com.waze.ui.l.cg;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bf {
    private final Animatable A;
    private final kotlinx.coroutines.b.k B;
    private final com.waze.reports_v2.presentation.a.ab C;
    private final com.waze.main_screen.p.b.a.b.t D;

    /* renamed from: a, reason: collision with root package name */
    private final ch f27186a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.p.g f27187b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.a.az f27188c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.p.a.b.a.t f27189d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.a.a.a.b f27190e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.ab.a.m f27191f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.main_screen.ad.a.h f27192g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.main_screen.af.b.i f27193h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.main_screen.s.c f27194i;

    /* renamed from: j, reason: collision with root package name */
    private final fo f27195j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.main_screen.ae.a.d f27196k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.main_screen.r.a.c f27197l;
    private final com.waze.main_screen.j.i m;
    private final com.waze.view.popups.b.m n;
    private final com.waze.sound.e.j o;
    private final cg p;
    private final com.waze.main_screen.c.an q;
    private final h.g.a.a r;
    private final h.g.a.a s;
    private final h.g.a.a t;
    private final com.waze.main_screen.w.a.a u;
    private final cc v;
    private final com.waze.main_screen.x.a w;
    private final com.waze.beacons.a.f x;
    private final h.g.a.a y;
    private final Animatable z;

    public bf(ch chVar, com.waze.ui.p.g gVar, com.waze.reports_v2.presentation.a.az azVar, com.waze.main_screen.p.a.b.a.t tVar, com.waze.reports_v2.presentation.a.ab abVar, com.waze.reports_v2.a.a.a.b bVar, com.waze.main_screen.p.b.a.b.t tVar2, com.waze.main_screen.ab.a.m mVar, com.waze.main_screen.ad.a.h hVar, com.waze.main_screen.af.b.i iVar, com.waze.main_screen.s.c cVar, fo foVar, com.waze.reports_v2.presentation.a.ba baVar, com.waze.main_screen.ae.a.d dVar, com.waze.main_screen.r.a.c cVar2, com.waze.main_screen.j.i iVar2, com.waze.view.popups.b.m mVar2, com.waze.sound.e.j jVar, cg cgVar, com.waze.main_screen.c.an anVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, com.waze.main_screen.w.a.a aVar4, cc ccVar, com.waze.main_screen.x.a aVar5, com.waze.beacons.a.f fVar, h.g.a.a aVar6) {
        h.g.b.x.f(chVar, "screenState");
        h.g.b.x.f(gVar, "mainMapState");
        h.g.b.x.f(azVar, "reportMenuState");
        h.g.b.x.f(tVar, "etaDrawerSheetState");
        h.g.b.x.f(bVar, "conversationalReportingActivationDialogState");
        h.g.b.x.f(tVar2, "navigationBarStateHolder");
        h.g.b.x.f(mVar, "popupsStateHolder");
        h.g.b.x.f(hVar, "trafficBarStateHolder");
        h.g.b.x.f(iVar, "wazeAsksStateHolder");
        h.g.b.x.f(cVar, "viaBarStateHolder");
        h.g.b.x.f(foVar, "recenterBarStateHolder");
        h.g.b.x.f(baVar, "reportMenuStateHolder");
        h.g.b.x.f(cVar2, "notificationMessageStateHolder");
        h.g.b.x.f(iVar2, "googleAssistantActionsStateHolder");
        h.g.b.x.f(mVar2, "myParkingPhotoStateHolder");
        h.g.b.x.f(cgVar, "insightState");
        h.g.b.x.f(aVar, "showDirections");
        h.g.b.x.f(aVar2, "onAlternativeRoutesEntrypointClicked");
        h.g.b.x.f(aVar3, "onBackClicked");
        h.g.b.x.f(aVar4, "quickSettingsStateHolder");
        h.g.b.x.f(aVar5, "rerouteSuggestionStateHolder");
        h.g.b.x.f(fVar, "beaconBluetoothPermissionStateHolder");
        h.g.b.x.f(aVar6, "onResumeDriveHandled");
        this.f27186a = chVar;
        this.f27187b = gVar;
        this.f27188c = azVar;
        this.f27189d = tVar;
        this.C = abVar;
        this.f27190e = bVar;
        this.D = tVar2;
        this.f27191f = mVar;
        this.f27192g = hVar;
        this.f27193h = iVar;
        this.f27194i = cVar;
        this.f27195j = foVar;
        this.f27196k = dVar;
        this.f27197l = cVar2;
        this.m = iVar2;
        this.n = mVar2;
        this.o = jVar;
        this.p = cgVar;
        this.q = anVar;
        this.r = aVar;
        this.s = aVar2;
        this.t = aVar3;
        this.u = aVar4;
        this.v = ccVar;
        this.w = aVar5;
        this.x = fVar;
        this.y = aVar6;
        this.z = new Animatable(Dp.m11162boximpl(0.0f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        this.A = new Animatable(Dp.m11162boximpl(0.0f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        this.B = kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new v(this, 2)));
    }

    static final int a(bf bfVar) {
        com.waze.main_screen.p.a.b.a.t tVar = bfVar.f27189d;
        Rect rectD = tVar.d();
        int iB = 0;
        int iB2 = rectD != null ? h.h.a.b(rectD.getBottom() - rectD.getTop()) : 0;
        Float fJ = tVar.e().j(com.waze.z.a.b.ad.f45734b);
        if (fJ != null) {
            if (true == Float.isNaN(fJ.floatValue())) {
                fJ = null;
            }
            if (fJ != null) {
                iB = h.h.a.b(fJ.floatValue());
            }
        }
        return h.k.n.h(h.k.n.i(h.h.a.b(tVar.e().a()), iB), iB2);
    }

    static final int b(Density density, bf bfVar) {
        return density.mo2121roundToPx0680j_4(((Dp) bfVar.A.getValue()).m11178unboximpl());
    }

    public final h.g.a.a A() {
        return this.r;
    }

    public final kotlinx.coroutines.b.k B() {
        return this.B;
    }

    public final ch C() {
        return this.u.a();
    }

    public final ch D() {
        return this.f27186a;
    }

    public final void E() {
        this.u.b();
    }

    public final void F() {
        this.f27191f.i();
    }

    public final void G() {
        this.t.invoke();
    }

    public final void H() {
        com.waze.sound.e.j jVar = this.o;
        if (jVar != null) {
            jVar.e();
        } else {
            this.u.c("quick_sound_settings");
        }
    }

    public final boolean I() {
        com.waze.main_screen.p.a.b.a.t tVar = this.f27189d;
        return tVar.e().h() == com.waze.z.a.b.ad.f45734b || tVar.e().h() == com.waze.z.a.b.ad.f45733a;
    }

    public final com.waze.main_screen.p.b.a.b.t J() {
        return this.D;
    }

    public final com.waze.reports_v2.presentation.a.ab K() {
        return this.C;
    }

    public final Object L(float f2, float f3, Density density, LifecycleOwner lifecycleOwner, h.c.e eVar) {
        int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(f3);
        int iMo2121roundToPx0680j_42 = density.mo2121roundToPx0680j_4(f2);
        Object objCollect = FlowExtKt.flowWithLifecycle$default(kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new n(density, this, 2))), lifecycleOwner.getLifecycle(), null, 2, null).collect(new x(this, new com.waze.map.main.aa(iMo2121roundToPx0680j_4, iMo2121roundToPx0680j_42, 0, h.h.a.b(iMo2121roundToPx0680j_42 * 0.5f), density.mo2121roundToPx0680j_4(16.0f), density.mo2121roundToPx0680j_4(((Dp) this.A.getValue()).m11178unboximpl()), 0), 2), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public final Animatable c() {
        return this.z;
    }

    public final Animatable d() {
        return this.A;
    }

    public final com.waze.beacons.a.f e() {
        return this.x;
    }

    public final com.waze.main_screen.c.an f() {
        return this.q;
    }

    public final com.waze.main_screen.j.i g() {
        return this.m;
    }

    public final com.waze.main_screen.p.a.b.a.t h() {
        return this.f27189d;
    }

    public final com.waze.main_screen.r.a.c i() {
        return this.f27197l;
    }

    public final com.waze.main_screen.s.c j() {
        return this.f27194i;
    }

    public final com.waze.main_screen.x.a k() {
        return this.w;
    }

    public final com.waze.main_screen.ab.a.m l() {
        return this.f27191f;
    }

    public final com.waze.main_screen.ad.a.h m() {
        return this.f27192g;
    }

    public final com.waze.main_screen.ae.a.d n() {
        return this.f27196k;
    }

    public final com.waze.main_screen.af.b.i o() {
        return this.f27193h;
    }

    public final fo p() {
        return this.f27195j;
    }

    public final com.waze.reports_v2.a.a.a.b q() {
        return this.f27190e;
    }

    public final com.waze.reports_v2.presentation.a.az r() {
        return this.f27188c;
    }

    public final cc s() {
        return this.v;
    }

    public final com.waze.sound.e.j t() {
        return this.o;
    }

    public final cg u() {
        return this.p;
    }

    public final com.waze.ui.p.g v() {
        return this.f27187b;
    }

    public final com.waze.view.popups.b.m w() {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(com.waze.ui.l.bp r13, androidx.compose.ui.unit.Density r14, int r15, java.lang.Integer r16, h.c.e r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.waze.main_screen.p.av
            if (r1 == 0) goto L15
            r1 = r0
            com.waze.main_screen.p.av r1 = (com.waze.main_screen.p.av) r1
            int r2 = r1.f27063c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r3
            if (r5 == 0) goto L15
            int r2 = r2 - r3
            r1.f27063c = r2
            goto L1a
        L15:
            com.waze.main_screen.p.av r1 = new com.waze.main_screen.p.av
            r1.<init>(r12, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.f27061a
            h.c.a.a r10 = h.c.a.a.f48038a
            int r1 = r9.f27063c
            r11 = 1
            if (r1 == 0) goto L34
            if (r1 != r11) goto L2c
            e.b.c.b(r0)     // Catch: java.lang.Throwable -> L2a
            goto L50
        L2a:
            r0 = move-exception
            goto L58
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            e.b.c.b(r0)
            com.waze.main_screen.p.bc r0 = new com.waze.main_screen.p.bc     // Catch: java.lang.Throwable -> L2a
            r7 = 1
            r8 = 0
            r6 = 0
            r4 = r12
            r2 = r13
            r1 = r14
            r5 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a
            h.g.a.p r0 = (h.g.a.p) r0     // Catch: java.lang.Throwable -> L2a
            r9.f27063c = r11     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = kotlinx.coroutines.aj.d(r0, r9)     // Catch: java.lang.Throwable -> L2a
            if (r0 != r10) goto L50
            return r10
        L50:
            com.waze.ui.l.cg r0 = r12.p
            r0.q()
            h.ab r0 = h.ab.f48028a
            return r0
        L58:
            com.waze.ui.l.cg r1 = r12.p
            r1.q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.bf.x(com.waze.ui.l.bp, androidx.compose.ui.unit.Density, int, java.lang.Integer, h.c.e):java.lang.Object");
    }

    public final h.g.a.a y() {
        return this.s;
    }

    public final h.g.a.a z() {
        return this.y;
    }
}
