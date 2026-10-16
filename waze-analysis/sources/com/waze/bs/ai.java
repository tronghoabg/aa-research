package com.waze.bs;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends dm<am, ai> implements fj {
    /* synthetic */ ai(byte[] bArr) {
        super(am.DEFAULT_INSTANCE);
    }

    public final void a(ak akVar) {
        copyOnWrite();
        ((am) this.instance).setFte(akVar);
    }

    public final void b(com.waze.u.a.s sVar) {
        copyOnWrite();
        ((am) this.instance).setUserPrompt(sVar);
    }

    private ai() {
        throw null;
    }
}
