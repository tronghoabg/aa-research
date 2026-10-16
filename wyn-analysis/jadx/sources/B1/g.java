package B1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends b {
    public g(byte[] bArr) {
        super(bArr);
        this.f1499a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void b(long j8) throws IOException {
        int i5 = this.f1500b;
        if (i5 > j8) {
            this.f1500b = 0;
            this.f1499a.reset();
        } else {
            j8 -= i5;
        }
        a((int) j8);
    }

    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1499a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
