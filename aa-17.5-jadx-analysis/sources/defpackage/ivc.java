package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.car.CarInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ivc implements jbo {
    private static final yph c = yph.c("GH.CAR.VIDEO");
    public final List a;
    public boolean b;
    private final jfg d;
    private final jes e;
    private final jev f;
    private final ikz g;
    private final jew h;
    private final Context i;
    private final ivb j;
    private final iwe k;
    private final Handler l;
    private final jcp m;
    private final irx n;
    private final boolean o;
    private final imf p;
    private final jgi q;
    private final izj r;

    public ivc(izj izjVar, jfg jfgVar, jes jesVar, jev jevVar, ikz ikzVar, jew jewVar, Context context, ivb ivbVar, Handler handler, jcp jcpVar, irx irxVar, imf imfVar, jgi jgiVar) {
        iwe iweVar = (iwe) new wba(c(jesVar), null).b(xkj.MEDIA_CODEC_VIDEO_H265, null);
        this.a = new ArrayList();
        this.r = izjVar;
        this.d = jfgVar;
        this.e = jesVar;
        this.f = jevVar;
        this.g = ikzVar;
        this.h = jewVar;
        this.i = context;
        this.j = ivbVar;
        this.k = iweVar;
        this.l = handler;
        this.m = jcpVar;
        this.n = irxVar;
        this.o = c(jesVar);
        this.p = imfVar;
        this.q = jgiVar;
    }

    private final String b(String str) {
        return this.g.b(str, null);
    }

    private static boolean c(jes jesVar) {
        CarInfo carInfoT = jesVar.t();
        return new jbq(carInfoT.e, carInfoT.f).t(6, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039c  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0, types: [ilc, iut, java.lang.Object, jev, jew] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ivf, iyw, java.lang.Object] */
    @Override // defpackage.jbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.iyw a(defpackage.xnz r32) throws defpackage.ijw {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivc.a(xnz):iyw");
    }
}
