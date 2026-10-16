package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qms extends defpackage.qlz {
    public int a;

    public qms() {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        int leastSignificantBits = (int) (uuidRandomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (uuidRandomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            android.util.Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
        this.a = leastSignificantBits;
    }

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ void b(defpackage.qlz qlzVar) {
        defpackage.qms qmsVar = (defpackage.qms) qlzVar;
        int i = this.a;
        if (i != 0) {
            qmsVar.a = i;
        }
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("screenName", null);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        map.put("interstitial", bool);
        map.put("automatic", bool);
        map.put("screenId", java.lang.Integer.valueOf(this.a));
        map.put("referrerScreenId", 0);
        map.put("referrerScreenName", null);
        map.put("referrerUri", null);
        return defpackage.qlz.a(map, 0);
    }
}
