package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class mdc extends nyh {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.ParkedNativeApps");
    static final ygr a = new ymp(nyi.b);

    public mdc() {
        super("CNA");
    }

    public static mdc a() {
        return (mdc) mki.a.b(mdc.class, new lfu(4));
    }

    public static final yfq d(qrn qrnVar) {
        if (lzf.a(qrnVar)) {
            return e(qrnVar, nyj.a(), acpf.d());
        }
        ((ype) c.l().ai((char) 4774)).u("Cannot launch on currently connected car");
        int i = yfq.d;
        return yls.a;
    }

    private static final yfq e(qrn qrnVar, nyj nyjVar, abrh abrhVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        qpi qpiVar = qpi.j;
        ygr ygrVar = a;
        yfq yfqVarA = mjv.b().a(qrnVar, new nyk(intent, qpiVar, nyjVar.c(ygrVar)));
        yph yphVar = c;
        ((ype) yphVar.l().ai((char) 4770)).y("Raw list of native apps found: %s", yfqVarA);
        Stream streamFilter = Collection.EL.stream(yfqVarA).filter(new lou(abrhVar, 17));
        yfq yfqVarA2 = mjv.b().a(qrnVar, new nyk(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_LAUNCHER"), qpiVar, nyjVar.c(ygrVar)));
        if (yfqVarA2.isEmpty()) {
            ((ype) ((ype) yphVar.f()).ai((char) 4773)).u("No opted-in native apps found");
        } else {
            ((ype) yphVar.l().ai((char) 4772)).y("Raw list of opted-in native apps found: %s", yfqVarA2);
        }
        return (yfq) Stream.CC.concat(streamFilter, Collection.EL.stream(yfqVarA2)).distinct().map(new lyd(10)).collect(ycm.a);
    }

    @Override // defpackage.nyh
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        if (nyjVar.e()) {
            if (!lzf.a(qrnVar)) {
                ((ype) c.l().ai((char) 4771)).u("Cannot launch on currently connected car");
                int i = yfq.d;
                return yls.a;
            }
        } else if (!lzf.b(qrnVar, false)) {
            int i2 = yfq.d;
            return yls.a;
        }
        return e(qrnVar, nyjVar, acpf.e());
    }

    @Override // defpackage.nyh, defpackage.mnd
    public final void h(PrintWriter printWriter) {
    }
}
