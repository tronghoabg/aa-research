package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3009r0 extends AbstractC3024u0 implements InterfaceC3002p2 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC3029v0 f38299c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntPredicate f38300d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3044y0.g(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3009r0(EnumC3029v0 enumC3029v0, IntPredicate intPredicate) {
        super(enumC3029v0);
        this.f38299c = enumC3029v0;
        this.f38300d = intPredicate;
    }

    @Override // j$.util.stream.AbstractC3024u0, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        if (this.f38317a) {
            return;
        }
        boolean zTest = this.f38300d.test(i5);
        EnumC3029v0 enumC3029v0 = this.f38299c;
        if (zTest == enumC3029v0.f38327a) {
            this.f38317a = true;
            this.f38318b = enumC3029v0.f38328b;
        }
    }
}
