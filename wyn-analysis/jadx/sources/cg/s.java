package cg;

import A7.AbstractC0279p0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class s implements H {

    /* renamed from: a, reason: collision with root package name */
    public final C1610B f19926a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f19927b;

    /* renamed from: c, reason: collision with root package name */
    public int f19928c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19929d;

    public s(C1610B c1610b, Inflater inflater) {
        this.f19926a = c1610b;
        this.f19927b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f19929d) {
            return;
        }
        this.f19927b.end();
        this.f19929d = true;
        this.f19926a.close();
    }

    @Override // cg.H
    public final long read(C1618g sink, long j8) throws DataFormatException, IOException {
        C1610B c1610b;
        long j10;
        AbstractC3340k.e(sink, "sink");
        do {
            Inflater inflater = this.f19927b;
            if (j8 < 0) {
                throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
            }
            if (this.f19929d) {
                throw new IllegalStateException("closed");
            }
            c1610b = this.f19926a;
            if (j8 == 0) {
                j10 = 0;
            } else {
                try {
                    C1611C c1611cP = sink.P(1);
                    int iMin = (int) Math.min(j8, 8192 - c1611cP.f19868c);
                    if (inflater.needsInput() && !c1610b.exhausted()) {
                        C1611C c1611c = c1610b.f19864b.f19901a;
                        AbstractC3340k.b(c1611c);
                        int i5 = c1611c.f19868c;
                        int i10 = c1611c.f19867b;
                        int i11 = i5 - i10;
                        this.f19928c = i11;
                        inflater.setInput(c1611c.f19866a, i10, i11);
                    }
                    int iInflate = inflater.inflate(c1611cP.f19866a, c1611cP.f19868c, iMin);
                    int i12 = this.f19928c;
                    if (i12 != 0) {
                        int remaining = i12 - inflater.getRemaining();
                        this.f19928c -= remaining;
                        c1610b.skip(remaining);
                    }
                    if (iInflate > 0) {
                        c1611cP.f19868c += iInflate;
                        j10 = iInflate;
                        sink.f19902b += j10;
                    } else {
                        if (c1611cP.f19867b == c1611cP.f19868c) {
                            sink.f19901a = c1611cP.a();
                            D.a(c1611cP);
                        }
                        j10 = 0;
                    }
                } catch (DataFormatException e7) {
                    throw new IOException(e7);
                }
            }
            if (j10 > 0) {
                return j10;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!c1610b.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // cg.H
    public final J timeout() {
        return this.f19926a.f19863a.timeout();
    }
}
