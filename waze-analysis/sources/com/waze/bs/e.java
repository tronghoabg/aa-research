package com.waze.bs;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends dm<m, e> implements fj {
    /* synthetic */ e(byte[] bArr) {
        super(m.DEFAULT_INSTANCE);
    }

    public final void a(d dVar) {
        copyOnWrite();
        ((m) this.instance).setChatContext(dVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((m) this.instance).setChatId(str);
    }

    public final void c(h hVar) {
        copyOnWrite();
        ((m) this.instance).setShowLocationPreviewResponse(hVar);
    }

    public final void d(j jVar) {
        copyOnWrite();
        ((m) this.instance).setShowSearchResultsResponse(jVar);
    }

    public final void e(l lVar) {
        copyOnWrite();
        ((m) this.instance).setShowTripOverviewResponse(lVar);
    }

    public final void f(com.waze.u.a.s sVar) {
        copyOnWrite();
        ((m) this.instance).setUserPrompt(sVar);
    }

    private e() {
        throw null;
    }
}
