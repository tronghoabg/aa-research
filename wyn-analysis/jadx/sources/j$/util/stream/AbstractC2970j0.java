package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2970j0 extends AbstractC2975k0 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f38237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC2970j0(AbstractC2929b abstractC2929b, int i5, int i10) {
        super(abstractC2929b, i5);
        this.f38237l = i10;
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean N() {
        switch (this.f38237l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h unordered() {
        switch (this.f38237l) {
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
        return new C3033w(this, EnumC2958g3.f38208r, 4);
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC2990n0 parallel() {
        switch (this.f38237l) {
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
    public final /* bridge */ /* synthetic */ InterfaceC2990n0 sequential() {
        switch (this.f38237l) {
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
        switch (this.f38237l) {
        }
        return spliterator();
    }
}
