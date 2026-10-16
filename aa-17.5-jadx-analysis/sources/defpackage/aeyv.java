package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class aeyv extends aexr {
    protected int b;
    protected int c;

    protected aeyv(int i) {
        this.b = i;
    }

    @Override // defpackage.aexr, defpackage.aeyu
    public void b(aeys aeysVar) {
        while (true) {
            int i = this.b;
            if (i >= j()) {
                return;
            }
            this.b = i + 1;
            this.c = i;
            aeysVar.c(k(i));
        }
    }

    public short d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return k(i);
    }

    @Override // defpackage.aexr, j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        b((aeys) obj);
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
            throw new IllegalStateException();
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
