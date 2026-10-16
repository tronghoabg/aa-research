package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nuz implements defpackage.lhn, defpackage.mnj {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.NotificationStore");
    private static final defpackage.yhx d = defpackage.ysr.o(defpackage.nve.a, new defpackage.nve[0]);
    public android.service.notification.NotificationListenerService.RankingMap a;
    private final defpackage.tdr e;
    private final defpackage.eqp f;
    private final java.util.List g;

    public nuz() {
        defpackage.tdr tdrVar = new defpackage.tdr(new java.util.ArrayList());
        this.e = tdrVar;
        this.f = tdrVar.a;
        this.g = new java.util.ArrayList();
    }

    public static defpackage.nuz b() {
        defpackage.wfp.c();
        return (defpackage.nuz) defpackage.mkp.a.i(defpackage.nuz.class);
    }

    private final android.service.notification.NotificationListenerService.Ranking m(nvh nvhVar) {
        java.lang.String str = nvhVar.g;
        if (str != null && this.a != null) {
            android.service.notification.NotificationListenerService.Ranking ranking = new android.service.notification.NotificationListenerService.Ranking();
            if (this.a.getRanking(str, ranking)) {
                return ranking;
            }
        }
        return null;
    }

    private final nuv n(java.lang.String str, long j, java.lang.String str2) {
        java.util.ListIterator listIterator = this.e.listIterator(0);
        while (listIterator.hasNext()) {
            nuv nuvVar = (nuv) listIterator.next();
            if (j == nuvVar.a && str.equals(nuvVar.b) && str2.equals(nuvVar.c.f)) {
                return nuvVar;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final defpackage.eqp a() throws wfo {
        defpackage.wfp.c();
        return this.f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        this.g.clear();
        this.e.clear();
        defpackage.mni.a().d(defpackage.mnh.r);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final defpackage.ygw e() throws wfo {
        defpackage.wfp.c();
        defpackage.ygw ygwVar = (defpackage.ygw) this.f.e();
        ygwVar.getClass();
        return ygwVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        defpackage.mni.a().b(defpackage.mnh.r, this);
    }

    public final void f(defpackage.nuy nuyVar) {
        defpackage.wfp.c();
        java.util.List list = this.g;
        if (list.contains(nuyVar)) {
            return;
        }
        list.add(nuyVar);
    }

    public final void g(java.lang.String str, long j, java.lang.String str2) {
        ((defpackage.yqj) c.l().ai(5485)).R("on cancel: t=%s, id=%d, pkg=%s", str, java.lang.Long.valueOf(j), str2);
        defpackage.wfp.c();
        nuv nuvVarN = n(str, j, str2);
        if (nuvVarN == null) {
            return;
        }
        this.e.remove(nuvVarN);
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((defpackage.nuy) it.next()).a(nuvVarN);
        }
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.println("NotificationStore");
        defpackage.tdr tdrVar = this.e;
        if (tdrVar.isEmpty()) {
            printWriter.println("No active notifications.");
            return;
        }
        java.util.ListIterator listIterator = tdrVar.listIterator(0);
        while (listIterator.hasNext()) {
            printWriter.println((nuv) listIterator.next());
        }
        printWriter.println();
    }

    final void i(nuv nuvVar) {
        defpackage.tdr tdrVar = this.e;
        if (tdrVar.contains(nuvVar)) {
            tdrVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r8.f.equals(r0.getPackageName()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r5, long r6, nvh r8) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuz.j(java.lang.String, long, nvh):void");
    }

    public final void k(defpackage.nuy nuyVar) {
        defpackage.wfp.c();
        this.g.remove(nuyVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void l(android.service.notification.NotificationListenerService.RankingMap rankingMap) throws wfo {
        defpackage.wfp.c();
        this.a = rankingMap;
        defpackage.tdr tdrVar = this.e;
        java.util.ListIterator listIterator = tdrVar.listIterator(0);
        boolean z = false;
        while (listIterator.hasNext()) {
            nuv nuvVar = (nuv) listIterator.next();
            nvh nvhVar = nuvVar.c;
            android.service.notification.NotificationListenerService.Ranking rankingM = m(nvhVar);
            boolean z2 = true;
            boolean z3 = (nuv.c(nvhVar, nuvVar.h) == nuv.c(nvhVar, rankingM) && nuv.a(nuvVar.h) == nuv.a(rankingM)) ? false : true;
            if (defpackage.acul.v()) {
                z3 |= (nuvVar.h == null) != (rankingM == null);
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    android.service.notification.NotificationListenerService.Ranking ranking = nuvVar.h;
                    if (ranking == null) {
                        z2 = false;
                    } else {
                        if (rankingM == null) {
                            rankingM = null;
                        } else if (ep$.ExternalSyntheticApiModelOutline0.m(ranking).equals(ep$.ExternalSyntheticApiModelOutline0.m(rankingM))) {
                        }
                        z2 = false;
                    }
                    z3 |= z2;
                }
            }
            nuvVar.h = rankingM;
            if (z3) {
                b().i(nuvVar);
            }
            z |= z3;
        }
        if (z) {
            ((defpackage.yqj) c.l().ai((char) 5490)).u("setRankingMap: at least one active notification's ranking changed");
            defpackage.ygw ygwVarO = defpackage.ygw.o(tdrVar);
            java.util.Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((defpackage.nuy) it.next()).c(ygwVarO);
            }
        }
    }
}
