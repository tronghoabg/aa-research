package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class n9 extends o9 implements Consumer {

    /* renamed from: e, reason: collision with root package name */
    public final Predicate f50543e;

    /* renamed from: f, reason: collision with root package name */
    public Object f50544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f50545g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Spliterator spliterator, n9 n9Var, int i2) {
        super(spliterator, n9Var);
        this.f50545g = i2;
        this.f50543e = n9Var.f50543e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f50563d = (this.f50563d + 1) & 63;
        this.f50544f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.o9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f50545g) {
            case 0:
                return new n9(spliterator, this, 0);
            default:
                return new n9(spliterator, this, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        int i2 = this.f50545g;
        AtomicBoolean atomicBoolean = this.f50561b;
        Predicate predicate = this.f50543e;
        Spliterator spliterator = this.f50560a;
        boolean z = false;
        switch (i2) {
            case 0:
                if (!this.f50562c) {
                    return spliterator.tryAdvance(consumer);
                }
                this.f50562c = false;
                while (true) {
                    zTryAdvance = spliterator.tryAdvance(this);
                    if (zTryAdvance && a() && predicate.test(this.f50544f)) {
                        z = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z) {
                    atomicBoolean.set(true);
                }
                consumer.accept(this.f50544f);
                return zTryAdvance;
            default:
                if (this.f50562c && a() && spliterator.tryAdvance(this)) {
                    zTest = predicate.test(this.f50544f);
                    if (zTest) {
                        consumer.accept(this.f50544f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f50562c = false;
                if (!zTest) {
                    atomicBoolean.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f50545g) {
            case 1:
                if (!this.f50561b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Spliterator spliterator, Predicate predicate, int i2) {
        super(spliterator);
        this.f50545g = i2;
        this.f50543e = predicate;
    }
}
