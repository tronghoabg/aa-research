package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class hf implements com.google.v.ei {
    private final /* synthetic */ int v;
    static final com.google.v.ei u = new hf(20);
    static final com.google.v.ei t = new hf(19);
    static final com.google.v.ei s = new hf(18);
    static final com.google.v.ei r = new hf(17);
    static final com.google.v.ei q = new hf(16);
    static final com.google.v.ei p = new hf(15);
    static final com.google.v.ei o = new hf(14);
    static final com.google.v.ei n = new hf(13);
    static final com.google.v.ei m = new hf(12);

    /* renamed from: l, reason: collision with root package name */
    static final com.google.v.ei f48748l = new hf(11);

    /* renamed from: k, reason: collision with root package name */
    static final com.google.v.ei f48747k = new hf(10);

    /* renamed from: j, reason: collision with root package name */
    static final com.google.v.ei f48746j = new hf(9);

    /* renamed from: i, reason: collision with root package name */
    static final com.google.v.ei f48745i = new hf(8);

    /* renamed from: h, reason: collision with root package name */
    static final com.google.v.ei f48744h = new hf(7);

    /* renamed from: g, reason: collision with root package name */
    static final com.google.v.ei f48743g = new hf(6);

    /* renamed from: f, reason: collision with root package name */
    static final com.google.v.ei f48742f = new hf(5);

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f48741e = new hf(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f48740d = new hf(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f48739c = new hf(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f48738b = new hf(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f48737a = new hf(0);

    private hf(int i2) {
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
            i.b.l.of r2 = i.b.l.of.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            i.b.l.nj r2 = i.b.l.nj.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            i.b.l.ni r2 = i.b.l.ni.a(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            i.b.l.mg r2 = i.b.l.mg.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            i.b.l.mf r2 = i.b.l.mf.a(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            i.b.l.md r2 = i.b.l.md.a(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            i.b.l.lw r2 = i.b.l.lw.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            i.b.l.lv r2 = i.b.l.lv.a(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            i.b.l.lu r2 = i.b.l.lu.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            i.b.l.lp r2 = i.b.l.lp.a(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            i.b.l.lk r2 = i.b.l.lk.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            i.b.l.kg r2 = i.b.l.kg.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            i.b.l.js r2 = i.b.l.js.a(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            i.b.l.jr r2 = i.b.l.jr.a(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            i.b.l.jl r2 = i.b.l.jl.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            i.b.l.iu r2 = i.b.l.iu.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            i.b.l.im r2 = i.b.l.im.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            i.b.l.ih r2 = i.b.l.ih.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            i.b.l.hw r2 = i.b.l.hw.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            i.b.l.gy r2 = i.b.l.gy.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            i.b.l.hg r2 = i.b.l.hg.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.l.hf.isInRange(int):boolean");
    }
}
