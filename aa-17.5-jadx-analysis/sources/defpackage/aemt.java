package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aemt extends aemz implements Iterator, aety {
    final /* synthetic */ aend a;
    private aemx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemt(aend aendVar) {
        super(aendVar);
        this.a = aendVar;
    }

    @Override // defpackage.aemz
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aemx aemxVar = new aemx(this.a, i);
        this.h = aemxVar;
        consumerM39m.accept(aemxVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aemx aemxVar = new aemx(this.a, b());
        this.h = aemxVar;
        return aemxVar;
    }

    @Override // defpackage.aemz, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
