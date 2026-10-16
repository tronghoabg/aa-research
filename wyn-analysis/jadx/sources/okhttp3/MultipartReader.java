package okhttp3;

import ab.b;
import cg.AbstractC1613b;
import cg.C1618g;
import cg.C1621j;
import cg.H;
import cg.J;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.utils.StringUtils;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultipartReader implements Closeable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lcg/H;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class PartSource implements H {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // cg.H
        public final long read(C1618g sink, long j8) {
            AbstractC3340k.e(sink, "sink");
            if (j8 >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(AbstractC3340k.k(Long.valueOf(j8), "byteCount < 0: ").toString());
        }

        @Override // cg.H
        public final J timeout() {
            return null;
        }
    }

    static {
        new Companion(0);
        C1621j c1621j = C1621j.f19903d;
        AbstractC1613b.h(b.c("\r\n"), b.c("--"), b.c(StringUtils.SPACE), b.c("\t"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
