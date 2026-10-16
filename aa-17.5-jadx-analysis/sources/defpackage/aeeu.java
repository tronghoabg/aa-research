package defpackage;

import j$.util.Spliterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class aeeu extends aeei {
    private static final long serialVersionUID = -3185226345314976296L;
    final /* synthetic */ aeev d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aeeu(aeev aeevVar, int i, int i2) {
        super(aeevVar, i, i2);
        this.d = aeevVar;
    }

    private final byte[] L() {
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
    final int J(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            aeev r0 = r5.d
            byte[] r1 = r0.a
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
            byte[] r3 = r0.a
            r3 = r3[r1]
            r4 = r6[r7]
            int r3 = java.lang.Byte.compare(r3, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeeu.J(byte[], int, int):int");
    }

    final boolean K(byte[] bArr, int i, int i2) {
        aeev aeevVar = this.d;
        if (aeevVar.a == bArr && this.b == i && this.c == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        int i3 = this.b;
        while (i3 < this.c) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (aeevVar.a[i3] != bArr[i]) {
                return false;
            }
            i3 = i4;
            i = i5;
        }
        return true;
    }

    @Override // defpackage.aeel, defpackage.aeen, defpackage.aeeg, defpackage.aeez
    public final aefz b() {
        return new aeet(this);
    }

    @Override // defpackage.aeen, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((List) obj);
    }

    @Override // defpackage.aeen, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof aeev) {
            aeev aeevVar = (aeev) obj;
            return K(aeevVar.a, 0, aeevVar.b);
        }
        if (!(obj instanceof aeeu)) {
            return super.equals(obj);
        }
        aeeu aeeuVar = (aeeu) obj;
        return K(aeeuVar.L(), aeeuVar.b, aeeuVar.c);
    }

    @Override // defpackage.aeel, defpackage.aefo
    public final byte l(int i) {
        E(i);
        return this.d.a[i + this.b];
    }

    @Override // defpackage.aeel, defpackage.aeen, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return new aees(this, i);
    }

    @Override // defpackage.aeel, defpackage.aeen, defpackage.aefo
    /* renamed from: o */
    public final aefp listIterator(int i) {
        return new aees(this, i);
    }

    @Override // defpackage.aeel, defpackage.aeen, defpackage.aeeg, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeet(this);
    }

    @Override // defpackage.aeen
    /* renamed from: u */
    public final int compareTo(List list) {
        if (list instanceof aeev) {
            aeev aeevVar = (aeev) list;
            return J(aeevVar.a, 0, aeevVar.b);
        }
        if (!(list instanceof aeeu)) {
            return super.compareTo(list);
        }
        aeeu aeeuVar = (aeeu) list;
        return J(aeeuVar.L(), aeeuVar.b, aeeuVar.c);
    }
}
