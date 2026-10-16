package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeya implements aeze {
    boolean a;
    int b;
    int c;
    final /* synthetic */ aeye d;

    private aeya(aeye aeyeVar, int i, int i2, boolean z) {
        this.d = aeyeVar;
        this.b = i;
        this.c = i2;
        this.a = z;
    }

    private final int b() {
        return this.a ? this.c : this.d.b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16720;
    }

    @Override // defpackage.aeze
    public final /* synthetic */ aeyk d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return b() - this.b;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        aeys aeysVar = (aeys) obj;
        short[] sArr = this.d.a;
        int iB = b();
        while (true) {
            int i = this.b;
            if (i >= iB) {
                return;
            }
            aeysVar.c(sArr[i]);
            this.b++;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return adqs.B();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    /* renamed from: hu */
    public final aeze trySplit() {
        int iB = b();
        int i = this.b;
        int i2 = (iB - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        this.c = iB;
        int i3 = i2 + i;
        this.b = i3;
        this.a = true;
        return new aeya(this.d, i, i3, true);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        aeys aeysVar = (aeys) obj;
        int i = this.b;
        if (i >= b()) {
            return false;
        }
        short[] sArr = this.d.a;
        this.b = i + 1;
        aeysVar.c(sArr[i]);
        return true;
    }

    public aeya(aeye aeyeVar) {
        this(aeyeVar, 0, aeyeVar.b, false);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqs.z(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adqs.A(this, consumer);
    }
}
