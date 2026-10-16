package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class oho extends defpackage.mdl {
    final /* synthetic */ defpackage.ohs a;

    public oho(defpackage.ohs ohsVar) {
        this.a = ohsVar;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("IcsPackageChangeReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        defpackage.ohs ohsVar = this.a;
        if (context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(context, ohsVar.getClass().getName())) == 1) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ohs.a.f()).ai((char) 5929)).u("ICS package disabled");
        ohsVar.b();
        defpackage.oib oibVar = ohsVar.c;
        if (oibVar != null) {
            oibVar.onUnbind(new android.content.Intent("android.telecom.InCallService"));
            return;
        }
        ohq ohqVar = ohsVar.b;
        ohqVar.getClass();
        ohqVar.onUnbind(new android.content.Intent("android.telecom.InCallService"));
    }
}
