package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import java.util.ArrayList;

/* loaded from: classes4.dex */
final class zzk extends zzz {
    final /* synthetic */ int[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(o oVar, int[] iArr, int i5, String str, String str2) {
        super(oVar);
        this.zza = iArr;
        this.zzb = i5;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        zzaf zzafVar = (zzaf) bVar;
        ArrayList arrayList = new ArrayList();
        for (int i5 : this.zza) {
            arrayList.add(Integer.valueOf(i5));
        }
        zzafVar.zzq(this.zze, arrayList, this.zzb, this.zzc, this.zzd);
    }
}
