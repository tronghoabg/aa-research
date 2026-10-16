package P4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import c7.C1575k;
import c7.ServiceConnectionC1574j;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9124b;

    public /* synthetic */ g(Object obj, int i5) {
        this.f9123a = i5;
        this.f9124b = obj;
    }

    private final boolean a(Message message) {
        int i5 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i5);
        }
        ServiceConnectionC1574j serviceConnectionC1574j = (ServiceConnectionC1574j) this.f9124b;
        synchronized (serviceConnectionC1574j) {
            try {
                C1575k c1575k = (C1575k) serviceConnectionC1574j.f19697e.get(i5);
                if (c1575k == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i5);
                    return true;
                }
                serviceConnectionC1574j.f19697e.remove(i5);
                serviceConnectionC1574j.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    c1575k.b(new Ya.a("Not supported by GmsCore", null));
                    return true;
                }
                switch (c1575k.f19703e) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            c1575k.c(null);
                            return true;
                        }
                        c1575k.b(new Ya.a("Invalid response to one way request", null));
                        return true;
                    default:
                        Bundle bundle = data.getBundle(JsonStorageKeyNames.DATA_KEY);
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        c1575k.c(bundle);
                        return true;
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f9123a) {
            case 0:
                int i5 = message.what;
                h hVar = (h) this.f9124b;
                if (i5 == 1) {
                    hVar.b((e) message.obj);
                    return true;
                }
                if (i5 == 2) {
                    hVar.f9128d.c((e) message.obj);
                }
                return false;
            case 1:
                return a(message);
            default:
                if (message.what != 0) {
                    return false;
                }
                R.e eVar = (R.e) this.f9124b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (eVar.f10014a) {
                    throw null;
                }
        }
    }
}
