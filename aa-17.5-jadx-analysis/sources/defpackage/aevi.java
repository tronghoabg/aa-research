package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aevi extends aevp implements Iterator, aety {
    final /* synthetic */ aevt a;
    private aevn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aevi(aevt aevtVar) {
        super(aevtVar);
        this.a = aevtVar;
    }

    @Override // defpackage.aevp
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aevn aevnVar = new aevn(this.a, i);
        this.h = aevnVar;
        consumerM39m.accept(aevnVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aevn aevnVar = new aevn(this.a, b());
        this.h = aevnVar;
        return aevnVar;
    }

    @Override // defpackage.aevp, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
