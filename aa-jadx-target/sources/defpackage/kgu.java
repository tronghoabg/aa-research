package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kgu {
    public static final void a(java.util.List list, boolean z, defpackage.zbe zbeVar) {
        java.util.Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            com.google.android.apps.auto.components.calendar.model.CalendarEvent calendarEvent = (com.google.android.apps.auto.components.calendar.model.CalendarEvent) it.next();
            i++;
            calendarEvent.f();
            boolean zIsEmpty = calendarEvent.f().isEmpty();
            boolean zIsEmpty2 = android.text.TextUtils.isEmpty(calendarEvent.g());
            boolean zJ = calendarEvent.j();
            if (!zIsEmpty) {
                i2++;
            }
            if (!zIsEmpty2) {
                i3++;
            }
            if (zIsEmpty && zIsEmpty2) {
                i4++;
            }
            if (zJ) {
                i5++;
                if (!zIsEmpty) {
                    i6++;
                }
                if (!zIsEmpty2) {
                    i7++;
                }
                if (zIsEmpty && zIsEmpty2) {
                    i8++;
                }
            }
            if (zbeVar == defpackage.zbe.CALENDAR_AGENDA_VIEW && calendarEvent.i()) {
                i9++;
                if (zJ) {
                    i10++;
                }
            }
        }
        rrg rrgVar = new rrg();
        rrgVar.b = defpackage.yzd.GEARHEAD;
        rrgVar.a = defpackage.yyh.CALENDAR_EVENT_LIST_SNAPSHOT;
        rrgVar.c = zbeVar;
        rrgVar.d = i;
        rrgVar.e = i2;
        rrgVar.f = i3;
        rrgVar.g = i4;
        rrgVar.o = (byte) 15;
        rrgVar.j = defpackage.xyn.h(java.lang.Integer.valueOf(i5));
        rrgVar.k = defpackage.xyn.h(java.lang.Integer.valueOf(i6));
        rrgVar.l = defpackage.xyn.h(java.lang.Integer.valueOf(i7));
        rrgVar.m = defpackage.xyn.h(java.lang.Integer.valueOf(i8));
        if (zbeVar == defpackage.zbe.CALENDAR_AGENDA_VIEW) {
            rrgVar.h = defpackage.xyn.h(java.lang.Integer.valueOf(i9));
            rrgVar.n = defpackage.xyn.h(java.lang.Integer.valueOf(i10));
            rrgVar.i = defpackage.xyn.h(java.lang.Boolean.valueOf(z));
        }
        defpackage.omf.u().F(rrgVar.l());
    }

    public static void b() {
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object c(defpackage.kjd kjdVar, java.lang.String str, defpackage.zbe zbeVar, defpackage.zbd zbdVar, boolean z, java.lang.String str2, java.lang.Object... objArr) {
        try {
            return kjdVar.a();
        } catch (defpackage.qst e) {
            if (e instanceof defpackage.rlq) {
                defpackage.rlq rlqVar = (defpackage.rlq) e;
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) new defpackage.yqm(defpackage.yrs.d(str)).g()).p(rlqVar)).ai(3171)).Y(str2, objArr);
                throw new kiw(java.lang.String.format(str2, objArr), rlqVar, zbeVar, zbdVar, z);
            }
            if (!(e instanceof rlo)) {
                defpackage.rox.p(str, e, str2, objArr);
                throw new java.lang.IllegalStateException("This should be unreachable, the method should always have returned or thrown an exception.");
            }
            java.lang.Throwable th = (rlo) e;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) new defpackage.yqm(defpackage.yrs.d(str)).g()).p(th)).ai(3170)).Y(str2, objArr);
            throw new kix(java.lang.String.format(str2, objArr), th, zbeVar, zbdVar, z);
        } catch (defpackage.qsu e2) {
            defpackage.rox.p(str, e2, str2, objArr);
            throw new java.lang.IllegalStateException("This should be unreachable, the method should always have returned or thrown an exception.");
        }
    }

    public static void d(defpackage.kje kjeVar, java.lang.String str, defpackage.zbe zbeVar, defpackage.zbd zbdVar, java.lang.String str2, java.lang.Object... objArr) {
        c(new defpackage.kjf(kjeVar, 1), str, zbeVar, zbdVar, true, str2, objArr);
    }

    public static final defpackage.ktl e(long j, long j2, long j3, long j4, long j5, long j6, long j7, defpackage.bve bveVar, int i) {
        long j8;
        long j9;
        if ((i & 2) != 0) {
            defpackage.ksw kswVar = defpackage.ksx.a;
            bveVar.v(1366992543);
            j8 = j;
            long jA = defpackage.ksx.a(defpackage.kfp.i(bveVar), j8);
            if (jA == 16) {
                jA = ((defpackage.ckd) bveVar.f(defpackage.bnq.a)).a;
            }
            bveVar.o();
            j9 = jA;
        } else {
            j8 = j;
            j9 = j2;
        }
        return new defpackage.ktl(j8, j9, (i & 4) != 0 ? j9 : j3, (i & 8) != 0 ? j8 : j4, (i & 16) != 0 ? j9 : j5, (i & 32) != 0 ? j9 : 0L, (i & 64) != 0 ? ((defpackage.kub) ((defpackage.mku) defpackage.ktl.d.a()).d).a(bveVar) : j6, (i & 128) != 0 ? ((defpackage.kub) ((defpackage.mku) defpackage.ktl.d.a()).b).a(bveVar) : j7);
    }

    public static final defpackage.ktl f(long j, long j2, long j3, long j4, defpackage.bve bveVar, int i) {
        long jA = (i & 1) != 0 ? defpackage.kud.a((defpackage.kry) m().a, bveVar) : j;
        long jA2 = (i & 2) != 0 ? defpackage.kud.a((defpackage.kry) m().c, bveVar) : 0L;
        return new defpackage.ktl(jA, jA2, (i & 4) != 0 ? jA2 : j2, (i & 8) != 0 ? jA : j3, (i & 16) != 0 ? jA2 : j4, jA2, ((defpackage.kub) m().d).a(bveVar), ((defpackage.kub) m().b).a(bveVar));
    }

    public static final defpackage.ktl g(long j, long j2, long j3, long j4, defpackage.bve bveVar, int i) {
        long j5;
        long jA = 0;
        if ((i & 1) != 0) {
            long j6 = ((defpackage.ktg) defpackage.ktl.a.a()).a;
            bveVar.v(1551263020);
            ((defpackage.bwc) bveVar).Y(false);
            j5 = 0;
        } else {
            j5 = j;
        }
        long jA2 = (i & 2) != 0 ? defpackage.kud.a(((defpackage.ktg) defpackage.ktl.a.a()).b, bveVar) : j2;
        long j7 = (i & 4) != 0 ? jA2 : j3;
        if ((i & 8) != 0) {
            defpackage.kua kuaVar = ((defpackage.ktg) defpackage.ktl.a.a()).c;
            jA = defpackage.kua.a(bveVar);
        }
        long j8 = jA;
        if ((i & 16) != 0) {
            long j9 = ((defpackage.ktg) defpackage.ktl.a.a()).d;
            bveVar.v(1551263020);
            ((defpackage.bwc) bveVar).Y(false);
        }
        long jA3 = (i & 32) != 0 ? defpackage.kud.a(((defpackage.ktg) defpackage.ktl.a.a()).e, bveVar) : j4;
        defpackage.afar afarVar = defpackage.ktl.a;
        long j10 = ((defpackage.ktg) afarVar.a()).f;
        bveVar.v(1551263020);
        ((defpackage.bwc) bveVar).Y(false);
        return new defpackage.ktl(j5, jA2, j7, j8, 0L, jA3, 0L, ((defpackage.ktg) afarVar.a()).g.a(bveVar));
    }

    public static final defpackage.ktl h(defpackage.bve bveVar) {
        defpackage.afar afarVar = defpackage.ktl.b;
        long j = ((defpackage.kth) afarVar.a()).a;
        bveVar.v(1551263020);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        bwcVar.Y(false);
        long jA = defpackage.kud.a(((defpackage.kth) afarVar.a()).b, bveVar);
        long jA2 = defpackage.kud.a(((defpackage.kth) afarVar.a()).c, bveVar);
        defpackage.kua kuaVar = ((defpackage.kth) afarVar.a()).d;
        long jA3 = defpackage.kua.a(bveVar);
        long j2 = ((defpackage.kth) afarVar.a()).e;
        bveVar.v(1551263020);
        bwcVar.Y(false);
        long jA4 = defpackage.kud.a(((defpackage.kth) afarVar.a()).f, bveVar);
        long j3 = ((defpackage.kth) afarVar.a()).g;
        bveVar.v(1551263020);
        bwcVar.Y(false);
        return new defpackage.ktl(0L, jA, jA2, jA3, 0L, jA4, 0L, ((defpackage.kth) afarVar.a()).h.a(bveVar));
    }

    public static final defpackage.ktl i(defpackage.bve bveVar) {
        defpackage.afar afarVar = defpackage.ktl.f;
        long jA = defpackage.kud.a(((defpackage.ktk) afarVar.a()).a, bveVar);
        float fD = defpackage.ckd.d(jA);
        float fC = defpackage.ckd.c(jA);
        float fB = defpackage.ckd.b(jA);
        float[] fArr = defpackage.clr.a;
        long jK = defpackage.cjv.k(fD, fC, fB, 0.5f, defpackage.clr.y[(int) (jA & 63)]);
        long jA2 = defpackage.kud.a(((defpackage.ktk) afarVar.a()).b, bveVar);
        defpackage.kua kuaVar = ((defpackage.ktk) afarVar.a()).c;
        long jA3 = defpackage.kua.a(bveVar);
        long j = ((defpackage.ktk) afarVar.a()).d;
        bveVar.v(1551263020);
        bveVar.o();
        long jA4 = defpackage.kud.a(((defpackage.ktk) afarVar.a()).e, bveVar);
        long j2 = ((defpackage.ktk) afarVar.a()).f;
        bveVar.v(1551263020);
        bveVar.o();
        return new defpackage.ktl(jK, jA2, jA2, jA3, 0L, jA4, 0L, ((defpackage.ktk) afarVar.a()).g.a(bveVar));
    }

    public static final defpackage.ktl j(long j, long j2, long j3, long j4, defpackage.bve bveVar, int i) {
        long jA;
        long jA2 = (i & 1) != 0 ? defpackage.kud.a(l().a, bveVar) : j;
        long jA3 = (i & 2) != 0 ? defpackage.kud.a(l().b, bveVar) : j2;
        long j5 = (i & 4) != 0 ? jA3 : j3;
        if ((i & 8) != 0) {
            defpackage.kua kuaVar = l().c;
            jA = defpackage.kua.a(bveVar);
        } else {
            jA = j4;
        }
        long j6 = l().d;
        defpackage.kuc.a(bveVar);
        return new defpackage.ktl(jA2, jA3, j5, jA, j6, defpackage.kud.a(l().e, bveVar), l().f.a(bveVar), l().g.a(bveVar));
    }

    public static final long k(float f, defpackage.bve bveVar) {
        return ((defpackage.dlo) bveVar.f(defpackage.dbl.d)).dQ(f);
    }

    private static final kti l() {
        return (kti) defpackage.ktl.c.a();
    }

    private static final defpackage.mku m() {
        return (defpackage.mku) defpackage.ktl.d.a();
    }
}
