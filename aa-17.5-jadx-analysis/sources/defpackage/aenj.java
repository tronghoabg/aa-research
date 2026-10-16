package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aenj extends aeno implements Iterator, aeui {
    final aenm a;
    final /* synthetic */ aenq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenj(aenq aenqVar) {
        super(aenqVar);
        this.b = aenqVar;
        this.a = new aenm(aenqVar);
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
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aenm aenmVar = this.a;
        aenmVar.a = i;
        consumerM39m.accept(aenmVar);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aenm aenmVar = this.a;
        aenmVar.a = g();
        return aenmVar;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* bridge */ /* synthetic */ Object previous() {
        aenm aenmVar = this.a;
        aenmVar.a = h();
        return aenmVar;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        aeno.j();
    }
}
