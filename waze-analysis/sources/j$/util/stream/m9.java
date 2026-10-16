package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m9 extends o9 implements LongConsumer, j$.util.x0 {

    /* renamed from: e, reason: collision with root package name */
    public long f50527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(Spliterator spliterator, int i2) {
        super(spliterator);
        this.f50528f = i2;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j2) {
        this.f50563d = (this.f50563d + 1) & 63;
        this.f50527e = j2;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.o9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f50528f) {
            case 0:
                return new m9((j$.util.x0) spliterator, this, 0);
            default:
                return new m9((j$.util.x0) spliterator, this, 1);
        }
    }

    @Override // j$.util.a1
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.x0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i2 = this.f50528f;
        Spliterator spliterator = this.f50560a;
        LongPredicate longPredicate = null;
        switch (i2) {
            case 0:
                if (!this.f50562c) {
                    return ((j$.util.x0) spliterator).tryAdvance(longConsumer);
                }
                this.f50562c = false;
                boolean zTryAdvance = ((j$.util.x0) spliterator).tryAdvance((LongConsumer) this);
                if (zTryAdvance && a()) {
                    longPredicate.test(this.f50527e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                longConsumer.accept(this.f50527e);
                return zTryAdvance;
            default:
                if (this.f50562c && a() && ((j$.util.x0) spliterator).tryAdvance((LongConsumer) this)) {
                    longPredicate.test(this.f50527e);
                    throw null;
                }
                this.f50562c = false;
                return false;
        }
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public j$.util.x0 trySplit() {
        switch (this.f50528f) {
            case 1:
                if (this.f50561b.get()) {
                    return null;
                }
                return (j$.util.x0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(Spliterator spliterator, o9 o9Var, int i2) {
        super(spliterator, o9Var);
        this.f50528f = i2;
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f50528f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        switch (this.f50528f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.a1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f50528f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
