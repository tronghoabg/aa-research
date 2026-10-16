package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afcc implements java.util.Iterator, defpackage.afhc {
    public boolean a;
    private final int b;
    private int c;

    public afcc(char c, char c2) {
        this.b = c2;
        this.a = c <= c2;
        this.c = c > c2 ? c2 : c;
    }

    public final char a() {
        int i = this.c;
        if (i != this.b) {
            this.c = i + 1;
        } else {
            if (!this.a) {
                throw new java.util.NoSuchElementException();
            }
            this.a = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
