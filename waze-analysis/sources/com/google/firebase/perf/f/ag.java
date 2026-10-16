package com.google.firebase.perf.f;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag extends dm<ah, ag> implements ai {
    /* synthetic */ ag(byte[] bArr) {
        super(ah.DEFAULT_INSTANCE);
    }

    public final void a(ak akVar) {
        copyOnWrite();
        ((ah) this.instance).addSessionVerbosity(akVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ah) this.instance).setSessionId(str);
    }

    private ag() {
        throw null;
    }
}
