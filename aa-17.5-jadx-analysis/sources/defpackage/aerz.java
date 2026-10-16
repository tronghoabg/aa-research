package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aerz extends aesf implements Iterator, aety {
    final /* synthetic */ aesj a;
    private final aesd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerz(aesj aesjVar) {
        super(aesjVar);
        this.a = aesjVar;
        this.h = new aesd(aesjVar);
    }

    @Override // defpackage.aesf
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aesd aesdVar = this.h;
        aesdVar.a = i;
        consumerM39m.accept(aesdVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aesd aesdVar = this.h;
        aesdVar.a = b();
        return aesdVar;
    }
}
