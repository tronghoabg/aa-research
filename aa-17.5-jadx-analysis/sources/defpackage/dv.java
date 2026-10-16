package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class dv {
    public final MediaSession a;
    public final MediaSessionCompat.Token b;
    public final Object c = new Object();
    public final RemoteCallbackList d = new RemoteCallbackList();
    public PlaybackStateCompat e;
    public MediaMetadataCompat f;
    du g;
    public final dh h;

    public dv(Context context, String str) {
        MediaSession mediaSessionC = c(context, str);
        this.a = mediaSessionC;
        dh dhVar = new dh(this);
        this.h = dhVar;
        this.b = new MediaSessionCompat.Token(mediaSessionC.getSessionToken(), dhVar);
        mediaSessionC.setFlags(3);
    }

    public final du a() {
        du duVar;
        synchronized (this.c) {
            duVar = this.g;
        }
        return duVar;
    }

    public final void b(du duVar, Handler handler) {
        synchronized (this.c) {
            this.g = duVar;
            ds dsVar = null;
            this.a.setCallback(duVar == null ? null : duVar.b, handler);
            if (duVar != null) {
                synchronized (duVar.a) {
                    duVar.c = new WeakReference(this);
                    ds dsVar2 = duVar.d;
                    if (dsVar2 != null) {
                        dsVar2.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        dsVar = new ds(duVar, handler.getLooper());
                    }
                    duVar.d = dsVar;
                }
            }
        }
    }

    public MediaSession c(Context context, String str) {
        return new MediaSession(context, str);
    }

    public void d() {
        synchronized (this.c) {
        }
    }

    public void e() {
        throw null;
    }
}
