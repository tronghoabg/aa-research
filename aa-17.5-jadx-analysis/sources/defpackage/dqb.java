package defpackage;

/* loaded from: classes2.dex */
public final class dqb extends dpv {
    public int ao;
    private int ap;
    private dqk aq;

    public dqb(dpz dpzVar) {
        super(dpzVar, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    @Override // defpackage.dpv, defpackage.dpp, defpackage.dpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r5 = this;
            r5.x()
            int r0 = r5.ao
            int r1 = r0 + (-1)
            if (r0 == 0) goto L2a
            r0 = 0
            if (r1 == 0) goto L21
            r2 = 1
            if (r1 == r2) goto L20
            r3 = 2
            if (r1 == r3) goto L21
            r4 = 3
            if (r1 == r4) goto L20
            r2 = 4
            if (r1 == r2) goto L1e
            r2 = 5
            if (r1 == r2) goto L1c
            goto L21
        L1c:
            r0 = r4
            goto L21
        L1e:
            r0 = r3
            goto L21
        L20:
            r0 = r2
        L21:
            dqk r1 = r5.aq
            r1.a = r0
            int r5 = r5.ap
            r1.c = r5
            return
        L2a:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqb.e():void");
    }

    @Override // defpackage.dpp
    public final void o(int i) {
        this.ap = i;
    }

    @Override // defpackage.dpp
    public final void w(Object obj) {
        this.ap = this.al.a(obj);
    }

    @Override // defpackage.dpv
    public final dqs x() {
        dqk dqkVar = this.aq;
        if (dqkVar != null) {
            return dqkVar;
        }
        dqk dqkVar2 = new dqk();
        this.aq = dqkVar2;
        return dqkVar2;
    }
}
