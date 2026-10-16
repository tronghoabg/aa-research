package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzgxm {
    public static Object zza(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static void zzb(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
