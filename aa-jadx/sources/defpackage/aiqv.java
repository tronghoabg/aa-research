package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiqv<T> extends defpackage.afbw<T> {
    public static final defpackage.aiqt Companion = new defpackage.aiqt(null);
    private java.lang.Object data;
    private int size;

    public /* synthetic */ aiqv(defpackage.affu affuVar) {
        this();
    }

    public static final <T> defpackage.aiqv<T> create() {
        return Companion.create();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (defpackage.afgz.b(r3).add(r6) == false) goto L22;
     */
    @Override // defpackage.afbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
            boolean r0 = defpackage.afga.f(r0, r6)
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
            boolean r0 = defpackage.afga.cg(r3, r6)
            if (r0 != 0) goto L7c
            int r0 = r5.size()
            r2 = 4
            if (r0 != r2) goto L5b
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            r0.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r0.length
            int r3 = defpackage.afga.P(r3)
            r2.<init>(r3)
            defpackage.afga.cu(r0, r2)
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
            java.util.Set r0 = defpackage.afgz.b(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqv.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.data = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return defpackage.afga.f(this.data, obj);
        }
        int size = size();
        java.lang.Object obj2 = this.data;
        if (size < 5) {
            obj2.getClass();
            return defpackage.afga.cg((java.lang.Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((java.util.Set) obj2).contains(obj);
    }

    @Override // defpackage.afbw
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
        if (size() == 0) {
            return java.util.Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new defpackage.aiqu(this.data);
        }
        if (size() < 5) {
            java.lang.Object obj = this.data;
            obj.getClass();
            return new defpackage.aiqs((java.lang.Object[]) obj);
        }
        java.lang.Object obj2 = this.data;
        obj2.getClass();
        return defpackage.afgz.b(obj2).iterator();
    }

    public void setSize(int i) {
        this.size = i;
    }

    private aiqv() {
    }
}
