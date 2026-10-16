package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qlg extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.qli a;

    public qlg(defpackage.qli qliVar) {
        this.a = qliVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        long longExtra = intent.getLongExtra("EXTRA_STREAMITEM_ID", Long.MIN_VALUE);
        defpackage.zaw zawVar = (defpackage.zaw) intent.getSerializableExtra("EXTRA_STREAMITEM_TYPE");
        if (longExtra == Long.MIN_VALUE || zawVar == null) {
            throw new java.lang.IllegalArgumentException("action intent missing id or type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent))));
        }
        android.util.Pair pair = new android.util.Pair(java.lang.Long.valueOf(longExtra), zawVar);
        defpackage.yqm yqmVar = defpackage.qli.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 7512)).y("received action intent %s", intent);
        java.util.Map map = this.a.b;
        if (map.containsKey(pair)) {
            ((qle) map.get(pair)).b(intent.getBundleExtra("EXTRA_PAYLOAD"));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 7513)).y("received action for expired adapter: %s", pair);
        }
    }
}
