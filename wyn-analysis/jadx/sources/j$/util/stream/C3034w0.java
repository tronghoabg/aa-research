package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3034w0 implements N3 {

    /* renamed from: a, reason: collision with root package name */
    final EnumC3029v0 f38333a;

    /* renamed from: b, reason: collision with root package name */
    final Supplier f38334b;

    C3034w0(EnumC2963h3 enumC2963h3, EnumC3029v0 enumC3029v0, Supplier supplier) {
        this.f38333a = enumC3029v0;
        this.f38334b = supplier;
    }

    @Override // j$.util.stream.N3
    public final int d() {
        return EnumC2958g3.f38211u | EnumC2958g3.f38208r;
    }

    @Override // j$.util.stream.N3
    public final Object b(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        AbstractC3024u0 abstractC3024u0 = (AbstractC3024u0) this.f38334b.get();
        abstractC2929b.S(spliterator, abstractC3024u0);
        return Boolean.valueOf(abstractC3024u0.f38318b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.N3
    public final Object c(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return (Boolean) new C3039x0(this, abstractC2929b, spliterator).invoke();
    }
}
