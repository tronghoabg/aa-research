package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qko implements defpackage.mkk {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SharedServiceClient");
    public defpackage.mkh b;
    public final android.os.IBinder c = new android.os.Binder();
    private defpackage.mkn d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        defpackage.mkh mkhVar = this.b;
        if (mkhVar != null) {
            try {
                mkhVar.g(this.c);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 7440)).u("Error stopping shared service");
            }
        }
        defpackage.mkn mknVar = this.d;
        mknVar.getClass();
        mknVar.b();
        this.d = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        android.content.Context context = defpackage.mkp.a.c;
        defpackage.ysr.bj(this.d == null);
        defpackage.mkn mknVarA = ((defpackage.mkm) defpackage.mkp.a.i(defpackage.mkm.class)).a(context, new defpackage.qkm(this));
        this.d = mknVarA;
        mknVarA.a();
    }
}
