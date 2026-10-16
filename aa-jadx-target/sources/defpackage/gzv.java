package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class gzv implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gzv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.companion.virtual.VirtualDeviceManager$ActivityListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v42, types: [affc, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((gzz) this.a).e.b();
                return defpackage.afbk.a;
            case 1:
                gzo gzoVar = (gzo) this.a;
                gzoVar.e = null;
                gzoVar.d.c(gzoVar.h);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((gzz) this.a).e.a();
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((gzz) this.a).e.a();
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.axx) this.a).l().j;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.List list = ((defpackage.axx) this.a).l().j;
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((defpackage.axp) it.next()).a));
                }
                return arrayList;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.axx) this.a).i());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.axx axxVar = (defpackage.axx) this.a;
                return new defpackage.afau(java.lang.Integer.valueOf(axxVar.b()), java.lang.Integer.valueOf(axxVar.c()));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((defpackage.axx) this.a).i());
            case 9:
                defpackage.afer aferVar = ((haq) this.a).e;
                if (aferVar != null) {
                    aferVar.invoke();
                }
                return defpackage.afbk.a;
            case 10:
                float f = hmv.a;
                this.a.invoke(hmo.b);
                return defpackage.afbk.a;
            case 11:
                hnd hndVar = (hnd) this.a;
                hndVar.d.d(hndVar.c);
                return defpackage.afbk.a;
            case 12:
                return new ijr(this.a, 0);
            case 13:
                return new android.view.Surface(((uts) this.a).f());
            case 14:
                java.lang.Object obj = this.a;
                uts utsVar = (uts) obj;
                java.lang.Object objInvoke = utsVar.h.invoke();
                defpackage.ipo ipoVar = (defpackage.ipo) objInvoke;
                ipoVar.j(3, 0);
                defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                ipoVar.d(utsVar.e, new defpackage.zie(zgtVar));
                defpackage.ypu ypuVarL = ipj.a.l();
                ?? r6 = utsVar.d;
                ypuVarL.y("Adding intent interceptors for %s", r6);
                for (android.content.IntentFilter intentFilter : r6) {
                    ipi ipiVar = new ipi(obj, 0);
                    ipoVar.f(intentFilter, new defpackage.zie(zgtVar), ipiVar);
                    utsVar.b.add(ipiVar);
                }
                return objInvoke;
            case 15:
                ipm ipmVar = (ipm) this.a;
                return ipmVar.e.invoke(ipmVar.g);
            case 16:
                return ((defpackage.nub) this.a).a;
            case 17:
                return java.lang.Integer.valueOf(((defpackage.ipo) this.a).a.getDisplay().getDisplayId());
            case 18:
                int i = defpackage.ipr.b;
                ((defpackage.ipo) this.a).g();
                return defpackage.afbk.a;
            case 19:
                int i2 = defpackage.ipr.b;
                ((defpackage.ipo) this.a).k(null);
                return defpackage.afbk.a;
            default:
                com.google.android.apps.auto.client.activity.ghost.GhostActivity ghostActivity = (com.google.android.apps.auto.client.activity.ghost.GhostActivity) this.a;
                android.os.Parcelable parcelableExtra = ghostActivity.getIntent().getParcelableExtra("CarActivityServiceComponentName");
                if (parcelableExtra != null) {
                    return (android.content.ComponentName) parcelableExtra;
                }
                android.os.Bundle extras = ghostActivity.getIntent().getExtras();
                java.util.Objects.toString(extras);
                throw new java.lang.IllegalArgumentException("Corresponding CarActivityService not specified in Intent! ".concat(java.lang.String.valueOf(extras)));
        }
    }
}
