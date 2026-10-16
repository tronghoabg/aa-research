package defpackage;

import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;
import com.google.android.apps.auto.components.apphost.view.TemplateView;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class joo implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public joo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, rwm] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rwy] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                try {
                    this.a.e(false);
                    return;
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) jou.a.h()).p(e)).ai((char) 2513)).u("Unexpected RemoteException when making callback.");
                    return;
                }
            case 1:
                try {
                    ?? r3 = this.a;
                    int i = yfq.d;
                    r3.h(false, yls.a, 0, 0, xob.a.h());
                    return;
                } catch (RemoteException e2) {
                    ((ype) ((ype) ((ype) jou.a.h()).p(e2)).ai((char) 2508)).u("RemoteException in ::resumeServices");
                    return;
                }
            case 2:
                jot jotVar = (jot) this.a;
                long j = jotVar.a;
                jou jouVar = jotVar.c;
                if (jouVar.k(j)) {
                    jouVar.g(jotVar.b, j);
                    return;
                }
                return;
            case 3:
                ((jkv) this.a).f();
                return;
            case 4:
                ((jkv) this.a).f();
                return;
            case 5:
                Object obj = this.a;
                jqm jqmVar = (jqm) obj;
                if (jqmVar.b.get()) {
                    jqmVar.d.postDelayed(new joo(obj, 5, bArr), jqmVar.e);
                    long jB = xvx.a.b();
                    synchronized (jqmVar.c) {
                        ArrayDeque arrayDeque = ((jqm) obj).i;
                        if (arrayDeque.size() >= 10) {
                            ((ype) ((ype) ((ype) jqm.a.h()).l(10, TimeUnit.SECONDS)).ai(2646)).B("Too many pending ping requests in flight: %d, max: %d", arrayDeque.size(), 10);
                            return;
                        }
                        izt iztVar = ((jqm) obj).k;
                        if (iztVar == null) {
                            ((ype) jqm.a.l().ai(2645)).u("Can't send ping request, end point is not ready yet.");
                            return;
                        } else {
                            arrayDeque.offer(Long.valueOf(jB));
                            iztVar.d(jB, false);
                            return;
                        }
                    }
                }
                return;
            case 6:
                Object obj2 = this.a;
                jqm jqmVar2 = (jqm) obj2;
                if (jqmVar2.b.get()) {
                    jqmVar2.d.postDelayed(new joo(obj2, 6, bArr), jqmVar2.f);
                    synchronized (jqmVar2.c) {
                        jql jqlVar = ((jqm) obj2).j;
                        List list = jqlVar.a;
                        if (list.isEmpty()) {
                            ((ype) ((ype) jqm.a.f()).ai(2644)).w("No latency stats to print, ping requests in flight: %d", ((jqm) obj2).i.size());
                            return;
                        }
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        ((ype) jqm.a.l().ai(2636)).U("Max latency: %dms; all (%d): %s (measured from %d to %d, %dms ago)", Integer.valueOf(jqlVar.b), Integer.valueOf(list.size()), new xxd(" ").b(list), Long.valueOf(jqlVar.c), Long.valueOf(jqlVar.d), Long.valueOf((xvx.a.b() / 1000000) - jqlVar.d));
                        jqlVar.c = 0L;
                        jqlVar.d = 0L;
                        jqlVar.b = 0;
                        list.clear();
                        return;
                    }
                }
                return;
            case 7:
                ype ypeVar = (ype) jre.a.l().ai(2656);
                Object obj3 = this.a;
                jrd jrdVar = (jrd) obj3;
                ypeVar.y("Timed out waiting for insight for %s", jrdVar.a);
                eqj eqjVar = (eqj) obj3;
                if (eqjVar.e() == null) {
                    int i2 = yfq.d;
                    eqjVar.m(yls.a);
                }
                jrdVar.a();
                return;
            case 8:
                jsb jsbVar = (jsb) this.a;
                geu geuVar = (geu) jsbVar.i.get();
                if (geuVar == null) {
                    ((ype) jsb.a.l().ai((char) 2711)).u("Template Context has been cleared when changing minimized mode");
                    return;
                }
                gsf gsfVar = (gsf) geuVar.l(gsf.class);
                gsfVar.getClass();
                boolean zC2 = gsfVar.c();
                if (zC2 == jsbVar.h) {
                    ((ype) jsb.a.l().ai((char) 2710)).u("Minimized state did not change, not updating ui");
                    return;
                } else {
                    jsbVar.h = zC2;
                    jsbVar.f();
                    return;
                }
            case 9:
                ((jsb) this.a).f();
                return;
            case 10:
                juf jufVar = (juf) this.a;
                jufVar.a.f.c();
                jufVar.h.setFocusable(false);
                return;
            case 11:
                jwl jwlVar = (jwl) this.a;
                lbh.c().n(jwlVar.e);
                lbh.c().l(jwlVar.f);
                return;
            case 12:
                ((hld) this.a).fb();
                return;
            case 13:
                ((hld) this.a).fb();
                return;
            case 14:
                jym jymVar = (jym) this.a;
                gsf gsfVar2 = (gsf) jymVar.c.l(gsf.class);
                if (gsfVar2 == null || (zC = gsfVar2.c()) == jymVar.d) {
                    return;
                }
                jymVar.d = zC;
                jymVar.i();
                return;
            case 15:
                ((MaterialStandardDialpadView) this.a).d.abandonAudioFocus(null);
                return;
            case 16:
                MaterialStandardDialpadView materialStandardDialpadView = (MaterialStandardDialpadView) this.a;
                View view = materialStandardDialpadView.g;
                view.getClass();
                if (view.isPressed()) {
                    materialStandardDialpadView.g.setPressed(false);
                    materialStandardDialpadView.g.performLongClick();
                    return;
                }
                return;
            case 17:
                ((StandardDialpadView) this.a).c.abandonAudioFocus(null);
                return;
            case 18:
                StandardDialpadView standardDialpadView = (StandardDialpadView) this.a;
                View view2 = standardDialpadView.f;
                view2.getClass();
                if (view2.isPressed()) {
                    standardDialpadView.f.setPressed(false);
                    standardDialpadView.f.performLongClick();
                    return;
                }
                return;
            case 19:
                yph yphVar = TemplateView.h;
                if (TemplateView.i) {
                    return;
                }
                geu geuVar2 = (geu) this.a;
                boolean zContains = ((gmh) geuVar2.d()).c.contains("androidx.car.app.category.POI");
                yph yphVar2 = TemplateView.h;
                ((ype) yphVar2.l().ai((char) 2894)).y("Preloading Map for POI app is %s", Boolean.valueOf(zContains));
                if (zContains) {
                    ((ype) yphVar2.l().ai((char) 2895)).u("Preloading MapView");
                    gpd gpdVar = (gpd) geuVar2.l(gpd.class);
                    gpdVar.getClass();
                    gpdVar.b();
                    TemplateView.i = true;
                    return;
                }
                return;
            default:
                Object obj4 = this.a;
                geu geuVar3 = ((hli) obj4).c;
                if (geuVar3 != null) {
                    gdx gdxVarE = geuVar3.e();
                    TemplateView templateView = (TemplateView) obj4;
                    if (templateView.o && ((gdy) gdxVarE).l && aczc.t()) {
                        lze lzeVar = templateView.m;
                        if (lzeVar.b) {
                            gdxVarE.b("Permits", String.format(Locale.getDefault(), "%.2f", Float.valueOf(lzeVar.e.a())));
                        } else {
                            gdxVarE.b("Permits", "disabled");
                        }
                    } else {
                        gdxVarE.a("Permits");
                    }
                }
                TemplateView templateView2 = (TemplateView) obj4;
                if (templateView2.o) {
                    templateView2.p.postDelayed(this, 100L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ joo(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
