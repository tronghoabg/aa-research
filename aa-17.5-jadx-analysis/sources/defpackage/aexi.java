package defpackage;

import j$.util.Iterator;
import java.util.AbstractCollection;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aexi implements Iterator, aety {
    int a = -1;
    int b = 0;
    final /* synthetic */ AbstractCollection c;
    private final /* synthetic */ int d;

    public aexi(AbstractCollection abstractCollection, int i) {
        this.d = i;
        this.c = abstractCollection;
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        int i = this.d;
        AbstractCollection abstractCollection = this.c;
        if (i != 0) {
            aets aetsVar = (aets) abstractCollection;
            Object[] objArr = aetsVar.a;
            while (true) {
                int i2 = this.b;
                if (i2 >= aetsVar.b) {
                    return;
                }
                this.b = i2 + 1;
                consumer.accept(objArr[i2]);
            }
        } else {
            aexj aexjVar = (aexj) abstractCollection;
            Object[] objArr2 = aexjVar.a;
            while (true) {
                int i3 = this.b;
                if (i3 >= aexjVar.b) {
                    return;
                }
                this.b = i3 + 1;
                consumer.accept(objArr2[i3]);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        int i2 = this.b;
        AbstractCollection abstractCollection = this.c;
        return i != 0 ? i2 < ((aets) abstractCollection).b : i2 < ((aexj) abstractCollection).b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = ((aets) this.c).a;
            int i = this.b;
            this.b = i + 1;
            this.a = i;
            return objArr[i];
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr2 = ((aexj) this.c).a;
        int i2 = this.b;
        this.b = i2 + 1;
        this.a = i2;
        return objArr2[i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d;
        int i2 = this.a;
        if (i != 0) {
            if (i2 == -1) {
                throw new IllegalStateException();
            }
            this.a = -1;
            aets aetsVar = (aets) this.c;
            int i3 = aetsVar.b;
            aetsVar.b = i3 - 1;
            int i4 = this.b;
            int i5 = i4 - 1;
            this.b = i5;
            Object[] objArr = aetsVar.a;
            System.arraycopy(objArr, i4, objArr, i5, i3 - i4);
            aetsVar.a[aetsVar.b] = null;
            return;
        }
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        this.a = -1;
        aexj aexjVar = (aexj) this.c;
        int i6 = aexjVar.b;
        aexjVar.b = i6 - 1;
        int i7 = this.b;
        int i8 = i7 - 1;
        this.b = i8;
        Object[] objArr2 = aexjVar.a;
        System.arraycopy(objArr2, i7, objArr2, i8, i6 - i7);
        aexjVar.a[aexjVar.b] = null;
    }
}
