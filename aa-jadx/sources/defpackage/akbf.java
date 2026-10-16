package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbf implements java.util.Iterator {
    protected final java.util.List a;
    protected int b = a(-1);
    protected int c = -1;
    protected final java.lang.String d;

    public akbf(java.util.List list, java.lang.String str) {
        this.a = list;
        this.d = str;
    }

    protected final int a(int i) {
        java.util.List list = this.a;
        int size = list.size() - 1;
        boolean zEqualsIgnoreCase = false;
        while (!zEqualsIgnoreCase) {
            if (i >= size) {
                return -1;
            }
            i++;
            java.lang.String str = this.d;
            zEqualsIgnoreCase = str == null ? true : str.equalsIgnoreCase(((defpackage.ajpy) list.get(i)).b());
        }
        return i;
    }

    public final defpackage.ajpy b() throws java.util.NoSuchElementException {
        int i = this.b;
        if (i < 0) {
            throw new java.util.NoSuchElementException("Iteration already finished.");
        }
        this.c = i;
        this.b = a(i);
        return (defpackage.ajpy) this.a.get(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws java.util.NoSuchElementException {
        return b();
    }

    @Override // java.util.Iterator
    public final void remove() throws java.lang.UnsupportedOperationException {
        defpackage.agvb.b(this.c >= 0, "No header to remove");
        this.a.remove(this.c);
        this.c = -1;
        this.b--;
    }
}
