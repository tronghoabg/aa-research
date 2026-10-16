package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dv {
    public final android.media.session.MediaSession a;
    public final android.support.v4.media.session.MediaSessionCompat.Token b;
    public final java.lang.Object c = new java.lang.Object();
    public final android.os.RemoteCallbackList d = new android.os.RemoteCallbackList();
    public android.support.v4.media.session.PlaybackStateCompat e;
    public android.support.v4.media.MediaMetadataCompat f;
    defpackage.du g;
    public final defpackage.dh h;

    public dv(android.content.Context context, java.lang.String str) {
        android.media.session.MediaSession mediaSessionC = c(context, str);
        this.a = mediaSessionC;
        defpackage.dh dhVar = new defpackage.dh(this);
        this.h = dhVar;
        this.b = new android.support.v4.media.session.MediaSessionCompat.Token(mediaSessionC.getSessionToken(), dhVar);
        mediaSessionC.setFlags(3);
    }

    public final defpackage.du a() {
        defpackage.du duVar;
        synchronized (this.c) {
            duVar = this.g;
        }
        return duVar;
    }

    public final void b(defpackage.du duVar, android.os.Handler handler) {
        synchronized (this.c) {
            this.g = duVar;
            defpackage.ds dsVar = null;
            this.a.setCallback(duVar == null ? null : duVar.b, handler);
            if (duVar != null) {
                synchronized (duVar.a) {
                    duVar.c = new java.lang.ref.WeakReference(this);
                    defpackage.ds dsVar2 = duVar.d;
                    if (dsVar2 != null) {
                        dsVar2.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        dsVar = new defpackage.ds(duVar, handler.getLooper());
                    }
                    duVar.d = dsVar;
                }
            }
        }
    }

    public android.media.session.MediaSession c(android.content.Context context, java.lang.String str) {
        return new android.media.session.MediaSession(context, str);
    }

    public void d() {
        synchronized (this.c) {
        }
    }

    public void e() {
        throw null;
    }
}
