package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aetk extends aeti implements Iterator, aety {
    final /* synthetic */ aetl a;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetk(aetl aetlVar, int i) {
        super(aetlVar);
        this.h = i;
        this.a = aetlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aeti
    public final /* synthetic */ void a(Object obj, int i) {
        int i2 = this.h;
        aetl aetlVar = this.a;
        if (i2 != 0) {
            obj.accept(aetlVar.a[i]);
        } else {
            obj.accept(aetlVar.b[i]);
        }
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.h != 0) {
            super.c(consumer);
        } else {
            super.c(consumer);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        aetl aetlVar = this.a;
        return i != 0 ? aetlVar.a[b()] : aetlVar.b[b()];
    }
}
