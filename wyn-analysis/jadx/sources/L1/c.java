package L1;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6816a;

    /* renamed from: b, reason: collision with root package name */
    public final db.c f6817b;

    public c(db.c cVar, Handler handler) {
        this.f6817b = cVar;
        this.f6816a = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f6817b.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i5) {
        Handler handler = this.f6816a;
        handler.sendMessage(Message.obtain(handler, 2782386, i5, 0));
    }
}
