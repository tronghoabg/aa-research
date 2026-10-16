package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qkl implements android.os.IBinder.DeathRecipient {
    public final android.os.IBinder a;
    public final defpackage.mkg b;

    public qkl(defpackage.mkg mkgVar, android.os.IBinder iBinder) throws android.os.RemoteException {
        this.b = mkgVar;
        this.a = iBinder;
        try {
            iBinder.linkToDeath(this, 0);
            mkgVar.a.add(this);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.service.SharedService.a.g()).p(e)).ai((char) 7425)).u("Remote process maybe died");
            throw e;
        }
    }

    public final void a(int i) {
        ((defpackage.yqj) com.google.android.gearhead.service.SharedService.a.l().ai((char) 7426)).y("Posting event %s", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(i)));
        defpackage.tna.i(new defpackage.rhh(this, i, 1, null));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean b(int i) {
        if (!this.b.a.remove(this)) {
            return false;
        }
        a(i);
        return true;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        b(2);
        defpackage.omf.t().b();
    }
}
