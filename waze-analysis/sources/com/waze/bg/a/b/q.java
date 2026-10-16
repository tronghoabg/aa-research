package com.waze.bg.a.b;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q extends dm<s, q> implements fj {
    /* synthetic */ q(byte[] bArr) {
        super(s.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((s) this.instance).setConversationId(str);
    }

    public final void b(gc gcVar) {
        copyOnWrite();
        ((s) this.instance).setConversationInitiationTime(gcVar);
    }

    public final void c(com.waze.bg.a.b.a.d dVar) {
        copyOnWrite();
        ((s) this.instance).setConversationReportDetails(dVar);
    }

    public final void d(e eVar) {
        copyOnWrite();
        ((s) this.instance).setGender(eVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((s) this.instance).setLanguageCode(str);
    }

    public final void f(h hVar) {
        copyOnWrite();
        ((s) this.instance).setMessage(hVar);
    }

    private q() {
        throw null;
    }
}
