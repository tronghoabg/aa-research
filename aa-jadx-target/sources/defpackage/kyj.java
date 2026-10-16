package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kyj implements ngs {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AssistantEdProvider");
    static final defpackage.yhe b;
    private final defpackage.ngy c;
    private long d = -1;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(defpackage.kyi.h, defpackage.ots.ASSISTANT_TOOLTIP_FOR_LAUNCHER_OPEN);
        yhaVar.f(defpackage.kyi.f, defpackage.ots.ASSISTANT_TOOLTIP_FOR_LONG_DRIVE_START);
        b = defpackage.ysr.F(yhaVar.d(true));
    }

    public kyj(defpackage.ngy ngyVar) {
        this.c = ngyVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final /* bridge */ /* synthetic */ ngx a(ngt ngtVar) {
        defpackage.kyi kyhVar;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3536)).y("getNextEducationToShow opportunity is %s", ngtVar);
        com.google.android.gms.car.CarInfo carInfoB = defpackage.juv.l().b();
        if (carInfoB != null && carInfoB.r == 3) {
            ((defpackage.yqj) yqmVar.l().ai((char) 3537)).u("Skipping assistant education tooltip on motorcycles");
            return null;
        }
        if (!defpackage.nuc.a().b()) {
            return null;
        }
        ngu nguVar = ngu.a;
        if (ngtVar != nguVar) {
            long j = this.d;
            defpackage.ngy ngyVar = this.c;
            if (j == ngyVar.a()) {
                kyhVar = null;
            } else if (ngtVar == ngu.g && defpackage.acza.w()) {
                kyhVar = defpackage.kyi.h;
                if (ngyVar.j(kyhVar)) {
                    if (ngtVar != ngu.c) {
                        if (!ngyVar.k("assistant", "media_openapp_tooltip")) {
                            if (ngtVar == ngu.d) {
                                kyhVar = null;
                            } else {
                                kyhVar = null;
                            }
                        } else if (ngtVar == ngu.d) {
                            kyhVar = null;
                        } else {
                            kyhVar = null;
                        }
                    } else if (!ngyVar.k("assistant", "media_openapp_tooltip")) {
                        if (ngtVar == ngu.d) {
                            kyhVar = null;
                        } else {
                            kyhVar = null;
                        }
                    } else if (ngtVar == ngu.d) {
                        kyhVar = null;
                    } else {
                        kyhVar = null;
                    }
                }
            } else if (ngtVar != ngu.c && defpackage.acza.s()) {
                kyhVar = defpackage.kyi.e;
                if (ngyVar.j(kyhVar)) {
                    if (!ngyVar.k("assistant", "media_openapp_tooltip")) {
                        if (ngtVar == ngu.d) {
                            kyhVar = null;
                        } else {
                            kyhVar = null;
                        }
                    } else if (ngtVar == ngu.d) {
                        kyhVar = null;
                    } else {
                        kyhVar = null;
                    }
                }
            } else if (!ngyVar.k("assistant", "media_openapp_tooltip") && (ngtVar instanceof ngn)) {
                kyhVar = new kyh();
            } else if (ngtVar == ngu.d || !defpackage.acza.B()) {
                kyhVar = null;
            } else {
                kyhVar = defpackage.kyi.g;
                if (ngyVar.j(kyhVar) || ngyVar.f(lal.a) <= 0) {
                    kyhVar = null;
                }
            }
        } else {
            kyhVar = null;
        }
        if (kyhVar != null) {
            this.d = this.c.a();
            return kyhVar;
        }
        if (ngtVar == nguVar && defpackage.acza.x()) {
            defpackage.ngy ngyVar2 = this.c;
            defpackage.kyi kyiVar = defpackage.kyi.d;
            if (!ngyVar2.j(kyiVar) && ngyVar2.f(lal.b) >= ((int) defpackage.acza.e())) {
                return kyiVar;
            }
        }
        if (ngtVar == nguVar && defpackage.acza.z()) {
            defpackage.ngy ngyVar3 = this.c;
            defpackage.kyi kyiVar2 = defpackage.kyi.c;
            if (!ngyVar3.j(kyiVar2) && ngyVar3.f(lal.a) >= ((int) defpackage.acza.h())) {
                return kyiVar2;
            }
        }
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(3538);
        defpackage.ngy ngyVar4 = this.c;
        defpackage.kyi kyiVar3 = defpackage.kyi.b;
        yqjVar.N("should show first run roca opp %s and hasSeen %s", ngtVar, ngyVar4.l(kyiVar3));
        if (ngtVar == ngu.k && !ngyVar4.l(kyiVar3)) {
            return kyiVar3;
        }
        if (ngtVar != nguVar || !defpackage.acza.u() || ngyVar4.m(lal.a)) {
            return null;
        }
        defpackage.kyi kyiVar4 = defpackage.kyi.a;
        if (ngyVar4.l(kyiVar4)) {
            return null;
        }
        return kyiVar4;
    }
}
