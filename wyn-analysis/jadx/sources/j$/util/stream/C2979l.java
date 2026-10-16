package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2979l extends AbstractC2992n2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38249b = 2;

    /* renamed from: c, reason: collision with root package name */
    boolean f38250c;

    /* renamed from: d, reason: collision with root package name */
    Object f38251d;

    public /* synthetic */ C2979l(InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2979l(R3 r32, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38251d = r32;
        this.f38250c = true;
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        switch (this.f38249b) {
            case 0:
                this.f38250c = false;
                this.f38251d = null;
                this.f38260a.l(-1L);
                break;
            case 1:
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
        switch (this.f38249b) {
            case 0:
                InterfaceC3011r2 interfaceC3011r2 = this.f38260a;
                if (obj == null) {
                    if (this.f38250c) {
                        return;
                    }
                    this.f38250c = true;
                    this.f38251d = null;
                    interfaceC3011r2.p((InterfaceC3011r2) null);
                    return;
                }
                Object obj2 = this.f38251d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f38251d = obj;
                    interfaceC3011r2.p((InterfaceC3011r2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C2924a) ((C3018t) this.f38251d).f38312n).apply((C2924a) obj);
                if (stream != null) {
                    try {
                        boolean z2 = this.f38250c;
                        InterfaceC3011r2 interfaceC3011r22 = this.f38260a;
                        if (!z2) {
                            ((Stream) stream.sequential()).forEach(interfaceC3011r22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC3011r22.n() && spliterator.tryAdvance(interfaceC3011r22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f38250c) {
                    boolean zTest = ((R3) this.f38251d).f38077m.test(obj);
                    this.f38250c = zTest;
                    if (zTest) {
                        this.f38260a.p((InterfaceC3011r2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public boolean n() {
        switch (this.f38249b) {
            case 1:
                this.f38250c = true;
                return this.f38260a.n();
            case 2:
                return !this.f38250c || this.f38260a.n();
            default:
                return super.n();
        }
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public void k() {
        switch (this.f38249b) {
            case 0:
                this.f38250c = false;
                this.f38251d = null;
                this.f38260a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2979l(C3018t c3018t, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38251d = c3018t;
    }
}
