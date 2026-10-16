package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e extends com.google.android.gms.internal.play_billing.zzg {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f20119a;

    /* renamed from: b, reason: collision with root package name */
    public final ResultReceiver f20120b;

    public /* synthetic */ e(WeakReference weakReference, ResultReceiver resultReceiver) {
        this.f20119a = weakReference;
        this.f20120b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzh
    public final void zza(Bundle bundle) {
        ResultReceiver resultReceiver = this.f20120b;
        if (bundle == null) {
            resultReceiver.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Response bundle doesn't contain a response code");
            resultReceiver.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to launch intent for alternative billing only dialog" + iZzb);
            resultReceiver.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            resultReceiver.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f20119a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", resultReceiver);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e7) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e7);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", e7.getClass().getName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e7.getMessage()));
            resultReceiver.send(6, bundle2);
        }
    }
}
