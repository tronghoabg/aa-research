package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class slv extends smn implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    public final sjv d;

    public slv(smo smoVar, sjv sjvVar) {
        super(smoVar);
        this.b = new AtomicReference(null);
        this.c = new sss(Looper.getMainLooper());
        this.d = sjvVar;
    }

    private static final int k(acjs acjsVar) {
        if (acjsVar == null) {
            return -1;
        }
        return acjsVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        e(connectionResult, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.smn
    public final void c(int i, int i2, Intent intent) {
        acjs acjsVar = (acjs) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int iK = this.d.k(l());
                if (iK == 0) {
                    b();
                    return;
                } else {
                    if (acjsVar == null) {
                        return;
                    }
                    if (((ConnectionResult) acjsVar.b).c == 18 && iK == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (acjsVar != null) {
                a(new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, ((ConnectionResult) acjsVar.b).toString(), null), k(acjsVar));
                return;
            }
            return;
        }
        if (acjsVar != null) {
            a((ConnectionResult) acjsVar.b, acjsVar.a);
        }
    }

    @Override // defpackage.smn
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new acjs(new ConnectionResult(1, bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null, null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(ConnectionResult connectionResult, int i);

    protected abstract void f();

    @Override // defpackage.smn
    public final void g(Bundle bundle) {
        acjs acjsVar = (acjs) this.b.get();
        if (acjsVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", acjsVar.a);
        ConnectionResult connectionResult = (ConnectionResult) acjsVar.b;
        bundle.putInt("failed_status", connectionResult.c);
        bundle.putParcelable("failed_resolution", connectionResult.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(1, 13, null, null, null), k((acjs) this.b.get()));
    }
}
