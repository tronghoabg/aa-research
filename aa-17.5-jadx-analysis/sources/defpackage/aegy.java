package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aegy extends aehd implements Iterator, aeui {
    final /* synthetic */ aehf a;
    private aehs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegy(aehf aehfVar) {
        super(aehfVar);
        this.a = aehfVar;
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
        a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(new aehs(this.a, i, 1));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aehs aehsVar = new aehs(this.a, g(), 1);
        this.b = aehsVar;
        return aehsVar;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* bridge */ /* synthetic */ Object previous() {
        aehs aehsVar = new aehs(this.a, h(), 1);
        this.b = aehsVar;
        return aehsVar;
    }

    @Override // defpackage.aehd, defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        super.remove();
        this.b.a = -1;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        aehd.j();
    }
}
