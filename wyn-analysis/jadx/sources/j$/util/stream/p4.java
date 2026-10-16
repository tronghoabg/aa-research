package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class p4 extends q4 implements Consumer {

    /* renamed from: e, reason: collision with root package name */
    final Predicate f38285e;

    /* renamed from: f, reason: collision with root package name */
    Object f38286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38287g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Spliterator spliterator, Predicate predicate, int i5) {
        super(spliterator);
        this.f38287g = i5;
        this.f38285e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Spliterator spliterator, p4 p4Var, int i5) {
        super(spliterator, p4Var);
        this.f38287g = i5;
        this.f38285e = p4Var.f38285e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f38297d = (this.f38297d + 1) & 63;
        this.f38286f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.f38287g) {
            case 0:
                boolean z2 = this.f38296c;
                Spliterator spliterator = this.f38294a;
                if (z2) {
                    boolean z10 = false;
                    this.f38296c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && b() && this.f38285e.test(this.f38286f)) {
                            z10 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z10) {
                        this.f38295b.set(true);
                    }
                    consumer.accept(this.f38286f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f38296c && b() && this.f38294a.tryAdvance(this)) {
                    zTest = this.f38285e.test(this.f38286f);
                    if (zTest) {
                        consumer.accept(this.f38286f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f38296c = false;
                if (!zTest) {
                    this.f38295b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f38287g) {
            case 1:
                if (!this.f38295b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.q4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f38287g) {
            case 0:
                return new p4(spliterator, this, 0);
            default:
                return new p4(spliterator, this, 1);
        }
    }
}
