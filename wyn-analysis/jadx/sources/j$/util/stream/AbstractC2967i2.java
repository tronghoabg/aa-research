package j$.util.stream;

/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2967i2 extends AbstractC2972j2 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f38222l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC2967i2(AbstractC2929b abstractC2929b, int i5, int i10) {
        super(abstractC2929b, i5);
        this.f38222l = i10;
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean N() {
        switch (this.f38222l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h unordered() {
        switch (this.f38222l) {
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
        return new C2952f2(this, EnumC2958g3.f38208r, 1);
    }
}
