package com.google.firebase.perf.f;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((b) this.instance).setPackageName(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((b) this.instance).setSdkVersion(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((b) this.instance).setVersionName(str);
    }

    private a() {
        throw null;
    }
}
