package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aetc extends aeti implements Iterator, aety {
    final /* synthetic */ aetl a;
    private aetg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetc(aetl aetlVar) {
        super(aetlVar);
        this.a = aetlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aeti
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        aetg aetgVar = new aetg(this.a, i, 0);
        this.h = aetgVar;
        obj.accept(aetgVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.c(consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aetg aetgVar = new aetg(this.a, b(), 0);
        this.h = aetgVar;
        return aetgVar;
    }

    @Override // defpackage.aeti, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
