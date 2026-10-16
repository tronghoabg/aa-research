package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class o4 extends q4 implements LongConsumer, j$.util.a0 {

    /* renamed from: e, reason: collision with root package name */
    long f38273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Spliterator spliterator, int i5) {
        super(spliterator);
        this.f38274f = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Spliterator spliterator, q4 q4Var, int i5) {
        super(spliterator, q4Var);
        this.f38274f = i5;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.h(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f38297d = (this.f38297d + 1) & 63;
        this.f38273e = j8;
    }

    @Override // j$.util.stream.q4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f38274f) {
            case 0:
                return new o4((j$.util.a0) spliterator, this, 0);
            default:
                return new o4((j$.util.a0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f38274f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        switch (this.f38274f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.a0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f38274f) {
            case 0:
                boolean z2 = this.f38296c;
                Spliterator spliterator = this.f38294a;
                if (z2) {
                    this.f38296c = false;
                    boolean zTryAdvance = ((j$.util.a0) spliterator).tryAdvance((LongConsumer) this);
                    if (zTryAdvance && b()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f38273e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    longConsumer.accept(this.f38273e);
                    return zTryAdvance;
                }
                return ((j$.util.a0) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f38296c && b() && ((j$.util.a0) this.f38294a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f38273e);
                    throw null;
                }
                this.f38296c = false;
                return false;
        }
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public j$.util.a0 trySplit() {
        switch (this.f38274f) {
            case 1:
                if (this.f38295b.get()) {
                    return null;
                }
                return (j$.util.a0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f38274f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
