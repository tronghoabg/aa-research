package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xgz extends defpackage.mdl {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WifiScanReceiver");
    public boolean b;

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("WifiScanReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (!j$.util.Objects.equals(action, "android.net.wifi.SCAN_RESULTS")) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 10306)).y("Unexpected action: %s", action);
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", true);
        ((defpackage.yqj) a.l().ai((char) 10305)).y("WIFI scan completed; successful scan: %b", java.lang.Boolean.valueOf(booleanExtra));
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.WIRELESS, defpackage.zbd.lI).l());
    }
}
