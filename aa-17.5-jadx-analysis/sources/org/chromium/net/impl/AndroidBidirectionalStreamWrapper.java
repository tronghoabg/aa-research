package org.chromium.net.impl;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* loaded from: classes2.dex */
class AndroidBidirectionalStreamWrapper extends ExperimentalBidirectionalStream {
    private final BidirectionalStream a;
    private final AndroidHttpEngineWrapper b;
    private final String c;
    private final Collection d;

    public AndroidBidirectionalStreamWrapper(BidirectionalStream bidirectionalStream, AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection<Object> collection) {
        this.a = bidirectionalStream;
        this.b = androidHttpEngineWrapper;
        this.c = str;
        this.d = collection;
    }

    final void a(int i, AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapper, CronetException cronetException) {
        AndroidRequestFinishedInfoWrapper.a(this.b, this.c, this.d, null, i, androidUrlResponseInfoWrapper, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.a.write(byteBuffer, z);
    }
}
