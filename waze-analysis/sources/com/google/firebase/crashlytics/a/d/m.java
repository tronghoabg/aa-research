package com.google.firebase.crashlytics.a.d;

import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f9253b = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    int f9254a;

    /* renamed from: c, reason: collision with root package name */
    private final RandomAccessFile f9255c;

    /* renamed from: d, reason: collision with root package name */
    private int f9256d;

    /* renamed from: e, reason: collision with root package name */
    private j f9257e;

    /* renamed from: f, reason: collision with root package name */
    private j f9258f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f9259g;

    public m(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f9259g = bArr;
        if (!file.exists()) {
            File file2 = new File(String.valueOf(file.getPath()).concat(".tmp"));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                r(bArr2, 4096, 0, 0, 0);
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f9255c = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iK = k(bArr, 0);
        this.f9254a = iK;
        if (iK <= randomAccessFile2.length()) {
            this.f9256d = k(bArr, 4);
            int iK2 = k(bArr, 8);
            int iK3 = k(bArr, 12);
            this.f9257e = m(iK2);
            this.f9258f = m(iK3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f9254a + ", Actual length: " + randomAccessFile2.length());
    }

    private static int k(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + (bArr[i2 + 3] & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(int i2) {
        int i3 = this.f9254a;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private final j m(int i2) throws IOException {
        if (i2 == 0) {
            return j.f9247a;
        }
        RandomAccessFile randomAccessFile = this.f9255c;
        randomAccessFile.seek(i2);
        return new j(i2, randomAccessFile.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iL = l(i2);
        long j2 = iL;
        int i5 = iL + i4;
        int i6 = this.f9254a;
        RandomAccessFile randomAccessFile = this.f9255c;
        if (i5 <= i6) {
            randomAccessFile.seek(j2);
            randomAccessFile.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iL;
        randomAccessFile.seek(j2);
        randomAccessFile.readFully(bArr, i3, i7);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i3 + i7, i4 - i7);
    }

    private final void o(int i2) throws IOException {
        RandomAccessFile randomAccessFile = this.f9255c;
        randomAccessFile.setLength(i2);
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).force(true);
    }

    private final void p(int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = {i2, i3, i4, i5};
        byte[] bArr = this.f9259g;
        r(bArr, iArr);
        RandomAccessFile randomAccessFile = this.f9255c;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    private static void q(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void r(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            q(bArr, i2, iArr[i3]);
            i2 += 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(Object obj) {
        if (obj == null) {
            throw new NullPointerException("buffer");
        }
    }

    private final void t(int i2, byte[] bArr, int i3) throws IOException {
        int iL = l(i2);
        long j2 = iL;
        int i4 = iL + i3;
        int i5 = this.f9254a;
        RandomAccessFile randomAccessFile = this.f9255c;
        if (i4 <= i5) {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, 0, i3);
            return;
        }
        int i6 = i5 - iL;
        randomAccessFile.seek(j2);
        randomAccessFile.write(bArr, 0, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i6, i3 - i6);
    }

    public final int b() {
        if (this.f9256d == 0) {
            return 16;
        }
        j jVar = this.f9258f;
        int i2 = jVar.f9248b;
        int i3 = this.f9257e.f9248b;
        return i2 >= i3 ? (i2 - i3) + 4 + jVar.f9249c + 16 : (((i2 + 4) + jVar.f9249c) + this.f9254a) - i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f9255c.close();
    }

    public final synchronized void e() {
        p(4096, 0, 0, 0);
        this.f9256d = 0;
        j jVar = j.f9247a;
        this.f9257e = jVar;
        this.f9258f = jVar;
        if (this.f9254a > 4096) {
            o(4096);
        }
        this.f9254a = 4096;
    }

    public final synchronized void f(l lVar) {
        int iL = this.f9257e.f9248b;
        for (int i2 = 0; i2 < this.f9256d; i2++) {
            j jVarM = m(iL);
            k kVar = new k(this, jVarM);
            int i3 = jVarM.f9249c;
            lVar.a(kVar, i3);
            iL = l(jVarM.f9248b + 4 + i3);
        }
    }

    public final synchronized void g() {
        if (h()) {
            throw new NoSuchElementException();
        }
        if (this.f9256d == 1) {
            e();
            return;
        }
        j jVar = this.f9257e;
        int iL = l(jVar.f9248b + 4 + jVar.f9249c);
        byte[] bArr = this.f9259g;
        n(iL, bArr, 0, 4);
        int iK = k(bArr, 0);
        p(this.f9254a, this.f9256d - 1, iL, this.f9258f.f9248b);
        this.f9256d--;
        this.f9257e = new j(iL, iK);
    }

    public final synchronized boolean h() {
        return this.f9256d == 0;
    }

    public final synchronized void j(byte[] bArr, int i2) {
        int iL;
        s(bArr);
        if (i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 + 4;
        int iB = this.f9254a - b();
        if (iB < i3) {
            int i4 = this.f9254a;
            do {
                iB += i4;
                i4 += i4;
            } while (iB < i3);
            o(i4);
            j jVar = this.f9258f;
            int iL2 = l(jVar.f9248b + 4 + jVar.f9249c);
            if (iL2 < this.f9257e.f9248b) {
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.f9255c.getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.position(this.f9254a);
                long j2 = iL2 - 4;
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary.transferTo(16L, j2, fileChannelConvertMaybeLegacyFileChannelFromLibrary) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f9258f.f9248b;
            int i6 = this.f9257e.f9248b;
            if (i5 < i6) {
                int i7 = (this.f9254a + i5) - 16;
                p(i4, this.f9256d, i6, i7);
                this.f9258f = new j(i7, this.f9258f.f9249c);
            } else {
                p(i4, this.f9256d, i6, i5);
            }
            this.f9254a = i4;
        }
        boolean zH = h();
        if (zH) {
            iL = 16;
        } else {
            j jVar2 = this.f9258f;
            iL = l(jVar2.f9248b + 4 + jVar2.f9249c);
        }
        j jVar3 = new j(iL, i2);
        byte[] bArr2 = this.f9259g;
        q(bArr2, 0, i2);
        int i8 = jVar3.f9248b;
        t(i8, bArr2, 4);
        t(i8 + 4, bArr, i2);
        p(this.f9254a, this.f9256d + 1, zH ? i8 : this.f9257e.f9248b, i8);
        this.f9258f = jVar3;
        this.f9256d++;
        if (zH) {
            this.f9257e = jVar3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f9254a);
        sb.append(", size=");
        sb.append(this.f9256d);
        sb.append(", first=");
        sb.append(this.f9257e);
        sb.append(", last=");
        sb.append(this.f9258f);
        sb.append(", element lengths=[");
        try {
            f(new i(this, sb));
        } catch (IOException e2) {
            f9253b.logp(Level.WARNING, "com.google.firebase.crashlytics.internal.metadata.QueueFile", "toString", "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}
