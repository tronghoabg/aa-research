package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeoe extends aeol implements Iterator, aety {
    final /* synthetic */ aeop a;
    private aeoj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeoe(aeop aeopVar) {
        super(aeopVar);
        this.a = aeopVar;
    }

    @Override // defpackage.aeol
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aeoj aeojVar = new aeoj(this.a, i);
        this.h = aeojVar;
        consumerM39m.accept(aeojVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aeoj aeojVar = new aeoj(this.a, b());
        this.h = aeojVar;
        return aeojVar;
    }

    @Override // defpackage.aeol, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
