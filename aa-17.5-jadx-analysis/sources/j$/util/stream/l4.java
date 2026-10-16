package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class l4 extends w3 {
    @Override // j$.util.stream.w3
    public final void d() {
        s3 s3Var = new s3();
        this.h = s3Var;
        this.e = this.b.t(new j$.desugar.sun.nio.fs.h((byte) 17, s3Var));
        this.f = new j$.desugar.sun.nio.fs.h((byte) 18, this);
    }

    @Override // j$.util.stream.w3
    public final w3 e(Spliterator spliterator) {
        return new l4(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        c();
        j$.nio.file.z zVar = new j$.nio.file.z(consumer, (byte) 3);
        this.b.s(this.d, zVar);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        s3 s3Var = (s3) this.h;
        long j = this.g;
        if (s3Var.b != 0) {
            if (j >= s3Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= s3Var.b; i++) {
                long j2 = s3Var.c[i];
                Object[] objArr = s3Var.e[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= s3Var.a) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = s3Var.d[(int) j];
        consumer.accept(obj);
        return zA;
    }
}
