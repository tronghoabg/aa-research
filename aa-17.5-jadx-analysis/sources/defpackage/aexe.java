package defpackage;

import j$.util.Iterator;
import java.util.AbstractCollection;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aexe extends aeua implements Iterator {
    final /* synthetic */ AbstractCollection a;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexe(AbstractCollection abstractCollection, int i, int i2) {
        super(i);
        this.d = i2;
        this.a = abstractCollection;
    }

    @Override // defpackage.aetz
    protected final int a() {
        int i;
        int i2;
        int i3 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i3 != 0) {
            aetp aetpVar = (aetp) abstractCollection;
            i = aetpVar.c;
            i2 = aetpVar.b;
        } else {
            aexg aexgVar = (aexg) abstractCollection;
            i = aexgVar.c;
            i2 = aexgVar.b;
        }
        return i - i2;
    }

    @Override // defpackage.aetz
    protected final Object b(int i) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            aetp aetpVar = (aetp) abstractCollection;
            return aetpVar.d.a[aetpVar.b + i];
        }
        aexg aexgVar = (aexg) abstractCollection;
        return aexgVar.d.a[aexgVar.b + i];
    }

    @Override // defpackage.aeua
    protected final void c(int i, Object obj) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            ((aeqv) abstractCollection).add(i, obj);
        } else {
            ((aerl) abstractCollection).add(i, obj);
        }
    }

    @Override // defpackage.aetz
    protected final void d(int i) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            ((aeqv) abstractCollection).remove(i);
        } else {
            ((aerl) abstractCollection).remove(i);
        }
    }

    @Override // defpackage.aeua
    protected final void e(int i, Object obj) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            ((aeqv) abstractCollection).set(i, obj);
        } else {
            ((aerl) abstractCollection).set(i, obj);
        }
    }

    @Override // defpackage.aetz, java.util.Iterator, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        int i = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i != 0) {
            aetp aetpVar = (aetp) abstractCollection;
            Object[] objArr = aetpVar.d.a;
            int i2 = aetpVar.c;
            int i3 = aetpVar.b;
            int i4 = i2 - i3;
            while (true) {
                int i5 = this.b;
                if (i5 >= i4) {
                    return;
                }
                this.b = i5 + 1;
                this.c = i5;
                consumer.accept(objArr[i5 + i3]);
            }
        } else {
            aexg aexgVar = (aexg) abstractCollection;
            Object[] objArr2 = aexgVar.d.a;
            int i6 = aexgVar.c;
            int i7 = aexgVar.b;
            int i8 = i6 - i7;
            while (true) {
                int i9 = this.b;
                if (i9 >= i8) {
                    return;
                }
                this.b = i9 + 1;
                this.c = i9;
                consumer.accept(objArr2[i9 + i7]);
            }
        }
    }

    @Override // defpackage.aetz, java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            aetp aetpVar = (aetp) this.a;
            Object[] objArr = aetpVar.d.a;
            int i = this.b;
            this.b = i + 1;
            this.c = i;
            return objArr[aetpVar.b + i];
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        aexg aexgVar = (aexg) this.a;
        Object[] objArr2 = aexgVar.d.a;
        int i2 = this.b;
        this.b = i2 + 1;
        this.c = i2;
        return objArr2[aexgVar.b + i2];
    }

    @Override // defpackage.aeua, java.util.ListIterator, defpackage.aeed
    public final Object previous() {
        if (this.d != 0) {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            aetp aetpVar = (aetp) this.a;
            Object[] objArr = aetpVar.d.a;
            int i = this.b - 1;
            this.b = i;
            this.c = i;
            return objArr[aetpVar.b + i];
        }
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        aexg aexgVar = (aexg) this.a;
        Object[] objArr2 = aexgVar.d.a;
        int i2 = this.b - 1;
        this.b = i2;
        this.c = i2;
        return objArr2[aexgVar.b + i2];
    }
}
