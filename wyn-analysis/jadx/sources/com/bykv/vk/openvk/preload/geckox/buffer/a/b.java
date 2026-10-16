package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f24368a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f24369b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private File f24370c;

    public b(File file) throws IOException {
        this.f24370c = file;
        file.getParentFile().mkdirs();
        try {
            this.f24368a = new RandomAccessFile(file, "rw");
        } catch (Exception e7) {
            CloseableUtils.close(this.f24368a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e7.getMessage(), e7);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f24369b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.f24368a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f24369b.get()) {
            throw new IOException("released!");
        }
        return this.f24368a.getFilePointer();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() throws IOException {
        if (this.f24369b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f24368a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f24370c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j8) throws IOException {
        if (this.f24369b.get()) {
            throw new IOException("released!");
        }
        if (j8 < 0) {
            j8 = 0;
        }
        this.f24368a.seek(j8);
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
        if (this.f24369b.get()) {
            throw new IOException("released!");
        }
        if (((int) j8) == j8) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j8)));
        }
        return this.f24368a.skipBytes(r0);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i5, int i10) throws IOException {
        int i11;
        if (!this.f24369b.get()) {
            if (bArr == null || i10 <= 0 || i5 < 0 || i5 >= bArr.length) {
                return 0;
            }
            if (i5 + i10 > bArr.length) {
                i10 = bArr.length - i5;
            }
            synchronized (this) {
                i11 = this.f24368a.read(bArr, i5, i10);
            }
            return i11;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i5, int i10) throws IOException {
        if (!this.f24369b.get()) {
            if (bArr == null || bArr.length == 0 || i10 <= 0 || i5 < 0 || i5 >= bArr.length) {
                return 0;
            }
            if (i5 + i10 > bArr.length) {
                i10 = bArr.length - i5;
            }
            synchronized (this) {
                this.f24368a.write(bArr, i5, i10);
            }
            return i10;
        }
        throw new IOException("released!");
    }
}
