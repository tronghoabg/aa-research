package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i extends o implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50175i;

    /* renamed from: j, reason: collision with root package name */
    public long f50176j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k[] kVarArr, int i2, int i3, int i4, long j2, int i5) {
        super(kVarArr, i2, i3, i4);
        this.f50175i = i5;
        this.f50176j = j2;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f50175i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f50175i) {
        }
        return this.f50176j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f50175i) {
            case 0:
                consumer.getClass();
                while (true) {
                    k kVarA = a();
                    if (kVarA == null) {
                        break;
                    } else {
                        consumer.u(kVarA.f50181b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    k kVarA2 = a();
                    if (kVarA2 == null) {
                        break;
                    } else {
                        consumer.u(kVarA2.f50182c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f50175i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f50175i) {
        }
        return j$.com.android.tools.r8.a.l(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        switch (this.f50175i) {
        }
        return j$.com.android.tools.r8.a.n(this, i2);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f50175i) {
            case 0:
                consumer.getClass();
                k kVarA = a();
                if (kVarA != null) {
                    consumer.u(kVarA.f50181b);
                    break;
                } else {
                    break;
                }
            default:
                consumer.getClass();
                k kVarA2 = a();
                if (kVarA2 != null) {
                    consumer.u(kVarA2.f50182c);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f50175i) {
            case 0:
                int i2 = this.f50193f;
                int i3 = this.f50194g;
                int i4 = (i2 + i3) >>> 1;
                if (i4 <= i2) {
                    return null;
                }
                k[] kVarArr = this.f50188a;
                this.f50194g = i4;
                long j2 = this.f50176j >>> 1;
                this.f50176j = j2;
                return new i(kVarArr, this.f50195h, i4, i3, j2, 0);
            default:
                int i5 = this.f50193f;
                int i6 = this.f50194g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                k[] kVarArr2 = this.f50188a;
                this.f50194g = i7;
                long j3 = this.f50176j >>> 1;
                this.f50176j = j3;
                return new i(kVarArr2, this.f50195h, i7, i6, j3, 1);
        }
    }
}
