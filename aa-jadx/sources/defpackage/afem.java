package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afem implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ defpackage.afen a;
    private java.lang.String b;
    private boolean c;

    public afem(defpackage.afen afenVar) {
        this.a = afenVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws java.io.IOException {
        java.lang.String line = this.b;
        if (line == null && !this.c) {
            line = ((java.io.BufferedReader) this.a.a).readLine();
            this.b = line;
            if (line == null) {
                this.c = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.b;
        this.b = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
