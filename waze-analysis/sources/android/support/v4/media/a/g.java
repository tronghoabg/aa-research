package android.support.v4.media.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    boolean f396a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, Looper looper) {
        super(looper);
        this.f397b = hVar;
        this.f396a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f396a) {
            switch (message.what) {
                case 1:
                    v.b(message.getData());
                    break;
                case 2:
                    this.f397b.b((z) message.obj);
                    break;
                case 3:
                    this.f397b.a((MediaMetadataCompat) message.obj);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    v.b((Bundle) message.obj);
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
