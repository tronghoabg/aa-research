package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cey implements ListIterator, afgc {
    final /* synthetic */ afft a;
    final /* synthetic */ cez b;

    public cey(afft afftVar, cez cezVar) {
        this.a = afftVar;
        this.b = cezVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        ceo.d();
        throw new aezp();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        afft afftVar = this.a;
        int i = afftVar.a + 1;
        cez cezVar = this.b;
        ceo.b(i, cezVar.a);
        afftVar.a = i;
        return cezVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        afft afftVar = this.a;
        cez cezVar = this.b;
        int i = afftVar.a;
        ceo.b(i, cezVar.a);
        afftVar.a = i - 1;
        return cezVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        ceo.d();
        throw new aezp();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        ceo.d();
        throw new aezp();
    }
}
