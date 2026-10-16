package com.bumptech.glide.g;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final Queue f2898a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f2899b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f2900c;

    static {
        int i2 = r.f2918a;
        f2898a = new ArrayDeque(0);
    }

    f() {
    }

    public static f a(InputStream inputStream) {
        f fVar;
        Queue queue = f2898a;
        synchronized (queue) {
            fVar = (f) queue.poll();
        }
        if (fVar == null) {
            fVar = new f();
        }
        fVar.f2899b = inputStream;
        return fVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2899b.available();
    }

    public final IOException b() {
        return this.f2900c;
    }

    public final void c() {
        this.f2900c = null;
        this.f2899b = null;
        Queue queue = f2898a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2899b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        this.f2899b.mark(i2);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f2899b.read();
        } catch (IOException e2) {
            this.f2900c = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f2899b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        try {
            return this.f2899b.skip(j2);
        } catch (IOException e2) {
            this.f2900c = e2;
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
            return this.f2899b.read(bArr);
        } catch (IOException e2) {
            this.f2900c = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            return this.f2899b.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f2900c = e2;
            throw e2;
        }
    }
}
