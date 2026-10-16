package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

/* loaded from: classes2.dex */
final class dk extends Handler {
    boolean a;
    final /* synthetic */ dl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(dl dlVar, Looper looper) {
        super(looper);
        this.b = dlVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            switch (message.what) {
                case 1:
                    MediaSessionCompat.c(message.getData());
                    break;
                case 2:
                    this.b.d((PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    this.b.c((MediaMetadataCompat) message.obj);
                    break;
                case 4:
                    this.b.a((dn) message.obj);
                    break;
                case 5:
                    this.b.e((List) message.obj);
                    break;
                case 6:
                    break;
                case 7:
                    Bundle bundle = (Bundle) message.obj;
                    MediaSessionCompat.c(bundle);
                    this.b.b(bundle);
                    break;
                case 8:
                    this.b.f();
                    break;
                case 9:
                    ((Integer) message.obj).intValue();
                    break;
                case 11:
                    ((Boolean) message.obj).booleanValue();
                    break;
                case 12:
                    ((Integer) message.obj).intValue();
                    break;
            }
        }
    }
}
