package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class k4 extends q4 implements DoubleConsumer, j$.util.V {

    /* renamed from: e, reason: collision with root package name */
    double f38247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Spliterator spliterator, int i5) {
        super(spliterator);
        this.f38248f = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Spliterator spliterator, q4 q4Var, int i5) {
        super(spliterator, q4Var);
        this.f38248f = i5;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.f(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d3) {
        this.f38297d = (this.f38297d + 1) & 63;
        this.f38247e = d3;
    }

    @Override // j$.util.stream.q4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f38248f) {
            case 0:
                return new k4((j$.util.V) spliterator, this, 0);
            default:
                return new k4((j$.util.V) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f38248f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        switch (this.f38248f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.V
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f38248f) {
            case 0:
                boolean z2 = this.f38296c;
                Spliterator spliterator = this.f38294a;
                if (z2) {
                    this.f38296c = false;
                    boolean zTryAdvance = ((j$.util.V) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && b()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f38247e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.f38247e);
                    return zTryAdvance;
                }
                return ((j$.util.V) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f38296c && b() && ((j$.util.V) this.f38294a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f38247e);
                    throw null;
                }
                this.f38296c = false;
                return false;
        }
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public j$.util.V trySplit() {
        switch (this.f38248f) {
            case 1:
                if (this.f38295b.get()) {
                    return null;
                }
                return (j$.util.V) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f38248f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
