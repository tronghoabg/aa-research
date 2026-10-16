package c7;

import Y2.B;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: c7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC1573i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1574j f19692b;

    public /* synthetic */ RunnableC1573i(ServiceConnectionC1574j serviceConnectionC1574j, int i5) {
        this.f19691a = i5;
        this.f19692b = serviceConnectionC1574j;
    }

    private final void a() {
        ServiceConnectionC1574j serviceConnectionC1574j = this.f19692b;
        synchronized (serviceConnectionC1574j) {
            if (serviceConnectionC1574j.f19693a == 1) {
                serviceConnectionC1574j.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.f19691a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f19692b.a("Service disconnected");
                return;
        }
        while (true) {
            ServiceConnectionC1574j serviceConnectionC1574j = this.f19692b;
            synchronized (serviceConnectionC1574j) {
                try {
                    if (serviceConnectionC1574j.f19693a != 2) {
                        return;
                    }
                    if (serviceConnectionC1574j.f19696d.isEmpty()) {
                        serviceConnectionC1574j.c();
                        return;
                    }
                    C1575k c1575k = (C1575k) serviceConnectionC1574j.f19696d.poll();
                    serviceConnectionC1574j.f19697e.put(c1575k.f19699a, c1575k);
                    ((ScheduledExecutorService) serviceConnectionC1574j.f19698f.f19707c).schedule(new L7.b(15, serviceConnectionC1574j, c1575k), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(c1575k)));
                    }
                    C1576l c1576l = serviceConnectionC1574j.f19698f;
                    Messenger messenger = serviceConnectionC1574j.f19694b;
                    int i5 = c1575k.f19701c;
                    Context context = (Context) c1576l.f19706b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i5;
                    messageObtain.arg1 = c1575k.f19699a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c1575k.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(JsonStorageKeyNames.DATA_KEY, c1575k.f19702d);
                    messageObtain.setData(bundle);
                    try {
                        B b5 = serviceConnectionC1574j.f19695c;
                        Messenger messenger2 = (Messenger) b5.f16383b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            C1571g c1571g = (C1571g) b5.f16384c;
                            if (c1571g == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c1571g.f19687a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e7) {
                        serviceConnectionC1574j.a(e7.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
