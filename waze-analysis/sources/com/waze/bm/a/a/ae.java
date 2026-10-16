package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends dm<af, ae> implements fj {
    /* synthetic */ ae(byte[] bArr) {
        super(af.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((af) this.instance).setAcceptedLanguage(str);
    }

    public final void b(com.waze.u.a.c cVar) {
        copyOnWrite();
        ((af) this.instance).setAudioConfiguration(cVar.build());
    }

    public final void c(String str) {
        copyOnWrite();
        ((af) this.instance).setCurrentStreetName(str);
    }

    public final void d(i.b.s sVar) {
        copyOnWrite();
        ((af) this.instance).setUserPosition(sVar);
    }

    private ae() {
        throw null;
    }
}
