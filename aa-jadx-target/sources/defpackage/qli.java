package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qli implements defpackage.mnx {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SimToNSAdapter");
    boolean c;
    android.content.BroadcastReceiver d;
    defpackage.erh e;
    private lkc f;
    private int g;
    public final java.util.Map b = new java.util.HashMap();
    private final mnv h = new defpackage.qlh(this, 0);

    public static java.lang.String b(mog mogVar) {
        return mogVar.O() == null ? "com.google.android.projection.gearhead" : mogVar.O();
    }

    @Override // defpackage.mnx
    public final android.app.PendingIntent a(android.content.Intent intent) {
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = defpackage.mkp.a.c;
        int i2 = this.g;
        this.g = i2 + 1;
        return android.app.PendingIntent.getBroadcast(context, i2, intent, (i >= 31 ? 33554432 : 0) | 268435456);
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 7520)).u("stopping");
        if (this.c) {
            android.content.Context context = defpackage.mkp.a.c;
            android.content.BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.d = null;
            }
            defpackage.lxy.o().k(this.h);
            this.b.clear();
            this.f.g();
            this.c = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, lkc] */
    public final void e(mog mogVar) {
        android.util.Pair pair = new android.util.Pair(java.lang.Long.valueOf(mogVar.A()), mogVar.J());
        java.util.Map map = this.b;
        if (!map.containsKey(pair)) {
            defpackage.erh erhVar = this.e;
            defpackage.zaw zawVarJ = mogVar.J();
            qld qkyVar = null;
            defpackage.xei xeiVar = new defpackage.xei(this, null);
            int iOrdinal = zawVarJ.ordinal();
            if (iOrdinal == 2) {
                qkyVar = new qky(xeiVar, (lkc) erhVar.a, new defpackage.onn());
            } else if (iOrdinal == 3) {
                qkyVar = new qkz(xeiVar);
            } else if (iOrdinal == 4) {
                qkyVar = new qla(xeiVar);
            } else if (iOrdinal == 5) {
                qkyVar = new qkz(xeiVar);
            } else if (iOrdinal == 6) {
                qkyVar = new qku(xeiVar);
            } else if (iOrdinal == 13) {
                qkyVar = new qlb(xeiVar);
            } else if (iOrdinal == 27 || iOrdinal == 29) {
                qkyVar = new qld(xeiVar);
            } else if (iOrdinal == 23) {
                qkyVar = new qla(xeiVar);
            } else if (iOrdinal == 24) {
                qkyVar = new qld(xeiVar);
            }
            if (qkyVar == null) {
                defpackage.yqm yqmVar = a;
                if (yqmVar.l().Z()) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 7515)).y("%s not supported", j$.util.Objects.toString(mogVar));
                    return;
                }
                return;
            }
            map.put(pair, qkyVar);
        }
        qle qleVar = (qle) map.get(pair);
        mog mogVarD = qleVar.d();
        nvh nvhVarE = qleVar.e(mogVar);
        if (nvhVarE == null) {
            defpackage.yqm yqmVar2 = a;
            if (yqmVar2.l().Z()) {
                ((defpackage.yqj) yqmVar2.l().ai((char) 7514)).y("unable to add, null notification for %s", j$.util.Objects.toString(mogVar));
                return;
            }
            return;
        }
        defpackage.mcj mcjVarB = defpackage.mcj.b();
        java.lang.String str = nvhVarE.f;
        mcjVarB.a(str).e(mogVar.J().name(), mogVar.A(), nvhVarE);
        if (mogVarD != null) {
            java.lang.String strB = b(mogVarD);
            if (strB.equals(str)) {
                return;
            }
            defpackage.nuz.b().g(mogVar.J().name(), mogVar.A(), strB);
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 7518)).u("starting");
        defpackage.lxy.o().f(this.h);
        lkc lkcVarB = this.f;
        if (lkcVarB == null) {
            lkcVarB = defpackage.kzi.s().b();
            this.f = lkcVarB;
        }
        lkcVarB.f();
        if (this.e == null) {
            this.e = new defpackage.erh(this.f);
        }
        android.content.Context context = defpackage.mkp.a.c;
        if (this.d == null) {
            this.d = new defpackage.qlg(this);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("com.google.android.gearhead.ACTION_HANDLE_NOTIFICATION_INTENT");
            defpackage.duw.e(context, this.d, intentFilter, null, true != defpackage.acul.C() ? 2 : 4);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 7519)).u("receiver active");
        }
        this.c = true;
    }
}
