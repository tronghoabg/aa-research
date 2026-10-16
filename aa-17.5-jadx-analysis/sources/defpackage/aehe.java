package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aehe extends aehd implements Iterator, aeui {
    final /* synthetic */ aehf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehe(aehf aehfVar) {
        super(aehfVar);
        this.a = aehfVar;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        adqs.aC();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // defpackage.aehd
    public final /* bridge */ /* synthetic */ void hr(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(this.a.b[i]);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.a.b[g()];
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final Object previous() {
        return this.a.b[h()];
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        adqs.aE();
    }
}
