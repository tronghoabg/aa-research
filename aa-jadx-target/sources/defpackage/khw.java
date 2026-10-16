package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class khw implements defpackage.zhh {
    private final /* synthetic */ int a;

    public khw(int i) {
        this.a = i;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.khx.a.g()).p(th)).ai((char) 3095)).u("queryTimedEvents failed to find events");
                break;
            case 1:
                th.getClass();
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jmt.a.g()).p(th)).u("Unable to launch projection");
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.khx.a.g()).p(th)).ai((char) 3097)).u("[All-Day Events] failed to find events");
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.khx.a.g()).p(th)).ai((char) 3099)).u("queryReminders failed to find events");
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) kqt.a.h()).p(th)).ai((char) 3383)).u("Failed to persist data to disk function to disk.");
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver.a.g()).p(th)).ai((char) 6175)).u("Unable to launch projection");
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ryx.a.h().p(th).ai(8568).u("Failed to persist data to disk function to disk.");
                break;
            default:
                if (android.util.Log.isLoggable("ClearcutMetricXmitter", 4)) {
                    android.util.Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(th))));
                }
                break;
        }
    }

    @Override // defpackage.zhh
    public final /* synthetic */ void b(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                java.util.List list = (java.util.List) obj;
                defpackage.yqm yqmVar = defpackage.khx.a;
                if (list != null) {
                    list.size();
                    break;
                }
                break;
            case 1:
                ((java.lang.Boolean) obj).booleanValue();
                defpackage.yqm yqmVar2 = defpackage.jmt.a;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List list2 = (java.util.List) obj;
                defpackage.yqm yqmVar3 = defpackage.khx.a;
                if (list2 != null) {
                    list2.size();
                    break;
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.List list3 = (java.util.List) obj;
                defpackage.yqm yqmVar4 = defpackage.khx.a;
                if (list3 != null) {
                    list3.size();
                    break;
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.yqj) kqt.a.l().ai((char) 3384)).u("Successfully persisted data to disk");
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar5 = com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver.a;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ryx.a.l().ai(8569).u("Successfully persisted data to disk");
                break;
            default:
                android.util.Log.v("ClearcutMetricXmitter", "Transmission is done.");
                break;
        }
    }
}
