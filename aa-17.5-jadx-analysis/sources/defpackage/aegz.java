package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aegz extends aehd implements Iterator, aeui {
    final /* synthetic */ aehf a;
    final aehs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegz(aehf aehfVar) {
        super(aehfVar);
        this.a = aehfVar;
        this.b = new aehs(aehfVar, 1, (byte[]) null);
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        aehd.i();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // defpackage.aehd
    public final /* bridge */ /* synthetic */ void hr(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aehs aehsVar = this.b;
        aehsVar.a = i;
        consumerM39m.accept(aehsVar);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aehs aehsVar = this.b;
        aehsVar.a = g();
        return aehsVar;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* bridge */ /* synthetic */ Object previous() {
        aehs aehsVar = this.b;
        aehsVar.a = h();
        return aehsVar;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        aehd.j();
    }
}
