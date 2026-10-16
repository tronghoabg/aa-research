package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class oyj implements zge {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public oyj(Context context, BluetoothDevice bluetoothDevice, int i) {
        this.c = i;
        this.a = context;
        this.b = bluetoothDevice;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        int i = this.c;
        if (i == 0) {
            ((ype) ((ype) ((ype) WifiBluetoothReceiver.a.h()).p(th)).ai(6154)).y("Unable to get WiFi credentials for %s", this.b);
            return;
        }
        if (i == 1) {
            ((ype) ((ype) ((ype) knt.a.h()).p(th)).ai((char) 3251)).u("Failed to get car token, not doing reset");
            return;
        }
        if (i == 2) {
            if ((th instanceof CancellationException) || (th instanceof TimeoutException)) {
                OptionalInt optionalInt = (OptionalInt) this.a;
                optionalInt.ifPresent(new oyh(this, 10));
                optionalInt.ifPresent(new oyh(this, 11));
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4) {
                ((ynz) ((ynz) ((ynz) pub.b.g()).p(th)).ai((char) 6891)).u("Expected attempts to exist in GmmNetworkPerformanceLogger");
                return;
            }
            if (i == 5) {
                rgh.a.h().p(th).ai(8005).u("Error removing car BT address");
                return;
            }
            Log.e("NetworkCallerGrpc", "Failed to get survey startup config.", th);
            whj.a.b = false;
            wht whtVar = (wht) this.a;
            whtVar.g();
            whtVar.k((whk) this.b);
            return;
        }
        th.getClass();
        if ((th instanceof pyc ? (pyc) th : null) != null) {
            throw null;
        }
        yob yobVar = pqe.a;
        ((ynz) ((ynz) ((ynz) yobVar.g()).p(th)).ai((char) 6812)).u("P/H: Failed to get a parameters response from Phenotype, evaluating falling back to GWS!");
        ppw ppwVar = (ppw) this.b;
        if (ppwVar.c != pqj.b) {
            Object obj = this.a;
            acef acefVar = acef.PHENOTYPE;
            pqc pqcVar = (pqc) obj;
            pqe pqeVar = pqcVar.i;
            aceg acegVarA = pqeVar.n.a(acefVar);
            if ((acegVarA.c == 243 ? (aawl) acegVarA.d : aawl.a).b) {
                pqeVar.e(pqcVar, null, null, null, pyc.a(th), ppwVar);
                return;
            }
        }
        pqc pqcVar2 = (pqc) this.a;
        pqcVar2.a(ppwVar.d(pqcVar2.i.k, pqu.b, null, pyc.a(th)));
        ((ynz) ((ynz) yobVar.f()).ai((char) 6813)).u("P/H: Retrying client parameters update via GWS.");
    }

    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        if (i == 0) {
            if (((Optional) obj).isEmpty()) {
                return;
            }
            Object obj2 = this.a;
            Object obj3 = this.b;
            gjv gjvVar = WifiBluetoothReceiver.i;
            if (((Set) gjvVar.v()).contains(obj3)) {
                ((ype) WifiBluetoothReceiver.a.l().ai((char) 6185)).y("Bond state changed detection receiver already registered for device %s.", obj3);
                return;
            }
            ((Set) gjvVar.v()).add(obj3);
            oyk oykVar = new oyk((BluetoothDevice) obj3);
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
            ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai((char) 6184)).u("Registered bond state changed receiver for acl connected");
            ((Context) obj2).getApplicationContext().registerReceiver(oykVar, intentFilter);
            return;
        }
        if (i == 1) {
            try {
                if (oni.h((qsz) obj)) {
                    ((ype) ((ype) knt.a.h()).ai(3252)).u("Car is connected, not doing reset");
                    ols.M(((knt) this.b).b, yxi.RESET_SUPPRESSED_CAR_CONNECTED);
                    return;
                }
                Object obj4 = this.b;
                ryf ryfVarA = qrv.A((String) ((xxh) this.a).c(new inl(ryf.e, 7)));
                ryfVarA.getClass();
                ((knt) obj4).d.d(((knt) obj4).b, 1, 4, ryfVarA);
                return;
            } catch (IllegalStateException e) {
                ((ype) ((ype) ((ype) knt.a.h()).p(e)).ai((char) 3253)).u("Car service not connected");
                Object obj5 = this.b;
                ols.M(((knt) obj5).b, yxi.RESET_SUPPRESSED_TOKEN_INVALID);
                return;
            }
        }
        if (i == 2) {
            return;
        }
        if (i == 3) {
            acbu acbuVar = (acbu) obj;
            ((ynz) ((ynz) pqe.a.f()).ai((char) 6814)).u("P/H: Got parameters response from Phenotype!");
            Object obj6 = this.b;
            pqc pqcVar = (pqc) this.a;
            pqcVar.i.e(pqcVar, null, acbuVar, null, 0, (ppw) obj6);
            return;
        }
        if (i != 4) {
            if (i == 5) {
                ((rgh) this.b).a((String) this.a, 0);
                return;
            }
            whj whjVar = whj.a;
            acld acldVar = ((acky) obj).b;
            if (acldVar == null) {
                acldVar = acld.a;
            }
            whjVar.b = acldVar.b;
            wht whtVar = (wht) this.a;
            whtVar.g();
            whtVar.k((whk) this.b);
            return;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return;
        }
        pxa pxaVar = (pxa) yrm.an(list);
        Duration duration = pxaVar.d;
        Duration duration2 = pxaVar.c;
        int millis = (int) duration.minus(duration2).toMillis();
        int millis2 = (int) duration2.minus(pxaVar.b).toMillis();
        int millis3 = (int) pxaVar.e.minus(duration).toMillis();
        if (millis >= 0) {
            adpb adpbVar = (adpb) this.b;
            int i2 = adpbVar.a;
            if (millis <= 2500) {
            }
        }
        if (millis2 >= 0) {
            adpb adpbVar2 = (adpb) this.b;
            int i3 = adpbVar2.a;
            if (millis2 <= 2500) {
            }
        }
        if (millis3 >= 0) {
            adpb adpbVar3 = (adpb) this.b;
            int i4 = adpbVar3.a;
            if (millis3 <= 2500) {
            }
        }
    }

    public oyj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public oyj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
