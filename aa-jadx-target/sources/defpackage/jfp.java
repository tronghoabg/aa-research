package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfp implements defpackage.jfo {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.ANALYTICS");
    public final defpackage.xzi b;
    public final defpackage.ilg c;
    public final defpackage.rqt d;
    public final android.content.Context e;
    public com.google.android.gms.car.CarFacet g;
    public long h;
    private final defpackage.rqy j = new defpackage.rqy();
    public final java.util.List f = new java.util.concurrent.CopyOnWriteArrayList();
    public int i = -1;

    public jfp(defpackage.xzi xziVar, defpackage.ikg ikgVar, defpackage.ilg ilgVar, defpackage.ilj iljVar, android.content.Context context) {
        if (iljVar == null) {
            throw new java.lang.IllegalArgumentException("args must not be null");
        }
        this.b = xziVar;
        this.c = ilgVar;
        this.e = context;
        defpackage.rqt rqtVarA = defpackage.rqt.a(context.getApplicationContext());
        rqtVarA.f(new defpackage.jfq(ikgVar));
        this.d = rqtVarA;
    }

    public static defpackage.yyw j(com.google.android.gms.car.CarUiInfo carUiInfo) {
        defpackage.abor aborVarN = defpackage.yyw.a.n();
        boolean z = carUiInfo.a;
        aborVarN.t();
        defpackage.yyw yywVar = (defpackage.yyw) aborVarN.b;
        int i = 1;
        yywVar.b |= 1;
        yywVar.c = z;
        boolean z2 = carUiInfo.b;
        aborVarN.t();
        defpackage.yyw yywVar2 = (defpackage.yyw) aborVarN.b;
        yywVar2.b |= 2;
        yywVar2.d = z2;
        int i2 = carUiInfo.g;
        if (i2 == 2) {
            i = 2;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 4;
        }
        aborVarN.t();
        defpackage.yyw yywVar3 = (defpackage.yyw) aborVarN.b;
        yywVar3.b = 4 | yywVar3.b;
        yywVar3.e = i - 1;
        boolean z3 = carUiInfo.d;
        aborVarN.t();
        defpackage.yyw yywVar4 = (defpackage.yyw) aborVarN.b;
        yywVar4.b |= 8;
        yywVar4.f = z3;
        boolean z4 = carUiInfo.f;
        aborVarN.t();
        defpackage.yyw yywVar5 = (defpackage.yyw) aborVarN.b;
        yywVar5.b |= 16;
        yywVar5.g = z4;
        boolean z5 = carUiInfo.h;
        aborVarN.t();
        defpackage.yyw yywVar6 = (defpackage.yyw) aborVarN.b;
        yywVar6.b |= 32;
        yywVar6.h = z5;
        boolean z6 = carUiInfo.c;
        aborVarN.t();
        defpackage.yyw yywVar7 = (defpackage.yyw) aborVarN.b;
        yywVar7.b |= 64;
        yywVar7.i = z6;
        return (defpackage.yyw) aborVarN.q();
    }

    public static java.util.List k(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.xqe xqeVar = (defpackage.xqe) it.next();
            defpackage.abor aborVarN = defpackage.yyu.a.n();
            android.graphics.Rect rectB = defpackage.ivf.b(xqeVar);
            defpackage.xqd xqdVarB = defpackage.xqd.b(xqeVar.c);
            if (xqdVarB == null) {
                xqdVarB = defpackage.xqd.VIDEO_800x480;
            }
            aborVarN.t();
            defpackage.yyu yyuVar = (defpackage.yyu) aborVarN.b;
            yyuVar.b |= 4;
            yyuVar.e = xqdVarB.j;
            int iWidth = rectB.width();
            aborVarN.t();
            defpackage.yyu yyuVar2 = (defpackage.yyu) aborVarN.b;
            yyuVar2.b |= 2;
            yyuVar2.d = iWidth;
            int iHeight = rectB.height();
            aborVarN.t();
            defpackage.yyu yyuVar3 = (defpackage.yyu) aborVarN.b;
            yyuVar3.b |= 1;
            yyuVar3.c = iHeight;
            if ((xqeVar.b & 16) != 0) {
                int i = xqeVar.g;
                aborVarN.t();
                defpackage.yyu yyuVar4 = (defpackage.yyu) aborVarN.b;
                yyuVar4.b |= 8;
                yyuVar4.f = i;
            }
            int iS = defpackage.wva.s(xqeVar.d);
            int i2 = iS != 0 ? iS : 1;
            aborVarN.t();
            defpackage.yyu yyuVar5 = (defpackage.yyu) aborVarN.b;
            yyuVar5.b |= 16;
            yyuVar5.g = i2;
            if ((xqeVar.b & 128) != 0) {
                int i3 = xqeVar.i;
                aborVarN.t();
                defpackage.yyu yyuVar6 = (defpackage.yyu) aborVarN.b;
                yyuVar6.b |= 32;
                yyuVar6.h = i3;
            }
            if ((xqeVar.b & 256) != 0) {
                int i4 = xqeVar.j;
                aborVarN.t();
                defpackage.yyu yyuVar7 = (defpackage.yyu) aborVarN.b;
                yyuVar7.b |= 64;
                yyuVar7.i = i4;
            }
            if ((xqeVar.b & 32) != 0) {
                int i5 = xqeVar.h;
                aborVarN.t();
                defpackage.yyu yyuVar8 = (defpackage.yyu) aborVarN.b;
                yyuVar8.b |= 128;
                yyuVar8.j = i5;
            }
            arrayList.add((defpackage.yyu) aborVarN.q());
        }
        return arrayList;
    }

    public static defpackage.yyh l(int i, boolean z) {
        int i2 = i - 1;
        if (i2 == 1) {
            return z ? defpackage.yyh.FACET_NAVIGATION_END : defpackage.yyh.FACET_NAVIGATION_START;
        }
        if (i2 == 2) {
            return z ? defpackage.yyh.FACET_PHONE_END : defpackage.yyh.FACET_PHONE_START;
        }
        if (i2 == 3) {
            return z ? defpackage.yyh.FACET_MUSIC_END : defpackage.yyh.FACET_MUSIC_START;
        }
        if (i2 == 4) {
            return z ? defpackage.yyh.FACET_OEM_END : defpackage.yyh.FACET_OEM_START;
        }
        if (i2 != 5) {
            return defpackage.yyh.UNKNOWN_EVENT_TYPE;
        }
        return z ? defpackage.yyh.FACET_HOME_END : defpackage.yyh.FACET_HOME_START;
    }

    @Override // defpackage.jfo
    public final void a(defpackage.yym yymVar) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        yymVar.getClass();
        yygVar.n = yymVar;
        yygVar.b |= 2048;
        defpackage.yyh yyhVar = defpackage.yyh.COMPONENT_INTERACTION_EVENT;
        int i = defpackage.ygw.d;
        m(aborVarN, yyhVar, defpackage.ymx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jfo
    public final void b(defpackage.rrs rrsVar) {
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        defpackage.yot it = rrsVar.d().iterator();
        while (it.hasNext()) {
            ygrVar.i(java.lang.Integer.valueOf(((defpackage.acbk) it.next()).a()));
        }
        m(rrsVar.g(), rrsVar.e(), ygrVar.g());
    }

    @Override // defpackage.jfo
    public final void c(defpackage.yzy yzyVar) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        yzyVar.getClass();
        yygVar.aj = yzyVar;
        yygVar.d |= 1024;
        defpackage.yyh yyhVar = defpackage.yyh.MEDIA_STATS;
        int i = defpackage.ygw.d;
        m(aborVarN, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.jfo
    public final void d(defpackage.zaj zajVar, defpackage.zak zakVar, long j, long j2) {
        zajVar.getClass();
        zakVar.getClass();
        defpackage.abor aborVarN = defpackage.zal.a.n();
        aborVarN.t();
        defpackage.zal zalVar = (defpackage.zal) aborVarN.b;
        zalVar.b |= 1;
        zalVar.c = zajVar.D;
        aborVarN.t();
        defpackage.zal zalVar2 = (defpackage.zal) aborVarN.b;
        zalVar2.b |= 2;
        zalVar2.d = zakVar.az;
        aborVarN.t();
        defpackage.zal zalVar3 = (defpackage.zal) aborVarN.b;
        zalVar3.b |= 4;
        zalVar3.e = j;
        aborVarN.t();
        defpackage.zal zalVar4 = (defpackage.zal) aborVarN.b;
        zalVar4.b |= 8;
        zalVar4.f = j2;
        defpackage.zal zalVar5 = (defpackage.zal) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zalVar5.getClass();
        yygVar.s = zalVar5;
        yygVar.b |= 65536;
        defpackage.yyh yyhVar = defpackage.yyh.OUT_OF_CAR_LIFECYCLE_ERROR;
        int i = defpackage.ygw.d;
        m(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.jfo
    public final void e(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        defpackage.abor aborVarN = defpackage.zbg.a.n();
        aborVarN.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN.b;
        zbgVar.b |= 1;
        zbgVar.d = zbeVar.he;
        int iA = zbdVar.a();
        aborVarN.t();
        defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarN.b;
        zbgVar2.b |= 2;
        zbgVar2.e = iA;
        defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zbgVar3.getClass();
        yygVar.o = zbgVar3;
        yygVar.b |= 4096;
        defpackage.yyh yyhVar = defpackage.yyh.UI;
        int i = defpackage.ygw.d;
        m(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.jfo
    public final void f(defpackage.zbe zbeVar, defpackage.zbd zbdVar, long j) {
        defpackage.abor aborVarN = defpackage.zbg.a.n();
        aborVarN.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN.b;
        zbgVar.b |= 1;
        zbgVar.d = zbeVar.he;
        int iA = zbdVar.a();
        aborVarN.t();
        defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarN.b;
        zbgVar2.b |= 2;
        zbgVar2.e = iA;
        aborVarN.t();
        defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarN.b;
        zbgVar3.b |= 4;
        zbgVar3.f = j;
        defpackage.zbg zbgVar4 = (defpackage.zbg) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zbgVar4.getClass();
        yygVar.o = zbgVar4;
        yygVar.b |= 4096;
        defpackage.yyh yyhVar = defpackage.yyh.UI;
        int i = defpackage.ygw.d;
        m(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.jfo
    public final void g(int i) {
        this.i = i;
        for (defpackage.epv epvVar : this.f) {
            defpackage.ino.l.a();
        }
    }

    @Override // defpackage.jfo
    public final boolean h() {
        return this.i != -1;
    }

    @Override // defpackage.jfo
    public final void i(defpackage.zaa zaaVar, defpackage.zab zabVar, java.lang.String str) {
        defpackage.abor aborVarN = defpackage.zae.a.n();
        aborVarN.t();
        defpackage.zae zaeVar = (defpackage.zae) aborVarN.b;
        zaeVar.b |= 1;
        zaeVar.c = 27;
        aborVarN.t();
        defpackage.zae zaeVar2 = (defpackage.zae) aborVarN.b;
        zaeVar2.b |= 2;
        zaeVar2.d = zaaVar.fI;
        aborVarN.t();
        defpackage.zae zaeVar3 = (defpackage.zae) aborVarN.b;
        zaeVar3.b |= 256;
        zaeVar3.i = zabVar.y;
        aborVarN.t();
        defpackage.zae zaeVar4 = (defpackage.zae) aborVarN.b;
        str.getClass();
        zaeVar4.b |= 128;
        zaeVar4.h = str;
        defpackage.zae zaeVar5 = (defpackage.zae) aborVarN.q();
        zaeVar5.getClass();
        defpackage.ysr.bk(1 == (zaeVar5.b & 1), "nonUiEvent.hasContext() is false");
        defpackage.ysr.bk((zaeVar5.b & 2) != 0, "nonUiEvent.hasAction() is false");
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yygVar.p = zaeVar5;
        yygVar.b |= 8192;
        defpackage.yyh yyhVar = defpackage.yyh.NON_UI;
        int i = defpackage.ygw.d;
        m(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    @java.lang.Deprecated
    public final void m(defpackage.abor aborVar, defpackage.yyh yyhVar, java.util.List list) {
        if ((((defpackage.yyg) aborVar.b).b & 8388608) == 0) {
            int i = this.i;
            aborVar.t();
            defpackage.yyg yygVar = (defpackage.yyg) aborVar.b;
            yygVar.b = 8388608 | yygVar.b;
            yygVar.x = i;
        }
        this.d.e(yyhVar, (defpackage.yyg) aborVar.q(), list);
        this.j.a(yyhVar, (defpackage.yyg) aborVar.q());
    }
}
