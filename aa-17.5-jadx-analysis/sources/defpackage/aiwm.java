package defpackage;

/* loaded from: classes3.dex */
public final class aiwm extends ajcw implements Runnable {
    public final long b;

    public aiwm(long j, afck afckVar) {
        super(afckVar.hH(), afckVar);
        this.b = j;
    }

    @Override // defpackage.aisz, defpackage.aivo
    public final String hG() {
        return super.hG() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            afco r0 = r7.a
            aiuf r1 = defpackage.aiow.e(r0)
            ezh r2 = defpackage.aitw.b
            afcm r0 = r0.get(r2)
            aitw r0 = (defpackage.aitw) r0
            r2 = 0
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.a
            goto L15
        L14:
            r0 = r2
        L15:
            long r3 = r7.b
            boolean r5 = r1 instanceof defpackage.aiuh
            if (r5 == 0) goto L1e
            r2 = r1
            aiuh r2 = (defpackage.aiuh) r2
        L1e:
            if (r2 == 0) goto L2d
            long r5 = defpackage.aisq.a
            aiss r1 = defpackage.aiss.c
            defpackage.afzc.d(r3, r1)
            java.lang.String r1 = r2.a()
            if (r1 != 0) goto L35
        L2d:
            java.lang.String r1 = "Timed out waiting for "
            java.lang.String r2 = " ms"
            java.lang.String r1 = defpackage.a.bI(r3, r1, r2)
        L35:
            if (r0 == 0) goto L65
            int r2 = r1.length()
            if (r2 <= 0) goto L5d
            r2 = 0
            char r2 = r1.charAt(r2)
            char r2 = java.lang.Character.toLowerCase(r2)
            r3 = 1
            java.lang.String r1 = r1.substring(r3)
            r1.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L5d:
            java.lang.String r2 = "Coroutine \""
            java.lang.String r3 = "\" "
            java.lang.String r1 = defpackage.a.bM(r1, r0, r2, r3)
        L65:
            aiwl r0 = new aiwl
            r0.<init>(r1, r7)
            r7.L(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwm.run():void");
    }
}
