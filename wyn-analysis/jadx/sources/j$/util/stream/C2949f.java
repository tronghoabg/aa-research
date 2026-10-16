package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2949f implements InterfaceC2959h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f38186a;

    private /* synthetic */ C2949f(BaseStream baseStream) {
        this.f38186a = baseStream;
    }

    public static /* synthetic */ InterfaceC2959h k(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C2954g ? ((C2954g) baseStream).f38188a : baseStream instanceof DoubleStream ? C.k((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C2980l0.k((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C2943d3.k((java.util.stream.Stream) baseStream) : new C2949f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f38186a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f38186a;
        if (obj instanceof C2949f) {
            obj = ((C2949f) obj).f38186a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f38186a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ boolean isParallel() {
        return this.f38186a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f38186a.iterator();
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h onClose(Runnable runnable) {
        return k(this.f38186a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h parallel() {
        return k(this.f38186a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h sequential() {
        return k(this.f38186a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e0.a(this.f38186a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h unordered() {
        return k(this.f38186a.unordered());
    }
}
