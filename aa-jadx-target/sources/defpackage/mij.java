package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mij implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PrjctStateOwnr");
    public final android.content.Context c;
    public defpackage.mih d;
    public boolean e;
    private boolean g;
    private final android.content.ServiceConnection f = new defpackage.mii(this);
    public final defpackage.mie b = new defpackage.mid(this);

    public mij(android.content.Context context) {
        this.c = context.getApplicationContext();
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.e) {
            if (this.g) {
                this.g = false;
                this.c.unbindService(this.f);
            }
            this.e = false;
            this.c.sendBroadcast(new android.content.Intent("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED").addFlags(268435456));
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (this.e) {
            return;
        }
        this.e = true;
        android.content.Context context = this.c;
        this.g = context.bindService(new android.content.Intent().setClass(context, com.google.android.apps.auto.components.projectionstate.ProjectionStateService.class), this.f, 1);
    }
}
