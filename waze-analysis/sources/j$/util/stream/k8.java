package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k8 extends m8 implements Spliterator, Consumer {

    /* renamed from: e, reason: collision with root package name */
    public Object f50491e;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        this.f50491e = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.m8
    public final Spliterator b(Spliterator spliterator) {
        return new k8(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        q7 q7Var = null;
        while (true) {
            l8 l8VarC = c();
            if (l8VarC == l8.NO_MORE) {
                return;
            }
            l8 l8Var = l8.MAYBE_MORE;
            Spliterator spliterator = this.f50523a;
            if (l8VarC != l8Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (q7Var == null) {
                q7Var = new q7();
            } else {
                q7Var.f50599a = 0;
            }
            long j2 = 0;
            while (spliterator.tryAdvance(q7Var)) {
                j2++;
                if (j2 >= 128) {
                    break;
                }
            }
            if (j2 == 0) {
                return;
            }
            long jA = a(j2);
            for (int i2 = 0; i2 < jA; i2++) {
                consumer.u(q7Var.f50588b[i2]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.l(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return j$.com.android.tools.r8.a.n(this, i2);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (c() != l8.NO_MORE && this.f50523a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.u(this.f50491e);
                this.f50491e = null;
                return true;
            }
        }
        return false;
    }
}
