package com.google.android.libraries.phenotype.client.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t extends dm<u, t> implements fj {
    /* synthetic */ t(byte[] bArr) {
        super(u.DEFAULT_INSTANCE);
    }

    public final void a(m mVar) {
        copyOnWrite();
        ((u) this.instance).setCredentialEncryptedStorageInfo(mVar.build());
    }

    private t() {
        throw null;
    }
}
