package okhttp3.internal.cache;

import cg.C1618g;
import cg.F;
import cg.n;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lcg/n;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FaultHidingSink extends n {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3343n f42519b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(F delegate, l lVar) {
        super(delegate);
        AbstractC3340k.e(delegate, "delegate");
        this.f42519b = (AbstractC3343n) lVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // cg.n, cg.F
    public final void E(C1618g source, long j8) throws EOFException {
        AbstractC3340k.e(source, "source");
        if (this.f42520c) {
            source.skip(j8);
            return;
        }
        try {
            super.E(source, j8);
        } catch (IOException e7) {
            this.f42520c = true;
            this.f42519b.invoke(e7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // cg.n, cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f42520c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e7) {
            this.f42520c = true;
            this.f42519b.invoke(e7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // cg.n, cg.F, java.io.Flushable
    public final void flush() {
        if (this.f42520c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e7) {
            this.f42520c = true;
            this.f42519b.invoke(e7);
        }
    }
}
