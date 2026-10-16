package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aexb extends aewz implements Iterator, aety {
    final /* synthetic */ aexc a;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexb(aexc aexcVar, int i) {
        super(aexcVar);
        this.h = i;
        this.a = aexcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aewz
    public final /* synthetic */ void a(Object obj, int i) {
        int i2 = this.h;
        aexc aexcVar = this.a;
        if (i2 != 0) {
            obj.accept(aexcVar.a[i]);
        } else {
            obj.accept(aexcVar.b[i]);
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
        aexc aexcVar = this.a;
        return i != 0 ? aexcVar.a[b()] : aexcVar.b[b()];
    }
}
