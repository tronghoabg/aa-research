package com.google.d.g;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class a extends c {
    a() {
    }

    @Override // com.google.d.g.h
    public final void a() {
        throw null;
    }

    protected void b(byte[] bArr, int i2) {
        throw null;
    }

    @Override // com.google.d.g.c
    public final void c(byte[] bArr, int i2) {
        an.t(0, i2, bArr.length);
        b(bArr, i2);
    }

    @Override // com.google.d.g.c, com.google.d.g.h
    public final void d(byte[] bArr) {
        an.B(bArr);
        b(bArr, bArr.length);
    }
}
