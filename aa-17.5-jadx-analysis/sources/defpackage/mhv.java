package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mhv implements lhg {
    public static final yph a = yph.c("GH.ProjectedApps");
    public tlu b;
    public Runnable c;
    public Context d;
    public ComponentName e;
    public rol h;
    public final List f = new ArrayList();
    public final Map g = new HashMap();
    private final mpb i = new mhs(this);

    public static mhv a() {
        return (mhv) mki.a.b(mhv.class, new lfu(6));
    }

    public final void b(mqc mqcVar) {
        Intent intentA = mqcVar.a.a();
        ((ype) a.l().ai((char) 4964)).y("Launching %s", intentA.toUri(0));
        this.e = mqcVar.a();
        mpe.a().i(intentA);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (acvk.c()) {
            mki mkiVar = mki.a;
            this.d = mkiVar.c;
            mkiVar.d.execute(new mhr(this, 1));
            mpd.b().g(this.i);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        synchronized (this) {
            rol rolVar = this.h;
            if (rolVar != null) {
                rolVar.b = null;
                this.h.b();
                this.h = null;
                ((ype) a.l().ai(4971)).u("Released vendor extension manager");
            }
        }
        mpd.b().j(this.i);
        tlu tluVar = this.b;
        if (tluVar != null) {
            tluVar.close();
        }
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            try {
                mjt mjtVar = ((mhu) it.next()).b;
            } catch (IOException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 4970)).u("Could not close callback");
            }
        }
        this.g.clear();
        this.e = null;
        this.c = null;
    }

    public final void e(akge akgeVar, String str) {
        wer.b();
        kgq.d(new mja(this, str, akgeVar, 1), "GH.ProjectedApps", yzz.PROJECTED_APPS, yzy.MJ, "Could not send %s", str);
    }
}
