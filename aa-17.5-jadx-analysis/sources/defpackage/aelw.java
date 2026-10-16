package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aelw extends aeme implements Iterator, aety {
    final /* synthetic */ aemi a;
    private aemc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelw(aemi aemiVar) {
        super(aemiVar);
        this.a = aemiVar;
    }

    @Override // defpackage.aeme
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aemc aemcVar = new aemc(this.a, i);
        this.h = aemcVar;
        consumerM39m.accept(aemcVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aemc aemcVar = new aemc(this.a, b());
        this.h = aemcVar;
        return aemcVar;
    }

    @Override // defpackage.aeme, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
