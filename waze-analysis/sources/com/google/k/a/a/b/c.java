package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c implements com.google.v.ei {
    private final /* synthetic */ int v;
    static final com.google.v.ei u = new c(20);
    static final com.google.v.ei t = new c(19);
    static final com.google.v.ei s = new c(18);
    static final com.google.v.ei r = new c(17);
    static final com.google.v.ei q = new c(16);
    static final com.google.v.ei p = new c(15);
    static final com.google.v.ei o = new c(14);
    static final com.google.v.ei n = new c(13);
    static final com.google.v.ei m = new c(12);

    /* renamed from: l, reason: collision with root package name */
    static final com.google.v.ei f11208l = new c(11);

    /* renamed from: k, reason: collision with root package name */
    static final com.google.v.ei f11207k = new c(10);

    /* renamed from: j, reason: collision with root package name */
    static final com.google.v.ei f11206j = new c(9);

    /* renamed from: i, reason: collision with root package name */
    static final com.google.v.ei f11205i = new c(8);

    /* renamed from: h, reason: collision with root package name */
    static final com.google.v.ei f11204h = new c(7);

    /* renamed from: g, reason: collision with root package name */
    static final com.google.v.ei f11203g = new c(6);

    /* renamed from: f, reason: collision with root package name */
    static final com.google.v.ei f11202f = new c(5);

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f11201e = new c(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f11200d = new c(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f11199c = new c(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f11198b = new c(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f11197a = new c(0);

    private c(int i2) {
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
            com.google.k.a.a.b.dl r2 = com.google.k.a.a.b.dl.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            com.google.k.a.a.b.dk r2 = com.google.k.a.a.b.dk.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            com.google.k.a.a.b.dg r2 = com.google.k.a.a.b.dg.a(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            com.google.k.a.a.b.cz r2 = com.google.k.a.a.b.cz.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            com.google.k.a.a.b.cu r2 = com.google.k.a.a.b.cu.a(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            com.google.k.a.a.b.ck r2 = com.google.k.a.a.b.ck.a(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            com.google.k.a.a.b.bs r2 = com.google.k.a.a.b.bs.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            com.google.k.a.a.b.bp r2 = com.google.k.a.a.b.bp.a(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            com.google.k.a.a.b.bo r2 = com.google.k.a.a.b.bo.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            com.google.k.a.a.b.bl r2 = com.google.k.a.a.b.bl.a(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            com.google.k.a.a.b.bd r2 = com.google.k.a.a.b.bd.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            com.google.k.a.a.b.aw r2 = com.google.k.a.a.b.aw.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            com.google.k.a.a.b.at r2 = com.google.k.a.a.b.at.a(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            com.google.k.a.a.b.ar r2 = com.google.k.a.a.b.ar.a(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            com.google.k.a.a.b.al r2 = com.google.k.a.a.b.al.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            com.google.k.a.a.b.ae r2 = com.google.k.a.a.b.ae.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            com.google.k.a.a.b.w r2 = com.google.k.a.a.b.w.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            com.google.k.a.a.b.t r2 = com.google.k.a.a.b.t.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            com.google.k.a.a.b.k r2 = com.google.k.a.a.b.k.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            com.google.k.a.a.b.b r2 = com.google.k.a.a.b.b.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            com.google.k.a.a.b.d r2 = com.google.k.a.a.b.d.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.k.a.a.b.c.isInRange(int):boolean");
    }
}
