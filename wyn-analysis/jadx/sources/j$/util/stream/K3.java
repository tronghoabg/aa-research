package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class K3 extends AbstractC2968i3 {
    @Override // j$.util.stream.AbstractC2968i3
    final AbstractC2968i3 e(Spliterator spliterator) {
        return new K3(this.f38224b, spliterator, this.f38223a);
    }

    @Override // j$.util.stream.AbstractC2968i3
    final void d() {
        C2938c3 c2938c3 = new C2938c3();
        this.f38230h = c2938c3;
        Objects.requireNonNull(c2938c3);
        this.f38227e = this.f38224b.T(new J3(c2938c3, 0));
        this.f38228f = new C2924a(5, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        C2938c3 c2938c3 = (C2938c3) this.f38230h;
        long j8 = this.f38229g;
        if (c2938c3.f38166c != 0) {
            if (j8 >= c2938c3.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            for (int i5 = 0; i5 <= c2938c3.f38166c; i5++) {
                long j10 = c2938c3.f38167d[i5];
                Object[] objArr = c2938c3.f38162f[i5];
                if (j8 < objArr.length + j10) {
                    obj = objArr[(int) (j8 - j10)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        if (j8 < c2938c3.f38165b) {
            obj = c2938c3.f38161e[(int) j8];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        consumer.p(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f38230h == null && !this.f38231i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            J3 j32 = new J3(consumer, 1);
            this.f38224b.S(this.f38226d, j32);
            this.f38231i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
