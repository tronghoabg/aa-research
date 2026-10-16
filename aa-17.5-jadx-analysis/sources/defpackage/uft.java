package defpackage;

import android.util.DisplayMetrics;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class uft implements uyl {
    private static final yob y = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/internal/overlay/TileOverlayFactory");
    private final erb A;
    public final ackk a;
    public final uiw b;
    public final ums c;
    public final ugq d;
    public final uod e;
    public final tmb f;
    public final ppo g;
    public final ScheduledExecutorService h;
    public final Executor i;
    public final ttw j;
    public final ukz k;
    public final tox l;
    public final tpa m;
    public final aezk n;
    public final xyc o;
    public final ackk p;
    public final boolean q;
    public final tzt r;
    public final txe s;
    public final uaj t;
    public final plq u;
    public final uvg v;
    public final usy w;
    public final gjv x;
    private final DisplayMetrics z;

    public uft(uvg uvgVar, ackk ackkVar, uiw uiwVar, usy usyVar, tox toxVar, uod uodVar, tzt tztVar, ums umsVar, ugq ugqVar, tmb tmbVar, ppo ppoVar, ScheduledExecutorService scheduledExecutorService, Executor executor, ttw ttwVar, ukz ukzVar, erb erbVar, txe txeVar, aezk aezkVar, tpa tpaVar, xyc xycVar, ackk ackkVar2, boolean z, DisplayMetrics displayMetrics, uaj uajVar, plq plqVar) {
        this.v = uvgVar;
        this.a = ackkVar;
        this.b = uiwVar;
        this.w = usyVar;
        this.l = toxVar;
        this.e = uodVar;
        this.r = tztVar;
        this.c = umsVar;
        this.d = ugqVar;
        this.f = tmbVar;
        this.g = ppoVar;
        this.h = scheduledExecutorService;
        this.i = executor;
        this.j = ttwVar;
        this.k = ukzVar;
        this.A = erbVar;
        this.s = txeVar;
        this.n = aezkVar;
        this.m = tpaVar;
        this.x = new gjv((tpd) tpaVar);
        this.o = xycVar;
        this.p = ackkVar2;
        this.q = z;
        this.z = displayMetrics;
        this.t = uajVar;
        this.u = plqVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final defpackage.ufs f(defpackage.tox r41, defpackage.ukr r42, defpackage.uor r43, defpackage.ujx r44, boolean r45, defpackage.uly r46) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uft.f(tox, ukr, uor, ujx, boolean, uly):ufs");
    }

    public final ufs a(tox toxVar, ukr ukrVar, uly ulyVar, boolean z) {
        return f(toxVar, ukrVar, this.e.a(toxVar, ukrVar, true), null, z, ulyVar);
    }

    public final ufs c(abgl abglVar, ukr ukrVar, uly ulyVar, boolean z) {
        return a(this.x.s(abglVar), ukrVar, ulyVar, z);
    }

    public final ufs d(tox toxVar, ukr ukrVar, uor uorVar, ujx ujxVar, boolean z) {
        return f(toxVar, ukrVar, uorVar, ujxVar, z, ulz.a.a(false));
    }

    public final ufs e(abgl abglVar, ukr ukrVar) {
        gjv gjvVar = this.x;
        uod uodVar = this.e;
        tox toxVarS = gjvVar.s(abglVar);
        return d(toxVarS, ukrVar, uodVar.a(toxVarS, ukrVar, true), null, true);
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
