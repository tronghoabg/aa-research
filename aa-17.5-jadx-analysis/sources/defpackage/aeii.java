package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeii extends aeip implements Iterator, aety {
    final /* synthetic */ aeit a;
    private aein h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeii(aeit aeitVar) {
        super(aeitVar);
        this.a = aeitVar;
    }

    @Override // defpackage.aeip
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aein aeinVar = new aein(this.a, i);
        this.h = aeinVar;
        consumerM39m.accept(aeinVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aein aeinVar = new aein(this.a, b());
        this.h = aeinVar;
        return aeinVar;
    }

    @Override // defpackage.aeip, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
