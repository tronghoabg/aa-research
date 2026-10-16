package A7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.UserChoiceDetails;
import com.android.billingclient.api.zzcb;
import com.android.billingclient.api.zze;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzcd;
import com.google.android.gms.internal.play_billing.zzga;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class W extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f727a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f728b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f729c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f730d;

    public W(K8.H h10, boolean z2) {
        this.f730d = h10;
        this.f729c = z2;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f728b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f729c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f728b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        L1 l12 = (L1) this.f730d;
        l12.a0();
        l12.zzl().c0();
        l12.zzl().c0();
        if (this.f728b) {
            l12.zzj().f612n.c("Unregistering connectivity change receiver");
            this.f728b = false;
            this.f729c = false;
            try {
                l12.f577l.f973a.unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                l12.zzj().f605f.d("Failed to unregister the network broadcast receiver", e7);
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.f728b) {
            zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f728b = false;
        }
    }

    public void d(Bundle bundle, BillingResult billingResult, int i5) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        K8.H h10 = (K8.H) this.f730d;
        if (byteArray == null) {
            ((X2.j) h10.f6586e).Z(zzcb.zza(23, i5, billingResult));
            return;
        }
        try {
            ((X2.j) h10.f6586e).Z(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzcd.zza()));
        } catch (Throwable unused) {
            zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f727a) {
            case 0:
                L1 l12 = (L1) this.f730d;
                l12.a0();
                String action = intent.getAction();
                l12.zzj().f612n.d("NetworkBroadcastReceiver received action", action);
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    l12.zzj().f608i.d("NetworkBroadcastReceiver received unknown action", action);
                    return;
                }
                Q q4 = l12.f568b;
                L1.m(q4);
                boolean zM0 = q4.m0();
                if (this.f729c != zM0) {
                    this.f729c = zM0;
                    l12.zzl().m0(new V(this, zM0));
                    return;
                }
                return;
            default:
                Bundle extras = intent.getExtras();
                K8.H h10 = (K8.H) this.f730d;
                if (extras == null) {
                    zzb.zzk("BillingBroadcastManager", "Bundle is null.");
                    X2.j jVar = (X2.j) h10.f6586e;
                    BillingResult billingResult = com.android.billingclient.api.i.f20141j;
                    jVar.Z(zzcb.zza(11, 1, billingResult));
                    PurchasesUpdatedListener purchasesUpdatedListener = (PurchasesUpdatedListener) h10.f6584c;
                    if (purchasesUpdatedListener != null) {
                        purchasesUpdatedListener.onPurchasesUpdated(billingResult, null);
                        return;
                    }
                    return;
                }
                BillingResult billingResultZze = zzb.zze(intent, "BillingBroadcastManager");
                String action2 = intent.getAction();
                int i5 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
                if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED") || action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                    List<Purchase> listZzi = zzb.zzi(extras);
                    if (billingResultZze.getResponseCode() == 0) {
                        ((X2.j) h10.f6586e).b0(zzcb.zzc(i5));
                    } else {
                        d(extras, billingResultZze, i5);
                    }
                    ((PurchasesUpdatedListener) h10.f6584c).onPurchasesUpdated(billingResultZze, listZzi);
                    return;
                }
                if (action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    if (billingResultZze.getResponseCode() != 0) {
                        d(extras, billingResultZze, i5);
                        ((PurchasesUpdatedListener) h10.f6584c).onPurchasesUpdated(billingResultZze, zzai.zzk());
                        return;
                    }
                    h10.getClass();
                    PurchasesUpdatedListener purchasesUpdatedListener2 = (PurchasesUpdatedListener) h10.f6584c;
                    UserChoiceBillingListener userChoiceBillingListener = (UserChoiceBillingListener) h10.f6585d;
                    X2.j jVar2 = (X2.j) h10.f6586e;
                    if (userChoiceBillingListener == null) {
                        zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                        BillingResult billingResult2 = com.android.billingclient.api.i.f20141j;
                        jVar2.Z(zzcb.zza(77, i5, billingResult2));
                        purchasesUpdatedListener2.onPurchasesUpdated(billingResult2, zzai.zzk());
                        return;
                    }
                    String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string == null) {
                        zzb.zzk("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                        BillingResult billingResult3 = com.android.billingclient.api.i.f20141j;
                        jVar2.Z(zzcb.zza(16, i5, billingResult3));
                        purchasesUpdatedListener2.onPurchasesUpdated(billingResult3, zzai.zzk());
                        return;
                    }
                    try {
                        if (userChoiceBillingListener != null) {
                            userChoiceBillingListener.userSelectedAlternativeBilling(new UserChoiceDetails(string));
                            jVar2.b0(zzcb.zzc(i5));
                            return;
                        }
                        JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                        ArrayList arrayList = new ArrayList();
                        if (jSONArrayOptJSONArray == null) {
                            throw null;
                        }
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject != null) {
                                arrayList.add(new zze(jSONObjectOptJSONObject));
                            }
                        }
                        throw null;
                    } catch (JSONException unused) {
                        zzb.zzk("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + "]");
                        BillingResult billingResult4 = com.android.billingclient.api.i.f20141j;
                        jVar2.Z(zzcb.zza(17, i5, billingResult4));
                        purchasesUpdatedListener2.onPurchasesUpdated(billingResult4, zzai.zzk());
                        return;
                    }
                }
                return;
        }
    }

    public W(L1 l12) {
        AbstractC1732v.i(l12);
        this.f730d = l12;
    }
}
