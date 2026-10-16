package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
abstract class A extends B {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f37946l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC2929b abstractC2929b, int i5, int i10) {
        super(abstractC2929b, i5);
        this.f37946l = i10;
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean N() {
        switch (this.f37946l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h unordered() {
        switch (this.f37946l) {
            case 0:
                if (!I()) {
                    break;
                } else {
                    break;
                }
            default:
                if (!I()) {
                    break;
                } else {
                    break;
                }
        }
        return new C3023u(this, EnumC2958g3.f38208r, 1);
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E parallel() {
        switch (this.f37946l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E sequential() {
        switch (this.f37946l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f37946l) {
        }
        return spliterator();
    }
}
