package com.bumptech.glide.a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f2732a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f2733b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f2734c;

    /* renamed from: d, reason: collision with root package name */
    private int f2735d;

    /* renamed from: e, reason: collision with root package name */
    private int f2736e;

    h(InputStream inputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(i.f2737a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f2732a = inputStream;
        this.f2733b = charset;
        this.f2734c = new byte[8192];
    }

    private final void d() throws IOException {
        byte[] bArr = this.f2734c;
        int length = bArr.length;
        int i2 = this.f2732a.read(bArr, 0, 8192);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.f2735d = 0;
        this.f2736e = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.String a() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f2732a
            monitor-enter(r0)
            byte[] r1 = r7.f2734c     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L7e
            int r1 = r7.f2735d     // Catch: java.lang.Throwable -> L86
            int r2 = r7.f2736e     // Catch: java.lang.Throwable -> L86
            if (r1 < r2) goto L10
            r7.d()     // Catch: java.lang.Throwable -> L86
        L10:
            int r1 = r7.f2735d     // Catch: java.lang.Throwable -> L86
        L12:
            int r2 = r7.f2736e     // Catch: java.lang.Throwable -> L86
            r3 = 10
            if (r1 == r2) goto L40
            byte[] r2 = r7.f2734c     // Catch: java.lang.Throwable -> L86
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L86
            if (r4 != r3) goto L3d
            int r3 = r7.f2735d     // Catch: java.lang.Throwable -> L86
            if (r1 == r3) goto L2a
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L86
            r6 = 13
            if (r5 == r6) goto L2b
        L2a:
            r4 = r1
        L2b:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L86
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f2733b     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L86
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L86
            int r1 = r1 + 1
            r7.f2735d = r1     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return r5
        L3d:
            int r1 = r1 + 1
            goto L12
        L40:
            com.bumptech.glide.a.g r1 = new com.bumptech.glide.a.g     // Catch: java.lang.Throwable -> L86
            int r2 = r7.f2736e     // Catch: java.lang.Throwable -> L86
            int r4 = r7.f2735d     // Catch: java.lang.Throwable -> L86
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L86
        L4c:
            byte[] r2 = r7.f2734c     // Catch: java.lang.Throwable -> L86
            int r4 = r7.f2735d     // Catch: java.lang.Throwable -> L86
            int r5 = r7.f2736e     // Catch: java.lang.Throwable -> L86
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L86
            r2 = -1
            r7.f2736e = r2     // Catch: java.lang.Throwable -> L86
            r7.d()     // Catch: java.lang.Throwable -> L86
            int r2 = r7.f2735d     // Catch: java.lang.Throwable -> L86
        L5e:
            int r4 = r7.f2736e     // Catch: java.lang.Throwable -> L86
            if (r2 == r4) goto L4c
            byte[] r4 = r7.f2734c     // Catch: java.lang.Throwable -> L86
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L86
            if (r5 != r3) goto L7b
            int r3 = r7.f2735d     // Catch: java.lang.Throwable -> L86
            if (r2 == r3) goto L71
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L86
        L71:
            int r2 = r2 + 1
            r7.f2735d = r2     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return r7
        L7b:
            int r2 = r2 + 1
            goto L5e
        L7e:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "LineReader is closed"
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L86
            throw r7     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.h.a():java.lang.String");
    }

    final boolean c() {
        return this.f2736e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f2732a;
        synchronized (inputStream) {
            if (this.f2734c != null) {
                this.f2734c = null;
                inputStream.close();
            }
        }
    }
}
