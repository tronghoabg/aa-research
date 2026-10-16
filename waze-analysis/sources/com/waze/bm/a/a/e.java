package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends dm<f, e> implements fj {
    /* synthetic */ e(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(m mVar) {
        copyOnWrite();
        ((f) this.instance).setGetClosureCandidatesResponse(mVar);
    }

    public final void b(s sVar) {
        copyOnWrite();
        ((f) this.instance).setReportAlertResponse(sVar);
    }

    public final void c(w wVar) {
        copyOnWrite();
        ((f) this.instance).setReportClosureResponse(wVar);
    }

    public final void d(aa aaVar) {
        copyOnWrite();
        ((f) this.instance).setReportMapIssueResponse(aaVar);
    }

    private e() {
        throw null;
    }
}
