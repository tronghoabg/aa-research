package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class lcy {
    public final wgx d;
    public final ncp e;
    private final wgh f;
    public static final lcw a = new lcw();
    public static final yph b = yph.c("GH.CsatRateLimiter");
    private static final kwp g = new kwp(abqw.a);
    public static final afgl c = new lcj(woy.df(new mkh[]{mkh.b, mkh.a}), 3);

    public /* synthetic */ lcy(byte[] bArr) {
        mki mkiVar = mki.a;
        Context context = mkiVar.c;
        context.getClass();
        Executor executor = mkiVar.d;
        executor.getClass();
        context.getClass();
        executor.getClass();
        wgg wggVarA = wgh.a();
        Pattern pattern = wez.a;
        wey weyVar = new wey(context);
        weyVar.b("csat");
        weyVar.c("ratelimit.pb");
        wggVarA.d(weyVar.a());
        abqw abqwVar = abqw.a;
        wggVarA.c(abqwVar);
        wggVarA.e(g);
        wggVarA.a = wgj.a;
        wgh wghVarA = wggVarA.a();
        this.f = wghVarA;
        aezr aezrVar = mie.a;
        this.d = mdh.e().a(wghVarA);
        abqwVar.getClass();
        abnj abnjVar = abnj.a;
        abnjVar.getClass();
        ehr ehrVar = new ehr(new egw(abqwVar, abnjVar), new flt(context, 8));
        ehrVar.a = new ehp(new kmn(20));
        ehrVar.a(executor);
        ehrVar.b = true;
        this.e = ehrVar.b();
    }

    public static final void a(zgp zgpVar) {
        wub.ah(zgpVar, new lcx(), zfq.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set b(java.util.Set r9, defpackage.abqw r10, j$.time.Instant r11) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcy.b(java.util.Set, abqw, j$.time.Instant):java.util.Set");
    }

    public lcy() {
        this(null);
    }
}
