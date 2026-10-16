package com.google.firebase.sessions;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aw extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10851a;

    /* renamed from: b, reason: collision with root package name */
    private long f10852b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f10853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(Looper looper) {
        super(looper);
        h.g.b.x.f(looper, "looper");
        this.f10853c = new ArrayList();
    }

    private final void a(Messenger messenger) throws RemoteException {
        if (this.f10851a) {
            c(messenger, com.google.e.a.d.a.d.g().a().d());
            return;
        }
        String strA = com.google.e.a.d.a.d.h().a();
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: ".concat(String.valueOf(strA)));
        if (strA != null) {
            c(messenger, strA);
        }
    }

    private final void b() throws RemoteException {
        com.google.e.a.d.a.d.g().b();
        Log.d("SessionLifecycleService", "Generated new session ".concat(String.valueOf(com.google.e.a.d.a.d.g().a().d())));
        ah ahVarA = com.google.e.a.d.a.d.g().a();
        Objects.toString(ahVarA);
        Log.d("SessionLifecycleService", "Broadcasting new session: ".concat(String.valueOf(ahVarA)));
        Object objF = com.google.e.a.a.a.s.c(com.google.firebase.b.f8908a).f(ak.class);
        h.g.b.x.e(objF, "get(...)");
        ((ak) objF).a(com.google.e.a.d.a.d.g().a());
        for (Messenger messenger : new ArrayList(this.f10853c)) {
            h.g.b.x.c(messenger);
            a(messenger);
        }
        com.google.e.a.d.a.d.h().b(com.google.e.a.d.a.d.g().a().d());
    }

    private final void c(Messenger messenger, String str) throws RemoteException {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Objects.toString(messenger);
            Log.d("SessionLifecycleService", "Removing dead client from list: ".concat(String.valueOf(messenger)));
            this.f10853c.remove(messenger);
        } catch (Exception e2) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + ".", e2);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws RemoteException {
        h.g.b.x.f(message, NotificationCompat.CATEGORY_MESSAGE);
        if (this.f10852b > message.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f10852b + ".");
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + ".");
            if (this.f10851a) {
                long when = message.getWhen() - this.f10852b;
                int i3 = com.google.firebase.sessions.b.k.f10898a;
                Object objF = com.google.e.a.a.a.s.c(com.google.firebase.b.f8908a).f(com.google.firebase.sessions.b.k.class);
                h.g.b.x.e(objF, "get(...)");
                if (when > h.o.a.m(((com.google.firebase.sessions.b.k) objF).b())) {
                    Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                    b();
                }
            } else {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f10851a = true;
                b();
            }
            this.f10852b = message.getWhen();
            return;
        }
        if (i2 == 2) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f10852b = message.getWhen();
            return;
        }
        if (i2 != 4) {
            Objects.toString(message);
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: ".concat(String.valueOf(message)));
            super.handleMessage(message);
            return;
        }
        ArrayList arrayList = this.f10853c;
        arrayList.add(message.replyTo);
        Messenger messenger = message.replyTo;
        h.g.b.x.e(messenger, "replyTo");
        a(messenger);
        Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + arrayList.size());
    }
}
