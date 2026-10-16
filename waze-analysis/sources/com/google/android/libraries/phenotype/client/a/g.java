package com.google.android.libraries.phenotype.client.a;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends dm<h, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    @Deprecated
    public final void a(String str) {
        copyOnWrite();
        ((h) this.instance).addDeleteFlag(str);
    }

    public final void b(k kVar) {
        copyOnWrite();
        ((h) this.instance).addFlag(kVar);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((h) this.instance).setConfigurationVersion(j2);
    }

    public final void d(v vVar) {
        copyOnWrite();
        ((h) this.instance).setExperimentToken(vVar);
    }

    @Deprecated
    public final void e(boolean z) {
        copyOnWrite();
        ((h) this.instance).setIsDelta(z);
    }

    public final void f(String str) {
        copyOnWrite();
        ((h) this.instance).setServerToken(str);
    }

    public final void g(String str) {
        copyOnWrite();
        ((h) this.instance).setSnapshotToken(str);
    }

    private g() {
        throw null;
    }
}
