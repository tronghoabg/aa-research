package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends dm<ae, ad> implements fj {
    /* synthetic */ ad(byte[] bArr) {
        super(ae.DEFAULT_INSTANCE);
    }

    public final void a(i.b.s sVar) {
        copyOnWrite();
        ((ae) this.instance).setLocation(sVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ae) this.instance).setName(str);
    }

    private ad() {
        throw null;
    }
}
