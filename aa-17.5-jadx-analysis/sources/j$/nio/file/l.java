package j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class l implements Iterator, Closeable {
    public final q a;
    public o b;

    public l(Path path, FileVisitOption... fileVisitOptionArr) throws IOException {
        q qVar = new q(Arrays.asList(fileVisitOptionArr));
        this.a = qVar;
        if (qVar.d) {
            throw new IllegalStateException("Closed");
        }
        o oVarC = qVar.c(path, false);
        this.b = oVarC;
        IOException iOException = oVarC.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void a() throws IOException {
        if (this.b == null) {
            q qVar = this.a;
            for (o oVarB = qVar.b(); oVarB != null; oVarB = qVar.b()) {
                IOException iOException = oVarB.d;
                if (iOException != null) {
                    throw new UncheckedIOException(iOException);
                }
                if (oVarB.a != p.END_DIRECTORY) {
                    this.b = oVarB;
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.a.d) {
            throw new IllegalStateException();
        }
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        if (this.a.d) {
            throw new IllegalStateException();
        }
        a();
        o oVar = this.b;
        if (oVar == null) {
            throw new NoSuchElementException();
        }
        this.b = null;
        return oVar;
    }
}
