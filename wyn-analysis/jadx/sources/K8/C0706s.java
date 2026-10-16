package K8;

import J8.AbstractC0640o;
import a.AbstractC1304a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: K8.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0706s extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6673a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f6674b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseAuth f6675c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0640o f6676d;

    public C0706s(E4.F f10, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC0640o abstractC0640o) {
        this.f6673a = new WeakReference(activity);
        this.f6674b = taskCompletionSource;
        this.f6675c = firebaseAuth;
        this.f6676d = abstractC0640o;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Activity activity = (Activity) this.f6673a.get();
        TaskCompletionSource taskCompletionSource = this.f6674b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(zzadg.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            E4.F.w(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
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
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f6675c.g(E4.F.v(intent)).addOnSuccessListener(new C0703o(context, taskCompletionSource)).addOnFailureListener(new C0704p(context, taskCompletionSource));
            return;
        }
        boolean zEquals = "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra);
        AbstractC0640o abstractC0640o = this.f6676d;
        if (zEquals) {
            J8.I iV = E4.F.v(intent);
            abstractC0640o.getClass();
            FirebaseAuth.getInstance(s8.g.f(((C0693e) abstractC0640o).f6629c)).h(abstractC0640o, iV).addOnSuccessListener(new C0705q(context, taskCompletionSource)).addOnFailureListener(new C0703o(context, taskCompletionSource));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            J8.I iV2 = E4.F.v(intent);
            abstractC0640o.getClass();
            FirebaseAuth.getInstance(s8.g.f(((C0693e) abstractC0640o).f6629c)).p(abstractC0640o, iV2).addOnSuccessListener(new C0704p(context, taskCompletionSource)).addOnFailureListener(new C0705q(context, taskCompletionSource));
        } else {
            taskCompletionSource.setException(zzadg.zza(AbstractC1304a.i0("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
