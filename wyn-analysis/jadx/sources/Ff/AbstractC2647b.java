package ff;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;
import uf.InterfaceC4291a;

/* renamed from: ff.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2647b implements Iterator, InterfaceC4291a {

    @Nullable
    private Object nextValue;
    private int state;

    public abstract void computeNext();

    public final void done() {
        this.state = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i5 = this.state;
        if (i5 == 0) {
            this.state = 3;
            computeNext();
            return this.state == 1;
        }
        if (i5 == 1) {
            return true;
        }
        if (i5 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i5 = this.state;
        if (i5 == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i5 != 2) {
            this.state = 3;
            computeNext();
            if (this.state == 1) {
                this.state = 0;
                return this.nextValue;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(Object obj) {
        this.nextValue = obj;
        this.state = 1;
    }
}
