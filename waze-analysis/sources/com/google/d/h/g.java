package com.google.d.h;

import com.google.d.b.an;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        an.B(bArr);
        an.t(i2, i3 + i2, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        an.B(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
    }
}
