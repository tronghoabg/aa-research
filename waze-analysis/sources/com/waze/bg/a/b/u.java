package com.waze.bg.a.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u extends dm<v, u> implements fj {
    /* synthetic */ u(byte[] bArr) {
        super(v.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((v) this.instance).setConversationId(str);
    }

    public final void b(e eVar) {
        copyOnWrite();
        ((v) this.instance).setGender(eVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((v) this.instance).setLanguageCode(str);
    }

    public final void d(h hVar) {
        copyOnWrite();
        ((v) this.instance).setMessage(hVar);
    }

    private u() {
        throw null;
    }
}
