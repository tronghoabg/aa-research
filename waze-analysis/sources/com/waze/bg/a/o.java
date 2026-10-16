package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o implements com.google.v.ei {
    private final /* synthetic */ int v;
    static final com.google.v.ei u = new o(20);
    static final com.google.v.ei t = new o(19);
    static final com.google.v.ei s = new o(18);
    static final com.google.v.ei r = new o(17);
    static final com.google.v.ei q = new o(16);
    static final com.google.v.ei p = new o(15);
    static final com.google.v.ei o = new o(14);
    static final com.google.v.ei n = new o(13);
    static final com.google.v.ei m = new o(12);

    /* renamed from: l, reason: collision with root package name */
    static final com.google.v.ei f16566l = new o(11);

    /* renamed from: k, reason: collision with root package name */
    static final com.google.v.ei f16565k = new o(10);

    /* renamed from: j, reason: collision with root package name */
    static final com.google.v.ei f16564j = new o(9);

    /* renamed from: i, reason: collision with root package name */
    static final com.google.v.ei f16563i = new o(8);

    /* renamed from: h, reason: collision with root package name */
    static final com.google.v.ei f16562h = new o(7);

    /* renamed from: g, reason: collision with root package name */
    static final com.google.v.ei f16561g = new o(6);

    /* renamed from: f, reason: collision with root package name */
    static final com.google.v.ei f16560f = new o(5);

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f16559e = new o(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f16558d = new o(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f16557c = new o(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f16556b = new o(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f16555a = new o(0);

    private o(int i2) {
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
            com.waze.bg.a.ca r2 = com.waze.bg.a.ca.b(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            com.waze.bg.a.bz r2 = com.waze.bg.a.bz.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            com.waze.bg.a.by r2 = com.waze.bg.a.by.b(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            com.waze.bg.a.bx r2 = com.waze.bg.a.bx.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            com.waze.bg.a.bw r2 = com.waze.bg.a.bw.b(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            com.waze.bg.a.bv r2 = com.waze.bg.a.bv.b(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            com.waze.bg.a.bu r2 = com.waze.bg.a.bu.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            com.waze.bg.a.bt r2 = com.waze.bg.a.bt.b(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            com.waze.bg.a.bs r2 = com.waze.bg.a.bs.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            com.waze.bg.a.br r2 = com.waze.bg.a.br.b(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            com.waze.bg.a.bq r2 = com.waze.bg.a.bq.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            com.waze.bg.a.bp r2 = com.waze.bg.a.bp.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            com.waze.bg.a.bo r2 = com.waze.bg.a.bo.b(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            com.waze.bg.a.bn r2 = com.waze.bg.a.bn.b(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            com.waze.bg.a.bm r2 = com.waze.bg.a.bm.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            com.waze.bg.a.bl r2 = com.waze.bg.a.bl.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            com.waze.bg.a.bk r2 = com.waze.bg.a.bk.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            com.waze.bg.a.au r2 = com.waze.bg.a.au.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            com.waze.bg.a.ah r2 = com.waze.bg.a.ah.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            com.waze.bg.a.d r2 = com.waze.bg.a.d.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            com.waze.bg.a.p r2 = com.waze.bg.a.p.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bg.a.o.isInRange(int):boolean");
    }
}
