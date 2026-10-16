package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class e implements com.google.v.ei {
    private final /* synthetic */ int v;
    static final com.google.v.ei u = new e(20);
    static final com.google.v.ei t = new e(19);
    static final com.google.v.ei s = new e(18);
    static final com.google.v.ei r = new e(17);
    static final com.google.v.ei q = new e(16);
    static final com.google.v.ei p = new e(15);
    static final com.google.v.ei o = new e(14);
    static final com.google.v.ei n = new e(13);
    static final com.google.v.ei m = new e(12);

    /* renamed from: l, reason: collision with root package name */
    static final com.google.v.ei f48665l = new e(11);

    /* renamed from: k, reason: collision with root package name */
    static final com.google.v.ei f48664k = new e(10);

    /* renamed from: j, reason: collision with root package name */
    static final com.google.v.ei f48663j = new e(9);

    /* renamed from: i, reason: collision with root package name */
    static final com.google.v.ei f48662i = new e(8);

    /* renamed from: h, reason: collision with root package name */
    static final com.google.v.ei f48661h = new e(7);

    /* renamed from: g, reason: collision with root package name */
    static final com.google.v.ei f48660g = new e(6);

    /* renamed from: f, reason: collision with root package name */
    static final com.google.v.ei f48659f = new e(5);

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f48658e = new e(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f48657d = new e(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f48656c = new e(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f48655b = new e(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f48654a = new e(0);

    private e(int i2) {
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
            i.b.l.ef r2 = i.b.l.ef.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            i.b.l.ee r2 = i.b.l.ee.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            i.b.l.ea r2 = i.b.l.ea.a(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            i.b.l.du r2 = i.b.l.du.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            i.b.l.dc r2 = i.b.l.dc.a(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            i.b.l.bm r2 = i.b.l.bm.a(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            i.b.l.bf r2 = i.b.l.bf.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            i.b.l.ay r2 = i.b.l.ay.a(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            i.b.l.aw r2 = i.b.l.aw.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            i.b.l.at r2 = i.b.l.at.a(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            i.b.l.aq r2 = i.b.l.aq.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            i.b.l.an r2 = i.b.l.an.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            i.b.l.ah r2 = i.b.l.ah.a(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            i.b.l.p r2 = i.b.l.p.a(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            i.b.l.m r2 = i.b.l.m.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            i.b.l.l r2 = i.b.l.l.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            i.b.l.k r2 = i.b.l.k.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            i.b.l.i r2 = i.b.l.i.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            i.b.l.g r2 = i.b.l.g.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            i.b.l.b r2 = i.b.l.b.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            i.b.l.f r2 = i.b.l.f.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.l.e.isInRange(int):boolean");
    }
}
