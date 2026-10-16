package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k4 extends d4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f50487h;

    public /* synthetic */ k4(int i2) {
        this.f50487h = i2;
    }

    @Override // j$.util.stream.d4
    public final y4 Q() {
        switch (this.f50487h) {
            case 0:
                return new c5();
            case 1:
                return new a5();
            case 2:
                return new d5();
            default:
                return new b5();
        }
    }

    @Override // j$.util.stream.d4, j$.util.stream.r8
    public final Object a(a aVar, Spliterator spliterator) {
        switch (this.f50487h) {
            case 0:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.a(aVar, spliterator);
    }

    @Override // j$.util.stream.d4, j$.util.stream.r8
    public final Object b(a aVar, Spliterator spliterator) {
        switch (this.f50487h) {
            case 0:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!j7.SIZED.k(aVar.f50316f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(aVar, spliterator);
    }

    @Override // j$.util.stream.d4, j$.util.stream.r8
    public final int c() {
        switch (this.f50487h) {
        }
        return j7.r;
    }
}
