package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class wcy {
    public static final /* synthetic */ int a = 0;
    private static final kwp d = new kwp(wbq.a);
    private static final Object b = new Object();
    private static volatile rdx c = null;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = a(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcy.a(java.io.File):boolean");
    }

    public static wgx b(wae waeVar) {
        wgg wggVarA = wgh.a();
        Pattern pattern = wez.a;
        wey weyVar = new wey(waeVar.c);
        weyVar.b("phenotype");
        weyVar.c("all_accounts.pb");
        wggVarA.d(weyVar.a());
        wggVarA.c(wbq.a);
        wggVarA.e(d);
        wggVarA.b();
        wgh wghVarA = wggVarA.a();
        rdx rdxVar = c;
        if (rdxVar == null) {
            synchronized (b) {
                rdxVar = c;
                if (rdxVar == null) {
                    wha whaVar = wha.a;
                    HashMap map = new HashMap();
                    zgt zgtVarB = waeVar.b();
                    nfh nfhVar = (nfh) waeVar.e.gu();
                    woy.aA(wgr.a, map);
                    rdx rdxVar2 = new rdx(zgtVarB, nfhVar, whaVar, map);
                    c = rdxVar2;
                    rdxVar = rdxVar2;
                }
            }
        }
        return rdxVar.d(wghVarA);
    }
}
