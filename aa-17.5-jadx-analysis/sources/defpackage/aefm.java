package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class aefm extends aeeh {
    protected int b;
    protected int c;

    protected aefm(int i) {
        this.b = i;
    }

    @Override // defpackage.aeeh, defpackage.aefl
    public void b(aefj aefjVar) {
        while (true) {
            int i = this.b;
            if (i >= k()) {
                return;
            }
            this.b = i + 1;
            this.c = i;
            aefjVar.b(j(i));
        }
    }

    public byte c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return j(i);
    }

    @Override // defpackage.aeeh, j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        b((aefj) obj);
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
