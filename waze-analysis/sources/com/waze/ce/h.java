package com.waze.ce;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends dm<j, h> implements fj {
    /* synthetic */ h(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(com.google.v.v vVar) {
        copyOnWrite();
        ((j) this.instance).setRerouteExplanationVoiceData(vVar);
    }

    public final void b(com.google.v.v vVar) {
        copyOnWrite();
        ((j) this.instance).setRouteInitialAnnouncementData(vVar);
    }

    public final void c(r rVar) {
        copyOnWrite();
        ((j) this.instance).setVoice(rVar);
    }

    private h() {
        throw null;
    }
}
