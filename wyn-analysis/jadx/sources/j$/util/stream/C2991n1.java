package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2991n1 extends AbstractC2996o1 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        K0 k0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f38270d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f38269c == null && (k0A = AbstractC2996o1.a(this.f38271e)) != null) {
                Spliterator spliterator = k0A.spliterator();
                this.f38270d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f38267a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f38267a == null) {
            return;
        }
        if (this.f38270d == null) {
            Spliterator spliterator = this.f38269c;
            if (spliterator == null) {
                ArrayDeque arrayDequeB = b();
                while (true) {
                    K0 k0A = AbstractC2996o1.a(arrayDequeB);
                    if (k0A != null) {
                        k0A.forEach(consumer);
                    } else {
                        this.f38267a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
