package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Z;
import com.google.android.apps.common.proguard.UsedByReflection;
import g.AbstractC2655c;
import g.C2653a;
import g.InterfaceC2654b;
import kotlin.jvm.internal.AbstractC3340k;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC2655c f20052b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC2655c f20053c;

    /* renamed from: d, reason: collision with root package name */
    public ResultReceiver f20054d;

    /* renamed from: e, reason: collision with root package name */
    public ResultReceiver f20055e;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20052b = registerForActivityResult(new Z(3), new InterfaceC2654b() { // from class: com.android.billingclient.api.zzcw
            @Override // g.InterfaceC2654b
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                C2653a c2653a = (C2653a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = c2653a.f35455b;
                int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(intent, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f20054d;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i5 = c2653a.f35454a;
                if (i5 != -1 || responseCode != 0) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f20053c = registerForActivityResult(new Z(3), new InterfaceC2654b() { // from class: com.android.billingclient.api.zzcx
            @Override // g.InterfaceC2654b
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                C2653a c2653a = (C2653a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = c2653a.f35455b;
                int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(intent, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f20055e;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i5 = c2653a.f35454a;
                if (i5 != -1 || responseCode != 0) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i5 + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f20054d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f20055e = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f20054d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            AbstractC2655c abstractC2655c = this.f20052b;
            AbstractC3340k.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC3340k.d(intentSender, "pendingIntent.intentSender");
            abstractC2655c.a(new g.j(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f20055e = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            AbstractC2655c abstractC2655c2 = this.f20053c;
            AbstractC3340k.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            AbstractC3340k.d(intentSender2, "pendingIntent.intentSender");
            abstractC2655c2.a(new g.j(intentSender2, null, 0, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f20054d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f20055e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
