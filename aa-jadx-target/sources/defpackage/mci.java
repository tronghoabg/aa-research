package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mci implements defpackage.lhn {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.AppsNotifStore");
    public java.util.Map a = new java.util.LinkedHashMap();
    private final defpackage.eqt d = new defpackage.lso(this, 4);
    private boolean e;

    public mci() {
        defpackage.kwu.b();
        java.lang.Boolean bool = (java.lang.Boolean) new defpackage.kwy().e();
        bool.getClass();
        this.e = bool.booleanValue();
    }

    public final void a(long j) {
        nvb nvbVar;
        android.app.PendingIntent pendingIntent;
        mch mchVar = (mch) this.a.get(java.lang.Long.valueOf(j));
        if (mchVar != null && (nvbVar = mchVar.c.s) != null && (pendingIntent = nvbVar.c) != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 4770)).u("Failed to send deleteAction intent");
            }
        }
        this.a.remove(java.lang.Long.valueOf(j));
    }

    public final void b(defpackage.nve nveVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Long l : this.a.keySet()) {
            mch mchVar = (mch) this.a.get(l);
            mchVar.getClass();
            if (nveVar == null || mchVar.c.x.equals(nveVar)) {
                nvh nvhVar = mchVar.c;
                nvd nvdVar = nvhVar.A;
                nvd nvdVar2 = nvd.d;
                if (nvdVar.equals(nvdVar2)) {
                    linkedHashMap.put(l, mchVar);
                } else {
                    nvc nvcVarA = nvc.a(nvhVar);
                    nvcVarA.A = nvdVar2;
                    nvcVarA.a = nvf.c;
                    nvh nvhVarB = nvcVarA.b();
                    java.lang.String str = mchVar.a;
                    long j = mchVar.b;
                    linkedHashMap.put(l, new mch(str, j, nvhVarB));
                    defpackage.nuz.b().j(str, j, nvhVarB);
                }
            }
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.lhn
    public final void d() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.kwu.b();
            new defpackage.kwy().k(this.d);
        }
        this.a.clear();
    }

    public final void e(java.lang.String str, long j, nvh nvhVar) {
        if (!nvhVar.C || this.e) {
            this.a.put(java.lang.Long.valueOf(j), new mch(str, j, nvhVar));
            defpackage.nuz.b().j(str, j, nvhVar);
        } else {
            java.lang.String strConcat = java.lang.String.format("\ncrossProfileFlagEnabled=%b\ncrossProfileSettingEnabled=%b\nworkProfileAvailability=%s", java.lang.Boolean.valueOf(android.os.Build.VERSION.SDK_INT >= 30), java.lang.Boolean.valueOf(defpackage.mpr.f().a().o()), defpackage.kwu.b().a());
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                strConcat = java.lang.String.valueOf(strConcat).concat(java.lang.String.valueOf(java.lang.String.format("\nrunningOnWork=%b\nworkProfileDetected=%b\nneedsWorkPermission=%b", java.lang.Boolean.valueOf(defpackage.kwu.b().c()), java.lang.Boolean.valueOf(defpackage.kwu.b().d()), java.lang.Boolean.valueOf(defpackage.kwu.b().d.f().c()))));
            }
            ((defpackage.yqj) ((defpackage.yqj) c.g()).ai((char) 4771)).y("Work notification posted when work data is unavailable.%s", strConcat);
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.kwu.b();
            new defpackage.kwy().eM(defpackage.ler.c(), this.d);
        }
        defpackage.kwu.b();
        java.lang.Boolean bool = (java.lang.Boolean) new defpackage.kwy().e();
        bool.getClass();
        f(bool.booleanValue());
    }

    public final void f(boolean z) {
        this.e = z;
        if (z) {
            return;
        }
        for (mch mchVar : (java.util.List) j$.util.Collection.-EL.stream(this.a.values()).filter(new defpackage.lyk(7)).collect(j$.util.stream.Collectors.toList())) {
            java.lang.String str = mchVar.a;
            long j = mchVar.b;
            defpackage.nuz.b().g(str, j, mchVar.c.f);
            this.a.remove(java.lang.Long.valueOf(j));
        }
    }
}
