package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.util.Objects;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nwi extends lhf implements mnd {
    public final wcp c;
    private final List e = new ArrayList();
    private final Handler f = new Handler();
    private final Runnable g = new nwg(this, 0);
    private nwk h;
    private boolean i;
    private static final yph d = yph.c("GH.HunManager");
    public static final Comparator a = new cwg(4);
    static final Duration b = Duration.ofMinutes(3);

    public nwi() {
        leh.a.a();
        this.h = new nwj(null);
        eqj eqjVar = tby.b;
        wcp wcpVar = new wcp((byte[]) null);
        wcpVar.b(eqjVar);
        this.c = wcpVar;
        this.i = true;
        int i = mnc.a;
        ((mnc) mki.a.i(mnc.class)).c(mnb.l, this, this);
    }

    public static nwi a() {
        return (nwi) mki.a.b(nwi.class, new lfu(12));
    }

    private final nwh j(nuh nuhVar) {
        for (nwh nwhVar : this.e) {
            if (Objects.equals(nwhVar.a.d, nuhVar.d)) {
                return nwhVar;
            }
        }
        return null;
    }

    private static boolean k(nwh nwhVar) {
        if (!nwhVar.c) {
            nfs nfsVarA = nfs.a();
            nuo nuoVar = nwhVar.b().x;
            boolean zBooleanValue = ((Boolean) nfsVarA.k.e()).booleanValue();
            if (nuoVar != nuo.d && nuoVar != nuo.e && nuoVar != nuo.c && nuoVar != nuo.b && (((Integer) lau.c().i().e()).intValue() == 2 || !zBooleanValue)) {
                if (nwhVar.a() > b.toMillis()) {
                    ((ype) ((ype) d.f()).ai((char) 5480)).u("Entry can interrupt user, beyond the max delay");
                    return true;
                }
                ((ype) d.l().ai((char) 5479)).y("InterruptionManager not allowing interruptions at this time for %s", nwhVar);
                return false;
            }
        }
        return true;
    }

    public final void b(nuh nuhVar) {
        wer.c();
        if (this.i) {
            return;
        }
        List list = this.e;
        ((ype) d.l().ai((char) 5486)).M("remove %s from %s", nuhVar, list);
        nwh nwhVarJ = j(nuhVar);
        if (nwhVarJ != null) {
            list.remove(nwhVarJ);
            g();
        }
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        wer.c();
        this.i = false;
        leh.a();
        nwj nwjVar = new nwj(this);
        this.h = nwjVar;
        this.c.b(nwjVar.l);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        wer.c();
        this.e.clear();
        this.f.removeCallbacks(this.g);
        this.h.j(nwr.a);
        this.i = true;
    }

    public final void e(nuo nuoVar) {
        wer.c();
        if (this.i) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List list = this.e;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            } else if (((nwh) list.get(size)).b().x == nuoVar) {
                arrayList.add(Integer.valueOf(size));
            }
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            ((ype) d.l().ai(5488)).M("removeAll(cat=%s) removed %s", nuoVar, (nwh) list.remove(((Integer) arrayList.get(i)).intValue()));
        }
    }

    public final void f(nuh nuhVar) {
        wer.c();
        if (this.i) {
            return;
        }
        nwh nwhVarJ = j(nuhVar);
        ((ype) d.l().ai((char) 5490)).M("show old=%s new=%s", nwhVarJ, nuhVar);
        if (nwhVarJ != null) {
            woy.N(Objects.equals(nuhVar.d, nwhVarJ.a.d));
            nwhVarJ.a = nuhVar;
        } else {
            this.e.add(new nwh(nuhVar));
        }
        g();
    }

    public final void g() {
        long j;
        GhIcon ghIcon;
        List list;
        yph yphVar;
        nwo nwoVar;
        nuh nuhVar;
        nud nudVar;
        nwu nwuVar;
        nwu nwuVar2;
        Handler handler = this.f;
        Runnable runnable = this.g;
        handler.removeCallbacks(runnable);
        List list2 = this.e;
        nwu nwuVar3 = null;
        if (list2.size() > 1) {
            nwh nwhVar = ((nwh) list2.get(0)).c ? (nwh) list2.remove(0) : null;
            Collections.sort(list2);
            nwh nwhVar2 = (nwh) list2.get(0);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nwh nwhVar3 = (nwh) it.next();
                if (k(nwhVar3)) {
                    nwhVar2 = nwhVar3;
                    break;
                }
            }
            if (nwhVar == null || nwhVar2.b().x == nuo.d) {
                list2.remove(nwhVar2);
                list2.add(0, nwhVar2);
            } else {
                list2.add(0, nwhVar);
            }
        }
        nwh nwhVar4 = (nwh) yrm.au(list2);
        yph yphVar2 = d;
        ((ype) yphVar2.l().ai(5491)).M("update visibleHun=%s pending=%s", nwhVar4, list2);
        if (nwhVar4 == null || !k(nwhVar4)) {
            this.h.j(nwr.a);
            if (nwhVar4 != null) {
                if (nwhVar4.b == 0) {
                    nwhVar4.b = SystemClock.elapsedRealtime();
                }
                handler.postDelayed(runnable, acxa.i());
                ((ype) yphVar2.l().ai(5489)).R("delaying HUN, delayed=%dms maxAllowed=%ds entry=%s", Long.valueOf(nwhVar4.a()), Long.valueOf(b.toSeconds()), nwhVar4);
                return;
            }
            return;
        }
        nwr nwrVar = this.h.j;
        nur nurVarB = nwhVar4.b();
        nuh nuhVar2 = nwhVar4.a;
        nwp nwpVar = new nwp(yzz.SYSTEM_UI_NOTIFICATION);
        nwpVar.b = nurVarB.f;
        nwpVar.c = nurVarB.x;
        nwpVar.d = nwhVar4.a();
        nwpVar.e = nurVarB.w != null;
        nwq nwqVar = new nwq(nwpVar);
        mgw mgwVar = new mgw(this, nwhVar4, 15);
        nur nurVar = nuhVar2.c;
        nuo nuoVar = nurVar.x;
        nuo nuoVar2 = nuo.d;
        if (nuoVar == nuoVar2 || nuoVar == nuo.e || (nudVar = nurVar.t) == null) {
            j = 0;
            nud nudVar2 = nurVar.t;
            if (nudVar2 == null || (ghIcon = nudVar2.b) == null) {
                ghIcon = nurVar.b;
            }
            boolean z = (nuoVar == nuoVar2 || nuoVar == nuo.e) ? false : true;
            int iG = nsh.g(nuoVar);
            nwt nwtVarF = nsh.f(nurVar.p, nuoVar);
            nwt nwtVarF2 = nsh.f(nurVar.q, nuoVar);
            int i = nurVar.h;
            Integer numValueOf = i != 0 ? Integer.valueOf(i) : null;
            int i2 = numValueOf != null ? R.style.ThemeOverlay_Gearhead_CustomColorNotification : -1;
            String str = nuhVar2.d;
            list = list2;
            Integer numValueOf2 = Integer.valueOf(i2);
            yphVar = yphVar2;
            nwo nwoVar2 = new nwo(str);
            nwoVar2.b = z;
            nwoVar2.h = nuoVar;
            nwoVar2.j = nurVar.d;
            nwoVar2.k = nurVar.e;
            nwoVar2.i = ghIcon;
            CharSequence charSequence = nurVar.m;
            if (charSequence == null) {
                charSequence = "";
            }
            nwoVar2.c = charSequence;
            CharSequence charSequence2 = nurVar.n;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            nwoVar2.d = charSequence2;
            nwoVar2.l = nurVar.c;
            nwoVar2.m = nwtVarF;
            nwoVar2.n = nwtVarF2;
            nwoVar2.t = iG;
            nwoVar2.p = numValueOf;
            nwoVar2.q = numValueOf2;
            nwoVar2.r = nurVar.C;
            nwoVar2.s = nurVar.E;
            nwoVar = nwoVar2;
        } else {
            j = 0;
            nwoVar = new nwo(nuhVar2.d);
            nwoVar.b = true;
            nwoVar.h = nuoVar;
            nwoVar.j = nudVar.a;
            nwoVar.i = nudVar.b;
            CharSequence charSequence3 = nudVar.c;
            if (charSequence3 == null) {
                charSequence3 = "";
            }
            nwoVar.c = charSequence3;
            CharSequence charSequence4 = nudVar.d;
            if (charSequence4 == null) {
                charSequence4 = "";
            }
            nwoVar.d = charSequence4;
            nwoVar.l = nudVar.j;
            nwoVar.e = nudVar.e;
            nwoVar.p = null;
            nwoVar.q = -1;
            nwoVar.r = nurVar.C;
            nwoVar.s = nurVar.E;
            nwoVar.t = nsh.g(nuoVar);
            nul nulVar = nudVar.f;
            if (nulVar == null) {
                nwuVar = null;
            } else {
                nwuVar = new nwu(nulVar.a, nulVar.b, nulVar.c, nulVar.e);
            }
            nwoVar.m = nwuVar;
            nul nulVar2 = nudVar.g;
            if (nulVar2 == null) {
                nwuVar2 = null;
            } else {
                nwuVar2 = new nwu(nulVar2.a, nulVar2.b, nulVar2.c, nulVar2.e);
            }
            nwoVar.n = nwuVar2;
            nul nulVar3 = nudVar.h;
            if (nulVar3 != null) {
                nwuVar3 = new nwu(nulVar3.a, nulVar3.b, nulVar3.c, nulVar3.e);
            }
            nwoVar.o = nwuVar3;
            list = list2;
            yphVar = yphVar2;
        }
        if (leh.a().b() && nwrVar != null) {
            nwoVar.u = nwrVar.v;
        }
        nwoVar.g = nwqVar;
        nwoVar.f = mgwVar;
        nwr nwrVar2 = new nwr(nwoVar);
        if (acpl.i() && nwrVar2.h.c == nuo.h) {
            lbt.m.e(mki.a.c);
        }
        nwk nwkVar = this.h;
        nuh nuhVar3 = nwhVar4.a;
        nur nurVar2 = nuhVar3.c;
        nud nudVar3 = nurVar2.t;
        if (nudVar3 == null || nudVar3.i == null) {
            nwkVar.j(nwrVar2);
        } else {
            nwq nwqVar2 = nwrVar2.h;
            Runnable runnable2 = nwrVar2.g;
            nvs nvsVar = nwk.g;
            yph yphVar3 = nvs.a;
            ype ypeVar = (ype) yphVar3.l().ai(5471);
            long j2 = nurVar2.i;
            ypeVar.x("#present timestamp=%s", j2);
            if (nvsVar.d(nuhVar3) && ((nuhVar = nvsVar.e) == null || j2 == nuhVar.c.i)) {
                ((ype) ((ype) yphVar3.h()).ai((char) 5474)).y("Nothing new to present. entry=%s", nuhVar3);
            } else if (kfl.h().L()) {
                ((ype) ((ype) yphVar3.f()).ai((char) 5472)).u("Active Assistant session while trying to autoplay");
                if (!nvsVar.d(nuhVar3)) {
                    ((ype) yphVar3.l().ai((char) 5473)).u("Registering callback when Assistant voice session ends.");
                    kfl.h().r(nvsVar.c);
                }
                nvsVar.a(nuhVar3, nwqVar2, runnable2);
                nvsVar.d = new nqw(nvsVar, 7);
                nvsVar.b(yzy.oG);
            } else {
                nvsVar.a(nuhVar3, nwqVar2, runnable2);
                nvsVar.c();
            }
        }
        if (nwhVar4.c) {
            ((ype) yphVar.l().ai(5493)).M("Notification did not play chime due to it being a consecutive message visibleHun=%s pending=%s", nwhVar4, list);
            mcd.J(nwrVar2, yzy.ol);
        } else {
            nur nurVarB2 = nwhVar4.b();
            if (nwhVar4.a.b() == nug.c) {
                ((ype) yphVar.l().ai((char) 5485)).u("Notification did not play chime due to it being suppressed by DND");
                mcd.J(nwrVar2, yzy.os);
            } else {
                yph yphVar4 = yphVar;
                Uri uri = nurVarB2.w;
                if (uri == null) {
                    ((ype) yphVar4.l().ai((char) 5484)).y("Notification did not play chime due to no sound in notification notification=%s", nurVarB2);
                    mcd.J(nwrVar2, yzy.om);
                } else if (mpl.f().a().k()) {
                    mar.a().b(uri, 1);
                    mcd.J(nwrVar2, yzy.ok);
                } else {
                    ((ype) yphVar4.l().ai((char) 5483)).y("Notification did not play chime due  to user preference in settings notification=%s", nurVarB2);
                    mcd.J(nwrVar2, yzy.on);
                }
            }
            if (nwhVar4.b != j) {
                mcd.J(nwrVar2, yzy.oM);
            }
        }
        nwhVar4.c = true;
        nwhVar4.a.e();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.println("HunManager");
        List list = this.e;
        if (list.isEmpty()) {
            printWriter.println("No active notifications.");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            printWriter.println((nwh) it.next());
        }
        printWriter.println();
    }

    public final boolean i(nuh nuhVar) {
        wer.c();
        return j(nuhVar) != null;
    }
}
