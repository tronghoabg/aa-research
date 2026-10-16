package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends dm<x, v> implements fj {
    /* synthetic */ v(byte[] bArr) {
        super(x.DEFAULT_INSTANCE);
    }

    public final void a(c cVar) {
        copyOnWrite();
        ((x) this.instance).setActionResult(cVar);
    }

    public final void b(u uVar) {
        copyOnWrite();
        ((x) this.instance).setChatContext(uVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((x) this.instance).setChatId(str);
    }

    public final void d(com.waze.u.a.s sVar) {
        copyOnWrite();
        ((x) this.instance).setUserPrompt(sVar);
    }

    private v() {
        throw null;
    }
}
