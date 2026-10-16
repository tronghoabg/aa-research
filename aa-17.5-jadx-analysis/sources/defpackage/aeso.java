package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeso extends aess implements Iterator, aeui {
    final /* synthetic */ aesu a;
    private aetg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeso(aesu aesuVar) {
        super(aesuVar);
        this.a = aesuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aess
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        obj.accept(new aetg(this.a, i, 1));
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        aess.f();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.e(consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aetg aetgVar = new aetg(this.a, c(), 1);
        this.b = aetgVar;
        return aetgVar;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* bridge */ /* synthetic */ Object previous() {
        aetg aetgVar = new aetg(this.a, d(), 1);
        this.b = aetgVar;
        return aetgVar;
    }

    @Override // defpackage.aess, defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        super.remove();
        this.b.a = -1;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        aess.g();
    }
}
