package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeni extends aeno implements Iterator, aeui {
    final /* synthetic */ aenq a;
    private aenm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeni(aenq aenqVar) {
        super(aenqVar);
        this.a = aenqVar;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        aeno.i();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // defpackage.aeno
    public final /* bridge */ /* synthetic */ void ht(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(new aenm(this.a, i));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aenm aenmVar = new aenm(this.a, g());
        this.b = aenmVar;
        return aenmVar;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* bridge */ /* synthetic */ Object previous() {
        aenm aenmVar = new aenm(this.a, h());
        this.b = aenmVar;
        return aenmVar;
    }

    @Override // defpackage.aeno, defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        super.remove();
        this.b.a = -1;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        aeno.j();
    }
}
