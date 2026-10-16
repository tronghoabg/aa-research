package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai implements ei {
    private final /* synthetic */ int v;
    static final ei u = new ai(20);
    static final ei t = new ai(19);
    static final ei s = new ai(18);
    static final ei r = new ai(17);
    static final ei q = new ai(16);
    static final ei p = new ai(15);
    static final ei o = new ai(14);
    static final ei n = new ai(13);
    static final ei m = new ai(12);

    /* renamed from: l, reason: collision with root package name */
    static final ei f12662l = new ai(11);

    /* renamed from: k, reason: collision with root package name */
    static final ei f12661k = new ai(10);

    /* renamed from: j, reason: collision with root package name */
    static final ei f12660j = new ai(9);

    /* renamed from: i, reason: collision with root package name */
    static final ei f12659i = new ai(8);

    /* renamed from: h, reason: collision with root package name */
    static final ei f12658h = new ai(7);

    /* renamed from: g, reason: collision with root package name */
    static final ei f12657g = new ai(6);

    /* renamed from: f, reason: collision with root package name */
    static final ei f12656f = new ai(5);

    /* renamed from: e, reason: collision with root package name */
    static final ei f12655e = new ai(4);

    /* renamed from: d, reason: collision with root package name */
    static final ei f12654d = new ai(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f12653c = new ai(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f12652b = new ai(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f12651a = new ai(0);

    private ai(int i2) {
        this.v = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00ad A[RETURN] */
    @Override // com.google.v.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInRange(int r3) {
        /*
            r2 = this;
            int r2 = r2.v
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto La6;
                case 1: goto L9e;
                case 2: goto L96;
                case 3: goto L8e;
                case 4: goto L86;
                case 5: goto L7e;
                case 6: goto L76;
                case 7: goto L6e;
                case 8: goto L66;
                case 9: goto L5e;
                case 10: goto L56;
                case 11: goto L4e;
                case 12: goto L46;
                case 13: goto L3e;
                case 14: goto L36;
                case 15: goto L2e;
                case 16: goto L26;
                case 17: goto L1e;
                case 18: goto L16;
                case 19: goto Le;
                default: goto L7;
            }
        L7:
            com.google.v.cj r2 = com.google.v.cj.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            com.google.v.ci r2 = com.google.v.ci.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            com.google.v.ch r2 = com.google.v.ch.a(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            com.google.v.cc r2 = com.google.v.cc.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            com.google.v.bw r2 = com.google.v.bw.a(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            com.google.v.bv r2 = com.google.v.bv.a(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            com.google.v.bu r2 = com.google.v.bu.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            com.google.v.bo r2 = com.google.v.bo.a(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            com.google.v.bi r2 = com.google.v.bi.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            com.google.v.bh r2 = com.google.v.bh.a(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            com.google.v.bg r2 = com.google.v.bg.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            com.google.v.bf r2 = com.google.v.bf.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            com.google.v.be r2 = com.google.v.be.a(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            com.google.v.bd r2 = com.google.v.bd.a(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            com.google.v.bc r2 = com.google.v.bc.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            com.google.v.bb r2 = com.google.v.bb.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            com.google.v.ba r2 = com.google.v.ba.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            com.google.v.ax r2 = com.google.v.ax.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            com.google.v.am r2 = com.google.v.am.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            com.google.v.ah r2 = com.google.v.ah.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            com.google.v.aj r2 = com.google.v.aj.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.ai.isInRange(int):boolean");
    }
}
