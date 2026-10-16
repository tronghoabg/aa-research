package defpackage;

import j$.util.Spliterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class aeix extends aegm {
    private static final long serialVersionUID = -3185226345314976296L;
    final /* synthetic */ aeiy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aeix(aeiy aeiyVar, int i, int i2) {
        super(aeiyVar, i, i2);
        this.d = aeiyVar;
    }

    private final int[] M() {
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
    final int K(int[] r6, int r7, int r8) {
        /*
            r5 = this;
            aeiy r0 = r5.d
            int[] r1 = r0.a
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
            int[] r3 = r0.a
            r3 = r3[r1]
            r4 = r6[r7]
            int r3 = java.lang.Integer.compare(r3, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeix.K(int[], int, int):int");
    }

    final boolean L(int[] iArr, int i, int i2) {
        aeiy aeiyVar = this.d;
        if (aeiyVar.a == iArr && this.b == i && this.c == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        int i3 = this.b;
        while (i3 < this.c) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (aeiyVar.a[i3] != iArr[i]) {
                return false;
            }
            i3 = i4;
            i = i5;
        }
        return true;
    }

    @Override // defpackage.aegp, defpackage.aegq, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aeiw(this);
    }

    @Override // defpackage.aegq, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aegq, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof aeiy) {
            aeiy aeiyVar = (aeiy) obj;
            return L(aeiyVar.a, 0, aeiyVar.b);
        }
        if (!(obj instanceof aeix)) {
            return super.equals(obj);
        }
        aeix aeixVar = (aeix) obj;
        return L(aeixVar.M(), aeixVar.b, aeixVar.c);
    }

    @Override // defpackage.aegp, defpackage.aegq, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return new aeiv(this, i);
    }

    @Override // defpackage.aegp, defpackage.aeka
    public final int m(int i) {
        F(i);
        return this.d.a[i + this.b];
    }

    @Override // defpackage.aegp, defpackage.aegq, defpackage.aeka
    /* renamed from: p */
    public final aekb listIterator(int i) {
        return new aeiv(this, i);
    }

    @Override // defpackage.aegp, defpackage.aegq, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeiw(this);
    }

    @Override // defpackage.aegq
    /* renamed from: v */
    public final int compareTo(List list) {
        if (list instanceof aeiy) {
            aeiy aeiyVar = (aeiy) list;
            return K(aeiyVar.a, 0, aeiyVar.b);
        }
        if (!(list instanceof aeix)) {
            return super.compareTo(list);
        }
        aeix aeixVar = (aeix) list;
        return K(aeixVar.M(), aeixVar.b, aeixVar.c);
    }
}
