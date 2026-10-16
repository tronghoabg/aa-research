package defpackage;

import j$.util.Spliterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class aeot extends aelg {
    private static final long serialVersionUID = -3185226345314976296L;
    final /* synthetic */ aeou d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aeot(aeou aeouVar, int i, int i2) {
        super(aeouVar, i, i2);
        this.d = aeouVar;
    }

    private final long[] M() {
        return this.d.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r1 >= r11) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r1 < r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int K(long[] r9, int r10, int r11) {
        /*
            r8 = this;
            aeou r0 = r8.d
            long[] r1 = r0.a
            r2 = 0
            if (r1 != r9) goto L11
            int r1 = r8.b
            if (r1 != r10) goto L11
            int r1 = r8.c
            if (r1 == r11) goto L10
            goto L11
        L10:
            return r2
        L11:
            int r1 = r8.b
        L13:
            int r3 = r8.c
            if (r1 >= r3) goto L2b
            if (r1 >= r11) goto L2b
            long[] r3 = r0.a
            r4 = r3[r1]
            r6 = r9[r10]
            int r3 = java.lang.Long.compare(r4, r6)
            if (r3 == 0) goto L26
            return r3
        L26:
            int r1 = r1 + 1
            int r10 = r10 + 1
            goto L13
        L2b:
            if (r1 >= r11) goto L2f
            r8 = -1
            return r8
        L2f:
            if (r1 < r3) goto L32
            return r2
        L32:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeot.K(long[], int, int):int");
    }

    final boolean L(long[] jArr, int i, int i2) {
        aeou aeouVar = this.d;
        if (aeouVar.a == jArr && this.b == i && this.c == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        int i3 = this.b;
        while (i3 < this.c) {
            int i4 = i3 + 1;
            long j = aeouVar.a[i3];
            int i5 = i + 1;
            if (j != jArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // defpackage.aelj, defpackage.aelk, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aeos(this);
    }

    @Override // defpackage.aelk, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aelk, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof aeou) {
            aeou aeouVar = (aeou) obj;
            return L(aeouVar.a, 0, aeouVar.b);
        }
        if (!(obj instanceof aeot)) {
            return super.equals(obj);
        }
        aeot aeotVar = (aeot) obj;
        return L(aeotVar.M(), aeotVar.b, aeotVar.c);
    }

    @Override // defpackage.aelj, defpackage.aelk, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return new aeor(this, i);
    }

    @Override // defpackage.aelj, defpackage.aeps
    public final long m(int i) {
        F(i);
        return this.d.a[i + this.b];
    }

    @Override // defpackage.aelj, defpackage.aelk, defpackage.aeps
    /* renamed from: p */
    public final aept listIterator(int i) {
        return new aeor(this, i);
    }

    @Override // defpackage.aelj, defpackage.aelk, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeos(this);
    }

    @Override // defpackage.aelk
    /* renamed from: v */
    public final int compareTo(List list) {
        if (list instanceof aeou) {
            aeou aeouVar = (aeou) list;
            return K(aeouVar.a, 0, aeouVar.b);
        }
        if (!(list instanceof aeot)) {
            return super.compareTo(list);
        }
        aeot aeotVar = (aeot) list;
        return K(aeotVar.M(), aeotVar.b, aeotVar.c);
    }
}
