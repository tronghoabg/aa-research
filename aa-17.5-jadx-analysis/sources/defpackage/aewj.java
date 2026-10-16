package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aewj extends aewh implements Iterator, aety {
    final /* synthetic */ aewk a;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewj(aewk aewkVar, int i) {
        super(aewkVar);
        this.h = i;
        this.a = aewkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aewh
    public final /* synthetic */ void a(Object obj, int i) {
        int i2 = this.h;
        aewk aewkVar = this.a;
        if (i2 != 0) {
            obj.accept(aewkVar.a[i]);
        } else {
            obj.accept(aewkVar.b[i]);
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
        aewk aewkVar = this.a;
        return i != 0 ? aewkVar.a[b()] : aewkVar.b[b()];
    }
}
