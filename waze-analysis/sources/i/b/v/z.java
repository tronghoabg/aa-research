package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class z implements com.google.v.ei {
    private final /* synthetic */ int v;
    static final com.google.v.ei u = new z(20);
    static final com.google.v.ei t = new z(19);
    static final com.google.v.ei s = new z(18);
    static final com.google.v.ei r = new z(17);
    static final com.google.v.ei q = new z(16);
    static final com.google.v.ei p = new z(15);
    static final com.google.v.ei o = new z(14);
    static final com.google.v.ei n = new z(13);
    static final com.google.v.ei m = new z(12);

    /* renamed from: l, reason: collision with root package name */
    static final com.google.v.ei f49565l = new z(11);

    /* renamed from: k, reason: collision with root package name */
    static final com.google.v.ei f49564k = new z(10);

    /* renamed from: j, reason: collision with root package name */
    static final com.google.v.ei f49563j = new z(9);

    /* renamed from: i, reason: collision with root package name */
    static final com.google.v.ei f49562i = new z(8);

    /* renamed from: h, reason: collision with root package name */
    static final com.google.v.ei f49561h = new z(7);

    /* renamed from: g, reason: collision with root package name */
    static final com.google.v.ei f49560g = new z(6);

    /* renamed from: f, reason: collision with root package name */
    static final com.google.v.ei f49559f = new z(5);

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f49558e = new z(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f49557d = new z(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f49556c = new z(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f49555b = new z(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f49554a = new z(0);

    private z(int i2) {
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
            i.b.v.ei r2 = i.b.v.ei.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            i.b.v.dw r2 = i.b.v.dw.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            i.b.v.dk r2 = i.b.v.dk.a(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            i.b.v.dh r2 = i.b.v.dh.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            i.b.v.cv r2 = i.b.v.cv.a(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            i.b.v.cs r2 = i.b.v.cs.a(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            i.b.v.cr r2 = i.b.v.cr.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            i.b.v.co r2 = i.b.v.co.a(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            i.b.v.cn r2 = i.b.v.cn.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            i.b.v.cm r2 = i.b.v.cm.a(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            i.b.v.bz r2 = i.b.v.bz.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            i.b.v.bw r2 = i.b.v.bw.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            i.b.v.bn r2 = i.b.v.bn.a(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            i.b.v.bh r2 = i.b.v.bh.a(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            i.b.v.as r2 = i.b.v.as.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            i.b.v.ar r2 = i.b.v.ar.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            i.b.v.aq r2 = i.b.v.aq.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            i.b.v.an r2 = i.b.v.an.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            i.b.v.ae r2 = i.b.v.ae.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            i.b.v.h r2 = i.b.v.h.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            i.b.v.aa r2 = i.b.v.aa.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.v.z.isInRange(int):boolean");
    }
}
