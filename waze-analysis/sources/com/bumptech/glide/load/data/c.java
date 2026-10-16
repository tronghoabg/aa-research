package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f3469a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f3470b;

    /* renamed from: c, reason: collision with root package name */
    private int f3471c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3472d;

    public c(OutputStream outputStream, com.bumptech.glide.load.a.a.j jVar) {
        this.f3469a = outputStream;
        this.f3472d = jVar;
        this.f3470b = (byte[]) jVar.a(65536, byte[].class);
    }

    private final void a() throws IOException {
        int i2 = this.f3471c;
        if (i2 > 0) {
            this.f3469a.write(this.f3470b, 0, i2);
            this.f3471c = 0;
        }
    }

    private final void b() throws IOException {
        if (this.f3471c == this.f3470b.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            this.f3469a.close();
            byte[] bArr = this.f3470b;
            if (bArr != null) {
                this.f3472d.c(bArr);
                this.f3470b = null;
            }
        } catch (Throwable th) {
            this.f3469a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        a();
        this.f3469a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f3471c;
            if (i7 == 0) {
                if (i5 >= this.f3470b.length) {
                    this.f3469a.write(bArr, i6, i5);
                    return;
                }
                i7 = 0;
            }
            int iMin = Math.min(i5, this.f3470b.length - i7);
            System.arraycopy(bArr, i6, this.f3470b, this.f3471c, iMin);
            this.f3471c += iMin;
            i4 += iMin;
            b();
        } while (i4 < i3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        byte[] bArr = this.f3470b;
        int i3 = this.f3471c;
        this.f3471c = i3 + 1;
        bArr[i3] = (byte) i2;
        b();
    }
}
