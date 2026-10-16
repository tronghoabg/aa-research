package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.AbstractC1732v;
import p7.C3773c;

/* loaded from: classes3.dex */
public final class zzbie {
    private final Context zza;

    public zzbie(Context context) {
        AbstractC1732v.j(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza() {
        Context context = this.zza;
        return ((Boolean) S3.f.R(context, zzbid.zza)).booleanValue() && C3773c.a(context).f2782a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean zzb() {
        return zzc(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc(Intent intent) {
        AbstractC1732v.j(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
