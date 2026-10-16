package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f10754a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b, reason: collision with root package name */
    private aw f10755b;

    /* renamed from: c, reason: collision with root package name */
    private Messenger f10756c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
        } else {
            Log.d("SessionLifecycleService", "Service bound to new client on process ".concat(String.valueOf(intent.getAction())));
            Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
            if (messenger != null) {
                Message messageObtain = Message.obtain(null, 4, 0, 0);
                messageObtain.replyTo = messenger;
                aw awVar = this.f10755b;
                if (awVar != null) {
                    awVar.sendMessage(messageObtain);
                }
            }
            Messenger messenger2 = this.f10756c;
            if (messenger2 != null) {
                return messenger2.getBinder();
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f10754a;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        h.g.b.x.e(looper, "getLooper(...)");
        this.f10755b = new aw(looper);
        this.f10756c = new Messenger(this.f10755b);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f10754a.quit();
    }
}
