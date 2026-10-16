package com.google.android.libraries.phenotype.client.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends dm<f, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((f) this.instance).setConfigPackage(str);
    }

    public final void b(e eVar) {
        copyOnWrite();
        ((f) this.instance).setSnapshotResult(eVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((f) this.instance).setSnapshotToken(str);
    }

    private a() {
        throw null;
    }
}
