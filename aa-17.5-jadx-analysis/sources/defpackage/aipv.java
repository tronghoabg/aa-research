package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aipv<T> extends afaw<T> {
    public static final aipt Companion = new aipt(null);
    private Object data;
    private int size;

    public /* synthetic */ aipv(afeu afeuVar) {
        this();
    }

    public static final <T> aipv<T> create() {
        return Companion.create();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (defpackage.affz.b(r3).add(r6) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afaw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean add(T r6) {
        /*
            r5 = this;
            int r0 = r5.size()
            r1 = 1
            if (r0 != 0) goto Lb
            r5.data = r6
            goto L7d
        Lb:
            int r0 = r5.size()
            r2 = 0
            if (r0 != r1) goto L27
            java.lang.Object r0 = r5.data
            boolean r0 = defpackage.affa.f(r0, r6)
            if (r0 == 0) goto L1b
            goto L7c
        L1b:
            java.lang.Object r0 = r5.data
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r6
            r5.data = r3
            goto L7d
        L27:
            int r0 = r5.size()
            java.lang.Object r3 = r5.data
            r4 = 5
            if (r0 >= r4) goto L6f
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r0 = defpackage.woy.dm(r3, r6)
            if (r0 != 0) goto L7c
            int r0 = r5.size()
            r2 = 4
            if (r0 != r2) goto L5b
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            r0.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r0.length
            int r3 = defpackage.woy.aV(r3)
            r2.<init>(r3)
            defpackage.woy.dA(r0, r2)
            r2.add(r6)
            goto L6c
        L5b:
            int r0 = r5.size()
            int r0 = r0 + r1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r0)
            r2.getClass()
            int r0 = r2.length
            int r0 = r0 + (-1)
            r2[r0] = r6
        L6c:
            r5.data = r2
            goto L7d
        L6f:
            r3.getClass()
            java.util.Set r0 = defpackage.affz.b(r3)
            boolean r6 = r0.add(r6)
            if (r6 != 0) goto L7d
        L7c:
            return r2
        L7d:
            int r6 = r5.size()
            int r6 = r6 + r1
            r5.setSize(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aipv.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.data = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return affa.f(this.data, obj);
        }
        int size = size();
        Object obj2 = this.data;
        if (size < 5) {
            obj2.getClass();
            return woy.dm((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // defpackage.afaw
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new aipu(this.data);
        }
        if (size() < 5) {
            Object obj = this.data;
            obj.getClass();
            return new aips((Object[]) obj);
        }
        Object obj2 = this.data;
        obj2.getClass();
        return affz.b(obj2).iterator();
    }

    public void setSize(int i) {
        this.size = i;
    }

    private aipv() {
    }
}
