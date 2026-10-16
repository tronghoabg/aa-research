package defpackage;

import android.content.Context;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class wib {
    private static wib b;
    public sf a;
    private final String c;

    private wib() {
        long jNextLong = new SecureRandom().nextLong();
        this.c = System.currentTimeMillis() + "_" + (jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong));
    }

    public static wib a() {
        wib wibVar = b;
        if (wibVar != null) {
            return wibVar;
        }
        wib wibVar2 = new wib();
        b = wibVar2;
        return wibVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(defpackage.abnp r13, defpackage.abpt r14, defpackage.abnf r15, android.content.Context r16, java.lang.String r17) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wib.e(abnp, abpt, abnf, android.content.Context, java.lang.String):void");
    }

    public final void b(abvf abvfVar, abpt abptVar, abnf abnfVar, Context context, String str) {
        abnp abnpVarN = abwn.a.n();
        abnpVarN.t();
        abwn abwnVar = (abwn) abnpVarN.b;
        abvfVar.getClass();
        abwnVar.e = abvfVar;
        abwnVar.b |= 2;
        e(abnpVarN, abptVar, abnfVar, context, str);
    }

    public final void c(abvn abvnVar, abpt abptVar, abnf abnfVar, Context context, String str) {
        abnp abnpVarN = abwn.a.n();
        abnpVarN.t();
        abwn abwnVar = (abwn) abnpVarN.b;
        abvnVar.getClass();
        abwnVar.g = abvnVar;
        abwnVar.b |= 8;
        e(abnpVarN, abptVar, abnfVar, context, str);
    }

    public final void d(abwm abwmVar, abpt abptVar, abnf abnfVar, Context context, String str) {
        abnp abnpVarN = abwn.a.n();
        abnpVarN.t();
        abwn abwnVar = (abwn) abnpVarN.b;
        abwmVar.getClass();
        abwnVar.f = abwmVar;
        abwnVar.b |= 4;
        e(abnpVarN, abptVar, abnfVar, context, str);
    }
}
