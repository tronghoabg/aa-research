package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d7.d;
import d7.f;

/* loaded from: classes3.dex */
public final class zzp extends l implements AppSetIdClient {
    private static final h zza;
    private static final AbstractC1686a zzb;
    private static final i zzc;
    private final Context zzd;
    private final f zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("AppSet.API", zznVar, hVar);
    }

    public zzp(Context context, f fVar) {
        super(context, null, zzc, e.f26433X8, k.f26561c);
        this.zzd = context;
        this.zze = fVar;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        if (this.zze.d(this.zzd, 212800000) != 0) {
            return Tasks.forException(new j(new Status(17, null, null, null)));
        }
        N7.e eVarA = A.a();
        eVarA.f8591e = new d[]{com.google.android.gms.appset.zze.zza};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        eVarA.f8588b = false;
        eVarA.f8589c = 27601;
        return doRead(eVarA.e());
    }
}
