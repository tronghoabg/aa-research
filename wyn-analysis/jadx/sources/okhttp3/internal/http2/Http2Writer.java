package okhttp3.internal.http2;

import cg.C1609A;
import cg.C1618g;
import com.google.android.gms.common.api.f;
import ff.m;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Writer implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f42837f;

    /* renamed from: a, reason: collision with root package name */
    public final C1609A f42838a;

    /* renamed from: b, reason: collision with root package name */
    public final C1618g f42839b;

    /* renamed from: c, reason: collision with root package name */
    public int f42840c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42841d;

    /* renamed from: e, reason: collision with root package name */
    public final Hpack.Writer f42842e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        f42837f = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(C1609A sink) {
        AbstractC3340k.e(sink, "sink");
        this.f42838a = sink;
        C1618g c1618g = new C1618g();
        this.f42839b = c1618g;
        this.f42840c = com.applovin.shadow.okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE;
        this.f42842e = new Hpack.Writer(c1618g);
    }

    public final synchronized void a(Settings peerSettings) {
        try {
            AbstractC3340k.e(peerSettings, "peerSettings");
            if (this.f42841d) {
                throw new IOException("closed");
            }
            int i5 = this.f42840c;
            int i10 = peerSettings.f42852a;
            if ((i10 & 32) != 0) {
                i5 = peerSettings.f42853b[5];
            }
            this.f42840c = i5;
            if (((i10 & 2) != 0 ? peerSettings.f42853b[1] : -1) != -1) {
                Hpack.Writer writer = this.f42842e;
                int i11 = (i10 & 2) != 0 ? peerSettings.f42853b[1] : -1;
                writer.getClass();
                int iMin = Math.min(i11, com.applovin.shadow.okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE);
                int i12 = writer.f42718d;
                if (i12 != iMin) {
                    if (iMin < i12) {
                        writer.f42716b = Math.min(writer.f42716b, iMin);
                    }
                    writer.f42717c = true;
                    writer.f42718d = iMin;
                    int i13 = writer.f42722h;
                    if (iMin < i13) {
                        if (iMin == 0) {
                            Header[] headerArr = writer.f42719e;
                            m.o0(headerArr, null, 0, headerArr.length);
                            writer.f42720f = writer.f42719e.length - 1;
                            writer.f42721g = 0;
                            writer.f42722h = 0;
                        } else {
                            writer.a(i13 - iMin);
                        }
                    }
                }
            }
            d(0, 0, 4, 1);
            this.f42838a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z2, int i5, C1618g c1618g, int i10) {
        if (this.f42841d) {
            throw new IOException("closed");
        }
        d(i5, i10, 0, z2 ? 1 : 0);
        if (i10 > 0) {
            AbstractC3340k.b(c1618g);
            this.f42838a.E(c1618g, i10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f42841d = true;
        this.f42838a.close();
    }

    public final void d(int i5, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f42837f;
        if (logger.isLoggable(level)) {
            Http2.f42723a.getClass();
            logger.fine(Http2.a(false, i5, i10, i11, i12));
        }
        if (i10 > this.f42840c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f42840c + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i5) != 0) {
            throw new IllegalArgumentException(AbstractC3340k.k(Integer.valueOf(i5), "reserved bit set: ").toString());
        }
        byte[] bArr = Util.f42438a;
        C1609A c1609a = this.f42838a;
        AbstractC3340k.e(c1609a, "<this>");
        c1609a.writeByte((i10 >>> 16) & 255);
        c1609a.writeByte((i10 >>> 8) & 255);
        c1609a.writeByte(i10 & 255);
        c1609a.writeByte(i11 & 255);
        c1609a.writeByte(i12 & 255);
        c1609a.d(i5 & f.API_PRIORITY_OTHER);
    }

    public final synchronized void flush() {
        if (this.f42841d) {
            throw new IOException("closed");
        }
        this.f42838a.flush();
    }

    public final synchronized void h(int i5, ErrorCode errorCode, byte[] bArr) {
        if (this.f42841d) {
            throw new IOException("closed");
        }
        if (errorCode.f42695a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        d(0, bArr.length + 8, 7, 0);
        this.f42838a.d(i5);
        this.f42838a.d(errorCode.f42695a);
        if (bArr.length != 0) {
            this.f42838a.write(bArr);
        }
        this.f42838a.flush();
    }

    public final synchronized void i(boolean z2, int i5, ArrayList arrayList) {
        if (this.f42841d) {
            throw new IOException("closed");
        }
        this.f42842e.d(arrayList);
        long j8 = this.f42839b.f19902b;
        long jMin = Math.min(this.f42840c, j8);
        int i10 = j8 == jMin ? 4 : 0;
        if (z2) {
            i10 |= 1;
        }
        d(i5, (int) jMin, 1, i10);
        this.f42838a.E(this.f42839b, jMin);
        if (j8 > jMin) {
            long j10 = j8 - jMin;
            while (j10 > 0) {
                long jMin2 = Math.min(this.f42840c, j10);
                j10 -= jMin2;
                d(i5, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                this.f42838a.E(this.f42839b, jMin2);
            }
        }
    }

    public final synchronized void o(boolean z2, int i5, int i10) {
        if (this.f42841d) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z2 ? 1 : 0);
        this.f42838a.d(i5);
        this.f42838a.d(i10);
        this.f42838a.flush();
    }

    public final synchronized void w(int i5, ErrorCode errorCode) {
        if (this.f42841d) {
            throw new IOException("closed");
        }
        if (errorCode.f42695a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(i5, 4, 3, 0);
        this.f42838a.d(errorCode.f42695a);
        this.f42838a.flush();
    }

    public final synchronized void y(Settings settings) {
        try {
            AbstractC3340k.e(settings, "settings");
            if (this.f42841d) {
                throw new IOException("closed");
            }
            d(0, Integer.bitCount(settings.f42852a) * 6, 4, 0);
            int i5 = 0;
            while (i5 < 10) {
                int i10 = i5 + 1;
                boolean z2 = true;
                if (((1 << i5) & settings.f42852a) == 0) {
                    z2 = false;
                }
                if (z2) {
                    this.f42838a.h(i5 != 4 ? i5 != 7 ? i5 : 4 : 3);
                    this.f42838a.d(settings.f42853b[i5]);
                }
                i5 = i10;
            }
            this.f42838a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void z(int i5, long j8) {
        if (this.f42841d) {
            throw new IOException("closed");
        }
        if (j8 == 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC3340k.k(Long.valueOf(j8), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        d(i5, 4, 8, 0);
        this.f42838a.d((int) j8);
        this.f42838a.flush();
    }
}
