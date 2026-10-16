package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;
import x7.p;
import x7.q;
import x7.z;

/* loaded from: classes.dex */
public final class zzda extends l {
    public static final /* synthetic */ int zza = 0;

    public zzda(Activity activity) {
        super(activity, activity, zzbi.zzb, e.f26433X8, k.f26561c);
    }

    public final Task<q> checkLocationSettings(final p pVar) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzdb
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                p pVar2 = pVar;
                AbstractC1732v.a("locationSettingsRequest can't be null", pVar2 != null);
                ((zzv) zzdzVar.getService()).zzD(pVar2, new zzde(taskCompletionSource), null);
            }
        };
        eVarA.f8589c = 2426;
        return doRead(eVarA.e());
    }

    public final Task<Boolean> isGoogleLocationAccuracyEnabled() {
        N7.e eVarA = A.a();
        eVarA.f8590d = zzdc.zza;
        eVarA.f8589c = 2444;
        eVarA.f8591e = new d[]{z.f47846g};
        return doRead(eVarA.e());
    }

    public zzda(Context context) {
        super(context, null, zzbi.zzb, e.f26433X8, k.f26561c);
    }
}
