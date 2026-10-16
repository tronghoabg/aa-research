package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    final com.google.firebase.perf.metrics.f f10538a;

    /* renamed from: b, reason: collision with root package name */
    long f10539b = -1;

    /* renamed from: c, reason: collision with root package name */
    private final OutputStream f10540c;

    /* renamed from: d, reason: collision with root package name */
    private final m f10541d;

    public b(OutputStream outputStream, com.google.firebase.perf.metrics.f fVar, m mVar) {
        this.f10540c = outputStream;
        this.f10538a = fVar;
        this.f10541d = mVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j2 = this.f10539b;
        if (j2 != -1) {
            this.f10538a.i(j2);
        }
        this.f10538a.m(this.f10541d.b());
        try {
            this.f10540c.close();
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10538a;
            fVar.n(this.f10541d.b());
            h.c(fVar);
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f10540c.flush();
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10538a;
            fVar.n(this.f10541d.b());
            h.c(fVar);
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        try {
            this.f10540c.write(i2);
            long j2 = this.f10539b + 1;
            this.f10539b = j2;
            this.f10538a.i(j2);
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10538a;
            fVar.n(this.f10541d.b());
            h.c(fVar);
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.f10540c.write(bArr);
            long length = this.f10539b + bArr.length;
            this.f10539b = length;
            this.f10538a.i(length);
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10538a;
            fVar.n(this.f10541d.b());
            h.c(fVar);
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        try {
            this.f10540c.write(bArr, i2, i3);
            long j2 = this.f10539b + i3;
            this.f10539b = j2;
            this.f10538a.i(j2);
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10538a;
            fVar.n(this.f10541d.b());
            h.c(fVar);
            throw e2;
        }
    }
}
