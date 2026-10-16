package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ogt extends android.content.BroadcastReceiver implements defpackage.lhn {
    public static final defpackage.ogq a = new defpackage.ogq();
    public static final defpackage.afhl b = new defpackage.ogs(defpackage.mkp.b, 0);
    private static final defpackage.yqm c = new defpackage.yqm(defpackage.ysh.c.a("GH.CallActionRec"));
    private final android.content.Context d;

    public ogt(android.content.Context context) {
        this.d = context;
    }

    public static final defpackage.ogt a() {
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        return new defpackage.ogt(context);
    }

    @Override // defpackage.lhn
    public final void d() {
        this.d.unregisterReceiver(this);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.gearhead.ACTION_HANDLE_PROJECTION_NOTIFICATION_INTENT");
        defpackage.duw.e(this.d, this, intentFilter, null, 2);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName componentNameA;
        if (intent == null) {
            ((defpackage.yqj) c.h()).u("Received a call notification action with no intent");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("action")) {
            ((defpackage.yqj) ogp.c.h()).y("Ignoring call intent with no action: %s", intent);
            return;
        }
        android.os.Bundle extras2 = intent.getExtras();
        if (extras2 == null || !extras2.containsKey("call_id")) {
            ((defpackage.yqj) ogp.c.h()).y("Ignoring call intent with no call id: %s", intent);
            return;
        }
        android.os.Bundle extras3 = intent.getExtras();
        java.io.Serializable serializable = extras3 != null ? extras3.getSerializable("action") : null;
        ogn ognVar = serializable instanceof ogn ? (ogn) serializable : null;
        if (ognVar == null) {
            ((defpackage.yqj) ogp.c.h()).y("Ignoring call intent with invalid action: %s", intent);
            return;
        }
        android.os.Bundle extras4 = intent.getExtras();
        if (extras4 == null) {
            ((defpackage.yqj) ogp.c.h()).y("Ignoring call intent with invalid call id: %s", intent);
            return;
        }
        int i = extras4.getInt("call_id");
        int iOrdinal = ognVar.ordinal();
        if (iOrdinal == 0) {
            android.content.ComponentName componentName = defpackage.mkt.b;
            componentName.getClass();
            com.google.android.apps.auto.components.telecom.call.CarCall carCallE = defpackage.oeh.a().e(i);
            defpackage.oej oejVarR = defpackage.mkc.R();
            if (carCallE != null && oejVarR.t(carCallE) && (componentNameA = oejVarR.a(defpackage.mkp.a.c, oejVarR.b(carCallE).getPackageName())) != null) {
                componentName = componentNameA;
            }
            defpackage.mpk mpkVarA = defpackage.mpk.a();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setComponent(componentName);
            mpkVarA.i(intent2);
            ogo.b(i, defpackage.zbd.aa);
            return;
        }
        if (iOrdinal == 1) {
            defpackage.omf.w().u(i, true);
            ogo.b(i, defpackage.zbd.J);
            return;
        }
        if (iOrdinal == 2) {
            defpackage.omf.w().u(i, false);
            ogo.b(i, defpackage.zbd.J);
            return;
        }
        if (iOrdinal == 3) {
            defpackage.omf.w().y(i);
            ogo.b(i, defpackage.zbd.I);
        } else if (iOrdinal == 4) {
            defpackage.omf.w().m(i);
            ogo.b(i, defpackage.zbd.E);
        } else {
            if (iOrdinal != 5) {
                throw new defpackage.afas();
            }
            defpackage.omf.w().y(i);
            ogo.b(i, defpackage.zbd.G);
        }
    }
}
