package defpackage;

import j$.time.Duration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes2.dex */
public final class pul extends UploadDataProvider {
    public final byte[] a;
    private final pwz b;
    private final tmb c;
    private int d = 0;

    public pul(ByteArrayOutputStream byteArrayOutputStream, pwz pwzVar, tmb tmbVar) {
        this.a = byteArrayOutputStream.toByteArray();
        this.b = pwzVar;
        this.c = tmbVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() throws IOException {
        return this.a.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        vaq.d();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = this.a;
        int length = bArr.length;
        int iMin = Math.min(iRemaining, length - this.d);
        if (this.d == 0) {
            this.b.c(Duration.ofMillis(this.c.a()));
        }
        byteBuffer.put(bArr, this.d, iMin);
        int i = this.d + iMin;
        this.d = i;
        if (i == length) {
            this.b.e(Duration.ofMillis(this.c.a()));
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.d = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
