package android.support.v4.media.a;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public class h implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    final MediaController.Callback f398a = new f(this);

    /* renamed from: b, reason: collision with root package name */
    g f399b;

    /* renamed from: c, reason: collision with root package name */
    a f400c;

    public void a(MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }

    public void b(z zVar) {
        throw null;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        c(8, null, null);
    }

    final void c(int i2, Object obj, Bundle bundle) {
        g gVar = this.f399b;
        if (gVar != null) {
            Message messageObtainMessage = gVar.obtainMessage(i2, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    final void d(Handler handler) {
        if (handler != null) {
            g gVar = new g(this, handler.getLooper());
            this.f399b = gVar;
            gVar.f396a = true;
        } else {
            g gVar2 = this.f399b;
            if (gVar2 != null) {
                gVar2.f396a = false;
                gVar2.removeCallbacksAndMessages(null);
                this.f399b = null;
            }
        }
    }
}
