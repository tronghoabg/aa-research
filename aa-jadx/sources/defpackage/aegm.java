package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aegm extends defpackage.aefh {
    protected int b;
    protected int c;

    protected aegm(int i) {
        this.b = i;
    }

    @Override // defpackage.aefh, defpackage.aegl
    public void b(defpackage.aegj aegjVar) {
        while (true) {
            int i = this.b;
            if (i >= k()) {
                return;
            }
            this.b = i + 1;
            this.c = i;
            aegjVar.b(j(i));
        }
    }

    public byte c() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return j(i);
    }

    @Override // defpackage.aefh, j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        b((defpackage.aegj) obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < k();
    }

    protected abstract byte j(int i);

    protected abstract int k();

    protected abstract void m(int i);

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        m(i);
        int i2 = this.c;
        int i3 = this.b;
        if (i2 < i3) {
            this.b = i3 - 1;
        }
        this.c = -1;
    }
}
