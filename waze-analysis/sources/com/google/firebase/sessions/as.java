package com.google.firebase.sessions;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f10841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(h.c.j jVar) {
        super(Looper.getMainLooper());
        h.g.b.x.f(jVar, "backgroundDispatcher");
        this.f10841a = jVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        h.g.b.x.f(message, NotificationCompat.CATEGORY_MESSAGE);
        if (message.what != 3) {
            Objects.toString(message);
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: ".concat(String.valueOf(message)));
            super.handleMessage(message);
        } else {
            Bundle data = message.getData();
            if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                string = "";
            }
            Log.d("SessionLifecycleClient", "Session update received: ".concat(String.valueOf(string)));
            kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(this.f10841a), null, null, new ar(string, (h.c.e) null, 0), 3);
        }
    }
}
