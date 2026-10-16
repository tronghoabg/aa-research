package T8;

import E4.F;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
public final class k implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f11801g = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f11802a;

    /* renamed from: b, reason: collision with root package name */
    public int f11803b;

    /* renamed from: c, reason: collision with root package name */
    public int f11804c;

    /* renamed from: d, reason: collision with root package name */
    public h f11805d;

    /* renamed from: e, reason: collision with root package name */
    public h f11806e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f11807f;

    public k(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f11807f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i5 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    Q(i5, iArr[i10], bArr2);
                    i5 += 4;
                }
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
        this.f11802a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iW = w(0, bArr);
        this.f11803b = iW;
        if (iW > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f11803b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f11804c = w(4, bArr);
        int iW2 = w(8, bArr);
        int iW3 = w(12, bArr);
        this.f11805d = o(iW2);
        this.f11806e = o(iW3);
    }

    public static void Q(int i5, int i10, byte[] bArr) {
        bArr[i5] = (byte) (i10 >> 24);
        bArr[i5 + 1] = (byte) (i10 >> 16);
        bArr[i5 + 2] = (byte) (i10 >> 8);
        bArr[i5 + 3] = (byte) i10;
    }

    public static int w(int i5, byte[] bArr) {
        return ((bArr[i5] & ForkServer.ERROR) << 24) + ((bArr[i5 + 1] & ForkServer.ERROR) << 16) + ((bArr[i5 + 2] & ForkServer.ERROR) << 8) + (bArr[i5 + 3] & ForkServer.ERROR);
    }

    public final void B(int i5, int i10, byte[] bArr) throws IOException {
        int iJ = J(i5);
        int i11 = iJ + i10;
        int i12 = this.f11803b;
        RandomAccessFile randomAccessFile = this.f11802a;
        if (i11 <= i12) {
            randomAccessFile.seek(iJ);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - iJ;
        randomAccessFile.seek(iJ);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int D() {
        if (this.f11804c == 0) {
            return 16;
        }
        h hVar = this.f11806e;
        int i5 = hVar.f11796a;
        int i10 = this.f11805d.f11796a;
        return i5 >= i10 ? (i5 - i10) + 4 + hVar.f11797b + 16 : (((i5 + 4) + hVar.f11797b) + this.f11803b) - i10;
    }

    public final int J(int i5) {
        int i10 = this.f11803b;
        return i5 < i10 ? i5 : (i5 + 16) - i10;
    }

    public final void P(int i5, int i10, int i11, int i12) throws IOException {
        int[] iArr = {i5, i10, i11, i12};
        byte[] bArr = this.f11807f;
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            Q(i13, iArr[i14], bArr);
            i13 += 4;
        }
        RandomAccessFile randomAccessFile = this.f11802a;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final void a(byte[] bArr) {
        int iJ;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    d(length);
                    boolean zI = i();
                    if (zI) {
                        iJ = 16;
                    } else {
                        h hVar = this.f11806e;
                        iJ = J(hVar.f11796a + 4 + hVar.f11797b);
                    }
                    h hVar2 = new h(iJ, length);
                    Q(0, length, this.f11807f);
                    B(iJ, 4, this.f11807f);
                    B(iJ + 4, length, bArr);
                    P(this.f11803b, this.f11804c + 1, zI ? iJ : this.f11805d.f11796a, iJ);
                    this.f11806e = hVar2;
                    this.f11804c++;
                    if (zI) {
                        this.f11805d = hVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void b() {
        P(4096, 0, 0, 0);
        this.f11804c = 0;
        h hVar = h.f11795c;
        this.f11805d = hVar;
        this.f11806e = hVar;
        if (this.f11803b > 4096) {
            RandomAccessFile randomAccessFile = this.f11802a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f11803b = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f11802a.close();
    }

    public final void d(int i5) throws IOException {
        int i10 = i5 + 4;
        int iD = this.f11803b - D();
        if (iD >= i10) {
            return;
        }
        int i11 = this.f11803b;
        do {
            iD += i11;
            i11 <<= 1;
        } while (iD < i10);
        RandomAccessFile randomAccessFile = this.f11802a;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        h hVar = this.f11806e;
        int iJ = J(hVar.f11796a + 4 + hVar.f11797b);
        if (iJ < this.f11805d.f11796a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f11803b);
            long j8 = iJ - 4;
            if (channel.transferTo(16L, j8, channel) != j8) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f11806e.f11796a;
        int i13 = this.f11805d.f11796a;
        if (i12 < i13) {
            int i14 = (this.f11803b + i12) - 16;
            P(i11, this.f11804c, i13, i14);
            this.f11806e = new h(i14, this.f11806e.f11797b);
        } else {
            P(i11, this.f11804c, i13, i12);
        }
        this.f11803b = i11;
    }

    public final synchronized void h(j jVar) {
        int iJ = this.f11805d.f11796a;
        for (int i5 = 0; i5 < this.f11804c; i5++) {
            h hVarO = o(iJ);
            jVar.a(new i(this, hVarO), hVarO.f11797b);
            iJ = J(hVarO.f11796a + 4 + hVarO.f11797b);
        }
    }

    public final synchronized boolean i() {
        return this.f11804c == 0;
    }

    public final h o(int i5) throws IOException {
        if (i5 == 0) {
            return h.f11795c;
        }
        RandomAccessFile randomAccessFile = this.f11802a;
        randomAccessFile.seek(i5);
        return new h(i5, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f11803b);
        sb2.append(", size=");
        sb2.append(this.f11804c);
        sb2.append(", first=");
        sb2.append(this.f11805d);
        sb2.append(", last=");
        sb2.append(this.f11806e);
        sb2.append(", element lengths=[");
        try {
            h(new F(sb2, 5));
        } catch (IOException e7) {
            f11801g.log(Level.WARNING, "read error", (Throwable) e7);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final synchronized void y() {
        try {
            if (i()) {
                throw new NoSuchElementException();
            }
            if (this.f11804c == 1) {
                b();
            } else {
                h hVar = this.f11805d;
                int iJ = J(hVar.f11796a + 4 + hVar.f11797b);
                z(iJ, this.f11807f, 0, 4);
                int iW = w(0, this.f11807f);
                P(this.f11803b, this.f11804c - 1, iJ, this.f11806e.f11796a);
                this.f11804c--;
                this.f11805d = new h(iJ, iW);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void z(int i5, byte[] bArr, int i10, int i11) throws IOException {
        int iJ = J(i5);
        int i12 = iJ + i11;
        int i13 = this.f11803b;
        RandomAccessFile randomAccessFile = this.f11802a;
        if (i12 <= i13) {
            randomAccessFile.seek(iJ);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - iJ;
        randomAccessFile.seek(iJ);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }
}
