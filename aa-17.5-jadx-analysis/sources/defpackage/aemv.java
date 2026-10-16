package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aemv extends aemz implements Iterator, aety {
    final /* synthetic */ aend a;
    private final aemx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemv(aend aendVar) {
        super(aendVar);
        this.a = aendVar;
        this.h = new aemx(aendVar);
    }

    @Override // defpackage.aemz
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aemx aemxVar = this.h;
        aemxVar.a = i;
        consumerM39m.accept(aemxVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aemx aemxVar = this.h;
        aemxVar.a = b();
        return aemxVar;
    }
}
