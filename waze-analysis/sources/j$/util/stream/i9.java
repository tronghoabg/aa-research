package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i9 extends o9 implements DoubleConsumer, j$.util.s0 {

    /* renamed from: e, reason: collision with root package name */
    public double f50457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9(Spliterator spliterator, int i2) {
        super(spliterator);
        this.f50458f = i2;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.f50563d = (this.f50563d + 1) & 63;
        this.f50457e = d2;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.o9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f50458f) {
            case 0:
                return new i9((j$.util.s0) spliterator, this, 0);
            default:
                return new i9((j$.util.s0) spliterator, this, 1);
        }
    }

    @Override // j$.util.a1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.s0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        int i2 = this.f50458f;
        Spliterator spliterator = this.f50560a;
        DoublePredicate doublePredicate = null;
        switch (i2) {
            case 0:
                if (!this.f50562c) {
                    return ((j$.util.s0) spliterator).tryAdvance(doubleConsumer);
                }
                this.f50562c = false;
                boolean zTryAdvance = ((j$.util.s0) spliterator).tryAdvance((DoubleConsumer) this);
                if (zTryAdvance && a()) {
                    doublePredicate.test(this.f50457e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                doubleConsumer.accept(this.f50457e);
                return zTryAdvance;
            default:
                if (this.f50562c && a() && ((j$.util.s0) spliterator).tryAdvance((DoubleConsumer) this)) {
                    doublePredicate.test(this.f50457e);
                    throw null;
                }
                this.f50562c = false;
                return false;
        }
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public j$.util.s0 trySplit() {
        switch (this.f50458f) {
            case 1:
                if (this.f50561b.get()) {
                    return null;
                }
                return (j$.util.s0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9(Spliterator spliterator, o9 o9Var, int i2) {
        super(spliterator, o9Var);
        this.f50458f = i2;
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f50458f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        switch (this.f50458f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.w(this, consumer);
    }

    @Override // j$.util.a1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f50458f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
