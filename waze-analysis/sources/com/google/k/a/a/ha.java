package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ha implements com.google.v.ei {
    private final /* synthetic */ int v;
    static final com.google.v.ei u = new ha(20);
    static final com.google.v.ei t = new ha(19);
    static final com.google.v.ei s = new ha(18);
    static final com.google.v.ei r = new ha(17);
    static final com.google.v.ei q = new ha(16);
    static final com.google.v.ei p = new ha(15);
    static final com.google.v.ei o = new ha(14);
    static final com.google.v.ei n = new ha(13);
    static final com.google.v.ei m = new ha(12);

    /* renamed from: l, reason: collision with root package name */
    static final com.google.v.ei f11895l = new ha(11);

    /* renamed from: k, reason: collision with root package name */
    static final com.google.v.ei f11894k = new ha(10);

    /* renamed from: j, reason: collision with root package name */
    static final com.google.v.ei f11893j = new ha(9);

    /* renamed from: i, reason: collision with root package name */
    static final com.google.v.ei f11892i = new ha(8);

    /* renamed from: h, reason: collision with root package name */
    static final com.google.v.ei f11891h = new ha(7);

    /* renamed from: g, reason: collision with root package name */
    static final com.google.v.ei f11890g = new ha(6);

    /* renamed from: f, reason: collision with root package name */
    static final com.google.v.ei f11889f = new ha(5);

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f11888e = new ha(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f11887d = new ha(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f11886c = new ha(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f11885b = new ha(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f11884a = new ha(0);

    private ha(int i2) {
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
            com.google.k.a.a.ll r2 = com.google.k.a.a.ll.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            com.google.k.a.a.lc r2 = com.google.k.a.a.lc.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            com.google.k.a.a.kt r2 = com.google.k.a.a.kt.a(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            com.google.k.a.a.ko r2 = com.google.k.a.a.ko.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            com.google.k.a.a.kl r2 = com.google.k.a.a.kl.a(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            com.google.k.a.a.ke r2 = com.google.k.a.a.ke.a(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            com.google.k.a.a.jt r2 = com.google.k.a.a.jt.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            com.google.k.a.a.jm r2 = com.google.k.a.a.jm.a(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            com.google.k.a.a.jh r2 = com.google.k.a.a.jh.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            com.google.k.a.a.ip r2 = com.google.k.a.a.ip.a(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            com.google.k.a.a.id r2 = com.google.k.a.a.id.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            com.google.k.a.a.hx r2 = com.google.k.a.a.hx.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            com.google.k.a.a.hw r2 = com.google.k.a.a.hw.a(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            com.google.k.a.a.hr r2 = com.google.k.a.a.hr.a(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            com.google.k.a.a.hq r2 = com.google.k.a.a.hq.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            com.google.k.a.a.hm r2 = com.google.k.a.a.hm.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            com.google.k.a.a.hk r2 = com.google.k.a.a.hk.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            com.google.k.a.a.hg r2 = com.google.k.a.a.hg.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            com.google.k.a.a.hf r2 = com.google.k.a.a.hf.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            com.google.k.a.a.gz r2 = com.google.k.a.a.gz.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            com.google.k.a.a.hb r2 = com.google.k.a.a.hb.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.k.a.a.ha.isInRange(int):boolean");
    }
}
