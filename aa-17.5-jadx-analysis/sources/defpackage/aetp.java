package defpackage;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class aetp extends aeqt {
    private static final long serialVersionUID = -3185226345314976296L;
    final /* synthetic */ aetq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aetp(aetq aetqVar, int i, int i2) {
        super(aetqVar, i, i2);
        this.d = aetqVar;
    }

    private final Object[] r() {
        return this.d.a;
    }

    @Override // defpackage.aequ, defpackage.aeqv, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeto(this);
    }

    @Override // defpackage.aeqv, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aequ, defpackage.aeqv, defpackage.aeuh
    /* renamed from: d */
    public final aeui listIterator(int i) {
        return new aexe(this, i, 1);
    }

    @Override // defpackage.aeqv, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof aetq) {
            aetq aetqVar = (aetq) obj;
            return q(aetqVar.a, 0, aetqVar.b);
        }
        if (!(obj instanceof aetp)) {
            return super.equals(obj);
        }
        aetp aetpVar = (aetp) obj;
        return q(aetpVar.r(), aetpVar.b, aetpVar.c);
    }

    @Override // defpackage.aequ, java.util.List
    public final Object get(int i) {
        l(i);
        return this.d.a[i + this.b];
    }

    @Override // defpackage.aeqv
    /* renamed from: h */
    public final int compareTo(List list) {
        if (list instanceof aetq) {
            aetq aetqVar = (aetq) list;
            return p(aetqVar.a, 0, aetqVar.b);
        }
        if (!(list instanceof aetp)) {
            return super.compareTo(list);
        }
        aetp aetpVar = (aetp) list;
        return p(aetpVar.r(), aetpVar.b, aetpVar.c);
    }

    @Override // defpackage.aequ, defpackage.aeqv, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return new aexe(this, i, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 >= r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r0 < r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int p(java.lang.Object[] r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.b
        L2:
            int r1 = r3.c
            if (r0 >= r1) goto L1e
            if (r0 >= r6) goto L1e
            aetq r1 = r3.d
            java.lang.Object[] r1 = r1.a
            r1 = r1[r0]
            r2 = r4[r5]
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r2)
            if (r1 == 0) goto L19
            return r1
        L19:
            int r0 = r0 + 1
            int r5 = r5 + 1
            goto L2
        L1e:
            if (r0 >= r6) goto L22
            r3 = -1
            return r3
        L22:
            if (r0 < r1) goto L26
            r3 = 0
            return r3
        L26:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetp.p(java.lang.Object[], int, int):int");
    }

    final boolean q(Object[] objArr, int i, int i2) {
        aetq aetqVar = this.d;
        if (aetqVar.a == objArr && this.b == i && this.c == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        int i3 = this.b;
        while (i3 < this.c) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (!Objects.equals(aetqVar.a[i3], objArr[i])) {
                return false;
            }
            i3 = i4;
            i = i5;
        }
        return true;
    }

    @Override // defpackage.aequ, defpackage.aeqv, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeto(this);
    }
}
