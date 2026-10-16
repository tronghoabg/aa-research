package com.b.a.a.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.b.b.a.aa;
import com.b.b.a.l;
import com.b.b.a.u;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f2551a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2552b;

    /* renamed from: c, reason: collision with root package name */
    private Messenger f2553c;

    /* renamed from: e, reason: collision with root package name */
    private d f2555e;

    /* renamed from: f, reason: collision with root package name */
    private com.b.b.a.k f2556f;

    /* renamed from: h, reason: collision with root package name */
    private aa f2558h;

    /* renamed from: d, reason: collision with root package name */
    private final Messenger f2554d = new Messenger(new e(this));

    /* renamed from: g, reason: collision with root package name */
    private int f2557g = 1;

    public f(String str, Context context) {
        this.f2551a = str;
        this.f2552b = context;
    }

    static /* bridge */ /* synthetic */ void b(f fVar, Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            if (message.replyTo == null) {
                fVar.f2555e.a(new com.b.b.b.a("Can't connect to Spotify service"));
                return;
            } else {
                fVar.f2553c = message.replyTo;
                fVar.f2555e.f(u.b(null));
                return;
            }
        }
        if (i2 != 2) {
            com.b.b.a.i.a("Unknown message: %d", Integer.valueOf(message.what));
            return;
        }
        byte[] byteArray = message.getData().getByteArray("MESSAGE_BODY");
        Charset.forName("UTF-8");
        com.b.b.a.i.f();
        aa aaVar = fVar.f2558h;
        int length = byteArray.length;
        aaVar.m(byteArray);
    }

    public final l a() {
        com.b.b.a.i.f();
        this.f2555e = new d();
        try {
            Intent intent = new Intent("com.spotify.mobile.appprotocol.action.START_APP_PROTOCOL_SERVICE");
            String str = this.f2551a;
            intent.setPackage(str);
            Context context = this.f2552b;
            context.getApplicationContext().startForegroundService(intent);
            if (context.getApplicationContext().bindService(intent, this, 65)) {
                com.b.b.a.i.f();
                this.f2557g = 2;
                return this.f2555e;
            }
            throw new IllegalStateException("Can't connect to Spotify service with package " + str);
        } catch (Exception e2) {
            com.b.b.a.i.a("Can't connect to Spotify service", new Object[0]);
            this.f2555e.a(new com.b.a.a.a.a.h(e2));
            return this.f2555e;
        }
    }

    public final void c() {
        com.b.b.a.i.f();
        try {
            this.f2552b.getApplicationContext().unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f2557g = 4;
        this.f2553c = null;
    }

    public final void d(com.b.b.a.k kVar) {
        this.f2556f = kVar;
    }

    public final void e(byte[] bArr) {
        int i2 = this.f2557g;
        if (i2 == 4) {
            throw new com.b.a.a.a.a.f();
        }
        if (i2 == 1) {
            throw new com.b.a.a.a.a.g();
        }
        if (this.f2553c == null) {
            com.b.b.a.i.a("No outgoing messenger", new Object[0]);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("MESSAGE_BODY", bArr);
        Message messageObtain = Message.obtain();
        messageObtain.setData(bundle);
        try {
            this.f2553c.send(messageObtain);
        } catch (RemoteException e2) {
            com.b.b.a.i.a("Couldn't send message to Spotify App: %s", e2.getMessage());
        }
    }

    public final void f(aa aaVar) {
        this.f2558h = aaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        com.b.b.a.i.f();
        Messenger messenger = new Messenger(iBinder);
        Message messageObtain = Message.obtain();
        messageObtain.replyTo = this.f2554d;
        try {
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            com.b.b.a.i.a("Could not send message to Spotify", new Object[0]);
        }
        this.f2557g = 3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.b.b.a.i.a("Spotify service disconnected", new Object[0]);
        this.f2553c = null;
        this.f2557g = 4;
        com.b.b.a.k kVar = this.f2556f;
        if (kVar != null) {
            kVar.a();
        }
    }
}
