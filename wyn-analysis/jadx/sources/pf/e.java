package Pf;

import A7.AbstractC0279p0;
import cb.AbstractC1593a;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final c f9464a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9465b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9466c = new a();

    public e(c cVar) {
        this.f9464a = cVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f9465b) {
            return;
        }
        this.f9465b = true;
        this.f9464a.f9462e = true;
        a aVar = this.f9466c;
        aVar.skip(aVar.f9456c);
    }

    @Override // Pf.i
    public final boolean exhausted() {
        if (this.f9465b) {
            throw new IllegalStateException("Source is closed.");
        }
        a aVar = this.f9466c;
        return aVar.exhausted() && this.f9464a.j(aVar, 8192L) == -1;
    }

    @Override // Pf.i
    public final a getBuffer() {
        return this.f9466c;
    }

    @Override // Pf.d
    public final long j(a sink, long j8) {
        AbstractC3340k.e(sink, "sink");
        if (this.f9465b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        a aVar = this.f9466c;
        if (aVar.f9456c == 0 && this.f9464a.j(aVar, 8192L) == -1) {
            return -1L;
        }
        return aVar.j(sink, Math.min(j8, aVar.f9456c));
    }

    @Override // Pf.i
    public final byte readByte() throws EOFException {
        require(1L);
        return this.f9466c.readByte();
    }

    @Override // Pf.i
    public final boolean request(long j8) {
        a aVar;
        if (this.f9465b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        do {
            aVar = this.f9466c;
            if (aVar.f9456c >= j8) {
                return true;
            }
        } while (this.f9464a.j(aVar, 8192L) != -1);
        return false;
    }

    @Override // Pf.i
    public final void require(long j8) throws EOFException {
        if (!request(j8)) {
            throw new EOFException(AbstractC1593a.h(j8, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    public final String toString() {
        return "buffered(" + this.f9464a + ')';
    }
}
