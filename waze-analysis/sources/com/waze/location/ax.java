package com.waze.location;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.media3.common.MimeTypes;
import com.waze.NativeManager;
import com.waze.ix;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ax extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f25284a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f25285b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.a.o f25286c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25287d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25288e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f25289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(Application application, com.waze.app_nav.hub.b.c cVar, h.g.a.a aVar) {
        super(application);
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        h.g.b.x.f(cVar, "wazePopupManager");
        h.g.b.x.f(aVar, "shutdownApp");
        this.f25284a = cVar;
        kotlinx.coroutines.b.bn bnVarB = ck.b(new al(null));
        this.f25285b = bnVarB;
        kotlinx.coroutines.a.o oVarC = h.g.b.w.c(-2, null, null, 6);
        this.f25286c = oVarC;
        this.f25287d = kotlinx.coroutines.b.ai.M(oVarC);
        this.f25288e = kotlinx.coroutines.b.ai.y(new aw(bnVarB, this, 0));
        this.f25289f = h.g.a(new com.waze.beacons.a.a(aVar, 6));
        if (NativeManager.isAppStarted()) {
            q();
        } else {
            oVarC.i(ar.f25267a);
        }
    }

    static final h.ab a(ax axVar) {
        axVar.f25286c.i(aq.f25266a);
        return h.ab.f48028a;
    }

    static final h.ab b(ax axVar) {
        axVar.f25286c.i(am.f25262a);
        return h.ab.f48028a;
    }

    static final h.ab c(ax axVar) {
        axVar.f25286c.i(an.f25263a);
        return h.ab.f48028a;
    }

    static final h.ab d(ax axVar) {
        axVar.f25286c.i(ap.f25265a);
        return h.ab.f48028a;
    }

    private final com.waze.app_nav.hub.b.k p() {
        return (com.waze.app_nav.hub.b.k) this.f25289f.getValue();
    }

    private final void q() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        ix.j();
        do {
            bnVar = this.f25285b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, al.e((al) objD, !LocationSensorListener.gpsConfigMissing(getApplication().getApplicationContext()), null, false, false, 14)));
        al alVar = (al) bnVar.d();
        h.g.b.x.f(alVar, "state");
        if (alVar.c() && alVar.a() == at.f25274c) {
            this.f25286c.i(ao.f25264a);
        }
    }

    private final void r() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f25285b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, al.e((al) objD, false, null, true, false, 11)));
    }

    public final kotlinx.coroutines.b.k e() {
        return this.f25287d;
    }

    public final kotlinx.coroutines.b.k f() {
        return this.f25288e;
    }

    public final void g() {
        this.f25284a.b(p());
    }

    public final void h() {
        q();
    }

    public final void i() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f25285b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, al.e((al) objD, false, null, false, true, 7)));
    }

    public final void j() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        q();
        do {
            bnVar = this.f25285b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, al.e((al) objD, false, null, false, false, 11)));
    }

    public final void k() {
        q();
        NativeManager.getInstance().startLocation();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r10, int[] r11) {
        /*
            r9 = this;
            java.lang.String r0 = "grantResults"
            h.g.b.x.f(r11, r0)
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r10 != r0) goto L5a
            int r10 = r11.length
            r0 = 0
            if (r10 != 0) goto Lf
        Ld:
            r1 = r0
            goto L31
        Lf:
            r10 = r11[r0]
            r1 = 1
            if (r10 != 0) goto L16
            r0 = r1
            goto L31
        L16:
            r10 = r11[r1]
            if (r10 != 0) goto Ld
            kotlinx.coroutines.b.bn r10 = r9.f25285b
            java.lang.Object r10 = r10.d()
            com.waze.location.al r10 = (com.waze.location.al) r10
            com.waze.location.at r10 = r10.a()
            com.waze.location.at r11 = com.waze.location.at.f25273b
            if (r10 != r11) goto L2e
            r9.r()
            goto Ld
        L2e:
            r8 = r1
            r1 = r0
            r0 = r8
        L31:
            if (r0 == 0) goto L54
            kotlinx.coroutines.b.bn r10 = r9.f25285b
        L35:
            java.lang.Object r11 = r10.d()
            r2 = r11
            com.waze.location.al r2 = (com.waze.location.al) r2
            if (r1 == 0) goto L41
            com.waze.location.at r0 = com.waze.location.at.f25274c
            goto L43
        L41:
            com.waze.location.at r0 = com.waze.location.at.f25273b
        L43:
            r4 = r0
            r6 = 0
            r7 = 13
            r3 = 0
            r5 = 0
            com.waze.location.al r0 = com.waze.location.al.e(r2, r3, r4, r5, r6, r7)
            boolean r11 = r10.f(r11, r0)
            if (r11 == 0) goto L35
            goto L57
        L54:
            r9.r()
        L57:
            r9.q()
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.ax.l(int, int[]):void");
    }

    public final void m(boolean z, boolean z2) {
        Object objD;
        if (!z2) {
            this.f25286c.i(ap.f25265a);
        }
        o(z, z2);
        kotlinx.coroutines.b.bn bnVar = this.f25285b;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, al.e((al) objD, false, null, false, false, 11)));
    }

    public final void n() {
        q();
    }

    public final void o(boolean z, boolean z2) {
        Object objD;
        Object objD2;
        Object objD3;
        if (z2) {
            kotlinx.coroutines.b.bn bnVar = this.f25285b;
            do {
                objD3 = bnVar.d();
            } while (!bnVar.f(objD3, al.e((al) objD3, false, at.f25274c, false, false, 13)));
        } else {
            kotlinx.coroutines.b.bn bnVar2 = this.f25285b;
            if (z) {
                do {
                    objD2 = bnVar2.d();
                } while (!bnVar2.f(objD2, al.e((al) objD2, false, at.f25273b, false, false, 13)));
            } else {
                do {
                    objD = bnVar2.d();
                } while (!bnVar2.f(objD, al.e((al) objD, false, at.f25272a, false, false, 13)));
            }
        }
        q();
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f25284a.c(p());
    }
}
