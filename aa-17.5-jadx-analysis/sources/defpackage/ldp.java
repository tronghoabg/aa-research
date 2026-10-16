package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ldp extends ldq {
    @Override // defpackage.ldq
    public final tea a() {
        jes jesVar = (jes) ((WeakReference) ivs.a().b).get();
        return lbh.b(jesVar != null ? jesVar.t() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    @Override // defpackage.ldq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean b() {
        /*
            r2 = this;
            ivs r2 = defpackage.ivs.a()
            jeq r0 = defpackage.jeq.e
            java.lang.Object r2 = r2.a
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            jer r2 = (defpackage.jer) r2
            if (r2 == 0) goto L16
            jeq r0 = r2.a()
        L16:
            int r2 = r0.ordinal()
            if (r2 == 0) goto L33
            r0 = 1
            if (r2 == r0) goto L34
            r1 = 2
            if (r2 == r1) goto L34
            r1 = 3
            if (r2 == r1) goto L34
            r1 = 4
            if (r2 == r1) goto L33
            r1 = 5
            if (r2 != r1) goto L2c
            goto L34
        L2c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r0 = 0
            r2.<init>(r0, r0)
            throw r2
        L33:
            r0 = 0
        L34:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldp.b():java.lang.Boolean");
    }
}
