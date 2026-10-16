package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j3 extends z6 implements i2, c2 {
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
        return (int[]) super.b();
    }

    @Override // j$.util.stream.c2, j$.util.stream.e2
    public final i2 build() {
        return this;
    }

    @Override // j$.util.stream.d7, j$.util.stream.l2
    public final void c(int i2, Object obj) {
        super.c(i2, (int[]) obj);
    }

    @Override // j$.util.stream.d7, j$.util.stream.l2
    public final void d(Object obj) {
        super.d((IntConsumer) obj);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.u(this, j2, j3);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void h(Object[] objArr, int i2) {
        d4.o(this, (Integer[]) objArr, i2);
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

    @Override // j$.util.stream.r5
    public final /* synthetic */ void m(Integer num) {
        d4.g(this, num);
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    @Override // j$.util.stream.m2
    public final int s() {
        return 0;
    }

    @Override // j$.util.stream.z6, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.a1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.e2
    public final m2 build() {
        return this;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // j$.util.stream.z6, java.lang.Iterable, j$.lang.a, j$.util.Collection
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
        m((Integer) obj);
    }
}
