package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class H1 extends AbstractC3044y0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f38000h;

    public /* synthetic */ H1(int i5) {
        this.f38000h = i5;
    }

    @Override // j$.util.stream.AbstractC3044y0
    public final V1 T() {
        switch (this.f38000h) {
            case 0:
                return new Z1();
            case 1:
                return new X1();
            case 2:
                return new C2927a2();
            default:
                return new Y1();
        }
    }

    @Override // j$.util.stream.AbstractC3044y0, j$.util.stream.N3
    public final Object b(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        switch (this.f38000h) {
            case 0:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(abstractC2929b, spliterator);
    }

    @Override // j$.util.stream.AbstractC3044y0, j$.util.stream.N3
    public final Object c(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        switch (this.f38000h) {
            case 0:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC2958g3.SIZED.t(abstractC2929b.H())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.c(abstractC2929b, spliterator);
    }

    @Override // j$.util.stream.AbstractC3044y0, j$.util.stream.N3
    public final int d() {
        switch (this.f38000h) {
        }
        return EnumC2958g3.f38208r;
    }
}
