package com.google.e.a.i.a;

import com.google.e.a.z;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    boolean f8596a = false;

    /* renamed from: b, reason: collision with root package name */
    InputStream f8597b = null;

    /* renamed from: c, reason: collision with root package name */
    final InputStream f8598c;

    /* renamed from: d, reason: collision with root package name */
    final List f8599d;

    /* renamed from: e, reason: collision with root package name */
    final byte[] f8600e;

    public c(List list, InputStream inputStream, byte[] bArr) {
        this.f8599d = list;
        if (inputStream.markSupported()) {
            this.f8598c = inputStream;
        } else {
            this.f8598c = new BufferedInputStream(inputStream);
        }
        this.f8598c.mark(Integer.MAX_VALUE);
        this.f8600e = (byte[]) bArr.clone();
    }

    private final void a() throws IOException {
        this.f8598c.reset();
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = this.f8597b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f8598c.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = this.f8597b;
        if (inputStream != null) {
            return inputStream.read(bArr, i2, i3);
        }
        if (this.f8596a) {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        this.f8596a = true;
        for (z zVar : this.f8599d) {
            try {
                InputStream inputStream2 = this.f8598c;
                InputStream inputStreamA = zVar.a(inputStream2, this.f8600e);
                int i4 = inputStreamA.read(bArr, i2, i3);
                if (i4 == 0) {
                    throw new IOException("Could not read bytes from the ciphertext stream");
                }
                this.f8597b = inputStreamA;
                inputStream2.mark(0);
                return i4;
            } catch (IOException unused) {
                a();
            } catch (GeneralSecurityException unused2) {
                a();
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
