package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class airn implements Iterator, afgc {
    final /* synthetic */ airo a;
    private Object b;
    private int c = -2;

    public airn(airo airoVar) {
        this.a = airoVar;
    }

    private final void a() {
        Object objInvoke;
        int i = this.c;
        airo airoVar = this.a;
        if (i == -2) {
            objInvoke = airoVar.a.invoke();
        } else {
            Object obj = this.b;
            obj.getClass();
            objInvoke = airoVar.b.invoke(obj);
        }
        this.b = objInvoke;
        this.c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
