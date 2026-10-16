package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aest extends aess implements Iterator, aeui {
    final /* synthetic */ aesu a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aest(aesu aesuVar, int i) {
        super(aesuVar);
        this.b = i;
        this.a = aesuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aess
    public final /* synthetic */ void a(Object obj, int i) {
        int i2 = this.b;
        aesu aesuVar = this.a;
        if (i2 != 0) {
            obj.accept(aesuVar.a[i]);
        } else {
            obj.accept(aesuVar.b[i]);
        }
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        if (this.b != 0) {
            adqs.aC();
        } else {
            adqs.aC();
        }
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.b != 0) {
            super.e(consumer);
        } else {
            super.e(consumer);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.b;
        aesu aesuVar = this.a;
        return i != 0 ? aesuVar.a[c()] : aesuVar.b[c()];
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final Object previous() {
        int i = this.b;
        aesu aesuVar = this.a;
        return i != 0 ? aesuVar.a[d()] : aesuVar.b[d()];
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        if (this.b != 0) {
            adqs.aE();
        } else {
            adqs.aE();
        }
    }
}
