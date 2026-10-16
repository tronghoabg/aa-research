package com.waze.main_screen.p.a.b.a;

import android.content.res.Configuration;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.waze.main_screen.p.a.b.b.af;
import com.waze.main_screen.p.a.b.b.am;
import com.waze.z.a.b.ad;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final af f26819a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.z.a.b.ab f26820b;

    /* renamed from: c, reason: collision with root package name */
    private final ScrollState f26821c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.p.a.b.b.c f26822d;

    /* renamed from: e, reason: collision with root package name */
    private final am f26823e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.p.a.b.b.t f26824f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26825g;

    /* renamed from: h, reason: collision with root package name */
    private final MutableState f26826h;

    /* renamed from: i, reason: collision with root package name */
    private final MutableState f26827i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f26828j;

    /* renamed from: k, reason: collision with root package name */
    private ad f26829k;

    public t(af afVar, com.waze.z.a.b.ab abVar, ScrollState scrollState) {
        h.g.b.x.f(afVar, "etaDrawerStateHolder");
        h.g.b.x.f(abVar, "wazeBottomSheetState");
        h.g.b.x.f(scrollState, "scrollState");
        this.f26819a = afVar;
        this.f26820b = abVar;
        this.f26821c = scrollState;
        this.f26822d = afVar.a();
        this.f26823e = afVar.c();
        this.f26824f = afVar.b();
        this.f26826h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f26827i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.f26828j = afVar.d();
        this.f26829k = ad.f45734b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r6.scrollTo(0, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.main_screen.p.a.b.a.p
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.main_screen.p.a.b.a.p r0 = (com.waze.main_screen.p.a.b.a.p) r0
            int r1 = r0.f26813c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26813c = r1
            goto L18
        L13:
            com.waze.main_screen.p.a.b.a.p r0 = new com.waze.main_screen.p.a.b.a.p
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f26811a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f26813c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r7)
            goto L61
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            e.b.c.b(r7)
            goto L56
        L39:
            e.b.c.b(r7)
            com.waze.z.a.b.ab r7 = r6.f26820b
            boolean r2 = r7.v()
            if (r2 != 0) goto L4d
            r0.f26813c = r5
            java.lang.Object r7 = r7.k(r0)
            if (r7 != r1) goto L56
            goto L64
        L4d:
            r0.f26813c = r4
            java.lang.Object r7 = r7.m(r0)
            if (r7 != r1) goto L56
            goto L64
        L56:
            androidx.compose.foundation.ScrollState r6 = r6.f26821c
            r0.f26813c = r3
            r7 = 0
            java.lang.Object r6 = r6.scrollTo(r7, r0)
            if (r6 == r1) goto L64
        L61:
            h.ab r6 = h.ab.f48028a
            return r6
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.a.b.a.t.F(h.c.e):java.lang.Object");
    }

    private final Object G(h.c.e eVar) {
        H();
        com.waze.z.a.b.ab abVar = this.f26820b;
        ad adVarG = abVar.g();
        ad adVar = ad.f45733a;
        int iOrdinal = adVarG.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            Object objN = abVar.n(eVar);
            if (objN == h.c.a.a.f48038a) {
                return objN;
            }
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new h.i();
            }
            Object objF = F(eVar);
            if (objF == h.c.a.a.f48038a) {
                return objF;
            }
        }
        return h.ab.f48028a;
    }

    private final void H() {
        this.f26827i.setValue(false);
    }

    static final ad g(t tVar) {
        return tVar.f26820b.h();
    }

    public static final /* synthetic */ void z(t tVar) {
        tVar.H();
        tVar.f26819a.f();
    }

    public final void B() {
        this.f26819a.g();
    }

    public final void C(Rect rect) {
        this.f26826h.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        return ((Boolean) this.f26827i.getValue()).booleanValue();
    }

    public final Object E(h.c.e eVar) {
        H();
        if (!this.f26825g) {
            this.f26825g = true;
            Object objN = this.f26820b.n(eVar);
            if (objN == h.c.a.a.f48038a) {
                return objN;
            }
        }
        return h.ab.f48028a;
    }

    public final float a(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1964913893, i2, -1, "com.waze.main_screen.mid_drive.eta_drawer.presentation.compose.EtaDrawerSheetState.rememberMainBarHeight (EtaDrawerSheetState.kt:194)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(x(), null, composer, 0, 1);
        boolean z = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
        boolean z2 = com.waze.bz.a.f(composer) == com.waze.ui.r.a.e.b.a.f43359a;
        boolean zChanged = composer.changed(((Boolean) stateCollectAsState.getValue()).booleanValue()) | composer.changed(z) | composer.changed(z2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = Dp.m11162boximpl(com.waze.main_screen.n.c.b(((Boolean) stateCollectAsState.getValue()).booleanValue(), z2, z));
            composer.updateRememberedValue(objRememberedValue);
        }
        float fM11178unboximpl = ((Dp) objRememberedValue).m11178unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM11178unboximpl;
    }

    public final int b() {
        return this.f26820b.f().a().a();
    }

    public final ScrollState c() {
        return this.f26821c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect d() {
        return (Rect) this.f26826h.getValue();
    }

    public final com.waze.z.a.b.ab e() {
        return this.f26820b;
    }

    public final com.waze.main_screen.p.a.b.b.c h() {
        return this.f26822d;
    }

    public final com.waze.main_screen.p.a.b.b.t i() {
        return this.f26824f;
    }

    public final am j() {
        return this.f26823e;
    }

    public final Object l(h.c.e eVar) {
        Object objF = F(eVar);
        return objF == h.c.a.a.f48038a ? objF : h.ab.f48028a;
    }

    public final Object m(h.c.e eVar) {
        Object objF = F(eVar);
        return objF == h.c.a.a.f48038a ? objF : h.ab.f48028a;
    }

    public final Object n(h.c.e eVar) {
        Object objG = G(eVar);
        return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
    }

    public final Object o(h.c.e eVar) {
        Object objN = this.f26820b.n(eVar);
        return objN == h.c.a.a.f48038a ? objN : h.ab.f48028a;
    }

    public final Object p(h.c.e eVar) {
        Object objG = G(eVar);
        return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
    }

    public final Object q(h.c.e eVar) {
        Object objG = G(eVar);
        return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
    }

    public final Object r(h.c.e eVar) {
        Object objF = F(eVar);
        return objF == h.c.a.a.f48038a ? objF : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(boolean r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.main_screen.p.a.b.a.q
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.main_screen.p.a.b.a.q r0 = (com.waze.main_screen.p.a.b.a.q) r0
            int r1 = r0.f26816c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26816c = r1
            goto L18
        L13:
            com.waze.main_screen.p.a.b.a.q r0 = new com.waze.main_screen.p.a.b.a.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f26814a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f26816c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            if (r5 == 0) goto L43
            r0.f26816c = r3
            java.lang.Object r5 = r4.F(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.waze.z.a.b.ab r4 = r4.f26820b
            r4.p()
            goto L48
        L43:
            com.waze.z.a.b.ab r4 = r4.f26820b
            r4.q()
        L48:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.a.b.a.t.s(boolean, h.c.e):java.lang.Object");
    }

    public final Object t(h.c.e eVar) {
        Object objF = F(eVar);
        return objF == h.c.a.a.f48038a ? objF : h.ab.f48028a;
    }

    public final Object u(h.c.e eVar) {
        Object objF = F(eVar);
        return objF == h.c.a.a.f48038a ? objF : h.ab.f48028a;
    }

    public final Object v(h.c.e eVar) {
        Object objF = F(eVar);
        return objF == h.c.a.a.f48038a ? objF : h.ab.f48028a;
    }

    public final ch w() {
        return this.f26828j;
    }

    public final ch x() {
        return this.f26819a.a().b();
    }
}
