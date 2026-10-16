package defpackage;

import j$.util.Spliterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class aeyd extends aext {
    private static final long serialVersionUID = -3185226345314976296L;
    final /* synthetic */ aeye d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aeyd(aeye aeyeVar, int i, int i2) {
        super(aeyeVar, i, i2);
        this.d = aeyeVar;
    }

    private final short[] K() {
        return this.d.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r1 >= r8) goto L21;
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
    final int I(short[] r6, int r7, int r8) {
        /*
            r5 = this;
            aeye r0 = r5.d
            short[] r1 = r0.a
            r2 = 0
            if (r1 != r6) goto L11
            int r1 = r5.b
            if (r1 != r7) goto L11
            int r1 = r5.c
            if (r1 == r8) goto L10
            goto L11
        L10:
            return r2
        L11:
            int r1 = r5.b
        L13:
            int r3 = r5.c
            if (r1 >= r3) goto L2b
            if (r1 >= r8) goto L2b
            short[] r3 = r0.a
            short r3 = r3[r1]
            short r4 = r6[r7]
            int r3 = java.lang.Short.compare(r3, r4)
            if (r3 == 0) goto L26
            return r3
        L26:
            int r1 = r1 + 1
            int r7 = r7 + 1
            goto L13
        L2b:
            if (r1 >= r8) goto L2f
            r5 = -1
            return r5
        L2f:
            if (r1 < r3) goto L32
            return r2
        L32:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyd.I(short[], int, int):int");
    }

    final boolean J(short[] sArr, int i, int i2) {
        aeye aeyeVar = this.d;
        if (aeyeVar.a == sArr && this.b == i && this.c == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        int i3 = this.b;
        while (i3 < this.c) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (aeyeVar.a[i3] != sArr[i]) {
                return false;
            }
            i3 = i4;
            i = i5;
        }
        return true;
    }

    @Override // defpackage.aexw, defpackage.aexx, defpackage.aexq, defpackage.aeyi
    public final aeze b() {
        return new aeyc(this);
    }

    @Override // defpackage.aexx, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aexx, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof aeye) {
            aeye aeyeVar = (aeye) obj;
            return J(aeyeVar.a, 0, aeyeVar.b);
        }
        if (!(obj instanceof aeyd)) {
            return super.equals(obj);
        }
        aeyd aeydVar = (aeyd) obj;
        return J(aeydVar.K(), aeydVar.b, aeydVar.c);
    }

    @Override // defpackage.aexw, defpackage.aexx, defpackage.aeyx
    /* renamed from: k */
    public final aeyy listIterator(int i) {
        return new aeyb(this, i);
    }

    @Override // defpackage.aexw, defpackage.aeyx
    public final short l(int i) {
        D(i);
        return this.d.a[i + this.b];
    }

    @Override // defpackage.aexw, defpackage.aexx, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return new aeyb(this, i);
    }

    @Override // defpackage.aexw, defpackage.aexx, defpackage.aexq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeyc(this);
    }

    @Override // defpackage.aexx
    /* renamed from: t */
    public final int compareTo(List list) {
        if (list instanceof aeye) {
            aeye aeyeVar = (aeye) list;
            return I(aeyeVar.a, 0, aeyeVar.b);
        }
        if (!(list instanceof aeyd)) {
            return super.compareTo(list);
        }
        aeyd aeydVar = (aeyd) list;
        return I(aeydVar.K(), aeydVar.b, aeydVar.c);
    }
}
