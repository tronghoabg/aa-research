package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes3.dex */
public final class zzdze {
    public static Bundle zza(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue()) {
            for (int i5 = 0; i5 < 2; i5++) {
                Pair pair = pairArr[i5];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }
}
