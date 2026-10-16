package o4;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.InAppMessageResponseListener;
import com.google.android.gms.internal.play_billing.zzb;

/* loaded from: classes.dex */
public final class a extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageResponseListener f41346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.f41346a = inAppMessageResponseListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        this.f41346a.onInAppMessageResponse(zzb.zzf(bundle, "BillingClient"));
    }
}
