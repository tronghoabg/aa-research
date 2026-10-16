package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mfs extends defpackage.qso implements defpackage.mgl {
    public static final android.content.ComponentName a = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.preflight.PreflightCarActivityService");

    @Override // defpackage.qso, defpackage.qsk, defpackage.qrd
    public final void a(android.os.Bundle bundle) {
        super.a(bundle);
        v(2131624492);
        defpackage.mgm mgmVar = new defpackage.mgm();
        android.os.Bundle extras = q().getExtras();
        extras.getClass();
        mgmVar.setArguments(extras);
        defpackage.w wVar = new defpackage.w(S());
        wVar.e(2131429219, mgmVar, null, 1);
        wVar.c();
    }
}
