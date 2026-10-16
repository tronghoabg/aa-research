package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dac implements aitx {
    public final View a;
    public final aitx b;
    public final AtomicReference c = new AtomicReference(null);
    public final fbf d;

    public dac(View view, fbf fbfVar, aitx aitxVar) {
        this.a = view;
        this.d = fbfVar;
        this.b = aitxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bip r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dab
            if (r0 == 0) goto L13
            r0 = r8
            dab r0 = (defpackage.dab) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dab r0 = new dab
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            defpackage.woy.dF(r8)
            goto L4e
        L2f:
            defpackage.woy.dF(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r6.c
            bpi r2 = new bpi
            r4 = 5
            r5 = 0
            r2.<init>(r7, r6, r4, r5)
            dmx r7 = new dmx
            r7.<init>(r6, r5, r3)
            r0.c = r3
            cgb r6 = new cgb
            r6.<init>(r2, r8, r7, r5)
            java.lang.Object r6 = defpackage.ahni.a(r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            aezp r6 = new aezp
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dac.a(bip, afck):java.lang.Object");
    }

    @Override // defpackage.aitx
    public final afco c() {
        return this.b.c();
    }
}
