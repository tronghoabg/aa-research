package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tgm {
    public static final tgm a = new tgm();
    public static final Map b;

    static {
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap.getClass();
        b = mapSynchronizedMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.tfj r6, defpackage.tgk r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.tgl
            if (r0 == 0) goto L13
            r0 = r8
            tgl r0 = (defpackage.tgl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tgl r0 = new tgl
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.a
            afcr r8 = defpackage.afcr.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            tgk r7 = r0.e
            tfj r6 = r0.d
            defpackage.woy.dF(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.woy.dF(r5)
            j$.time.Duration r5 = r7.a
            long r3 = r5.toMillis()
            r0.d = r6
            r0.e = r7
            r0.c = r2
            java.lang.Object r5 = defpackage.aiow.c(r3, r0)
            if (r5 != r8) goto L49
            return r8
        L49:
            int r5 = r7.b
            tfk r5 = defpackage.tfk.a
            r7 = 2
            r5.d(r6, r7)
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgm.a(tfj, tgk, afck):java.lang.Object");
    }
}
