package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzimw {
    public static List zza(int i5) {
        return i5 == 0 ? Collections.EMPTY_LIST : new ArrayList(i5);
    }

    public static HashSet zzb(int i5) {
        return new HashSet(zzd(i5));
    }

    public static LinkedHashMap zzc(int i5) {
        return new LinkedHashMap(zzd(i5));
    }

    private static int zzd(int i5) {
        return i5 < 3 ? i5 + 1 : i5 < 1073741824 ? (int) ((i5 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }
}
