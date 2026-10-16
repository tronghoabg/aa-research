package com.google.aa.a.a.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements ei {
    private final /* synthetic */ int v;
    static final ei u = new i(20);
    static final ei t = new i(19);
    static final ei s = new i(18);
    static final ei r = new i(17);
    static final ei q = new i(16);
    static final ei p = new i(15);
    static final ei o = new i(14);
    static final ei n = new i(13);
    static final ei m = new i(12);

    /* renamed from: l, reason: collision with root package name */
    static final ei f3794l = new i(11);

    /* renamed from: k, reason: collision with root package name */
    static final ei f3793k = new i(10);

    /* renamed from: j, reason: collision with root package name */
    static final ei f3792j = new i(9);

    /* renamed from: i, reason: collision with root package name */
    static final ei f3791i = new i(8);

    /* renamed from: h, reason: collision with root package name */
    static final ei f3790h = new i(7);

    /* renamed from: g, reason: collision with root package name */
    static final ei f3789g = new i(6);

    /* renamed from: f, reason: collision with root package name */
    static final ei f3788f = new i(5);

    /* renamed from: e, reason: collision with root package name */
    static final ei f3787e = new i(4);

    /* renamed from: d, reason: collision with root package name */
    static final ei f3786d = new i(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f3785c = new i(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f3784b = new i(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f3783a = new i(0);

    private i(int i2) {
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
            com.google.aa.a.a.a.a.ci r2 = com.google.aa.a.a.a.a.ci.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Le:
            com.google.aa.a.a.a.a.ca r2 = com.google.aa.a.a.a.a.ca.a(r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            return r1
        L16:
            com.google.aa.a.a.a.a.bx r2 = com.google.aa.a.a.a.a.bx.a(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            com.google.aa.a.a.a.a.bw r2 = com.google.aa.a.a.a.a.bw.a(r3)
            if (r2 == 0) goto L25
            return r0
        L25:
            return r1
        L26:
            com.google.aa.a.a.a.a.bt r2 = com.google.aa.a.a.a.a.bt.a(r3)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            return r1
        L2e:
            com.google.aa.a.a.a.a.bs r2 = com.google.aa.a.a.a.a.bs.a(r3)
            if (r2 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            com.google.aa.a.a.a.a.bq r2 = com.google.aa.a.a.a.a.bq.a(r3)
            if (r2 == 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            com.google.aa.a.a.a.a.bf r2 = com.google.aa.a.a.a.a.bf.a(r3)
            if (r2 == 0) goto L45
            return r0
        L45:
            return r1
        L46:
            com.google.aa.a.a.a.a.bc r2 = com.google.aa.a.a.a.a.bc.a(r3)
            if (r2 == 0) goto L4d
            return r0
        L4d:
            return r1
        L4e:
            com.google.aa.a.a.a.a.aq r2 = com.google.aa.a.a.a.a.aq.a(r3)
            if (r2 == 0) goto L55
            return r0
        L55:
            return r1
        L56:
            com.google.aa.a.a.a.a.ao r2 = com.google.aa.a.a.a.a.ao.a(r3)
            if (r2 == 0) goto L5d
            return r0
        L5d:
            return r1
        L5e:
            com.google.aa.a.a.a.a.am r2 = com.google.aa.a.a.a.a.am.a(r3)
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            com.google.aa.a.a.a.a.ag r2 = com.google.aa.a.a.a.a.ag.a(r3)
            if (r2 == 0) goto L6d
            return r0
        L6d:
            return r1
        L6e:
            com.google.aa.a.a.a.a.ae r2 = com.google.aa.a.a.a.a.ae.a(r3)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            com.google.aa.a.a.a.a.ab r2 = com.google.aa.a.a.a.a.ab.a(r3)
            if (r2 == 0) goto L7d
            return r0
        L7d:
            return r1
        L7e:
            com.google.aa.a.a.a.a.y r2 = com.google.aa.a.a.a.a.y.a(r3)
            if (r2 == 0) goto L85
            return r0
        L85:
            return r1
        L86:
            com.google.aa.a.a.a.a.t r2 = com.google.aa.a.a.a.a.t.a(r3)
            if (r2 == 0) goto L8d
            return r0
        L8d:
            return r1
        L8e:
            com.google.aa.a.a.a.a.o r2 = com.google.aa.a.a.a.a.o.a(r3)
            if (r2 == 0) goto L95
            return r0
        L95:
            return r1
        L96:
            com.google.aa.a.a.a.a.l r2 = com.google.aa.a.a.a.a.l.a(r3)
            if (r2 == 0) goto L9d
            return r0
        L9d:
            return r1
        L9e:
            com.google.aa.a.a.a.a.h r2 = com.google.aa.a.a.a.a.h.a(r3)
            if (r2 == 0) goto La5
            return r0
        La5:
            return r1
        La6:
            com.google.aa.a.a.a.a.j r2 = com.google.aa.a.a.a.a.j.a(r3)
            if (r2 == 0) goto Lad
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aa.a.a.a.a.i.isInRange(int):boolean");
    }
}
