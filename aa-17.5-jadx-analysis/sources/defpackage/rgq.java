package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes2.dex */
public final class rgq implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public rgq(Object obj, Object obj2, int i) {
        this.b = i;
        this.a = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        he heVar;
        int i = this.b;
        if (i == 0) {
            rgs rgsVar = (rgs) this.a;
            if (rgsVar.k) {
                rgs.a.f().ai(8035).y("Delayed transition after cleanup. nextState=%s", ((rgp) this.c).name());
                return;
            }
            yop yopVarAi = rgs.a.l().ai(8034);
            String strName = rgsVar.g.name();
            rgp rgpVar = (rgp) this.c;
            yopVarAi.M("DelayedTransitionHandler dispatched. Transitioning from %s to %s", strName, rgpVar.name());
            rgsVar.d(rgpVar);
            return;
        }
        ?? r1 = this.a;
        if (i == 1) {
            io ioVar = (io) r1;
            hg hgVar = ioVar.c;
            if (hgVar != null && (heVar = hgVar.b) != null) {
                heVar.I(hgVar);
            }
            View view = (View) ioVar.f;
            if (view != null && view.getWindowToken() != null) {
                Object obj = this.c;
                if (((hq) obj).h()) {
                    ioVar.i = (im) obj;
                }
            }
            ioVar.l = null;
            return;
        }
        slv slvVar = (slv) r1;
        if (slvVar.a) {
            Object obj2 = this.c;
            sjv sjvVar = slvVar.d;
            acjs acjsVar = (acjs) obj2;
            Object obj3 = acjsVar.b;
            ConnectionResult connectionResult = (ConnectionResult) obj3;
            int i2 = connectionResult.c;
            if (!sjvVar.f(i2)) {
                Log.w("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(obj3))));
                slvVar.a(connectionResult, acjsVar.a);
                return;
            }
            if (connectionResult.b()) {
                smo smoVar = slvVar.f;
                Activity activityL = ((smn) r1).l();
                PendingIntent pendingIntent = connectionResult.d;
                spu.aw(pendingIntent);
                smoVar.startActivityForResult(GoogleApiActivity.a(activityL, pendingIntent, acjsVar.a, false), 1);
                return;
            }
            smn smnVar = (smn) r1;
            if (sjvVar.m(smnVar.l(), i2, null) != null) {
                Activity activityL2 = smnVar.l();
                Dialog dialogG = sjvVar.g(activityL2, i2, new snu(sjvVar.m(activityL2, i2, "d"), slvVar.f), r1);
                if (dialogG != null) {
                    sjvVar.e(activityL2, dialogG, "GooglePlayServicesErrorDialog", r1);
                }
                sjvVar.d(smnVar.l().getApplicationContext(), connectionResult, true);
                return;
            }
            if (i2 != 18) {
                slvVar.a(connectionResult, acjsVar.a);
                return;
            }
            Activity activityL3 = smnVar.l();
            ProgressBar progressBar = new ProgressBar(activityL3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityL3);
            builder.setView(progressBar);
            builder.setMessage(sns.c(activityL3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            sjvVar.e(activityL3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", r1);
            Context applicationContext = smnVar.l().getApplicationContext();
            urg urgVar = new urg(this, alertDialogCreate, (char[]) null);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            smk smkVar = new smk(urgVar);
            dup.e(applicationContext, smkVar, intentFilter, null, 2);
            smkVar.a = applicationContext;
            if (!skm.e(applicationContext)) {
                urgVar.d();
                smkVar.a();
            }
            sjvVar.d(smnVar.l().getApplicationContext(), connectionResult, true);
        }
    }
}
