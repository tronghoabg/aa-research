package defpackage;

/* loaded from: classes3.dex */
public final class vuc extends vmc {
    public vuc(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    @Override // defpackage.vmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r6 = this;
            ajgu r6 = r6.a
            java.util.Locale r0 = java.util.Locale.US
            ajex r1 = r6.t
            if (r1 != 0) goto La
            ajex r1 = defpackage.ajex.a
        La:
            int r1 = r1.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            ajex r2 = r6.t
            if (r2 != 0) goto L17
            ajex r3 = defpackage.ajex.a
            goto L18
        L17:
            r3 = r2
        L18:
            int r3 = r3.f
            int r3 = defpackage.a.as(r3)
            if (r3 != 0) goto L21
            goto L36
        L21:
            switch(r3) {
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L27;
                default: goto L24;
            }
        L24:
            java.lang.String r3 = "INCOMPLETE"
            goto L38
        L27:
            java.lang.String r3 = "INTERRUPTED"
            goto L38
        L2a:
            java.lang.String r3 = "TIMEOUT"
            goto L38
        L2d:
            java.lang.String r3 = "CANCELED"
            goto L38
        L30:
            java.lang.String r3 = "FAILURE"
            goto L38
        L33:
            java.lang.String r3 = "SUCCESS"
            goto L38
        L36:
            java.lang.String r3 = "UNKNOWN"
        L38:
            if (r2 != 0) goto L3c
            ajex r2 = defpackage.ajex.a
        L3c:
            abnf r2 = r2.d
            if (r2 != 0) goto L42
            abnf r2 = defpackage.abnf.a
        L42:
            long r4 = defpackage.abqs.a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r2 = f(r2)
            ajex r6 = r6.t
            if (r6 != 0) goto L54
            ajex r6 = defpackage.ajex.a
        L54:
            long r4 = r6.e
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r3
            r1 = 2
            r4[r1] = r2
            r1 = 3
            r4[r1] = r6
            java.lang.String r6 = "CUI id=%d status: %s, duration: %s, trace_id: %s"
            java.lang.String r6 = java.lang.String.format(r0, r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vuc.e():java.lang.String");
    }

    @Override // defpackage.vmc
    public final String g() {
        return "CUI";
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 524288) != 0;
    }
}
