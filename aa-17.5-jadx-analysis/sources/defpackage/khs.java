package defpackage;

import android.util.Log;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import java.util.List;

/* loaded from: classes.dex */
public final class khs implements zge {
    private final /* synthetic */ int a;

    public khs(int i) {
        this.a = i;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((ype) ((ype) ((ype) kht.a.g()).p(th)).ai((char) 3092)).u("queryTimedEvents failed to find events");
                break;
            case 1:
                th.getClass();
                ((ype) ((ype) jmm.a.g()).p(th)).u("Unable to launch projection");
                break;
            case 2:
                ((ype) ((ype) ((ype) kht.a.g()).p(th)).ai((char) 3094)).u("[All-Day Events] failed to find events");
                break;
            case 3:
                ((ype) ((ype) ((ype) kht.a.g()).p(th)).ai((char) 3096)).u("queryReminders failed to find events");
                break;
            case 4:
                ((ype) ((ype) ((ype) kql.a.h()).p(th)).ai((char) 3380)).u("Failed to persist data to disk function to disk.");
                break;
            case 5:
                ((ype) ((ype) ((ype) WifiBluetoothReceiver.a.g()).p(th)).ai((char) 6149)).u("Unable to launch projection");
                break;
            case 6:
                ryc.a.h().p(th).ai(8543).u("Failed to persist data to disk function to disk.");
                break;
            default:
                if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
                    Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(String.valueOf(String.valueOf(th))));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                yph yphVar = kht.a;
                if (list != null) {
                    list.size();
                    break;
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                yph yphVar2 = jmm.a;
                break;
            case 2:
                List list2 = (List) obj;
                yph yphVar3 = kht.a;
                if (list2 != null) {
                    list2.size();
                    break;
                }
                break;
            case 3:
                List list3 = (List) obj;
                yph yphVar4 = kht.a;
                if (list3 != null) {
                    list3.size();
                    break;
                }
                break;
            case 4:
                ((ype) kql.a.l().ai((char) 3381)).u("Successfully persisted data to disk");
                break;
            case 5:
                yph yphVar5 = WifiBluetoothReceiver.a;
                break;
            case 6:
                ryc.a.l().ai(8544).u("Successfully persisted data to disk");
                break;
            default:
                Log.v("ClearcutMetricXmitter", "Transmission is done.");
                break;
        }
    }
}
