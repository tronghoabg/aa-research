package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2984m extends AbstractC2992n2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38255b;

    /* renamed from: c, reason: collision with root package name */
    Object f38256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2984m(AbstractC2929b abstractC2929b, InterfaceC3011r2 interfaceC3011r2, int i5) {
        super(interfaceC3011r2);
        this.f38255b = i5;
        this.f38256c = abstractC2929b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2984m(InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38255b = 0;
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public void k() {
        switch (this.f38255b) {
            case 0:
                this.f38256c = null;
                this.f38260a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        switch (this.f38255b) {
            case 0:
                this.f38256c = new HashSet();
                this.f38260a.l(-1L);
                break;
            case 1:
            default:
                super.l(j8);
                break;
            case 2:
                this.f38260a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f38255b) {
            case 0:
                if (!((HashSet) this.f38256c).contains(obj)) {
                    ((HashSet) this.f38256c).add(obj);
                    this.f38260a.accept((InterfaceC3011r2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((C3018t) this.f38256c).f38312n).accept(obj);
                this.f38260a.accept((InterfaceC3011r2) obj);
                break;
            case 2:
                if (((Predicate) ((C3018t) this.f38256c).f38312n).test(obj)) {
                    this.f38260a.accept((InterfaceC3011r2) obj);
                    break;
                }
                break;
            case 3:
                this.f38260a.accept((InterfaceC3011r2) ((Function) ((C3018t) this.f38256c).f38312n).apply(obj));
                break;
            case 4:
                this.f38260a.accept(((ToIntFunction) ((W) this.f38256c).f38120m).applyAsInt(obj));
                break;
            case 5:
                this.f38260a.accept(((ToLongFunction) ((C2960h0) this.f38256c).f38219n).applyAsLong(obj));
                break;
            default:
                this.f38260a.accept(((ToDoubleFunction) ((C3043y) this.f38256c).f38352n).applyAsDouble(obj));
                break;
        }
    }
}
