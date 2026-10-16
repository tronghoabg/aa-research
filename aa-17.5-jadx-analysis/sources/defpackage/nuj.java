package defpackage;

import android.service.notification.NotificationListenerService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class nuj implements lhg, mnd {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.NotificationStore");
    private static final ygr d = yrm.o(nuo.a, new nuo[0]);
    public NotificationListenerService.RankingMap a;
    private final tcv e;
    private final eqj f;
    private final List g;

    public nuj() {
        tcv tcvVar = new tcv(new ArrayList());
        this.e = tcvVar;
        this.f = tcvVar.a;
        this.g = new ArrayList();
    }

    public static nuj b() {
        wer.c();
        return (nuj) mki.a.i(nuj.class);
    }

    private final NotificationListenerService.Ranking m(nur nurVar) {
        String str = nurVar.g;
        if (str != null && this.a != null) {
            NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
            if (this.a.getRanking(str, ranking)) {
                return ranking;
            }
        }
        return null;
    }

    private final nuh n(String str, long j, String str2) {
        ListIterator listIterator = this.e.listIterator(0);
        while (listIterator.hasNext()) {
            nuh nuhVar = (nuh) listIterator.next();
            if (j == nuhVar.a && str.equals(nuhVar.b) && str2.equals(nuhVar.c.f)) {
                return nuhVar;
            }
        }
        return null;
    }

    public final eqj a() {
        wer.c();
        return this.f;
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        mnc.a().b(mnb.r, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        this.g.clear();
        this.e.clear();
        mnc.a().d(mnb.r);
    }

    public final yfq e() {
        wer.c();
        yfq yfqVar = (yfq) this.f.e();
        yfqVar.getClass();
        return yfqVar;
    }

    public final void f(nui nuiVar) {
        wer.c();
        List list = this.g;
        if (list.contains(nuiVar)) {
            return;
        }
        list.add(nuiVar);
    }

    public final void g(String str, long j, String str2) {
        ((ype) c.l().ai(5459)).R("on cancel: t=%s, id=%d, pkg=%s", str, Long.valueOf(j), str2);
        wer.c();
        nuh nuhVarN = n(str, j, str2);
        if (nuhVarN == null) {
            return;
        }
        this.e.remove(nuhVarN);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((nui) it.next()).a(nuhVarN);
        }
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.println("NotificationStore");
        tcv tcvVar = this.e;
        if (tcvVar.isEmpty()) {
            printWriter.println("No active notifications.");
            return;
        }
        ListIterator listIterator = tcvVar.listIterator(0);
        while (listIterator.hasNext()) {
            printWriter.println((nuh) listIterator.next());
        }
        printWriter.println();
    }

    final void i(nuh nuhVar) {
        tcv tcvVar = this.e;
        if (tcvVar.contains(nuhVar)) {
            tcvVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r8.f.equals(r0.getPackageName()) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r5, long r6, defpackage.nur r8) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuj.j(java.lang.String, long, nur):void");
    }

    public final void k(nui nuiVar) {
        wer.c();
        this.g.remove(nuiVar);
    }

    public final void l(NotificationListenerService.RankingMap rankingMap) {
        wer.c();
        this.a = rankingMap;
        tcv tcvVar = this.e;
        ListIterator listIterator = tcvVar.listIterator(0);
        boolean z = false;
        while (listIterator.hasNext()) {
            nuh nuhVar = (nuh) listIterator.next();
            nur nurVar = nuhVar.c;
            NotificationListenerService.Ranking rankingM = m(nurVar);
            boolean z2 = true;
            if (nuh.c(nurVar, nuhVar.h) == nuh.c(nurVar, rankingM) && nuh.a(nuhVar.h) == nuh.a(rankingM)) {
                z2 = false;
            }
            nuhVar.h = rankingM;
            if (z2) {
                b().i(nuhVar);
            }
            z |= z2;
        }
        if (z) {
            ((ype) c.l().ai((char) 5464)).u("setRankingMap: at least one active notification's ranking changed");
            yfq yfqVarO = yfq.o(tcvVar);
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((nui) it.next()).c(yfqVarO);
            }
        }
    }
}
