package com.google.e.a.h;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bw extends dm<bx, bw> implements by {
    /* synthetic */ bw(byte[] bArr) {
        super(bx.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((bx) this.instance).setKeyId(i2);
    }

    public final void b(ci ciVar) {
        copyOnWrite();
        ((bx) this.instance).setOutputPrefixType(ciVar);
    }

    public final void c(bk bkVar) {
        copyOnWrite();
        ((bx) this.instance).setStatus(bkVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((bx) this.instance).setTypeUrl(str);
    }

    private bw() {
        throw null;
    }
}
