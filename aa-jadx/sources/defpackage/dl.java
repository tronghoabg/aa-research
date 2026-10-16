package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class dl implements android.os.IBinder.DeathRecipient {
    public final android.media.session.MediaController.Callback a = new defpackage.dj(this);
    defpackage.dk b;
    public defpackage.df c;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        g(8, null, null);
    }

    public void c(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public final void g(int i, java.lang.Object obj, android.os.Bundle bundle) {
        defpackage.dk dkVar = this.b;
        if (dkVar != null) {
            android.os.Message messageObtainMessage = dkVar.obtainMessage(i, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void h(android.os.Handler handler) {
        if (handler != null) {
            defpackage.dk dkVar = new defpackage.dk(this, handler.getLooper());
            this.b = dkVar;
            dkVar.a = true;
        } else {
            defpackage.dk dkVar2 = this.b;
            if (dkVar2 != null) {
                dkVar2.a = false;
                dkVar2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public void a(defpackage.dn dnVar) {
    }

    public void b(android.os.Bundle bundle) {
    }

    public void d(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
    }

    public void e(java.util.List list) {
    }
}
