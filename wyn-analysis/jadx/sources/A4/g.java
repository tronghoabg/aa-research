package a4;

import B.F;
import cg.C1618g;
import cg.n;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g extends n {

    /* renamed from: b, reason: collision with root package name */
    public final F f17372b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17373c;

    public g(cg.F f10, F f11) {
        super(f10);
        this.f17372b = f11;
    }

    @Override // cg.n, cg.F
    public final void E(C1618g c1618g, long j8) throws EOFException {
        if (this.f17373c) {
            c1618g.skip(j8);
            return;
        }
        try {
            super.E(c1618g, j8);
        } catch (IOException e7) {
            this.f17373c = true;
            this.f17372b.invoke(e7);
        }
    }

    @Override // cg.n, cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e7) {
            this.f17373c = true;
            this.f17372b.invoke(e7);
        }
    }

    @Override // cg.n, cg.F, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e7) {
            this.f17373c = true;
            this.f17372b.invoke(e7);
        }
    }
}
