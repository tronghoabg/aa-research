package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgev implements zzgep {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgev(ExecutorService executorService, String str, long j8) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j8;
    }

    private final p8.p zze(final String str, final boolean z2, final byte[] bArr, final String str2) {
        return com.moloco.sdk.internal.publisher.H.Y(new N0.k() { // from class: com.google.android.gms.internal.ads.zzges
            @Override // N0.k
            public final /* synthetic */ Object attachCompleter(N0.j jVar) {
                return this.zza.zzc(str, z2, str2, bArr, jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.lang.String r6, N0.j r7, boolean r8, java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgev.zzd(java.lang.String, N0.j, boolean, java.lang.String, byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final p8.p zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final p8.p zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, CommonGatewayClient.HEADER_PROTOBUF);
    }

    public final /* synthetic */ Object zzc(final String str, final boolean z2, final String str2, final byte[] bArr, final N0.j jVar) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzger
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(str, jVar, z2, str2, bArr);
            }
        });
        return "";
    }
}
