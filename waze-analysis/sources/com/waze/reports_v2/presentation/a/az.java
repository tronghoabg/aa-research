package com.waze.reports_v2.presentation.a;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.bt;
import com.waze.reports_v2.c.dk;
import com.waze.reports_v2.presentation.bz;
import com.waze.reports_v2.presentation.ca;
import com.waze.reports_v2.presentation.cb;
import com.waze.reports_v2.presentation.cc;
import com.waze.reports_v2.presentation.cd;
import com.waze.reports_v2.presentation.ce;
import com.waze.reports_v2.presentation.cf;
import com.waze.reports_v2.presentation.cg;
import com.waze.reports_v2.presentation.dc;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az {

    /* renamed from: a, reason: collision with root package name */
    private final ba f34694a;

    /* renamed from: b, reason: collision with root package name */
    private final s f34695b;

    /* renamed from: c, reason: collision with root package name */
    private final dc f34696c;

    /* renamed from: d, reason: collision with root package name */
    private final dk f34697d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableIntState f34698e;

    /* renamed from: f, reason: collision with root package name */
    private final MutableState f34699f;

    /* renamed from: g, reason: collision with root package name */
    private final MutableState f34700g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f34701h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.k f34702i;

    public az(ba baVar, s sVar, dc dcVar, com.waze.reports_v2.presentation.k kVar, dk dkVar) {
        h.g.b.x.f(baVar, "reportMenuStateHolder");
        h.g.b.x.f(sVar, "reportLaterStateHolder");
        h.g.b.x.f(dcVar, "reportResultPresenter");
        h.g.b.x.f(kVar, "legacyMenuHandler");
        h.g.b.x.f(dkVar, "reportMenuCommands");
        this.f34694a = baVar;
        this.f34695b = sVar;
        this.f34696c = dcVar;
        this.f34702i = kVar;
        this.f34697d = dkVar;
        this.f34698e = SnapshotIntStateKt.mutableIntStateOf(0);
        this.f34699f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f34700g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f34701h = sVar.a();
    }

    public static final /* synthetic */ boolean l(az azVar) {
        s sVar = azVar.f34695b;
        at atVar = (at) sVar.a().d();
        com.waze.reports_v2.b.ad adVarD = atVar != null ? atVar.d() : null;
        com.waze.reports_v2.b.ad adVar = com.waze.reports_v2.b.ad.f34018b;
        if (adVarD == adVar) {
            return false;
        }
        sVar.d(new at(adVar, -44976, R.drawable.icon_report_sos, null, null, null, null, null));
        return true;
    }

    private final void q(com.waze.reports_v2.b.ad adVar) {
        at atVarB;
        s sVar = this.f34695b;
        r(new au(adVar, (at) sVar.a().d()));
        au auVarC = c();
        com.waze.reports_v2.b.ad adVarD = (auVarC == null || (atVarB = auVarC.b()) == null) ? null : atVarB.d();
        au auVarC2 = c();
        if (adVarD == (auVarC2 != null ? auVarC2.a() : null)) {
            sVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(au auVar) {
        this.f34700g.setValue(auVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(av avVar) {
        this.f34699f.setValue(avVar);
    }

    public final int a() {
        return this.f34698e.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final au c() {
        return (au) this.f34700g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final av d() {
        return (av) this.f34699f.getValue();
    }

    public final Object f(h.c.e eVar) {
        Object objCollect = this.f34697d.a().collect(new ax(this), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.waze.reports_v2.c.dj r5, com.waze.shared_infra.h.c r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.reports_v2.presentation.a.ay
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.reports_v2.presentation.a.ay r0 = (com.waze.reports_v2.presentation.a.ay) r0
            int r1 = r0.f34692c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34692c = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.a.ay r0 = new com.waze.reports_v2.presentation.a.ay
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f34690a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34692c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.reports_v2.c.dj r5 = r0.f34693d
            r6 = r5
            com.waze.reports_v2.c.dj r6 = (com.waze.reports_v2.c.dj) r6
            e.b.c.b(r7)
            goto L47
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r7)
            r7 = 0
            r4.r(r7)
            com.waze.reports_v2.presentation.a.ba r7 = r4.f34694a
            r0.f34693d = r5
            r0.f34692c = r3
            java.lang.Object r7 = r7.e(r6, r0)
            if (r7 == r1) goto L78
        L47:
            com.waze.reports_v2.c.ed r7 = (com.waze.reports_v2.c.ed) r7
            boolean r6 = r7 instanceof com.waze.reports_v2.c.eb
            if (r6 == 0) goto L61
            com.waze.reports_v2.presentation.a.av r6 = new com.waze.reports_v2.presentation.a.av
            r0 = r7
            com.waze.reports_v2.c.eb r0 = (com.waze.reports_v2.c.eb) r0
            com.waze.sharedui.e.c r1 = r0.b()
            long r2 = r0.a()
            r6.<init>(r5, r1, r2)
            r4.s(r6)
            return r7
        L61:
            boolean r5 = r7 instanceof com.waze.reports_v2.c.ec
            if (r5 == 0) goto L72
            com.waze.reports_v2.presentation.dc r4 = r4.f34696c
            r5 = r7
            com.waze.reports_v2.c.ec r5 = (com.waze.reports_v2.c.ec) r5
            com.waze.reports_v2.c.ea r5 = r5.a()
            r4.d(r5)
            return r7
        L72:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.a.az.g(com.waze.reports_v2.c.dj, com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    public final ch h() {
        return this.f34701h;
    }

    public final void i(cg cgVar) {
        h.g.b.x.f(cgVar, "command");
        av avVarD = d();
        if (avVarD == null) {
            return;
        }
        k(0);
        s(null);
        boolean z = cgVar instanceof bz;
        com.waze.sharedui.e.c cVarC = avVarD.c();
        long jA = avVarD.a();
        if (z) {
            bz bzVar = (bz) cgVar;
            this.f34694a.h(bzVar.a());
            com.waze.reports_v2.presentation.ch chVarA = bzVar.a();
            com.waze.reports_v2.b.ad adVar = com.waze.reports_v2.b.ad.f34017a;
            com.waze.reports_v2.presentation.ch chVar = com.waze.reports_v2.presentation.ch.f34947a;
            if (chVarA.ordinal() != 0) {
                throw new h.i();
            }
            this.f34696c.a(bb.f34709a);
            return;
        }
        if (cgVar instanceof ca) {
            ca caVar = (ca) cgVar;
            this.f34694a.i(caVar.b(), caVar.c(), cVarC, jA, caVar.a());
            return;
        }
        if (!(cgVar instanceof cb)) {
            if (cgVar instanceof cd) {
                this.f34694a.g(((cd) cgVar).a());
                return;
            } else if (cgVar instanceof ce) {
                this.f34694a.m(((ce) cgVar).a());
                return;
            } else {
                if (!h.g.b.x.n(cgVar, cc.f34943a) && !(cgVar instanceof cf)) {
                    throw new h.i();
                }
                return;
            }
        }
        cb cbVar = (cb) cgVar;
        com.waze.reports_v2.b.ad adVarA = cbVar.a();
        com.waze.reports_v2.presentation.ch chVar2 = com.waze.reports_v2.presentation.ch.f34947a;
        switch (adVarA.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                q(cbVar.a());
                return;
            case 2:
                bt.searchNearbyStations$default((bt) com.waze.web.r.m(DriveToNativeManager.class), null, 1, null);
                return;
            case 5:
                ConfigManager configManager = ConfigManager.getInstance();
                h.g.b.x.e(configManager, "getInstance(...)");
                com.waze.bc.sendLogsClick$default(configManager, null, 1, null);
                return;
            case 6:
                this.f34702i.a();
                return;
            default:
                throw new h.i();
        }
    }

    public final void j(at atVar) {
        h.g.b.x.f(atVar, "laterButton");
        s(null);
        k(0);
        q(atVar.d());
    }

    public final void k(int i2) {
        this.f34698e.setIntValue(i2);
    }

    public final boolean m() {
        return d() != null;
    }
}
