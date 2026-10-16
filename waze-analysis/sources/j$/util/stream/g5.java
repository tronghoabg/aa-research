package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g5 extends p5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50413b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f50415d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f50416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(t5 t5Var, g0 g0Var, int i2) {
        super(t5Var);
        this.f50413b = i2;
        switch (i2) {
            case 1:
                this.f50415d = g0Var;
                super(t5Var);
                t5 t5Var2 = this.f50576a;
                Objects.requireNonNull(t5Var2);
                this.f50416e = new j$.util.c0(t5Var2, 1);
                break;
            default:
                this.f50415d = g0Var;
                t5 t5Var3 = this.f50576a;
                Objects.requireNonNull(t5Var3);
                this.f50416e = new j$.util.k0(t5Var3, 1);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) throws Exception {
        int i2 = this.f50413b;
        t5 t5Var = this.f50576a;
        g0 g0Var = this.f50415d;
        Object obj2 = this.f50416e;
        switch (i2) {
            case 0:
                j$.util.k0 k0Var = (j$.util.k0) obj2;
                LongStream longStream = (LongStream) g0Var.apply((g0) obj);
                if (longStream != null) {
                    try {
                        if (this.f50414c) {
                            j$.util.x0 x0VarSpliterator = longStream.sequential().spliterator();
                            while (!t5Var.o() && x0VarSpliterator.tryAdvance((LongConsumer) k0Var)) {
                            }
                        } else {
                            longStream.sequential().forEach(k0Var);
                        }
                    } catch (Throwable th) {
                        try {
                            longStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (longStream != null) {
                    longStream.close();
                    return;
                }
                return;
            default:
                j$.util.c0 c0Var = (j$.util.c0) obj2;
                DoubleStream doubleStream = (DoubleStream) g0Var.apply((g0) obj);
                if (doubleStream != null) {
                    try {
                        if (this.f50414c) {
                            j$.util.s0 s0VarSpliterator = doubleStream.sequential().spliterator();
                            while (!t5Var.o() && s0VarSpliterator.tryAdvance((DoubleConsumer) c0Var)) {
                            }
                        } else {
                            doubleStream.sequential().forEach(c0Var);
                        }
                    } catch (Throwable th3) {
                        try {
                            doubleStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (doubleStream != null) {
                    doubleStream.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void l(long j2) {
        switch (this.f50413b) {
            case 0:
                this.f50576a.l(-1L);
                break;
            default:
                this.f50576a.l(-1L);
                break;
        }
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final boolean o() {
        switch (this.f50413b) {
            case 0:
                this.f50414c = true;
                break;
            default:
                this.f50414c = true;
                break;
        }
        return this.f50576a.o();
    }
}
