package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o3 extends p3 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f50567a == null) {
            return;
        }
        if (this.f50570d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.f50569c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            m2 m2VarA = p3.a(arrayDequeB);
            if (m2VarA == null) {
                this.f50567a = null;
                return;
            }
            m2VarA.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        m2 m2VarA;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f50570d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f50569c == null && (m2VarA = p3.a(this.f50571e)) != null) {
                Spliterator spliterator = m2VarA.spliterator();
                this.f50570d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f50567a = null;
        }
        return zTryAdvance;
    }
}
