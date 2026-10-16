package okhttp3.internal.http2;

import R8.v;
import cg.C1610B;
import cg.C1618g;
import cg.H;
import cg.J;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;
import org.apache.tika.fork.ForkServer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f42802d = new Companion(0);

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f42803e;

    /* renamed from: a, reason: collision with root package name */
    public final C1610B f42804a;

    /* renamed from: b, reason: collision with root package name */
    public final ContinuationSource f42805b;

    /* renamed from: c, reason: collision with root package name */
    public final Hpack.Reader f42806c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static int a(int i5, int i10, int i11) throws IOException {
            if ((i10 & 8) != 0) {
                i5--;
            }
            if (i11 <= i5) {
                return i5 - i11;
            }
            throw new IOException(v.e(i11, i5, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lcg/H;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ContinuationSource implements H {

        /* renamed from: a, reason: collision with root package name */
        public final C1610B f42807a;

        /* renamed from: b, reason: collision with root package name */
        public int f42808b;

        /* renamed from: c, reason: collision with root package name */
        public int f42809c;

        /* renamed from: d, reason: collision with root package name */
        public int f42810d;

        /* renamed from: e, reason: collision with root package name */
        public int f42811e;

        /* renamed from: f, reason: collision with root package name */
        public int f42812f;

        public ContinuationSource(C1610B source) {
            AbstractC3340k.e(source, "source");
            this.f42807a = source;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // cg.H
        public final long read(C1618g sink, long j8) throws IOException {
            int i5;
            int i10;
            AbstractC3340k.e(sink, "sink");
            do {
                int i11 = this.f42811e;
                C1610B c1610b = this.f42807a;
                if (i11 == 0) {
                    c1610b.skip(this.f42812f);
                    this.f42812f = 0;
                    if ((this.f42809c & 4) == 0) {
                        i5 = this.f42810d;
                        int iS = Util.s(c1610b);
                        this.f42811e = iS;
                        this.f42808b = iS;
                        int i12 = c1610b.readByte() & ForkServer.ERROR;
                        this.f42809c = c1610b.readByte() & ForkServer.ERROR;
                        Http2Reader.f42802d.getClass();
                        Logger logger = Http2Reader.f42803e;
                        if (logger.isLoggable(Level.FINE)) {
                            Http2 http2 = Http2.f42723a;
                            int i13 = this.f42810d;
                            int i14 = this.f42808b;
                            int i15 = this.f42809c;
                            http2.getClass();
                            logger.fine(Http2.a(true, i13, i14, i12, i15));
                        }
                        i10 = c1610b.readInt() & f.API_PRIORITY_OTHER;
                        this.f42810d = i10;
                        if (i12 != 9) {
                            throw new IOException(i12 + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long j10 = c1610b.read(sink, Math.min(j8, i11));
                    if (j10 != -1) {
                        this.f42811e -= (int) j10;
                        return j10;
                    }
                }
                return -1L;
            } while (i10 == i5);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // cg.H
        public final J timeout() {
            return this.f42807a.f19863a.timeout();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        AbstractC3340k.d(logger, "getLogger(Http2::class.java.name)");
        f42803e = logger;
    }

    public Http2Reader(C1610B source) {
        AbstractC3340k.e(source, "source");
        this.f42804a = source;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f42805b = continuationSource;
        this.f42806c = new Hpack.Reader(continuationSource);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ed, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.AbstractC3340k.k(java.lang.Integer.valueOf(r11), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r22, final okhttp3.internal.http2.Http2Connection.ReaderRunnable r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.a(boolean, okhttp3.internal.http2.Http2Connection$ReaderRunnable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.AbstractC3340k.k(java.lang.Integer.valueOf(r8), "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(int r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.b(int, int, int, int):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42804a.close();
    }

    public final void d(Http2Connection.ReaderRunnable readerRunnable, int i5) throws EOFException {
        C1610B c1610b = this.f42804a;
        c1610b.readInt();
        c1610b.readByte();
        byte[] bArr = Util.f42438a;
    }
}
