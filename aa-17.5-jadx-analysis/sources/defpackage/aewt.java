package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aewt extends aewz implements Iterator, aety {
    final /* synthetic */ aexc a;
    private aewx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewt(aexc aexcVar) {
        super(aexcVar);
        this.a = aexcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aewz
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        aewx aewxVar = new aewx(this.a, i, 0);
        this.h = aewxVar;
        obj.accept(aewxVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.c(consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aewx aewxVar = new aewx(this.a, b(), 0);
        this.h = aewxVar;
        return aewxVar;
    }

    @Override // defpackage.aewz, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
