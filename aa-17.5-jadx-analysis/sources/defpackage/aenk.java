package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aenk extends aeno implements Iterator, aept {
    final /* synthetic */ aenq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenk(aenq aenqVar) {
        super(aenqVar);
        this.a = aenqVar;
    }

    @Override // defpackage.aeoz
    public final long a() {
        return this.a.a[h()];
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        d((Long) obj);
    }

    @Override // defpackage.aept
    public final /* synthetic */ Long b() {
        throw null;
    }

    @Override // defpackage.aept
    public final /* synthetic */ void c(long j) {
        adqq.al();
    }

    @Override // defpackage.aept
    public final /* synthetic */ void d(Long l) {
        adqq.ah(this, l);
    }

    @Override // defpackage.aept
    public final /* synthetic */ void e(long j) {
        adqq.am();
    }

    @Override // defpackage.aept
    public final /* synthetic */ void f(Long l) {
        adqq.aj(this, l);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ao(this, consumer);
    }

    @Override // defpackage.aeno
    public final /* bridge */ /* synthetic */ void ht(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m42m(obj).accept(this.a.a[i]);
    }

    @Override // defpackage.aept, java.util.ListIterator, java.util.Iterator, defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        return this.a.a[g()];
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adqq.au(this);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Long) obj);
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        super.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqq.an(this);
    }
}
