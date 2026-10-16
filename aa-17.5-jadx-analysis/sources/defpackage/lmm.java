package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class lmm extends lhf implements ljs {
    public static final /* synthetic */ int h = 0;
    private static final yph i = yph.c("GH.MediaManager");
    public ComponentName a;
    public boolean b;
    public ComponentName c;
    public boolean d;
    public boolean g;
    private final String k;
    private long m;
    private eqj p;
    private eqj r;
    private final Handler l = new Handler(Looper.getMainLooper());
    public final List e = new CopyOnWriteArrayList();
    public final Map f = new HashMap();
    private final eqj n = eqy.a(lgx.b().a(mpz.d));
    private final lml o = new lml(this);
    private final eqn q = new kqc(this, 12);
    private final eqn s = new kqc(this, 13);

    public lmm(Context context) {
        String string = context.getString(R.string.default_media_app_name);
        this.k = string;
        ljw ljwVarA = ljx.a();
        ljwVarA.d(string);
        ljwVarA.a();
    }

    @Override // defpackage.ljs
    public final ComponentName a() {
        return this.a;
    }

    @Override // defpackage.ljs
    public final String b() {
        return this.k;
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        this.n.fE(this, this.o);
        oit.a();
        this.m = SystemClock.elapsedRealtime();
        eqj eqjVarB = loh.b();
        this.p = eqjVarB;
        eqjVarB.fE(this, this.q);
        eqj eqjVarV = tby.v(tby.C(this.p, new llf(loy.j(), 9)), new lle(15));
        this.r = eqjVarV;
        eqjVarV.fE(this, this.s);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        Handler handler = this.l;
        if (handler.hasMessages(0)) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.hg).l());
        }
        handler.removeCallbacksAndMessages(null);
        this.f.clear();
        this.g = false;
        this.e.clear();
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = false;
        eqj eqjVar = this.n;
        lml lmlVar = this.o;
        eqjVar.k(lmlVar);
        lmlVar.b();
        eqj eqjVar2 = this.p;
        if (eqjVar2 != null) {
            eqjVar2.k(this.q);
            this.p = null;
        }
        eqj eqjVar3 = this.r;
        if (eqjVar3 != null) {
            eqjVar3.k(this.s);
            this.r = null;
        }
    }

    @Override // defpackage.ljs
    public final void e(ljr ljrVar) {
        this.e.add(ljrVar);
        ComponentName componentName = this.a;
        if (componentName != null) {
            ljrVar.a(componentName);
            Intent intent = (Intent) this.f.get(componentName);
            if (intent != null) {
                ljrVar.b(intent, this.b, componentName);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ljs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmm.f(android.content.Intent):void");
    }

    @Override // defpackage.ljs
    public final void g(ljr ljrVar) {
        this.e.remove(ljrVar);
    }

    @Override // defpackage.ljs
    public final boolean h(ComponentName componentName) {
        oit.a();
        if (SystemClock.elapsedRealtime() - this.m > 5000) {
            return false;
        }
        lqu lquVarA = lqu.a();
        lqh lqhVar = lquVarA.g;
        lqd lqdVar = ((lqe) lqhVar.get()).a;
        if (!Objects.equals(componentName, ((lqe) lqhVar.get()).b) || !lqdVar.a()) {
            return false;
        }
        lqn lqnVar = lquVarA.h;
        if (lqnVar != null) {
            return !lqq.d(((lqq) lqnVar).c, lqp.g);
        }
        return true;
    }
}
