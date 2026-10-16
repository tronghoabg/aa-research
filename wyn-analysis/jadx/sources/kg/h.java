package kg;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.util.Objects;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes5.dex */
public final class h extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f39731e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f39732a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39733b;

    /* renamed from: c, reason: collision with root package name */
    public int f39734c;

    /* renamed from: d, reason: collision with root package name */
    public int f39735d;

    public h(byte[] bArr) {
        int length = bArr.length;
        this.f39732a = bArr;
        this.f39733b = length;
        this.f39734c = 0;
        this.f39735d = 0;
    }

    public static void a(int i5, String str) {
        if (i5 < 0) {
            throw new IllegalArgumentException(str.concat(" cannot be negative"));
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        int i5 = this.f39734c;
        int i10 = this.f39733b;
        if (i5 < i10) {
            return i10 - i5;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        this.f39735d = this.f39734c;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i5 = this.f39734c;
        if (i5 >= this.f39733b) {
            return -1;
        }
        this.f39734c = i5 + 1;
        return this.f39732a[i5] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f39734c = this.f39735d;
    }

    @Override // java.io.InputStream
    public final long skip(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i5 = this.f39734c;
        long j10 = this.f39733b - i5;
        if (j8 < j10) {
            j10 = j8;
        }
        long j11 = (int) j8;
        if (j8 != j11) {
            throw new ArithmeticException();
        }
        long j12 = i5 + j11;
        int i10 = (int) j12;
        if (j12 != i10) {
            throw new ArithmeticException();
        }
        this.f39734c = i10;
        return j10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        Objects.requireNonNull(bArr, "dest");
        if (i5 >= 0 && i10 >= 0 && i5 + i10 <= bArr.length) {
            int i11 = this.f39734c;
            int i12 = this.f39733b;
            if (i11 >= i12) {
                return -1;
            }
            int i13 = i12 - i11;
            if (i10 >= i13) {
                i10 = i13;
            }
            if (i10 <= 0) {
                return 0;
            }
            System.arraycopy(this.f39732a, i11, bArr, i5, i10);
            this.f39734c += i10;
            return i10;
        }
        throw new IndexOutOfBoundsException();
    }

    public h(byte[] bArr, int i5) {
        a(0, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        a(i5, "length");
        Objects.requireNonNull(bArr, JsonStorageKeyNames.DATA_KEY);
        this.f39732a = bArr;
        a(0, "defaultValue");
        this.f39733b = Math.min(Math.min(0, bArr.length > 0 ? bArr.length : 0) + i5, bArr.length);
        a(0, "defaultValue");
        this.f39734c = Math.min(0, bArr.length > 0 ? bArr.length : 0);
        a(0, "defaultValue");
        this.f39735d = Math.min(0, bArr.length > 0 ? bArr.length : 0);
    }
}
