package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fnl extends defpackage.fnh {
    @Override // defpackage.fnh
    public final android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.fnj
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.Intent intentRegisterReceiver = this.a.registerReceiver(null, a());
        boolean z = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            java.lang.String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // defpackage.fnh
    public final void c(android.content.Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        defpackage.fjv.a().c(defpackage.fnm.a, "Received ".concat(java.lang.String.valueOf(intent.getAction())));
        java.lang.String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    f(java.lang.Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                f(java.lang.Boolean.TRUE);
            }
        }
    }
}
