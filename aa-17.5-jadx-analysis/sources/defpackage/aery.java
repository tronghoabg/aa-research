package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aery extends aesf implements Iterator, aety {
    final /* synthetic */ aesj a;
    private aesd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aery(aesj aesjVar) {
        super(aesjVar);
        this.a = aesjVar;
    }

    @Override // defpackage.aesf
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aesd aesdVar = new aesd(this.a, i);
        this.h = aesdVar;
        consumerM39m.accept(aesdVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aesd aesdVar = new aesd(this.a, b());
        this.h = aesdVar;
        return aesdVar;
    }

    @Override // defpackage.aesf, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
