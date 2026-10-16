package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fnc extends defpackage.fnh {
    @Override // defpackage.fnh
    public final android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // defpackage.fnj
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.Intent intentRegisterReceiver = this.a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            defpackage.fjv.a();
            android.util.Log.e(defpackage.fnd.a, "getInitialState - null intent received");
            return java.lang.Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        boolean z = true;
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fnh
    public final void c(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        defpackage.fjv.a().c(defpackage.fnd.a, "Received ".concat(action));
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    f(java.lang.Boolean.FALSE);
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    f(java.lang.Boolean.FALSE);
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    f(java.lang.Boolean.TRUE);
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    f(java.lang.Boolean.TRUE);
                }
                break;
        }
    }
}
