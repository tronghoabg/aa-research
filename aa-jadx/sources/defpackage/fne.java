package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fne extends defpackage.fnh {
    @Override // defpackage.fnh
    public final android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.fnj
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.Intent intentRegisterReceiver = this.a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            defpackage.fjv.a();
            android.util.Log.e(defpackage.fnf.a, "getInitialState - null intent received");
            return java.lang.Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        float intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 / intExtra3 <= 0.15f) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // defpackage.fnh
    public final void c(android.content.Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        defpackage.fjv.a().c(defpackage.fnf.a, "Received ".concat(java.lang.String.valueOf(intent.getAction())));
        java.lang.String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    f(java.lang.Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                f(java.lang.Boolean.FALSE);
            }
        }
    }
}
