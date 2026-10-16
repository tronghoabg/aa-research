package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
final /* synthetic */ class zzckg implements zzagg {
    static final /* synthetic */ zzckg zza = new zzckg();

    private /* synthetic */ zzckg() {
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final /* synthetic */ zzaga[] zza() {
        int i5 = zzckj.zza;
        return new zzaga[]{new zzami(), new zzakm(), new zzalw(zzanq.zza, 32, null, null, zzgwt.zzi(), null)};
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final /* synthetic */ zzaga[] zzb(Uri uri, Map map) {
        return AbstractC1743g.a(this, uri, map);
    }
}
