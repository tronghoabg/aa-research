package com.google.android.gms.internal.p001authapiphone;

import N7.e;
import Y6.a;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;

/* loaded from: classes3.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        };
        eVarA.f8591e = new d[]{zzac.zzc};
        eVarA.f8589c = 1567;
        return doWrite(eVarA.e());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(this.zza, (TaskCompletionSource) obj2));
            }
        };
        eVarA.f8591e = new d[]{zzac.zzd};
        eVarA.f8589c = 1568;
        return doWrite(eVarA.e());
    }

    public zzab(Context context) {
        super(context);
    }
}
