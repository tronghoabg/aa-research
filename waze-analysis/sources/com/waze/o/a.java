package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends dm<c, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(c.DEFAULT_INSTANCE);
    }

    public final void a(m mVar) {
        copyOnWrite();
        ((c) this.instance).setCalculateRouteResponse(mVar);
    }

    public final void b(s sVar) {
        copyOnWrite();
        ((c) this.instance).setChangeVoiceGuidanceModeResponse(sVar);
    }

    public final void c(com.waze.bm.a.a.m mVar) {
        copyOnWrite();
        ((c) this.instance).setGetClosureCandidatesResponse(mVar);
    }

    public final void d(com.waze.bm.a.a.s sVar) {
        copyOnWrite();
        ((c) this.instance).setReportAlertResponse(sVar);
    }

    public final void e(com.waze.bm.a.a.w wVar) {
        copyOnWrite();
        ((c) this.instance).setReportClosureResponse(wVar);
    }

    public final void f(com.waze.bm.a.a.aa aaVar) {
        copyOnWrite();
        ((c) this.instance).setReportMapIssueResponse(aaVar);
    }

    public final void g(au auVar) {
        copyOnWrite();
        ((c) this.instance).setSendUserLogsResponse(auVar);
    }

    public final void h(bc bcVar) {
        copyOnWrite();
        ((c) this.instance).setStartNavigationResponse(bcVar);
    }

    public final void i(bg bgVar) {
        copyOnWrite();
        ((c) this.instance).setStopNavigationResponse(bgVar);
    }

    public final void j(cc ccVar) {
        copyOnWrite();
        ((c) this.instance).setUpdateFavoriteResponse(ccVar);
    }

    private a() {
        throw null;
    }
}
