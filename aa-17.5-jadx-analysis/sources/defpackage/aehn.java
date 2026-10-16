package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aehn extends aehu implements Iterator, aety {
    final /* synthetic */ aehy a;
    private aehs h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehn(aehy aehyVar) {
        super(aehyVar);
        this.a = aehyVar;
    }

    @Override // defpackage.aehu
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aehs aehsVar = new aehs(this.a, i, 0);
        this.h = aehsVar;
        consumerM39m.accept(aehsVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aehs aehsVar = new aehs(this.a, b(), 0);
        this.h = aehsVar;
        return aehsVar;
    }

    @Override // defpackage.aehu, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
