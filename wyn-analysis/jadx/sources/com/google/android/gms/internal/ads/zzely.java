package com.google.android.gms.internal.ads;

import android.content.Context;
import f3.C2553b;
import h3.C2773a;

/* loaded from: classes3.dex */
public final class zzely {
    private final Context zza;

    public zzely(Context context) {
        this.zza = context;
    }

    public final p8.p zza(boolean z2) {
        try {
            C2773a c2773a = new C2773a(z2);
            C2553b c2553bA = C2553b.a(this.zza);
            return c2553bA != null ? c2553bA.b(c2773a) : zzhcf.zzc(new IllegalStateException());
        } catch (Exception e7) {
            return zzhcf.zzc(e7);
        }
    }
}
