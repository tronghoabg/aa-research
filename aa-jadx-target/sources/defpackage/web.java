package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class web extends android.content.BroadcastReceiver {
    public static volatile defpackage.wyz a;
    private static volatile defpackage.wyz b;

    public static void a(android.content.Context context, defpackage.wyz wyzVar, defpackage.wyz wyzVar2) {
        if (a == null) {
            synchronized (defpackage.web.class) {
                if (a == null) {
                    if (wyzVar != null && !j$.util.Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            ep$.ExternalSyntheticApiModelOutline1.m(context, new defpackage.web(), new android.content.IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        } else {
                            context.registerReceiver(new defpackage.web(), new android.content.IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                        }
                        b = wyzVar;
                    }
                    a = wyzVar2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            android.util.Log.w("PhUpdateBroadcastRecv", defpackage.a.bp(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        defpackage.wyz wyzVar = b;
        if (wyzVar == null) {
            android.util.Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        defpackage.sjr sjrVar = (defpackage.sjr) ((defpackage.wdm) wyzVar.a).b.get(stringExtra);
        if (sjrVar != null) {
            sjrVar.d(new wdk(1));
        }
    }
}
