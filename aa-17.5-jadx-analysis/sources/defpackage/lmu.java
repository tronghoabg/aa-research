package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class lmu implements ljv {
    public static final yph a = yph.c("GH.MediaModel");
    final ljx b;
    public final List c = new CopyOnWriteArrayList();
    public Intent d;
    public lol e;
    public lmd f;
    public AaPlaybackState g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final eqm k;
    private final eqm l;
    private final eqj m;
    private final lmt n;
    private final eqj o;
    private final lmt p;
    private final ljr q;
    private final ljr r;

    public lmu() {
        int i = yfq.d;
        yfq yfqVar = yls.a;
        this.h = false;
        this.i = false;
        this.j = false;
        eqm eqmVar = new eqm(null);
        this.l = eqmVar;
        this.k = new eqm(new lmp());
        this.m = tby.C(eqmVar, new lle(16));
        this.n = new lmr(this, lbh.d());
        eqj eqjVarC = tby.C(eqmVar, new lle(17));
        this.o = eqjVarC;
        this.p = new lms(this, lbh.d());
        eqy.c(eqjVarC, new lle(18));
        this.q = new lmo(this, 1);
        this.r = new lmo(this, 0);
        ljw ljwVarA = ljx.a();
        ljwVarA.d(lnm.y().b());
        this.b = ljwVarA.a();
    }

    private final void m(ComponentName componentName) {
        if (!aczc.p()) {
            this.d = null;
        }
        this.e = null;
        this.g = null;
        this.f = null;
        int i = yfq.d;
        yfq yfqVar = yls.a;
        this.h = false;
        this.k.m(new lmp());
        this.l.m(componentName);
    }

    @Override // defpackage.ljv
    public final ljx a() {
        wer.c();
        return (ljx) new ntn((ljx) spu.aT(this.e, new llx(7))).i(this.b);
    }

    @Override // defpackage.ljv
    public final lmd b() {
        wer.c();
        return this.f;
    }

    @Override // defpackage.ljv
    public final AaPlaybackState c() {
        wer.c();
        return this.g;
    }

    @Override // defpackage.ljv
    public final void d(lju ljuVar) {
        wer.c();
        this.c.add(ljuVar);
    }

    @Override // defpackage.ljv
    public final void e(lju ljuVar) {
        wer.c();
        this.c.remove(ljuVar);
    }

    @Override // defpackage.ljv
    public final void f() {
        wer.c();
        ((ype) a.l().ai((char) 4014)).u("start()");
        lnm.y().e(this.q);
        lnm.y().e(this.r);
        this.o.fE(lbh.d(), this.p);
        this.m.fE(lbh.d(), this.n);
    }

    @Override // defpackage.ljv
    public final void g() {
        wer.c();
        ((ype) a.l().ai((char) 4015)).u("stop()");
        this.c.clear();
        lnm.y().g(this.q);
        lnm.y().g(this.r);
        eqj eqjVar = this.o;
        lmt lmtVar = this.p;
        eqjVar.k(lmtVar);
        lmtVar.b();
        eqj eqjVar2 = this.m;
        lmt lmtVar2 = this.n;
        eqjVar2.k(lmtVar2);
        lmtVar2.b();
        m(null);
    }

    @Override // defpackage.ljv
    public final boolean h() {
        wer.c();
        return this.e instanceof lod;
    }

    @Override // defpackage.ljv
    public final boolean i(String str) {
        wer.c();
        lol lolVar = this.e;
        if (lolVar instanceof lod) {
            return ((lod) lolVar).a().getBoolean(str, false);
        }
        return false;
    }

    @Override // defpackage.ljv
    public final ogz j() {
        wer.c();
        lol lolVar = this.e;
        if (lolVar instanceof lod) {
            return ((lod) lolVar).i;
        }
        return null;
    }

    protected void k(ComponentName componentName) {
        l(componentName);
    }

    public final void l(ComponentName componentName) {
        ((ype) a.l().ai((char) 4016)).y("onMediaAppChanged %s", componentName);
        ComponentName componentName2 = (ComponentName) spu.aT(a(), new llx(6));
        if (Objects.equals(componentName2, componentName)) {
            return;
        }
        this.j = false;
        this.i = true;
        m(componentName);
        List list = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lju) it.next()).a(componentName2, componentName);
        }
        this.i = false;
        ljr ljrVar = this.r;
        lnm.y().g(ljrVar);
        lnm.y().e(ljrVar);
        if (!h() || this.j) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((lju) it2.next()).b();
        }
        this.j = true;
    }
}
