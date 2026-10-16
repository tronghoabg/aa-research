package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private long f24371a;

    /* renamed from: b, reason: collision with root package name */
    private long f24372b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f24373c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f24374d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private File f24375e;

    public c(long j8, File file) throws IOException {
        this.f24371a = j8;
        this.f24375e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f24373c = randomAccessFile;
            randomAccessFile.setLength(j8);
        } catch (Exception e7) {
            CloseableUtils.close(this.f24373c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e7.getMessage(), e7);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f24374d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f24371a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f24374d.get()) {
            throw new IOException("released!");
        }
        return this.f24372b;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() throws IOException {
        if (this.f24374d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f24373c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f24375e;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e A[PHI: r0
  0x000e: PHI (r0v5 long) = (r0v2 long), (r0v3 long) binds: [B:5:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f24374d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.f24371a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.f24372b = r4
            java.io.RandomAccessFile r0 = r3.f24373c
            r0.seek(r4)
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.buffer.a.c.b(long):void");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i5) throws IOException {
        a(new byte[]{(byte) i5});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j8) throws IOException {
        int iSkipBytes;
        if (this.f24374d.get()) {
            throw new IOException("released!");
        }
        int i5 = (int) j8;
        if (i5 == j8) {
            iSkipBytes = this.f24373c.skipBytes(i5);
            this.f24372b = this.f24373c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j8)));
        }
        return iSkipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i5, int i10) throws IOException {
        if (!this.f24374d.get()) {
            if (bArr == null || i10 <= 0 || i5 < 0 || i5 >= bArr.length) {
                return 0;
            }
            if (i5 + i10 > bArr.length) {
                i10 = bArr.length - i5;
            }
            synchronized (this) {
                try {
                    long j8 = this.f24372b;
                    long j10 = this.f24371a;
                    if (j8 == j10) {
                        return -1;
                    }
                    if (i10 + j8 > j10) {
                        i10 = (int) (j10 - j8);
                    }
                    int i11 = this.f24373c.read(bArr, i5, i10);
                    if (i11 == -1) {
                        return -1;
                    }
                    this.f24372b += i11;
                    return i11;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i5, int i10) throws IOException {
        if (!this.f24374d.get()) {
            if (bArr == null || bArr.length == 0 || i10 <= 0 || i5 < 0 || i5 >= bArr.length) {
                return 0;
            }
            if (i5 + i10 > bArr.length) {
                i10 = bArr.length - i5;
            }
            synchronized (this) {
                try {
                    long j8 = this.f24372b;
                    long j10 = this.f24371a;
                    if (j8 == j10) {
                        return 0;
                    }
                    if (i10 + j8 > j10) {
                        i10 = (int) (j10 - j8);
                    }
                    this.f24373c.write(bArr, i5, i10);
                    this.f24372b += i10;
                    return i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }
}
