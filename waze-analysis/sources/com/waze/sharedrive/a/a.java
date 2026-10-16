package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((b) this.instance).setName(str);
    }

    public final void b(com.waze.sharedrive.f.a.i iVar) {
        copyOnWrite();
        ((b) this.instance).setNewRole(iVar);
    }

    private a() {
        throw null;
    }
}
