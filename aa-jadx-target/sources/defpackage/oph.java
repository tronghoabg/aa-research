package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class oph implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oph(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [afer, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                this.a.b(java.lang.Boolean.valueOf(true));
                return defpackage.afbk.a;
            case 1:
                return java.lang.Integer.valueOf((int) (((defpackage.qjf) this.a).e(2131167446) * 255.0f));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.a.invoke();
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.axx) this.a).j(0, 0);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.a.b(java.lang.Boolean.valueOf(false));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj = this.a;
                android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
                if (activity != null) {
                    activity.finish();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.b(java.lang.Boolean.valueOf(false));
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a.b(java.lang.Boolean.valueOf(false));
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((com.google.android.apps.auto.components.widgets.EarthPickerActivity) this.a).finish();
                return defpackage.afbk.a;
            case 9:
                android.app.Application application = ((com.google.android.apps.auto.components.widgets.EarthPickerActivity) this.a).getApplication();
                application.getClass();
                return new oqp(application, 0);
            case 10:
                this.a.invoke(oqc.a);
                return defpackage.afbk.a;
            case 11:
                this.a.invoke(oqc.b);
                return defpackage.afbk.a;
            case 12:
                this.a.invoke();
                return defpackage.afbk.a;
            case 13:
                this.a.b(java.lang.Boolean.valueOf(false));
                return defpackage.afbk.a;
            case 14:
                this.a.b(java.lang.Float.valueOf(1.0f));
                return defpackage.afbk.a;
            case 15:
                return ((defpackage.oqk) this.a).d.getSharedPreferences("widget_stack_prefs", 0);
            case 16:
                return ((android.os.PowerManager) ((peu) this.a).d.getSystemService(android.os.PowerManager.class)).newWakeLock(1, "com.google.android.projection.gearhead:WPP-RFCOMM");
            case 17:
                java.lang.Object obj2 = this.a;
                int i = pik.c;
                return java.lang.Boolean.valueOf(j$.util.Objects.equals(android.os.Looper.myLooper(), obj2));
            case 18:
                return java.lang.Boolean.valueOf(defpackage.lnt.F(((com.google.android.apps.gmm.systems.accounts.GmmAccount) this.a).c()));
            case 19:
                defpackage.tdo tdoVar = (defpackage.tdo) this.a;
                return new tdq(tdoVar, tdoVar.a.keySet());
            default:
                defpackage.tdo tdoVar2 = (defpackage.tdo) this.a;
                return new tdg(tdoVar2, tdoVar2.a.values());
        }
    }
}
