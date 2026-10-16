package com.google.android.gms.f;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f5244a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5245b;

    o(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f5244a = new Messenger(iBinder);
            this.f5245b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f5245b = new d(iBinder);
            this.f5244a = null;
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f5244a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        d dVar = this.f5245b;
        if (dVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        dVar.b(message);
    }
}
