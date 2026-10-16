package L4;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public InputStream f6899a;

    public g(InputStream inputStream) {
        this.f6899a = inputStream;
    }

    public InputStream a() {
        InputStream inputStream = this.f6899a;
        this.f6899a = null;
        return inputStream;
    }

    @Override // L4.f
    public int e() {
        return (g() << 8) | g();
    }

    @Override // L4.f
    public short g() throws IOException {
        int i5 = this.f6899a.read();
        if (i5 != -1) {
            return (short) i5;
        }
        throw new e();
    }

    @Override // L4.f
    public long skip(long j8) throws IOException {
        if (j8 < 0) {
            return 0L;
        }
        long j10 = j8;
        while (j10 > 0) {
            InputStream inputStream = this.f6899a;
            long jSkip = inputStream.skip(j10);
            if (jSkip > 0) {
                j10 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j10--;
            }
        }
        return j8 - j10;
    }
}
