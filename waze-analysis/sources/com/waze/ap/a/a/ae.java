package com.waze.ap.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae extends dm<af, ae> implements fj {
    /* synthetic */ ae(byte[] bArr) {
        super(af.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((af) this.instance).setInsightId(str);
    }

    public final void b(aj ajVar) {
        copyOnWrite();
        ((af) this.instance).setInsightType(ajVar);
    }

    private ae() {
        throw null;
    }
}
