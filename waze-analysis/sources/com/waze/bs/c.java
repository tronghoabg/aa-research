package com.waze.bs;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((d) this.instance).setAcceptedLanguage(str);
    }

    public final void b(com.waze.u.a.g gVar) {
        copyOnWrite();
        ((d) this.instance).setAudioConfiguration(gVar);
    }

    private c() {
        throw null;
    }
}
