package com.google.android.gms.internal.mlkit_common;

import Fe.g;
import android.content.Context;

/* loaded from: classes4.dex */
final class zzd extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z2) {
        return (zzjVar.zza.getAuthority().lastIndexOf(64) < 0 || g.v(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
