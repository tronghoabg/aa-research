package com.waze.copilot;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends dm<n, l> implements o {
    /* synthetic */ l(byte[] bArr) {
        super(n.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((n) this.instance).setCarName(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((n) this.instance).setMoodName(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((n) this.instance).setVoiceId(str);
    }

    private l() {
        throw null;
    }
}
