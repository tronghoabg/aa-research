package defpackage;

import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ajnv extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ ajnw a;

    public ajnv(ajnw ajnwVar) {
        this.a = ajnwVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ajnw ajnwVar = this.a;
        if (ajnwVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(ajnwVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        ajnw ajnwVar = this.a;
        if (ajnwVar.c) {
            throw new IOException("closed");
        }
        ahfd.g(bArr.length, i, i2);
        ajmy ajmyVar = ajnwVar.b;
        if (ajmyVar.b == 0 && ajnwVar.a.hU(ajmyVar, 8192L) == -1) {
            return -1;
        }
        return ajmyVar.e(bArr, i, i2);
    }

    public final String toString() {
        ajnw ajnwVar = this.a;
        Objects.toString(ajnwVar);
        return ajnwVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        ajnw ajnwVar = this.a;
        if (ajnwVar.c) {
            throw new IOException("closed");
        }
        long j = 0;
        while (true) {
            ajmy ajmyVar = ajnwVar.b;
            if (ajmyVar.b == 0 && ajnwVar.a.hU(ajmyVar, 8192L) == -1) {
                return j;
            }
            long j2 = ajmyVar.b;
            j += j2;
            ajmyVar.R(outputStream, j2);
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ajnw ajnwVar = this.a;
        if (ajnwVar.c) {
            throw new IOException("closed");
        }
        ajmy ajmyVar = ajnwVar.b;
        if (ajmyVar.b == 0 && ajnwVar.a.hU(ajmyVar, 8192L) == -1) {
            return -1;
        }
        return ajmyVar.d() & 255;
    }
}
