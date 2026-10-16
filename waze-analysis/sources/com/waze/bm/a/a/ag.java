package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends dm<ai, ag> implements fj {
    /* synthetic */ ag(byte[] bArr) {
        super(ai.DEFAULT_INSTANCE);
    }

    public final void a(f fVar) {
        copyOnWrite();
        ((ai) this.instance).setActionResult(fVar);
    }

    public final void b(af afVar) {
        copyOnWrite();
        ((ai) this.instance).setChatContext(afVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ai) this.instance).setChatId(str);
    }

    public final void d(com.waze.u.a.n nVar) {
        copyOnWrite();
        ((ai) this.instance).setUserPrompt(nVar.build());
    }

    private ag() {
        throw null;
    }
}
