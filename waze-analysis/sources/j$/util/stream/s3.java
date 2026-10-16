package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s3 extends b7 implements k2, d2 {
    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final l2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.d7, j$.util.stream.l2
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final k2 build() {
        return this;
    }

    @Override // j$.util.stream.d7, j$.util.stream.l2
    public final void c(int i2, Object obj) {
        super.c(i2, (long[]) obj);
    }

    @Override // j$.util.stream.d7, j$.util.stream.l2
    public final void d(Object obj) {
        super.d((LongConsumer) obj);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.v(this, j2, j3);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void h(Object[] objArr, int i2) {
        d4.p(this, (Long[]) objArr, i2);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return d4.m(this, intFunction);
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        clear();
        z(j2);
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.m2
    public final int s() {
        return 0;
    }

    @Override // j$.util.stream.b7, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.a1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.s5
    public final /* synthetic */ void u(Long l2) {
        d4.i(this, l2);
    }

    @Override // j$.util.stream.e2
    public final m2 build() {
        return this;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // j$.util.stream.b7, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.m2
    public final m2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        u((Long) obj);
    }
}
