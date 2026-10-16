package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qfh implements defpackage.afak {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qfh(android.content.Context context, java.lang.Object obj, int i) {
        this.c = i;
        this.a = context;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        java.lang.String name;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                int i = defpackage.qfn.g;
                return new defpackage.qjm(this.a, (defpackage.lwq) this.b.fF());
            case 1:
                android.content.Context context = this.a;
                int i2 = defpackage.qfn.g;
                android.content.Context applicationContext = context.getApplicationContext();
                defpackage.mkc.a();
                defpackage.ynu ynuVar = new defpackage.ynu((mjy) defpackage.mkp.a.b(mjy.class, new defpackage.mbf(5)));
                applicationContext.getClass();
                ?? r7 = this.b;
                r7.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(ynuVar, 10));
                defpackage.yot it = ynuVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tmh) it.next()).a);
                }
                aiaz.b((java.util.concurrent.Executor) r7);
                defpackage.ysr.ay(ynuVar);
                java.lang.String string = android.provider.Settings.Global.getString(applicationContext.getContentResolver(), "device_name");
                if ((string == null || string.length() == 0) && (((string = android.provider.Settings.System.getString(applicationContext.getContentResolver(), "device_name")) == null || string.length() == 0) && (((string = android.provider.Settings.System.getString(applicationContext.getContentResolver(), "bluetooth_name")) == null || string.length() == 0) && ((string = android.provider.Settings.Secure.getString(applicationContext.getContentResolver(), "bluetooth_name")) == null || string.length() == 0)))) {
                    if (applicationContext.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
                        java.lang.Object systemService = applicationContext.getSystemService("bluetooth");
                        systemService.getClass();
                        name = ((android.bluetooth.BluetoothManager) systemService).getAdapter().getName();
                    } else {
                        name = null;
                    }
                    string = name;
                    if (string == null || string.length() == 0) {
                        string = android.os.Build.MODEL;
                        string.getClass();
                    }
                }
                string.getClass();
                defpackage.ygw ygwVarR = defpackage.ygw.r(new tmq("com.google.android.libraries.car.remote.apps"), new tmq("com.google.android.libraries.car.remote.notification"));
                new tmo();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(ygwVarR, 10));
                defpackage.you youVarListIterator = ygwVarR.listIterator(0);
                while (youVarListIterator.hasNext()) {
                    arrayList2.add(((tmq) youVarListIterator.next()).a);
                }
                if (defpackage.afga.bf(arrayList2).size() == ((defpackage.ymx) ygwVarR).c) {
                    return new tmo();
                }
                throw new java.lang.IllegalArgumentException("Endpoint ids must be unique");
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = defpackage.qfn.g;
                defpackage.kyq kyqVar = new defpackage.kyq(new defpackage.lak());
                android.content.Context context2 = this.a;
                return new defpackage.kzb(context2, kyqVar, new defpackage.kzm(context2), this.b, new defpackage.kpc(context2, 2));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i4 = defpackage.qfn.g;
                return new defpackage.mbt(this.a, (defpackage.ygw) this.b);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i5 = defpackage.qfn.g;
                return new defpackage.orf(this.a, (ora) this.b.fF());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i6 = defpackage.qfn.g;
                return new defpackage.ojo(this.a, this.b);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i7 = defpackage.qfn.g;
                return new defpackage.lwn(this.a, defpackage.omf.u(), (defpackage.mbw) this.b.fF());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i8 = defpackage.qfn.g;
                return new defpackage.lvk(this.a, (java.lang.Class) this.b);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i9 = defpackage.qfs.g;
                return new defpackage.mbt(this.a, (defpackage.ygw) this.b);
            case 9:
                int i10 = com.google.android.projection.gearhead.GhApplication.b;
                return new defpackage.kmy(this.b, this.a);
            default:
                int i11 = com.google.android.projection.gearhead.GhApplication.b;
                return new defpackage.kmy(this.b, this.a);
        }
    }

    public /* synthetic */ qfh(java.util.concurrent.Executor executor, android.content.Context context, int i) {
        this.c = i;
        this.b = executor;
        this.a = context;
    }
}
