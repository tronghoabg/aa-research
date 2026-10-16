package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;

/* loaded from: classes3.dex */
public final class zzv extends l {
    private static final h zza;
    private static final AbstractC1686a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new i("SmsCodeBrowser.API", zztVar, hVar);
    }

    public zzv(Activity activity) {
        super(activity, activity, zzc, e.f26433X8, k.f26561c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        N7.e eVarA = A.a();
        eVarA.f8591e = new d[]{zzac.zzb};
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
            }
        };
        eVarA.f8589c = 1566;
        return doWrite(eVarA.e());
    }

    public zzv(Context context) {
        super(context, null, zzc, e.f26433X8, k.f26561c);
    }
}
