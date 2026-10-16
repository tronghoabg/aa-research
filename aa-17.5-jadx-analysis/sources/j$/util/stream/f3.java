package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class f3 extends o2 {
    public final Comparator b;
    public boolean c;

    public f3(z2 z2Var, Comparator comparator) {
        super(z2Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final boolean s() {
        this.c = true;
        return false;
    }
}
