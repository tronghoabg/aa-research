package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class whj implements defpackage.zgm {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ whj(defpackage.vwt vwtVar, defpackage.vwp vwpVar, defpackage.vzf vzfVar, int i) {
        this.d = i;
        this.b = vwtVar;
        this.a = vwpVar;
        this.c = vzfVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, zgn] */
    @Override // defpackage.zgm
    public final defpackage.zhs a() throws java.io.IOException {
        defpackage.zhs zhsVarG;
        java.util.ArrayList arrayList;
        android.net.NetworkInfo activeNetworkInfo;
        defpackage.zhs zifVar;
        int i = this.d;
        if (i == 0) {
            java.lang.Object obj = this.a;
            defpackage.who whoVar = (defpackage.who) obj;
            android.net.Uri uri = (android.net.Uri) defpackage.ysr.cw(whoVar.a);
            ?? r5 = this.c;
            ?? r9 = this.b;
            try {
                defpackage.wgh wghVar = new defpackage.wgh((java.io.Closeable) ((defpackage.who) obj).i.d(uri, new defpackage.wgq(false)));
                try {
                    try {
                        zhsVarG = defpackage.ysr.cp(((defpackage.who) obj).c(uri));
                    } catch (java.lang.Throwable th) {
                        try {
                            wghVar.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    defpackage.xyn xynVar = ((defpackage.who) obj).c;
                    if (xynVar.f() && !defpackage.who.g(e)) {
                        zhsVarG = defpackage.zgh.g(((defpackage.kwv) xynVar.b()).x(e, ((defpackage.who) obj).g), defpackage.xvx.b(new waa((defpackage.who) obj, uri, 4)), ((defpackage.who) obj).b);
                    } else {
                        defpackage.zif zifVar2 = new defpackage.zif(e);
                        zhsVarG = zifVar2;
                    }
                }
                defpackage.zhs zhsVarG2 = defpackage.zgh.g(defpackage.zhm.v(zhsVarG), defpackage.xvx.b(r9), r5);
                defpackage.zgn zgnVarB = defpackage.xvx.b(new waa(obj, zhsVarG, 5));
                java.util.concurrent.Executor executor = ((defpackage.who) obj).b;
                defpackage.zhs zhsVarB = defpackage.who.b(defpackage.zgh.g(zhsVarG2, zgnVarB, executor), wghVar.a(), executor);
                wghVar.close();
                return zhsVarB;
            } catch (java.io.FileNotFoundException e2) {
                throw vvb.N(whoVar.i, defpackage.sqs.bD(uri, ".lock"), e2, whoVar.f);
            }
        }
        int i2 = 1;
        if (i != 1) {
            defpackage.wgq wgqVar = new defpackage.wgq(false);
            java.lang.Object obj2 = this.c;
            defpackage.ngb ngbVar = ((defpackage.who) obj2).i;
            java.lang.Object obj3 = this.a;
            defpackage.wgh wghVar2 = new defpackage.wgh((java.io.Closeable) ngbVar.d((android.net.Uri) obj3, wgqVar));
            java.lang.Object obj4 = this.b;
            try {
                try {
                    ((defpackage.who) obj2).c((android.net.Uri) obj3);
                    zifVar = defpackage.zho.a;
                } catch (java.lang.Throwable th3) {
                    try {
                        wghVar2.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.io.IOException e3) {
                zifVar = defpackage.who.g(e3) ? new defpackage.zif(e3) : ((defpackage.kwv) obj4).x(e3, ((defpackage.who) obj2).g);
            }
            defpackage.zhs zhsVarBE = defpackage.sqs.bE(defpackage.who.b(zifVar, wghVar2.a(), ((defpackage.who) obj2).b));
            wghVar2.close();
            return zhsVarBE;
        }
        java.lang.Object obj5 = this.b;
        java.lang.Object obj6 = this.c;
        try {
            int iAs = defpackage.a.as(((ajgy) ((defpackage.vwt) obj5).e.a()).e);
            java.lang.Object obj7 = this.a;
            if (iAs != 0 && iAs == 5) {
                ((defpackage.vwp) obj7).q = (defpackage.vzf) obj6;
            }
            android.content.Context context = ((defpackage.vwt) obj5).a;
            ((defpackage.vwp) obj7).l = ((defpackage.vwt) obj5).h.A();
            int type = -1;
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    type = activeNetworkInfo.getType();
                }
            } catch (java.lang.SecurityException e4) {
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e4)).ai((char) 9870)).u("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
            }
            int iA = aiit.a(type);
            if (iA != 0) {
                i2 = iA;
            }
            ((defpackage.vwp) obj7).s = i2;
            int i3 = ((defpackage.vwo) ((defpackage.vwt) obj5).b.a()).a;
            synchronized (((defpackage.vwt) obj5).c) {
                ((defpackage.vwt) obj5).f.ensureCapacity(i3);
                ((defpackage.vwt) obj5).f.add(obj7);
                if (((defpackage.vwt) obj5).f.size() >= i3) {
                    arrayList = ((defpackage.vwt) obj5).f;
                    ((defpackage.vwt) obj5).f = new java.util.ArrayList(0);
                } else {
                    arrayList = null;
                }
            }
            defpackage.zhs zhsVarB2 = arrayList == null ? defpackage.zho.a : ((defpackage.vwt) obj5).b(((defpackage.vwq) ((defpackage.vwt) obj5).d.a()).c(arrayList));
            ((defpackage.vwt) obj5).g.decrementAndGet();
            return zhsVarB2;
        } catch (java.lang.Throwable th5) {
            ((defpackage.vwt) obj5).g.decrementAndGet();
            throw th5;
        }
    }

    public /* synthetic */ whj(defpackage.who whoVar, android.net.Uri uri, defpackage.kwv kwvVar, int i) {
        this.d = i;
        this.c = whoVar;
        this.a = uri;
        this.b = kwvVar;
    }

    public /* synthetic */ whj(defpackage.who whoVar, defpackage.zgn zgnVar, java.util.concurrent.Executor executor, int i) {
        this.d = i;
        this.a = whoVar;
        this.b = zgnVar;
        this.c = executor;
    }
}
