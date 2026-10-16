package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

/* loaded from: classes4.dex */
final class zzi extends zzr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(o oVar, byte[] bArr, String str) {
        super(oVar);
        this.zza = bArr;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        zzaf zzafVar = (zzaf) bVar;
        zzg zzgVar = this.zzc;
        byte[] bArr = this.zza;
        String strZzp = this.zzb;
        if (TextUtils.isEmpty(strZzp)) {
            strZzp = zzafVar.zzp("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzh) zzafVar.getService()).zzc(zzgVar, bArr, strZzp);
    }
}
