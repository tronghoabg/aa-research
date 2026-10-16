package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qkp implements defpackage.mkn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SharedServiceConnect");
    public boolean b = false;
    public final defpackage.mkl c;
    public defpackage.mkh d;
    private android.content.ServiceConnection e;
    private final android.content.Context f;

    public qkp(android.content.Context context, defpackage.mkl mklVar) {
        this.f = context;
        this.c = mklVar;
    }

    @Override // defpackage.mkn
    public final void a() {
        defpackage.ysr.bk(!this.b, "Cannot be bound already");
        android.content.Intent component = new android.content.Intent().setComponent(new android.content.ComponentName("com.google.android.projection.gearhead", com.google.android.gearhead.service.SharedService.class.getCanonicalName()));
        defpackage.sba sbaVar = new defpackage.sba(this, 1);
        this.e = sbaVar;
        this.b = this.f.bindService(component, sbaVar, 65);
        ((defpackage.yqj) a.l().ai((char) 7443)).u("Shared service started.");
    }

    @Override // defpackage.mkn
    public final void b() {
        ((defpackage.yqj) a.l().ai((char) 7444)).y("unbind() [bound:%b]", java.lang.Boolean.valueOf(this.b));
        if (this.b) {
            this.f.unbindService(this.e);
            this.b = false;
            this.e = null;
        }
        this.d = null;
    }
}
