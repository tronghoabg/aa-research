package com.google.android.libraries.phenotype.client.b;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f5970a;

    d(f fVar) {
        Objects.requireNonNull(fVar);
        this.f5970a = fVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws DataFormatException, IOException {
        try {
            f fVar = this.f5970a;
            int iInflate = fVar.f5972a.inflate(bArr, i2, i3);
            if (iInflate > 0) {
                return iInflate;
            }
            if (i3 == 0) {
                return 0;
            }
            if (fVar.f5972a.getRemaining() == 0) {
                return -1;
            }
            throw new IOException("Read no bytes (requested up to " + i3 + ") but did not reach end of stream, had " + this.f5970a.f5972a.getRemaining());
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }
}
