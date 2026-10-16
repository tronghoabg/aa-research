package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ryo implements defpackage.xzi {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ryo(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [aclm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r4v70, types: [java.lang.Object, xzi] */
    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        int i = 20;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqk yqkVar = defpackage.rys.a;
                return java.lang.Boolean.valueOf(defpackage.ryk.a((android.content.Context) this.a).f());
            case 1:
                return new defpackage.rps(new defpackage.jpe(this.a, 3));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((android.content.Context) this.a).getSharedPreferences("primes", 0);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Long.valueOf(java.lang.Double.valueOf((java.lang.String) ((defpackage.vqo) this.a).a.fF()).longValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return (java.lang.Boolean) this.a.a();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (android.os.Build.VERSION.SDK_INT < 30) {
                    return defpackage.xxe.a;
                }
                android.content.Context context = (android.content.Context) this.a;
                try {
                    return defpackage.xyn.g(bgp$.ExternalSyntheticApiModelOutline0.m$1(bgp$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager(), context.getPackageName())));
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return defpackage.xxe.a;
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.Comparator comparatorComparing = j$.util.Comparator.-CC.comparing(new defpackage.mmf(i), j$.util.Comparator.-CC.reverseOrder());
                java.lang.Iterable iterable = (java.lang.Iterable) this.a.a();
                int i2 = defpackage.ygw.d;
                comparatorComparing.getClass();
                java.lang.Object[] array = defpackage.ysr.aq(iterable).toArray();
                int length = array.length;
                defpackage.ysr.B(array, length);
                java.util.Arrays.sort(array, comparatorComparing);
                return defpackage.ygw.l(array, length);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Long.valueOf(((defpackage.vsx) this.a).e.a().getTotalSpace() / 1024);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.vrn.d(((defpackage.vwk) this.a).b);
            case 9:
                return (defpackage.vvu) this.a.a();
            case 10:
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.wba.a;
                defpackage.wfs wfsVar = new defpackage.wfs();
                wfsVar.f = this.a;
                return wfsVar.a();
            case 11:
                java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.wba.a;
                return new defpackage.roy(new defpackage.svo((android.content.Context) this.a));
            case 12:
                java.util.concurrent.atomic.AtomicReference atomicReference3 = defpackage.wba.a;
                return new defpackage.ngb((java.util.List) this.a);
            case 13:
                java.util.concurrent.atomic.AtomicReference atomicReference4 = defpackage.wba.a;
                return (defpackage.wec) ((defpackage.xyn) this.a.fF()).e();
            case 14:
                java.lang.Object obj = ((defpackage.wfs) this.a).f;
                java.util.concurrent.atomic.AtomicReference atomicReference5 = defpackage.wba.a;
                try {
                    return defpackage.xyn.h(((android.content.Context) obj).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                    return defpackage.xxe.a;
                }
            case 15:
                return this.a;
            case 16:
                boolean z = defpackage.wbn.b;
                return defpackage.waw.a((android.content.Context) this.a);
            case 17:
                java.lang.Object obj2 = this.a;
                defpackage.wem wemVar = (defpackage.wem) obj2;
                defpackage.zhw zhwVar = (defpackage.zhw) wemVar.e.fF();
                zhwVar.getClass();
                defpackage.roy royVar = (defpackage.roy) wemVar.d.fF();
                royVar.getClass();
                defpackage.zhm zhmVarW = defpackage.zhm.v(defpackage.roy.c(((defpackage.svo) royVar.a).c())).u(defpackage.wbu.class, new txx(20), zhwVar).w(new rha(obj2, 15), zhwVar);
                zhmVarW.c(new defpackage.wdg(zhmVarW, 7), zhwVar);
                return zhmVarW;
            case 18:
                defpackage.zhw zhwVar2 = (defpackage.zhw) this.a.fF();
                zhwVar2.getClass();
                return zhwVar2.schedule(new wdz(2), 10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            default:
                defpackage.yqm yqmVar = com.google.android.projection.gearhead.GhCrashHandler.a;
                return defpackage.rqv.a((android.content.Context) this.a);
        }
    }
}
