package com.google.e.a.j;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class z implements com.google.e.a.z {
    z() {
    }

    @Override // com.google.e.a.z
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new ah(this, inputStream, bArr);
    }

    @Override // com.google.e.a.z
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return new ai(this, outputStream, bArr);
    }

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract af j();

    public abstract ag k(byte[] bArr);
}
