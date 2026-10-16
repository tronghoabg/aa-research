package com.google.android.gms.internal.ads;

import D6.A1;
import D6.v1;
import android.location.Location;
import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public final class zzfng implements zzfnf {
    private final Object[] zza;

    public zzfng(v1 v1Var, String str, int i5, String str2, A1 a12) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i5));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(v1Var.f2505b));
        }
        if (hashSet.contains(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
            arrayList.add(zza(v1Var.f2506c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(v1Var.f2506c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(v1Var.f2507d));
        }
        if (hashSet.contains("keywords")) {
            List list = v1Var.f2508e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(v1Var.f2509f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(v1Var.f2510g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(v1Var.f2511h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(v1Var.f2512i);
        }
        if (hashSet.contains("location")) {
            Location location = v1Var.k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(v1Var.f2514l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(v1Var.f2515m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(v1Var.f2516n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = v1Var.f2517o;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(v1Var.f2518p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(v1Var.f2519q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(v1Var.f2520r));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(v1Var.f2522t));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(v1Var.f2523u);
        }
        if (hashSet.contains(AdUnitActivity.EXTRA_ORIENTATION)) {
            if (a12 != null) {
                arrayList.add(Integer.valueOf(a12.f2336a));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb2.append(obj == null ? "null" : obj instanceof Bundle ? zza((Bundle) obj) : obj.toString());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnf
    public final boolean equals(Object obj) {
        if (obj instanceof zzfng) {
            return Arrays.equals(this.zza, ((zzfng) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnf
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb2.append("[PoolKey#");
        sb2.append(iHashCode);
        sb2.append(StringUtils.SPACE);
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
