package com.android.billingclient.api;

import A.C0230x;
import android.os.Bundle;
import java.util.ArrayList;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public abstract class j {
    public static C0230x a(Bundle bundle, String str) {
        BillingResult billingResult = i.f20141j;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", str.concat(" got null owned items list"));
            return new C0230x(billingResult, 54, 18);
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultC = AbstractC3256n.c(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", str + " failed. Response code: " + iZzb);
            return new C0230x(billingResultC, 23, 18);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new C0230x(billingResult, 55, 18);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new C0230x(billingResult, 56, 18);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new C0230x(billingResult, 57, 18);
        }
        if (stringArrayList3 != null) {
            return new C0230x(i.k, 1, 18);
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new C0230x(billingResult, 58, 18);
    }
}
