package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class dl implements IBinder.DeathRecipient {
    public final MediaController.Callback a = new dj(this);
    dk b;
    public df c;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        g(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public final void g(int i, Object obj, Bundle bundle) {
        dk dkVar = this.b;
        if (dkVar != null) {
            Message messageObtainMessage = dkVar.obtainMessage(i, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void h(Handler handler) {
        if (handler != null) {
            dk dkVar = new dk(this, handler.getLooper());
            this.b = dkVar;
            dkVar.a = true;
        } else {
            dk dkVar2 = this.b;
            if (dkVar2 != null) {
                dkVar2.a = false;
                dkVar2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public void a(dn dnVar) {
    }

    public void b(Bundle bundle) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List list) {
    }
}
