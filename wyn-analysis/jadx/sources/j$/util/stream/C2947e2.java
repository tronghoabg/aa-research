package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2947e2 extends AbstractC2992n2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38180b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f38181c;

    /* renamed from: d, reason: collision with root package name */
    Object f38182d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2929b f38183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2947e2(C3043y c3043y, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38183e = c3043y;
        InterfaceC3011r2 interfaceC3011r22 = this.f38260a;
        Objects.requireNonNull(interfaceC3011r22);
        this.f38182d = new C2994o(interfaceC3011r22);
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        switch (this.f38180b) {
            case 0:
                this.f38260a.l(-1L);
                break;
            default:
                this.f38260a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) throws Exception {
        switch (this.f38180b) {
            case 0:
                InterfaceC2990n0 interfaceC2990n0 = (InterfaceC2990n0) ((C2924a) ((C2960h0) this.f38183e).f38219n).apply((C2924a) obj);
                if (interfaceC2990n0 != null) {
                    try {
                        boolean z2 = this.f38181c;
                        C2940d0 c2940d0 = (C2940d0) this.f38182d;
                        if (!z2) {
                            interfaceC2990n0.sequential().forEach(c2940d0);
                        } else {
                            j$.util.a0 a0VarSpliterator = interfaceC2990n0.sequential().spliterator();
                            while (!this.f38260a.n() && a0VarSpliterator.tryAdvance((LongConsumer) c2940d0)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC2990n0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC2990n0 != null) {
                    interfaceC2990n0.close();
                    return;
                }
                return;
            default:
                E e7 = (E) ((C2924a) ((C3043y) this.f38183e).f38352n).apply((C2924a) obj);
                if (e7 != null) {
                    try {
                        boolean z10 = this.f38181c;
                        C2994o c2994o = (C2994o) this.f38182d;
                        if (!z10) {
                            e7.sequential().forEach(c2994o);
                        } else {
                            j$.util.V vSpliterator = e7.sequential().spliterator();
                            while (!this.f38260a.n() && vSpliterator.tryAdvance((DoubleConsumer) c2994o)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            e7.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (e7 != null) {
                    e7.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        switch (this.f38180b) {
            case 0:
                this.f38181c = true;
                break;
            default:
                this.f38181c = true;
                break;
        }
        return this.f38260a.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2947e2(C2960h0 c2960h0, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38183e = c2960h0;
        InterfaceC3011r2 interfaceC3011r22 = this.f38260a;
        Objects.requireNonNull(interfaceC3011r22);
        this.f38182d = new C2940d0(interfaceC3011r22);
    }
}
