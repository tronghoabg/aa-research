package com.waze.ce;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(com.google.v.v vVar) {
        copyOnWrite();
        ((b) this.instance).setInstructionAnnouncementData(vVar);
    }

    public final void b(r rVar) {
        copyOnWrite();
        ((b) this.instance).setVoice(rVar);
    }

    private a() {
        throw null;
    }
}
