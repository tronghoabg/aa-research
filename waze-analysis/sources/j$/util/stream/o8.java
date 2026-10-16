package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o8 extends l7 {
    @Override // j$.util.stream.l7
    public final void d() {
        e7 e7Var = new e7();
        this.f50504h = e7Var;
        Objects.requireNonNull(e7Var);
        this.f50501e = this.f50498b.R(new n8(e7Var, 0));
        this.f50502f = new j$.desugar.sun.nio.fs.g(14, this);
    }

    @Override // j$.util.stream.l7
    public final l7 e(Spliterator spliterator) {
        return new o8(this.f50498b, spliterator, this.f50497a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f50504h != null || this.f50505i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        n8 n8Var = new n8(consumer, 1);
        this.f50498b.Q(this.f50500d, n8Var);
        this.f50505i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        e7 e7Var = (e7) this.f50504h;
        long j2 = this.f50503g;
        if (e7Var.f50344c != 0) {
            if (j2 >= e7Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            for (int i2 = 0; i2 <= e7Var.f50344c; i2++) {
                long j3 = e7Var.f50345d[i2];
                Object[] objArr = e7Var.f50391f[i2];
                if (j2 < objArr.length + j3) {
                    obj = objArr[(int) (j2 - j3)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        if (j2 >= e7Var.f50343b) {
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        obj = e7Var.f50390e[(int) j2];
        consumer.u(obj);
        return zA;
    }
}
