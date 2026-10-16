package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aewc extends aewh implements Iterator, aety {
    final /* synthetic */ aewk a;
    private aewx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewc(aewk aewkVar) {
        super(aewkVar);
        this.a = aewkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aewh
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        aewx aewxVar = new aewx(this.a, i, 1);
        this.h = aewxVar;
        obj.accept(aewxVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.c(consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aewx aewxVar = new aewx(this.a, b(), 1);
        this.h = aewxVar;
        return aewxVar;
    }

    @Override // defpackage.aewh, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
