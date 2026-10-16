package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f10532a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.metrics.f f10533b;

    /* renamed from: c, reason: collision with root package name */
    private final m f10534c;

    /* renamed from: e, reason: collision with root package name */
    private long f10536e;

    /* renamed from: d, reason: collision with root package name */
    private long f10535d = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f10537f = -1;

    public a(InputStream inputStream, com.google.firebase.perf.metrics.f fVar, m mVar) {
        this.f10534c = mVar;
        this.f10532a = inputStream;
        this.f10533b = fVar;
        this.f10536e = fVar.a();
    }

    private final void a(long j2) {
        long j3 = this.f10535d;
        if (j3 == -1) {
            this.f10535d = j2;
        } else {
            this.f10535d = j3 + j2;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f10532a.available();
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10533b;
            fVar.n(this.f10534c.b());
            h.c(fVar);
            throw e2;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long jB = this.f10534c.b();
        if (this.f10537f == -1) {
            this.f10537f = jB;
        }
        try {
            this.f10532a.close();
            long j2 = this.f10535d;
            if (j2 != -1) {
                this.f10533b.l(j2);
            }
            long j3 = this.f10536e;
            if (j3 != -1) {
                this.f10533b.o(j3);
            }
            com.google.firebase.perf.metrics.f fVar = this.f10533b;
            fVar.n(this.f10537f);
            fVar.e();
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10533b;
            fVar2.n(this.f10534c.b());
            h.c(fVar2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        this.f10532a.mark(i2);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f10532a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            int i2 = this.f10532a.read();
            long jB = this.f10534c.b();
            if (this.f10536e == -1) {
                this.f10536e = jB;
            }
            if (i2 == -1) {
                if (this.f10537f == -1) {
                    this.f10537f = jB;
                    com.google.firebase.perf.metrics.f fVar = this.f10533b;
                    fVar.n(jB);
                    fVar.e();
                    return -1;
                }
                i2 = -1;
            }
            a(1L);
            this.f10533b.l(this.f10535d);
            return i2;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10533b;
            fVar2.n(this.f10534c.b());
            h.c(fVar2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f10532a.reset();
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10533b;
            fVar.n(this.f10534c.b());
            h.c(fVar);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        try {
            long jSkip = this.f10532a.skip(j2);
            long jB = this.f10534c.b();
            if (this.f10536e == -1) {
                this.f10536e = jB;
            }
            if (jSkip == 0) {
                if (j2 != 0 && this.f10537f == -1) {
                    this.f10537f = jB;
                    this.f10533b.n(jB);
                    return 0L;
                }
                jSkip = 0;
            }
            a(jSkip);
            this.f10533b.l(this.f10535d);
            return jSkip;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10533b;
            fVar.n(this.f10534c.b());
            h.c(fVar);
            throw e2;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            int i2 = this.f10532a.read(bArr);
            long jB = this.f10534c.b();
            if (this.f10536e == -1) {
                this.f10536e = jB;
            }
            if (i2 == -1) {
                if (this.f10537f == -1) {
                    this.f10537f = jB;
                    com.google.firebase.perf.metrics.f fVar = this.f10533b;
                    fVar.n(jB);
                    fVar.e();
                    return -1;
                }
                i2 = -1;
            }
            a(i2);
            this.f10533b.l(this.f10535d);
            return i2;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10533b;
            fVar2.n(this.f10534c.b());
            h.c(fVar2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            int i4 = this.f10532a.read(bArr, i2, i3);
            long jB = this.f10534c.b();
            if (this.f10536e == -1) {
                this.f10536e = jB;
            }
            if (i4 == -1) {
                if (this.f10537f == -1) {
                    this.f10537f = jB;
                    com.google.firebase.perf.metrics.f fVar = this.f10533b;
                    fVar.n(jB);
                    fVar.e();
                    return -1;
                }
                i4 = -1;
            }
            a(i4);
            this.f10533b.l(this.f10535d);
            return i4;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10533b;
            fVar2.n(this.f10534c.b());
            h.c(fVar2);
            throw e2;
        }
    }
}
