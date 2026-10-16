package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aezv extends defpackage.aeyr {
    protected int b;
    protected int c;

    protected aezv(int i) {
        this.b = i;
    }

    @Override // defpackage.aeyr, defpackage.aezu
    public void b(defpackage.aezs aezsVar) {
        while (true) {
            int i = this.b;
            if (i >= j()) {
                return;
            }
            this.b = i + 1;
            this.c = i;
            aezsVar.c(k(i));
        }
    }

    public short d() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return k(i);
    }

    @Override // defpackage.aeyr, j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        b((defpackage.aezs) obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < j();
    }

    protected abstract int j();

    protected abstract short k(int i);

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
