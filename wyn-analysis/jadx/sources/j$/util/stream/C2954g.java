package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2954g implements BaseStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2959h f38188a;

    private /* synthetic */ C2954g(InterfaceC2959h interfaceC2959h) {
        this.f38188a = interfaceC2959h;
    }

    public static /* synthetic */ BaseStream k(InterfaceC2959h interfaceC2959h) {
        if (interfaceC2959h == null) {
            return null;
        }
        return interfaceC2959h instanceof C2949f ? ((C2949f) interfaceC2959h).f38186a : interfaceC2959h instanceof E ? D.k((E) interfaceC2959h) : interfaceC2959h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC2959h) : interfaceC2959h instanceof InterfaceC2990n0 ? C2985m0.k((InterfaceC2990n0) interfaceC2959h) : interfaceC2959h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC2959h) : new C2954g(interfaceC2959h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f38188a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC2959h interfaceC2959h = this.f38188a;
        if (obj instanceof C2954g) {
            obj = ((C2954g) obj).f38188a;
        }
        return interfaceC2959h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f38188a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f38188a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f38188a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return k(this.f38188a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return k(this.f38188a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return k(this.f38188a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f38188a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return k(this.f38188a.unordered());
    }
}
