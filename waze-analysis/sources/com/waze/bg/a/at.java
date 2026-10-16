package com.waze.bg.a;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at extends com.google.v.dm<av, at> implements fj {
    /* synthetic */ at(byte[] bArr) {
        super(av.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((av) this.instance).setDescription(str);
    }

    public final void b(cd cdVar) {
        copyOnWrite();
        ((av) this.instance).setMapIssueType(cdVar);
    }

    public final void c(au auVar) {
        copyOnWrite();
        ((av) this.instance).setReportingManner(auVar);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((av) this.instance).setUrDisclaimerShown(z);
    }

    public final void e(com.waze.bg.d.d dVar) {
        copyOnWrite();
        ((av) this.instance).setUserPosition(dVar);
    }

    private at() {
        throw null;
    }
}
