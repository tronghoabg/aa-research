package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aely extends aeme implements Iterator, aety {
    final /* synthetic */ aemi a;
    private final aemc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aely(aemi aemiVar) {
        super(aemiVar);
        this.a = aemiVar;
        this.h = new aemc(aemiVar);
    }

    @Override // defpackage.aeme
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aemc aemcVar = this.h;
        aemcVar.a = i;
        consumerM39m.accept(aemcVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aemc aemcVar = this.h;
        aemcVar.a = b();
        return aemcVar;
    }
}
