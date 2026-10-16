package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements java.util.Iterator, java.io.Closeable {
    public final j$.nio.file.q a;
    public j$.nio.file.o b;

    public l(j$.nio.file.Path path, j$.nio.file.FileVisitOption... fileVisitOptionArr) throws java.io.IOException {
        j$.nio.file.q qVar = new j$.nio.file.q(java.util.Arrays.asList(fileVisitOptionArr));
        this.a = qVar;
        if (qVar.d) {
            throw new java.lang.IllegalStateException("Closed");
        }
        j$.nio.file.o oVarC = qVar.c(path, false);
        this.b = oVarC;
        java.io.IOException iOException = oVarC.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void a() {
        if (this.b == null) {
            j$.nio.file.q qVar = this.a;
            for (j$.nio.file.o oVarB = qVar.b(); oVarB != null; oVarB = qVar.b()) {
                java.io.IOException iOException = oVarB.d;
                if (iOException != null) {
                    throw new java.io.UncheckedIOException(iOException);
                }
                if (oVarB.a != j$.nio.file.p.END_DIRECTORY) {
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
    public final boolean hasNext() {
        if (this.a.d) {
            throw new java.lang.IllegalStateException();
        }
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.a.d) {
            throw new java.lang.IllegalStateException();
        }
        a();
        j$.nio.file.o oVar = this.b;
        if (oVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.b = null;
        return oVar;
    }
}
