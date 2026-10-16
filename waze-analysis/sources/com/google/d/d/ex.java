package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ex<K, V> extends bs<K, V> {

    /* renamed from: b, reason: collision with root package name */
    static final bs f7594b = new ex(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f7595c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object f7596d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f7597e;

    private ex(Object obj, Object[] objArr, int i2) {
        this.f7596d = obj;
        this.f7595c = objArr;
        this.f7597e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.d.d.ex m(int r19, java.lang.Object[] r20, com.google.d.d.bq r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.d.ex.m(int, java.lang.Object[], com.google.d.d.bq):com.google.d.d.ex");
    }

    @Override // com.google.d.d.bs
    final bh a() {
        return new ew(this.f7595c, 1, this.f7597e);
    }

    @Override // com.google.d.d.bs
    final ci g() {
        return new eu(this, this.f7595c, this.f7597e);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x003a->B:22:0x0050], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0065->B:32:0x007c], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x008b->B:43:0x00a2]] */
    @Override // com.google.d.d.bs, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r8 = r0
            goto L9e
        L6:
            int r1 = r8.f7597e
            java.lang.Object[] r2 = r8.f7595c
            r3 = 1
            if (r1 != r3) goto L22
            r8 = 0
            r8 = r2[r8]
            java.lang.Object r8 = j$.util.Objects.requireNonNull(r8)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L3
            r8 = r2[r3]
            java.lang.Object r8 = j$.util.Objects.requireNonNull(r8)
            goto L9e
        L22:
            java.lang.Object r8 = r8.f7596d
            if (r8 != 0) goto L27
            goto L3
        L27:
            boolean r1 = r8 instanceof byte[]
            r4 = -1
            if (r1 == 0) goto L53
            r1 = r8
            byte[] r1 = (byte[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.d.d.fo.V(r8)
        L3a:
            r8 = r8 & r5
            r4 = r1[r8]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L43
            goto L3
        L43:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L50
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9e
        L50:
            int r8 = r8 + 1
            goto L3a
        L53:
            boolean r1 = r8 instanceof short[]
            if (r1 == 0) goto L7f
            r1 = r8
            short[] r1 = (short[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.d.d.fo.V(r8)
        L65:
            r8 = r8 & r5
            short r4 = r1[r8]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L6f
            goto L3
        L6f:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L7c
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9e
        L7c:
            int r8 = r8 + 1
            goto L65
        L7f:
            int[] r8 = (int[]) r8
            int r1 = r8.length
            int r1 = r1 + r4
            int r5 = r9.hashCode()
            int r5 = com.google.d.d.fo.V(r5)
        L8b:
            r5 = r5 & r1
            r6 = r8[r5]
            if (r6 != r4) goto L92
            goto L3
        L92:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La2
            r8 = r6 ^ 1
            r8 = r2[r8]
        L9e:
            if (r8 != 0) goto La1
            return r0
        La1:
            return r8
        La2:
            int r5 = r5 + 1
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.d.ex.get(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.d.d.bs
    final ci h() {
        return new ev(this, new ew(this.f7595c, 0, this.f7597e));
    }

    @Override // com.google.d.d.bs
    final boolean k() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7597e;
    }

    @Override // com.google.d.d.bs
    Object writeReplace() {
        return super.writeReplace();
    }
}
