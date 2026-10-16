package com.google.e.a.h;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class br extends dm<bs, br> implements bt {
    /* synthetic */ br(byte[] bArr) {
        super(bs.DEFAULT_INSTANCE);
    }

    public final void a(bh bhVar) {
        copyOnWrite();
        ((bs) this.instance).setKeyData(bhVar.build());
    }

    public final void b(int i2) {
        copyOnWrite();
        ((bs) this.instance).setKeyId(i2);
    }

    public final void c(ci ciVar) {
        copyOnWrite();
        ((bs) this.instance).setOutputPrefixType(ciVar);
    }

    public final void d(bk bkVar) {
        copyOnWrite();
        ((bs) this.instance).setStatus(bkVar);
    }

    private br() {
        throw null;
    }
}
