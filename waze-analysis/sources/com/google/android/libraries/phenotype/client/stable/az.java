package com.google.android.libraries.phenotype.client.stable;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class az extends dm<ba, az> implements fj {
    /* synthetic */ az(byte[] bArr) {
        super(ba.DEFAULT_INSTANCE);
    }

    public final void a(bd bdVar) {
        copyOnWrite();
        ((ba) this.instance).addFlag(bdVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((ba) this.instance).setConfigurationVersion(j2);
    }

    public final void c(com.google.v.v vVar) {
        copyOnWrite();
        ((ba) this.instance).setExperimentToken(vVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((ba) this.instance).setServerToken(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((ba) this.instance).setSnapshotToken(str);
    }

    private az() {
        throw null;
    }
}
