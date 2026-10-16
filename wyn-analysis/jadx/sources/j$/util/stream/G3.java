package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class G3 extends I3 implements Spliterator, Consumer {

    /* renamed from: f, reason: collision with root package name */
    Object f37996f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37996f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != H3.NO_MORE && this.f38009a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f37996f);
                this.f37996f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C2993n3 c2993n3 = null;
        while (true) {
            H3 h3D = d();
            if (h3D == H3.NO_MORE) {
                return;
            }
            H3 h32 = H3.MAYBE_MORE;
            Spliterator spliterator = this.f38009a;
            if (h3D == h32) {
                int i5 = this.f38011c;
                if (c2993n3 == null) {
                    c2993n3 = new C2993n3(i5);
                } else {
                    c2993n3.f38272a = 0;
                }
                long j8 = 0;
                while (spliterator.tryAdvance(c2993n3)) {
                    j8++;
                    if (j8 >= i5) {
                        break;
                    }
                }
                if (j8 == 0) {
                    return;
                }
                long jB = b(j8);
                for (int i10 = 0; i10 < jB; i10++) {
                    consumer.accept(c2993n3.f38261b[i10]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.I3
    protected final Spliterator c(Spliterator spliterator) {
        return new G3(spliterator, this);
    }
}
