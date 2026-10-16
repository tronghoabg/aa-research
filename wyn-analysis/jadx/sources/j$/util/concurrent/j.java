package j$.util.concurrent;

import j$.util.S;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class j extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37828i;

    /* renamed from: j, reason: collision with root package name */
    long f37829j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i5, int i10, int i11, long j8, int i12) {
        super(lVarArr, i5, i10, i11);
        this.f37828i = i12;
        this.f37829j = j8;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f37828i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f37828i) {
        }
        return S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        switch (this.f37828i) {
        }
        return S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f37828i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f37828i) {
            case 0:
                int i5 = this.f37846f;
                int i10 = this.f37847g;
                int i11 = (i5 + i10) >>> 1;
                if (i11 <= i5) {
                    return null;
                }
                l[] lVarArr = this.f37841a;
                this.f37847g = i11;
                long j8 = this.f37829j >>> 1;
                this.f37829j = j8;
                return new j(lVarArr, this.f37848h, i11, i10, j8, 0);
            default:
                int i12 = this.f37846f;
                int i13 = this.f37847g;
                int i14 = (i12 + i13) >>> 1;
                if (i14 <= i12) {
                    return null;
                }
                l[] lVarArr2 = this.f37841a;
                this.f37847g = i14;
                long j10 = this.f37829j >>> 1;
                this.f37829j = j10;
                return new j(lVarArr2, this.f37848h, i14, i13, j10, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f37828i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l lVarA = a();
                    if (lVarA == null) {
                        break;
                    } else {
                        consumer.accept(lVarA.f37834b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l lVarA2 = a();
                    if (lVarA2 == null) {
                        break;
                    } else {
                        consumer.accept(lVarA2.f37835c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f37828i) {
            case 0:
                consumer.getClass();
                l lVarA = a();
                if (lVarA != null) {
                    consumer.accept(lVarA.f37834b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                l lVarA2 = a();
                if (lVarA2 != null) {
                    consumer.accept(lVarA2.f37835c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f37828i) {
        }
        return this.f37829j;
    }
}
