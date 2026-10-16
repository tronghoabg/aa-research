package K8;

import a.AbstractC1304a;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3340k;
import uc.C4271h;

/* loaded from: classes4.dex */
public final class r extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6670a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f6671b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6672c;

    public r(E4.F f10, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f6671b = new WeakReference(activity);
        this.f6672c = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f6670a) {
            case 0:
                Activity activity = (Activity) ((WeakReference) this.f6671b).get();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6672c;
                if (activity == null) {
                    Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
                    taskCompletionSource.setException(zzadg.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
                    E4.F.w(context);
                    return;
                }
                if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
                    String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
                    if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                        E4.F.w(context);
                        return;
                    } else {
                        taskCompletionSource.setException(zzadg.zza(AbstractC1304a.i0("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
                        return;
                    }
                }
                HashMap map = D.f6576a;
                if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                    if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                        taskCompletionSource.setException(zzadg.zza(AbstractC1304a.i0("WEB_CONTEXT_CANCELED")));
                        E4.F.w(context);
                        return;
                    }
                    return;
                }
                AbstractC1732v.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
                Parcelable.Creator<Status> creator = Status.CREATOR;
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
                taskCompletionSource.setException(zzadg.zza((Status) (byteArrayExtra != null ? android.support.v4.media.session.b.c0(byteArrayExtra, creator) : null)));
                E4.F.w(context);
                return;
            case 1:
                AbstractC3340k.e(context, "context");
                AbstractC3340k.e(intent, "intent");
                int intExtra = intent.getIntExtra("status", -1);
                ((Vb.a) this.f6671b).getClass();
                String strB = Vb.a.b(intExtra);
                C4271h c4271h = (C4271h) this.f6672c;
                if (strB != null) {
                    c4271h.a(strB);
                    return;
                } else {
                    c4271h.c("UNAVAILABLE", "Charging status unavailable", null);
                    return;
                }
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    com.google.android.gms.common.api.internal.D d3 = (com.google.android.gms.common.api.internal.D) this.f6672c;
                    com.google.android.gms.common.api.internal.E e7 = (com.google.android.gms.common.api.internal.E) ((e0) d3.f26444b).f26522c;
                    e7.f26446b.set(null);
                    zau zauVar = e7.f26450f.f26543n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) d3.f26443a;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = (Context) this.f6671b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f6671b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public r(com.google.android.gms.common.api.internal.D d3) {
        this.f6672c = d3;
    }

    public r(Vb.a aVar, C4271h c4271h) {
        this.f6671b = aVar;
        this.f6672c = c4271h;
    }
}
